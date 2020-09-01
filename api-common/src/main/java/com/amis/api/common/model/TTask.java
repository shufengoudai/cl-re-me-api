package com.amis.api.common.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class TTask {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.id")
    private Object id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_story")
    private Object taskStory;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_code")
    private Integer taskCode;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.hour_remain")
    private BigDecimal hourRemain;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_name")
    private String taskName;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_type")
    private Integer taskType;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_status")
    private Integer taskStatus;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_owner")
    private Object taskOwner;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_priority")
    private Integer taskPriority;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_start")
    private Date taskStart;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_end")
    private Date taskEnd;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_hour")
    private BigDecimal taskHour;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_description")
    private String taskDescription;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.ins_account_id")
    private Object insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.ins_dt_time")
    private Date insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.upd_account_id")
    private Object updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.upd_dt_time")
    private Date updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.logical_del_div")
    private Integer logicalDelDiv;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.id")
    public Object getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.id")
    public void setId(Object id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_story")
    public Object getTaskStory() {
        return taskStory;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_story")
    public void setTaskStory(Object taskStory) {
        this.taskStory = taskStory;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_code")
    public Integer getTaskCode() {
        return taskCode;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_code")
    public void setTaskCode(Integer taskCode) {
        this.taskCode = taskCode;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.hour_remain")
    public BigDecimal getHourRemain() {
        return hourRemain;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.hour_remain")
    public void setHourRemain(BigDecimal hourRemain) {
        this.hourRemain = hourRemain;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_name")
    public String getTaskName() {
        return taskName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_name")
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_type")
    public Integer getTaskType() {
        return taskType;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5305609+08:00", comments = "Source field: t_task.task_type")
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_status")
    public Integer getTaskStatus() {
        return taskStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_status")
    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_owner")
    public Object getTaskOwner() {
        return taskOwner;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_owner")
    public void setTaskOwner(Object taskOwner) {
        this.taskOwner = taskOwner;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_priority")
    public Integer getTaskPriority() {
        return taskPriority;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_priority")
    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_start")
    public Date getTaskStart() {
        return taskStart;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_start")
    public void setTaskStart(Date taskStart) {
        this.taskStart = taskStart;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_end")
    public Date getTaskEnd() {
        return taskEnd;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_end")
    public void setTaskEnd(Date taskEnd) {
        this.taskEnd = taskEnd;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_hour")
    public BigDecimal getTaskHour() {
        return taskHour;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_hour")
    public void setTaskHour(BigDecimal taskHour) {
        this.taskHour = taskHour;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_description")
    public String getTaskDescription() {
        return taskDescription;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.task_description")
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.ins_account_id")
    public Object getInsAccountId() {
        return insAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.ins_account_id")
    public void setInsAccountId(Object insAccountId) {
        this.insAccountId = insAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.ins_dt_time")
    public Date getInsDtTime() {
        return insDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.ins_dt_time")
    public void setInsDtTime(Date insDtTime) {
        this.insDtTime = insDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.upd_account_id")
    public Object getUpdAccountId() {
        return updAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5315596+08:00", comments = "Source field: t_task.upd_account_id")
    public void setUpdAccountId(Object updAccountId) {
        this.updAccountId = updAccountId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.upd_dt_time")
    public Date getUpdDtTime() {
        return updDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.upd_dt_time")
    public void setUpdDtTime(Date updDtTime) {
        this.updDtTime = updDtTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.logical_del_div")
    public Integer getLogicalDelDiv() {
        return logicalDelDiv;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.logical_del_div")
    public void setLogicalDelDiv(Integer logicalDelDiv) {
        this.logicalDelDiv = logicalDelDiv;
    }
}
