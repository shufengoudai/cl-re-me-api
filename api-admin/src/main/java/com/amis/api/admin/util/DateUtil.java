package com.amis.api.admin.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;

public class DateUtil {

  /**
   * 日期格式化.
   *
   * @param d Date
   * @return
   */
  public static String formatDate(Date d) {
    if (d == null) {
      return "";
    }
    DateFormat format1 = new SimpleDateFormat("MM-dd");
    String dateString = format1.format(d);
    return dateString;
  }
  
  
  public static long daysBetween(Date start, Date end) {
    long diff = end.getTime() - start.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
  }
  
  /**
   * 日期格式化.
   *
   * @param d Date
   * @return
   */
  public static String formatDate(Date d, String format) {
    if (d == null) {
      return "";
    }
    DateFormat format1 = new SimpleDateFormat(format);
    String dateString = format1.format(d);
    return dateString;
  }
  
  /**
   * 日期格式化.
   *
   * @param input String
   * @param format String
   * @return
   */
  public static Date stringToDate(String input, String format) {
    if (StringUtils.isEmpty(input)) {
      return null;
    }
    DateFormat format1 = new SimpleDateFormat(format);
    Date res = null;
    try {
      res = format1.parse(input);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return res;
  }
}
