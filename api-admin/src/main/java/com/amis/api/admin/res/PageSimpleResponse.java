package com.amis.api.admin.res;

import java.util.List;
import lombok.Data;

/** 简单的分页返回对象 */
@Data
public class PageSimpleResponse<T> {
  // 总数
  private Long total;
  // 列表
  private List<T> list;
}
