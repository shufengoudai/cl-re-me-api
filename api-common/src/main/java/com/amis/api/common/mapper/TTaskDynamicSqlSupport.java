package com.amis.api.common.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TTaskDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source Table: t_task")
    public static final TTask TTask = new TTask();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.id")
    public static final SqlColumn<Object> id = TTask.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_story")
    public static final SqlColumn<Object> taskStory = TTask.taskStory;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_code")
    public static final SqlColumn<Integer> taskCode = TTask.taskCode;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.hour_remain")
    public static final SqlColumn<BigDecimal> hourRemain = TTask.hourRemain;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_name")
    public static final SqlColumn<String> taskName = TTask.taskName;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_type")
    public static final SqlColumn<Integer> taskType = TTask.taskType;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_status")
    public static final SqlColumn<Integer> taskStatus = TTask.taskStatus;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_owner")
    public static final SqlColumn<Object> taskOwner = TTask.taskOwner;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_priority")
    public static final SqlColumn<Integer> taskPriority = TTask.taskPriority;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_start")
    public static final SqlColumn<Date> taskStart = TTask.taskStart;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_end")
    public static final SqlColumn<Date> taskEnd = TTask.taskEnd;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source field: t_task.task_hour")
    public static final SqlColumn<BigDecimal> taskHour = TTask.taskHour;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source field: t_task.task_description")
    public static final SqlColumn<String> taskDescription = TTask.taskDescription;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source field: t_task.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TTask.insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source field: t_task.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TTask.insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source field: t_task.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TTask.updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source field: t_task.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TTask.updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source field: t_task.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TTask.logicalDelDiv;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.532559+08:00", comments = "Source Table: t_task")
    public static final class TTask extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);
        public final SqlColumn<Object> taskStory = column("task_story", JDBCType.OTHER);
        public final SqlColumn<Integer> taskCode = column("task_code", JDBCType.INTEGER);
        public final SqlColumn<BigDecimal> hourRemain = column("hour_remain", JDBCType.NUMERIC);
        public final SqlColumn<String> taskName = column("task_name", JDBCType.VARCHAR);
        public final SqlColumn<Integer> taskType = column("task_type", JDBCType.INTEGER);
        public final SqlColumn<Integer> taskStatus = column("task_status", JDBCType.INTEGER);
        public final SqlColumn<Object> taskOwner = column("task_owner", JDBCType.OTHER);
        public final SqlColumn<Integer> taskPriority = column("task_priority", JDBCType.INTEGER);
        public final SqlColumn<Date> taskStart = column("task_start", JDBCType.TIMESTAMP);
        public final SqlColumn<Date> taskEnd = column("task_end", JDBCType.TIMESTAMP);
        public final SqlColumn<BigDecimal> taskHour = column("task_hour", JDBCType.NUMERIC);
        public final SqlColumn<String> taskDescription = column("task_description", JDBCType.VARCHAR);
        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public TTask() {
            super("t_task");
        }
    }
}
