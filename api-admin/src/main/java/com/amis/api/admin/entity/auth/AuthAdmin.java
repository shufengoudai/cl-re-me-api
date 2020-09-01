package com.amis.api.admin.entity.auth;

import java.util.Date;
import lombok.Data;

@Data
public class AuthAdmin {

  // 主键
  private Object id;
  // 昵称
  private String username;
  // 登录密码
  private String password;
  // 手机号
  private String tel;
  // 邮箱
  private String email;
  // 头像
  private String avatar;
  // 性别
  private Integer sex;
  // 最后登录ip
  private String lastLoginIp;
  // 最后登录时间
  private Date lastLoginTime;
  // 创建时间
  private Date createTime;
  // 状态
  private Integer status;
  // 认证类型
  private Integer authType;
}
