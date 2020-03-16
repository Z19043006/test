package whq.smartplm.domain.model;

import io.swagger.annotations.ApiModel;


@ApiModel(description = "for file uploading")
public class MinioFile {

    String downloadUrl;
    String originalName;
    String bucketName;
    String folderName;  //forderName+originalName=objectName;
    String objectName;  //bucketName+objectName即可下載檔案
    byte[] file;        //預留，未來可以拿來直接做檔案下載，目前多用downloadUrl即可

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public String toString() {
        return "MinioFile{" +
                "downloadUrl='" + downloadUrl + '\'' +
                ", originalName='" + originalName + '\'' +
                ", bucketName='" + bucketName + '\'' +
                ", folderName='" + folderName + '\'' +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}
