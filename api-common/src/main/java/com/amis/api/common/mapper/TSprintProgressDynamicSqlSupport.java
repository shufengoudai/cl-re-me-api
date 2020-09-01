package com.amis.api.common.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TSprintProgressDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.458363+08:00", comments="Source Table: t_sprint_progress")
    public static final TSprintProgress TSprintProgress = new TSprintProgress();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.458363+08:00", comments="Source field: t_sprint_progress.sprint_id")
    public static final SqlColumn<Object> sprintId = TSprintProgress.sprintId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.458363+08:00", comments="Source field: t_sprint_progress.statistics_date")
    public static final SqlColumn<Date> statisticsDate = TSprintProgress.statisticsDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.458363+08:00", comments="Source field: t_sprint_progress.sprint_remain_hours")
    public static final SqlColumn<BigDecimal> sprintRemainHours = TSprintProgress.sprintRemainHours;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.458363+08:00", comments="Source field: t_sprint_progress.sprint_remain_point")
    public static final SqlColumn<Integer> sprintRemainPoint = TSprintProgress.sprintRemainPoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.458363+08:00", comments="Source field: t_sprint_progress.sprint_remain_story")
    public static final SqlColumn<Integer> sprintRemainStory = TSprintProgress.sprintRemainStory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source field: t_sprint_progress.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TSprintProgress.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source field: t_sprint_progress.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TSprintProgress.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source field: t_sprint_progress.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TSprintProgress.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source field: t_sprint_progress.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TSprintProgress.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source field: t_sprint_progress.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TSprintProgress.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.458363+08:00", comments="Source Table: t_sprint_progress")
    public static final class TSprintProgress extends SqlTable {
        public final SqlColumn<Object> sprintId = column("sprint_id", JDBCType.OTHER);

        public final SqlColumn<Date> statisticsDate = column("statistics_date", JDBCType.DATE);

        public final SqlColumn<BigDecimal> sprintRemainHours = column("sprint_remain_hours", JDBCType.NUMERIC);

        public final SqlColumn<Integer> sprintRemainPoint = column("sprint_remain_point", JDBCType.INTEGER);

        public final SqlColumn<Integer> sprintRemainStory = column("sprint_remain_story", JDBCType.INTEGER);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public TSprintProgress() {
            super("t_sprint_progress");
        }
    }
}