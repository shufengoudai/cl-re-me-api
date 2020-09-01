package com.amis.api.common.model;

import java.util.Date;
import javax.annotation.Generated;

public class TUser {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6183077+08:00", comments = "Source field: t_user.id")
    private Object id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_name")
    private String userName;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_fullname")
    private String userFullname;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.password")
    private String password;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.authority")
    private Integer authority;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.position")
    private String position;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_mail")
    private String userMail;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_tel")
    private String userTel;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_depart")
    private String userDepart;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_sex")
    private Integer userSex;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_notify")
    private Integer userNotify;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.ins_account_id")
    private Object insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.ins_dt_time")
    private Date insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.upd_account_id")
    private Object updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.upd_dt_time")
    private Date updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.logical_del_div")
    private Integer logicalDelDiv;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.company_id")
    private Object companyId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.auth_type")
    private Integer authType;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6213088+08:00", comments = "Source field: t_user.id")
    public Object getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6213088+08:00", comments = "Source field: t_user.id")
    public void setId(Object id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_fullname")
    public String getUserFullname() {
        return userFullname;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_fullname")
    public void setUserFullname(String userFullname) {
        this.userFullname = userFullname;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.password")
    public String getPassword() {
        return password;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.authority")
    public Integer getAuthority() {
        return authority;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.authority")
    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.position")
    public String getPosition() {
        return position;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.position")
    public void setPosition(String position) {
        this.position = position;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_mail")
    public String getUserMail() {
        return userMail;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6223096+08:00", comments = "Source field: t_user.user_mail")
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_tel")
    public String getUserTel() {
        return userTel;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_tel")
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_depart")
    public String getUserDepart() {
        return userDepart;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_depart")
    public void setUserDepart(String userDepart) {
        this.userDepart = userDepart;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_sex")
    public Integer getUserSex() {
        return userSex;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_sex")
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_notify")
    public Integer getUserNotify() {
        return userNotify;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.user_notify")
    public void setUserNotify(Integer userNotify) {
        this.userNotify = userNotify;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.ins_account_id")
    public Object getInsAccountId() {
        return insAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.ins_account_id")
    public void setInsAccountId(Object insAccountId) {
        this.insAccountId = insAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.ins_dt_time")
    public Date getInsDtTime() {
        return insDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.ins_dt_time")
    public void setInsDtTime(Date insDtTime) {
        this.insDtTime = insDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.upd_account_id")
    public Object getUpdAccountId() {
        return updAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.upd_account_id")
    public void setUpdAccountId(Object updAccountId) {
        this.updAccountId = updAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.upd_dt_time")
    public Date getUpdDtTime() {
        return updDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.upd_dt_time")
    public void setUpdDtTime(Date updDtTime) {
        this.updDtTime = updDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.logical_del_div")
    public Integer getLogicalDelDiv() {
        return logicalDelDiv;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.logical_del_div")
    public void setLogicalDelDiv(Integer logicalDelDiv) {
        this.logicalDelDiv = logicalDelDiv;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.company_id")
    public Object getCompanyId() {
        return companyId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6243054+08:00", comments = "Source field: t_user.company_id")
    public void setCompanyId(Object companyId) {
        this.companyId = companyId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.auth_type")
    public Integer getAuthType() {
        return authType;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6233058+08:00", comments = "Source field: t_user.auth_type")
    public void setAuthType(Integer authType) {
        this.authType = authType;
    }
}
