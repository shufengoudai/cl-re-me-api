package com.amis.api.common.model;

import java.util.Date;
import javax.annotation.Generated;

public class TNotificationHistory {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.id")
    private Object id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.notify_member")
    private Object notifyMember;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.notify_content")
    private String notifyContent;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.notify_time")
    private Date notifyTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.ins_account_id")
    private Object insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.ins_dt_time")
    private Date insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.upd_account_id")
    private Object updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.upd_dt_time")
    private Date updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.logical_del_div")
    private Integer logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.id")
    public Object getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.id")
    public void setId(Object id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.notify_member")
    public Object getNotifyMember() {
        return notifyMember;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.notify_member")
    public void setNotifyMember(Object notifyMember) {
        this.notifyMember = notifyMember;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.notify_content")
    public String getNotifyContent() {
        return notifyContent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.notify_content")
    public void setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0352811+08:00", comments="Source field: t_notification_history.notify_time")
    public Date getNotifyTime() {
        return notifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.notify_time")
    public void setNotifyTime(Date notifyTime) {
        this.notifyTime = notifyTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.ins_account_id")
    public Object getInsAccountId() {
        return insAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.ins_account_id")
    public void setInsAccountId(Object insAccountId) {
        this.insAccountId = insAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.ins_dt_time")
    public Date getInsDtTime() {
        return insDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.ins_dt_time")
    public void setInsDtTime(Date insDtTime) {
        this.insDtTime = insDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.upd_account_id")
    public Object getUpdAccountId() {
        return updAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.upd_account_id")
    public void setUpdAccountId(Object updAccountId) {
        this.updAccountId = updAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.upd_dt_time")
    public Date getUpdDtTime() {
        return updDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.upd_dt_time")
    public void setUpdDtTime(Date updDtTime) {
        this.updDtTime = updDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.logical_del_div")
    public Integer getLogicalDelDiv() {
        return logicalDelDiv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0362801+08:00", comments="Source field: t_notification_history.logical_del_div")
    public void setLogicalDelDiv(Integer logicalDelDiv) {
        this.logicalDelDiv = logicalDelDiv;
    }
}