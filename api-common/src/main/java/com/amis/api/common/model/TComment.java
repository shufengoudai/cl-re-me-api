package com.amis.api.common.model;

import java.util.Date;
import javax.annotation.Generated;

public class TComment {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.id")
    private Object id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.comment_type")
    private Integer commentType;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.comment_relative_id")
    private Object commentRelativeId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_info")
    private String commentInfo;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_account")
    private Object commentAccount;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_date")
    private Date commentDate;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.ins_account_id")
    private Object insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.ins_dt_time")
    private Date insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.upd_account_id")
    private Object updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.upd_dt_time")
    private Date updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.logical_del_div")
    private Integer logicalDelDiv;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.id")
    public Object getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.id")
    public void setId(Object id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.comment_type")
    public Integer getCommentType() {
        return commentType;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.comment_type")
    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.comment_relative_id")
    public Object getCommentRelativeId() {
        return commentRelativeId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7004288+08:00", comments = "Source field: t_comment.comment_relative_id")
    public void setCommentRelativeId(Object commentRelativeId) {
        this.commentRelativeId = commentRelativeId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_info")
    public String getCommentInfo() {
        return commentInfo;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_info")
    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_account")
    public Object getCommentAccount() {
        return commentAccount;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_account")
    public void setCommentAccount(Object commentAccount) {
        this.commentAccount = commentAccount;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_date")
    public Date getCommentDate() {
        return commentDate;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.comment_date")
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.ins_account_id")
    public Object getInsAccountId() {
        return insAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.ins_account_id")
    public void setInsAccountId(Object insAccountId) {
        this.insAccountId = insAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.ins_dt_time")
    public Date getInsDtTime() {
        return insDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.ins_dt_time")
    public void setInsDtTime(Date insDtTime) {
        this.insDtTime = insDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.upd_account_id")
    public Object getUpdAccountId() {
        return updAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.upd_account_id")
    public void setUpdAccountId(Object updAccountId) {
        this.updAccountId = updAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.upd_dt_time")
    public Date getUpdDtTime() {
        return updDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.upd_dt_time")
    public void setUpdDtTime(Date updDtTime) {
        this.updDtTime = updDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.logical_del_div")
    public Integer getLogicalDelDiv() {
        return logicalDelDiv;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.701429+08:00", comments = "Source field: t_comment.logical_del_div")
    public void setLogicalDelDiv(Integer logicalDelDiv) {
        this.logicalDelDiv = logicalDelDiv;
    }
}
