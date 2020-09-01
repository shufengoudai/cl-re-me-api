package com.amis.api.admin.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class PropUtil {

  private static String SERVER;

  private static String PORT;

  @Value("${cors.allowed-origins}")
  private void setServer(String server) {
    SERVER = server;
  }

  @Value("${server.port}")
  private void setPort(String port) {
    PORT = port;
  }

  public static String getServerPort() {
    return SERVER.replace(":8080", "") + ":" + PORT;
  }

}
