package whq.smartplm.controller;

import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import whq.smartplm.domain.model.MinioFile;
import whq.smartplm.service.MinioService;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
public class MinioController extends ApiController{
    @Autowired
    private MinioService minioService;

    @PostMapping("/uploadToMinio")
    @ResponseBody
    public ApiResponse uploadToMinio(
            @RequestParam MultipartFile file,
            @RequestParam String bucketName,
            @RequestParam String folderName
    ) {
        logger.info("eco/uploadToMinio start...");
        ApiResponse response = new ApiResponse();
        byte bytes[] = new byte[0];
        try {
            bytes = file.getBytes();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        String objectName = folderName + "/" + file.getOriginalFilename();
        InputStream io = new ByteArrayInputStream(bytes);

        try {
            minioService.createMinioFile(bucketName, objectName, io, null);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            logger.info("eco/uploadToMinio finished.");
            return response;
        }

    }

    @PostMapping("/downloadFileMinio")
    @ResponseBody
    public ApiResponse downloadFromMinio(
            @RequestParam String bucketName,
            @RequestParam String objectName
    ) {
        logger.info("eco/downloadFromMinio start...");

        ApiResponse response = new ApiResponse();
        byte[] bytes;
        try {
            InputStream io = minioService.readMinioFile(bucketName, objectName);
            bytes = IOUtils.toByteArray(io);
            response.setSuccess(bytes);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            logger.info("eco/downloadFromMinio finished.");
            return response;
        }
    }


    @PostMapping("eco/getMinioFolderUrls")
    @ResponseBody
    public ApiResponse downloadFolderFromMinio(
            @RequestParam String bucketName,
            @RequestParam String folderName
    ) {
        logger.info("eco/downloadFolerFromMinio start...");
        ApiResponse response = new ApiResponse();
        List<String> downloadUrls = null;
        try {
            downloadUrls = minioService.readMinioFolderWithUrls(bucketName, folderName);
            response.setSuccess(downloadUrls);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            logger.info("eco/downloadFolerFromMinio finished.");
            return response;
        }
    }

    @PostMapping("eco/deleteMinioFolder")
    @ResponseBody
    public ApiResponse deleteFolderFromMinio(
            @RequestParam String bucketName,
            @RequestParam String folderName
    ) {
        logger.info("eco/deleteFolderFromMinio start...");
        ApiResponse response = new ApiResponse();
        response = new ApiResponse();
        try {
            if(!minioService.deleteMinioFolderFile(bucketName, folderName)){

            }else {
                response.setMessage("");
            }

        } catch (Exception e) {
            logger.error(e.getMessage());
            response.setMessage(e.getMessage());
        } finally {
            logger.info("eco/deleteFolderFromMinio finished.");
            return response;
        }
    }

    @PostMapping("eco/getMinioFolderDetail")
    @ResponseBody
    public ApiResponse getMinioFolderDetail(
            @RequestParam String bucketName,
            @RequestParam String folderName
    ) {
        logger.info("eco/getMinioFolderDetail start...");
        ApiResponse response = new ApiResponse();
        List<MinioFile> downloadUrls = null;
        try {
            downloadUrls = minioService.readMinioFolderWithDetail(bucketName, folderName);
            response.setSuccess(downloadUrls);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            logger.info("eco/getMinioFolderDetail finished.");
            return response;
        }
    }

    @PostMapping("eco/copyMinioFolderFile")
    @ResponseBody
    public ApiResponse getMinioFolderDetail(
            @RequestParam String oBucketName,
            @RequestParam String oFolderName,
            @RequestParam String dBucketName,
            @RequestParam String dFolderName
    ) {
        logger.info("eco/copyMinioFolderFile start...");
        ApiResponse response = new ApiResponse();
        try {
            if(minioService.copyMinioFolderFile(oBucketName, oFolderName,dBucketName,dFolderName)){
                response.setSuccess("");
            }
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            logger.info("eco/copyMinioFolderFile finished.");
            return response;
        }
    }

}
