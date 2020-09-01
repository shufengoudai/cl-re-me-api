package com.amis.api.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Resource
    private UploadFileConfig uploadFileConfig;
    @Override
    public  void addResourceHandlers(ResourceHandlerRegistry  registry) {

        //img路径映射
        registry.addResourceHandler("/img/**").addResourceLocations("file:"+uploadFileConfig.getImgAddr());
        //file路径映射
        registry.addResourceHandler("/file/**").addResourceLocations("file:"+uploadFileConfig.getFileAddr());
        //icon路径映射
        registry.addResourceHandler("/icon/**").addResourceLocations("file:"+uploadFileConfig.getIconAddr());
        //file下载路径映射
        registry.addResourceHandler("/download/**").addResourceLocations("/download/{fileName}");
        //excel下载路径映射
        registry.addResourceHandler("/excel/**").addResourceLocations("/excel/{fileName}");
    }
}