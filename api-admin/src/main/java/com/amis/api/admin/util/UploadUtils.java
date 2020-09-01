package com.amis.api.admin.util;

import com.amis.api.admin.config.UploadFileConfig;
import com.amis.api.admin.entity.uploadFile.UploadFile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class UploadUtils {
    public static String approvalFile(MultipartFile fileContent,String PATH) throws IOException {
        String res = "";
        if (!fileContent.isEmpty()) {
            OutputStream os = null;
            InputStream inputStream = null;
            //原始文件名
            String originalFilename = fileContent.getOriginalFilename();

            String EXCEL = "xls,xlsx,csv,pdf";
            // 获取文件的后缀名
            String suffixName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1).toLowerCase();

            String fileName = UUID.randomUUID().toString().concat(".").concat(suffixName);
            try {
                inputStream = fileContent.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {

                byte[] bs = new byte[1024];
                // 读取到的数据长度
                int len;
                // 输出的文件流保存到本地文件
                File tempFile = new File(PATH);
                if (!tempFile.exists()) {
                    tempFile.mkdirs();
                }
                os = new FileOutputStream(tempFile.getPath()+ "/" + File.separator + fileName);
                // 开始读取
                while ((len = inputStream.read(bs)) != -1) {
                    os.write(bs, 0, len);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 完毕，关闭所有链接
                try {
                    os.close();
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            res = PATH +fileName;
            return res;
        }
        return res;
    }

    public static boolean isImage(MultipartFile file) {
        if (file.isEmpty()) {
            return false;
        }
        BufferedImage image = null;
        try {
            image = ImageIO.read(file.getInputStream());
            if (image == null || image.getWidth()<=0 || image.getHeight()<=0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String saveFile(MultipartFile fileContent,String fileAddr) throws IOException {
        String res = "";
        if (!fileContent.isEmpty()) {
            OutputStream os = null;
            InputStream inputStream = null;
            //原始文件名
            String originalFilename = fileContent.getOriginalFilename();

            // 获取文件的后缀名
            String suffixName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);

            String fileName = UUID.randomUUID().toString().concat(".").concat(suffixName);
            try {
                inputStream = fileContent.getInputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {

                byte[] bs = new byte[1024];
                // 读取到的数据长度
                int len;
                // 输出的文件流保存到本地文件
                File tempFile = new File(fileAddr);
                if (!tempFile.exists()) {
                    tempFile.mkdirs();
                }
                os = new FileOutputStream(tempFile.getPath()+ "/" + File.separator + fileName);
                // 开始读取
                while ((len = inputStream.read(bs)) != -1) {
                    os.write(bs, 0, len);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 完毕，关闭所有链接
                try {
                    os.close();
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            res = fileAddr +fileName;
            return res;
        }
        return res;
    }
    /**
     * bug页面用，el-upload上传文件，通用需求写法(有特别需求的话不适合)
     */
    public static boolean saveFileToServer(MultipartFile[] files, List<UploadFile> fileList, Map<String, String> map,String realPath) {
        String id = map.get("id").toString();
        String account = map.get("account").toString();
        String idType = map.get("idType").toString();
        // 文件上传路径<br>
        File path = new File(realPath);
        //判断文件夹
        if (!path.exists()) {
            path.mkdirs();
        }
        // 文件全名
        String fileName = null;
        // 文件的后缀名
        String suffixName = null;
        //存表文件路径
        String tFilePath=null;
        //判空
        if(files != null && files.length > 0) {
            //循环获取file数组中得文件
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                //保存文件
                if (!file.isEmpty()) {
                    UploadFile fileEntity = new UploadFile();
                    //设置表通用属性
                    fileEntity.setFileRelativeType(Integer.parseInt(idType));
                    fileEntity.setFileRelativeId(UUID.fromString(id));
                    fileEntity.setInsAccountId(UUID.fromString(account));
                    fileEntity.setUpdAccountId(UUID.fromString(account));
                    fileEntity.setInsDtTime(new Date());
                    fileEntity.setUpdDtTime(new Date());
                    fileEntity.setLogicalDelDiv(0);
                    //设置表fileSize
                    fileEntity.setFileSize(formatFileSize(file.getSize()));
                    // 获取文件全名
                    fileName = file.getOriginalFilename();
                    //设置表fileName
                    fileEntity.setFileName(fileName);
                    // 获取文件的后缀名
                    suffixName = fileName.substring(fileName.lastIndexOf("."));
                    //设置表fileType
                    fileEntity.setFileType(formatFileType(suffixName));
                    //文件重名
                    fileName = UUID.randomUUID() + suffixName;
                    tFilePath=realPath.concat(fileName);
                    fileEntity.setFilePath(tFilePath);
                    File dest = new File(tFilePath);
                    try {
                        //转存文件
                        file.transferTo(dest);
                    } catch (IOException e) {
                        e.printStackTrace();
                        return false;
                    }
                    fileList.add(fileEntity);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 文件大小单位转换（通用，特殊需求不适用）
     * @param fileS
     * @return
     */
    public static String formatFileSize(long fileS) {
        DecimalFormat df = new DecimalFormat("#.00");
        String fileSizeString = "";
        if (fileS < 1024) {
            fileSizeString = df.format((double) fileS).concat(" B");
        } else if (fileS < 1048576) {
            fileSizeString = df.format((double) fileS / 1024).concat(" KB");
        } else if (fileS < 1073741824) {
            fileSizeString = df.format((double) fileS / 1048576).concat(" M");
        } else {
            fileSizeString = df.format((double) fileS / 1073741824).concat(" G");
        }
        return fileSizeString;
    }

    /**
     * 文件后缀名转换（通用，特殊需求不适用）
     * @param suffixName
     * @return
     */
    public static int formatFileType(String suffixName) {
        int fileType=0;
        switch (suffixName){
            case "txt":
                fileType=0;
                break;
            case "xls":
                fileType=1;
                break;
            case "doc":
                fileType=2;
                break;
            case "pdf":
                fileType=3;
                break;
            case "ppt":
                fileType=4;
                break;
            case "zip":
                fileType=5;
                break;
            //其他类型
            default:
                fileType=6;
                break;
        }
        return fileType;
    }

    /**
     * bug页面用，删除服务器上的文件
     * @param filePath
     * @return
     */
    public static boolean deleteFileInServer(String filePath) {
        boolean res=false;
        File file=new File(filePath);
        //判断指定文件是否存在
        if(file.exists()){
            //文件删除
            file.delete();
            res = true;
        }
        return res;
    }

    public static int getFileType(MultipartFile file){
        int fileType = 9;
        String originalName = file.getOriginalFilename();
        if (originalName.endsWith("txt")) {
            fileType = 0;
        } else if (originalName.endsWith("xls") || originalName.endsWith("xlsx")) {
            fileType = 1;
        } else if (originalName.endsWith("doc") || originalName.endsWith("docx")) {
            fileType = 2;
        } else if (originalName.endsWith("pdf")) {
            fileType = 3;
        } else if (originalName.endsWith("ppt") || originalName.endsWith("pptx")) {
            fileType = 4;
        } else if (originalName.endsWith("zip")) {
            fileType = 5;
        } else if (isImage(file)) {
            fileType = 6;
        }
        return fileType;
    }
}
