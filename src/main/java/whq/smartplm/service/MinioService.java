package whq.smartplm.service;

import org.springframework.stereotype.Service;
import whq.smartplm.domain.model.MinioFile;

import java.io.InputStream;
import java.util.List;
import java.util.Map;


@Service
public interface MinioService {
    void createMinioFile(String bucketName, String objectName, InputStream io, Map map) throws Exception;
    InputStream readMinioFile(String bucketName,String objectName) throws Exception;
    List<String> readMinioFolderWithUrls (String bucketName, String folderName) throws Exception;
    List<MinioFile> readMinioFolderWithDetail (String bucketName, String folderName) throws Exception;
    boolean deleteMinioFolderFile(String bucketName, String folderName)throws Exception;
    boolean deleteMinioFile(String bucketName, String objectName)throws Exception;
    boolean copyMinioFolderFile(String originBucketname,String originFolderName,String destinationBucketName,String destinationFolderName);

}
