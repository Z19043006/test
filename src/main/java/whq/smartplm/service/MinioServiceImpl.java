package whq.smartplm.service;

import io.minio.MinioClient;
import io.minio.Result;
import io.minio.messages.Item;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import whq.smartplm.controller.ApiController;
import whq.smartplm.domain.model.MinioFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class MinioServiceImpl extends ApiController implements MinioService{

    @Value("${minio.server.url}")
    private String minioUrl;
    @Value("${minio.accesskey}")
    private String minioAccessKey;
    @Value("${minio.secretkey}")
    private String minioSecretKey;

    @Override
    public void createMinioFile(String bucketName, String objectName, InputStream io, Map map) throws Exception {
        logger.info("createMinioFile() start...");
        try {
            MinioClient minioClient = new MinioClient(minioUrl,minioAccessKey,minioSecretKey);
            if(!minioClient.bucketExists(bucketName)){
                minioClient.makeBucket(bucketName);
            }
            minioClient.putObject(bucketName,objectName,io,map);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
    }


    @Override
    public InputStream readMinioFile(String bucketName,String objectName) throws Exception{
        InputStream io;
        try {

            MinioClient minioClient = new MinioClient(minioUrl,minioAccessKey,minioSecretKey);
            if(!minioClient.bucketExists(bucketName)){
                throw new RuntimeException("Can't find the bucketName:"+bucketName+"!");
            }
            return minioClient.getObject(bucketName,objectName);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            throw new RuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }

    }

    @Override
    public List<String> readMinioFolderWithUrls(String bucketName, String folderName) throws Exception {
        List<String> objectNames = new ArrayList<>();
        List<String> urls = new ArrayList<>();
        try {
            MinioClient minioClient = new MinioClient(minioUrl,minioAccessKey,minioSecretKey);
            if(!minioClient.bucketExists(bucketName)){
                throw new RuntimeException("Can't find the bucketName:"+bucketName+"!");
            }
            Iterable<Result<Item>> items = minioClient.listObjects(bucketName,folderName,true);

            for(Result<Item> item:items){
                String name =item.get().objectName();
                objectNames.add(item.get().objectName());
                urls.add(minioClient.presignedGetObject(bucketName,name));
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            throw new RuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
        return urls;
    }

    @Override
    public boolean deleteMinioFolderFile(String bucketName, String folderName) throws Exception{
        List<String> objectNames = new ArrayList<>();
        try {
            MinioClient minioClient = new MinioClient(minioUrl,minioAccessKey,minioSecretKey);
            if(!minioClient.bucketExists(bucketName)){
                throw new RuntimeException("Can't find the bucketName:"+bucketName+"!");
            }
            Iterable<Result<Item>> items = minioClient.listObjects(bucketName,folderName,true);
            for(Result<Item> item:items){
                String name =item.get().objectName();
                objectNames.add(item.get().objectName());
                minioClient.removeObject(bucketName,name);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            throw new RuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
    }

    @Override
    public List<MinioFile> readMinioFolderWithDetail(String bucketName, String folderName) throws Exception {
        List<String> objectNames = new ArrayList<>();
        List<MinioFile> minioFileList = new ArrayList<>();
        try {
            MinioClient minioClient = new MinioClient(minioUrl,minioAccessKey,minioSecretKey);
            if(!minioClient.bucketExists(bucketName)){
                throw new RuntimeException("Can't find the bucketName:"+bucketName+"!");
            }
            Iterable<Result<Item>> items = minioClient.listObjects(bucketName,folderName,true);

            for(Result<Item> item:items){
                String name =item.get().objectName();
                objectNames.add(item.get().objectName());
                MinioFile minioFile = new MinioFile();
                minioFile.setBucketName(bucketName);
                minioFile.setFolderName(folderName);
                minioFile.setOriginalName(name.replace((folderName+"/"),""));
                minioFile.setObjectName(name);
                minioFile.setDownloadUrl(minioClient.presignedGetObject(bucketName,name));
                minioFileList.add(minioFile);

            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            throw new RuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
        return minioFileList;
    }


    @Override
    public boolean deleteMinioFile(String bucketName, String objectName) throws Exception{
        try {
            MinioClient minioClient = new MinioClient(minioUrl,minioAccessKey,minioSecretKey);
            if(!minioClient.bucketExists(bucketName)){
                throw new RuntimeException("Can't find the bucketName:"+bucketName+"!");
            }
            minioClient.removeObject(bucketName,objectName);
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }
    }

    @Override
    public boolean copyMinioFolderFile(String originBucketname, String originFolderName, String destinationBucketName, String destinationFolderName) {
        logger.info("copyMinioFolderFile start");
        try {
            MinioClient minioClient = new MinioClient(minioUrl,minioAccessKey,minioSecretKey);
            if(!minioClient.bucketExists(originBucketname)){
                throw new RuntimeException("Can't find the bucketName:"+originBucketname+"!");
            }
            if(!minioClient.bucketExists(destinationBucketName)){
                throw new RuntimeException("Can't find the bucketName:"+destinationBucketName+"!");
            }
            Iterable<Result<Item>> items = minioClient.listObjects(originBucketname,originFolderName,true);



            for(Result<Item> item:items){
                String objectName=item.get().objectName();
                System.out.println("bucketName:"+originBucketname);
                System.out.println("objectName:"+objectName);
                minioClient.copyObject(originBucketname,objectName,destinationBucketName,destinationFolderName+objectName.replace(originFolderName,""));
            }
            logger.info("copyMinioFolderFile finished.");
            return true;
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        }

    }
}
