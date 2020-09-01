package com.amis.api.admin.util;

import java.net.InetAddress;
import javax.servlet.http.HttpServletRequest;

public class IpUtils {

  /**
   * 获取客户端IP地址
   *
   * @param request
   * @return
   */
  public static String getIpAddr(HttpServletRequest request) {
    String ip = request.getHeader("x-forwarded-for");
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getRemoteAddr();
      if (ip.equals("127.0.0.1")) {
        // 根据网卡取本机配置的IP
        InetAddress inet = null;
        try {
          inet = InetAddress.getLocalHost();
          ip = inet.getHostAddress();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
    // 多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
    if (ip != null && ip.length() > 15) {
      if (ip.indexOf(",") > 0) {
        ip = ip.substring(0, ip.indexOf(","));
      }
    }
    return ip;
  }
}