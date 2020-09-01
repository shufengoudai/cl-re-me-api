package com.amis.api.common.model;

import java.util.Date;
import javax.annotation.Generated;

public class MessageMaster {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2521476+08:00", comments="Source field: message_master.message_type")
    private String messageType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_id")
    private Integer messageId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_lang")
    private Integer messageLang;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_text")
    private String messageText;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.ins_account_id")
    private Object insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.ins_dt_time")
    private Date insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.upd_account_id")
    private Object updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.upd_dt_time")
    private Date updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2561467+08:00", comments="Source field: message_master.logical_del_div")
    private Integer logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_type")
    public String getMessageType() {
        return messageType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_type")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_id")
    public Integer getMessageId() {
        return messageId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_id")
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_lang")
    public Integer getMessageLang() {
        return messageLang;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2541466+08:00", comments="Source field: message_master.message_lang")
    public void setMessageLang(Integer messageLang) {
        this.messageLang = messageLang;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.message_text")
    public String getMessageText() {
        return messageText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.message_text")
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.ins_account_id")
    public Object getInsAccountId() {
        return insAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.ins_account_id")
    public void setInsAccountId(Object insAccountId) {
        this.insAccountId = insAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.ins_dt_time")
    public Date getInsDtTime() {
        return insDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.ins_dt_time")
    public void setInsDtTime(Date insDtTime) {
        this.insDtTime = insDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.upd_account_id")
    public Object getUpdAccountId() {
        return updAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.upd_account_id")
    public void setUpdAccountId(Object updAccountId) {
        this.updAccountId = updAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.upd_dt_time")
    public Date getUpdDtTime() {
        return updDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2551453+08:00", comments="Source field: message_master.upd_dt_time")
    public void setUpdDtTime(Date updDtTime) {
        this.updDtTime = updDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2561467+08:00", comments="Source field: message_master.logical_del_div")
    public Integer getLogicalDelDiv() {
        return logicalDelDiv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2561467+08:00", comments="Source field: message_master.logical_del_div")
    public void setLogicalDelDiv(Integer logicalDelDiv) {
        this.logicalDelDiv = logicalDelDiv;
    }
}