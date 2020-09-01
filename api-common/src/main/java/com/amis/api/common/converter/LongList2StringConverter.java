package com.amis.api.common.converter;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

/** Long 类型的 List 转为字符串 */
public class LongList2StringConverter {

  /**
   * Long 类型的 List 转为字符串
   *
   * @param longList
   * @param regex
   * @return
   */
  public static String convert(List<Long> longList, String regex) {

    if (longList.isEmpty()) {
      return null;
    }
    Set<String> stringSet = new HashSet<>();
    for (Long value : longList) {
      stringSet.add(value.toString());
    }
    if (stringSet.isEmpty()) {
      return null;
    }
    return StringUtils.join(stringSet, regex);
  }
}
