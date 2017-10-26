package com.demo.action;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileAction extends BaseAction {
        private File uploadfile;
        private String uploadfileFileName;
        private String uploadfileContentType;



    public String upFile() {
        System.out.println("文件名："+ uploadfileFileName);
        System.out.println("文件种类："+ uploadfileContentType);
        //将文件上传到服务器
        String path = application.getRealPath("/images");
        System.out.println("文件所在地："+path);
        File file = new File(path, uploadfileFileName);
        try {
            FileUtils.copyFile(uploadfile,file);
        } catch (IOException e) {
            e.printStackTrace();
            return this.INPUT;
        }
        return this.SUCCESS;
    }


    public File getUploadfile() {
        return uploadfile;
    }

    public void setUploadfile(File uploadfile) {
        this.uploadfile = uploadfile;
    }

    public String getUploadfileFileName() {
        return uploadfileFileName;
    }

    public void setUploadfileFileName(String uploadfileFileName) {
        this.uploadfileFileName = uploadfileFileName;
    }

    public String getUploadfileContentType() {
        return uploadfileContentType;
    }

    public void setUploadfileContentType(String uploadfileContentType) {
        this.uploadfileContentType = uploadfileContentType;
    }
}
