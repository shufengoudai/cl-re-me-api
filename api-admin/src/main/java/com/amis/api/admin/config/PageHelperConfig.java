package com.amis.api.admin.config;

import com.github.pagehelper.PageHelper;
import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageHelperConfig {

  /**
   * 注入pagehelper配置
   *
   * @return PageHelper
   */
  @Bean
  public PageHelper getPageHelper() {
    PageHelper pageHelper = new PageHelper();
    Properties properties = new Properties();
    properties.setProperty("helperDialect", "mysql");
    properties.setProperty("reasonable", "true");
    properties.setProperty("supportMethodsArguments", "true");
    properties.setProperty("params", "count=countSql");
    pageHelper.setProperties(properties);
    return pageHelper;
  }
}
