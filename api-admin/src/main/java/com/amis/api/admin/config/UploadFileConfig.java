package com.amis.api.admin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "upload")
@Data
public class UploadFileConfig {

    private String excelAddr;

    private String fileAddr;

    private String imgAddr;

    private String iconAddr;
}
