package com.amis.api.common.enums;

import lombok.Getter;

/** 返回结果的枚举类 */
@Getter
public enum ResultEnum {
  SUCCESS(0, "success"),
  NOT_NETWORK(1, "系统繁忙，请稍后再试。"),
  LOGIN_VERIFY_FALL(2, "登录失效"),
  PARAM_VERIFY_FALL(3, "参数验证错误"),
  AUTH_FAILED(4, "权限验证失败"),
  DATA_NOT(5, "没有相关数据"),
  DATA_CHANGE(6, "数据没有任何更改"),
  DATA_REPEAT(7, "数据已存在"),
  EXCLUSION_ERROR(8, "该数据已经被别的用户更新过"),
  DUPLICATE_USERNAME(9,"用户名重复"),
  DUPLICATE_IDENTIFY(10,"项目标识重复"),
  LOGIN_ERROR(11,"用户名或密码错误"),
  OPERATE_ERROR(12,"操作失败"),
  DUPLICATE_COMPANY_IDENTIFY(13,"企业识别码重复")
  ;

  private Integer code;

  private String message;

  ResultEnum(Integer code, String message) {
    this.code = code;
    this.message = message;
  }
}
