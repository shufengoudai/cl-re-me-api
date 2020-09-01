package com.amis.api.common.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class TBugProgress {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.bug_id")
    private Object bugId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.statistics_date")
    private Date statisticsDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.hour_regist")
    private BigDecimal hourRegist;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.hour_remain")
    private BigDecimal hourRemain;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_regist_account")
    private Object hourRegistAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_update_account")
    private Object hourUpdateAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_description")
    private Date hourDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.ins_account_id")
    private Object insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.ins_dt_time")
    private Date insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.upd_account_id")
    private Object updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.upd_dt_time")
    private Date updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.logical_del_div")
    private Integer logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.bug_id")
    public Object getBugId() {
        return bugId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.bug_id")
    public void setBugId(Object bugId) {
        this.bugId = bugId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.statistics_date")
    public Date getStatisticsDate() {
        return statisticsDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.statistics_date")
    public void setStatisticsDate(Date statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.hour_regist")
    public BigDecimal getHourRegist() {
        return hourRegist;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.hour_regist")
    public void setHourRegist(BigDecimal hourRegist) {
        this.hourRegist = hourRegist;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.hour_remain")
    public BigDecimal getHourRemain() {
        return hourRemain;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7483227+08:00", comments="Source field: t_bug_progress.hour_remain")
    public void setHourRemain(BigDecimal hourRemain) {
        this.hourRemain = hourRemain;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_regist_account")
    public Object getHourRegistAccount() {
        return hourRegistAccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_regist_account")
    public void setHourRegistAccount(Object hourRegistAccount) {
        this.hourRegistAccount = hourRegistAccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_update_account")
    public Object getHourUpdateAccount() {
        return hourUpdateAccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_update_account")
    public void setHourUpdateAccount(Object hourUpdateAccount) {
        this.hourUpdateAccount = hourUpdateAccount;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_description")
    public Date getHourDescription() {
        return hourDescription;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.hour_description")
    public void setHourDescription(Date hourDescription) {
        this.hourDescription = hourDescription;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.ins_account_id")
    public Object getInsAccountId() {
        return insAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.ins_account_id")
    public void setInsAccountId(Object insAccountId) {
        this.insAccountId = insAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.ins_dt_time")
    public Date getInsDtTime() {
        return insDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.ins_dt_time")
    public void setInsDtTime(Date insDtTime) {
        this.insDtTime = insDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.upd_account_id")
    public Object getUpdAccountId() {
        return updAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.upd_account_id")
    public void setUpdAccountId(Object updAccountId) {
        this.updAccountId = updAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.upd_dt_time")
    public Date getUpdDtTime() {
        return updDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7493225+08:00", comments="Source field: t_bug_progress.upd_dt_time")
    public void setUpdDtTime(Date updDtTime) {
        this.updDtTime = updDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7503222+08:00", comments="Source field: t_bug_progress.logical_del_div")
    public Integer getLogicalDelDiv() {
        return logicalDelDiv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7503222+08:00", comments="Source field: t_bug_progress.logical_del_div")
    public void setLogicalDelDiv(Integer logicalDelDiv) {
        this.logicalDelDiv = logicalDelDiv;
    }
}