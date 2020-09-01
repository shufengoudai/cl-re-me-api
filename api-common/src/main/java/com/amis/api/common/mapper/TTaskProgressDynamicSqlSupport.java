package com.amis.api.common.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TTaskProgressDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5275615+08:00", comments = "Source Table: t_task_progress")
    public static final TTaskProgress TTaskProgress = new TTaskProgress();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5275615+08:00", comments = "Source field: t_task_progress.task_id")
    public static final SqlColumn<Object> taskId = TTaskProgress.taskId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5275615+08:00", comments = "Source field: t_task_progress.statistics_date")
    public static final SqlColumn<Date> statisticsDate = TTaskProgress.statisticsDate;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5275615+08:00", comments = "Source field: t_task_progress.hour_regist")
    public static final SqlColumn<BigDecimal> hourRegist = TTaskProgress.hourRegist;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5275615+08:00", comments = "Source field: t_task_progress.hour_remain")
    public static final SqlColumn<BigDecimal> hourRemain = TTaskProgress.hourRemain;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5285622+08:00", comments = "Source field: t_task_progress.hour_regist_account")
    public static final SqlColumn<Object> hourRegistAccount = TTaskProgress.hourRegistAccount;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5285622+08:00", comments = "Source field: t_task_progress.hour_update_account")
    public static final SqlColumn<Object> hourUpdateAccount = TTaskProgress.hourUpdateAccount;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5285622+08:00", comments = "Source field: t_task_progress.hour_description")
    public static final SqlColumn<Date> hourDescription = TTaskProgress.hourDescription;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5285622+08:00", comments = "Source field: t_task_progress.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TTaskProgress.insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5285622+08:00", comments = "Source field: t_task_progress.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TTaskProgress.insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5285622+08:00", comments = "Source field: t_task_progress.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TTaskProgress.updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5285622+08:00", comments = "Source field: t_task_progress.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TTaskProgress.updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5285622+08:00", comments = "Source field: t_task_progress.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TTaskProgress.logicalDelDiv;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5275615+08:00", comments = "Source Table: t_task_progress")
    public static final class TTaskProgress extends SqlTable {
        public final SqlColumn<Object> taskId = column("task_id", JDBCType.OTHER);
        public final SqlColumn<Date> statisticsDate = column("statistics_date", JDBCType.DATE);
        public final SqlColumn<BigDecimal> hourRegist = column("hour_regist", JDBCType.NUMERIC);
        public final SqlColumn<BigDecimal> hourRemain = column("hour_remain", JDBCType.NUMERIC);
        public final SqlColumn<Object> hourRegistAccount = column("hour_regist_account", JDBCType.OTHER);
        public final SqlColumn<Object> hourUpdateAccount = column("hour_update_account", JDBCType.OTHER);
        public final SqlColumn<Date> hourDescription = column("hour_description", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public TTaskProgress() {
            super("t_task_progress");
        }
    }
}
