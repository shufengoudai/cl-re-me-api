package com.amis.api.common.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TBugProgressDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7503222+08:00", comments="Source Table: t_bug_progress")
    public static final TBugProgress TBugProgress = new TBugProgress();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7503222+08:00", comments="Source field: t_bug_progress.bug_id")
    public static final SqlColumn<Object> bugId = TBugProgress.bugId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7503222+08:00", comments="Source field: t_bug_progress.statistics_date")
    public static final SqlColumn<Date> statisticsDate = TBugProgress.statisticsDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7503222+08:00", comments="Source field: t_bug_progress.hour_regist")
    public static final SqlColumn<BigDecimal> hourRegist = TBugProgress.hourRegist;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7513221+08:00", comments="Source field: t_bug_progress.hour_remain")
    public static final SqlColumn<BigDecimal> hourRemain = TBugProgress.hourRemain;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7513221+08:00", comments="Source field: t_bug_progress.hour_regist_account")
    public static final SqlColumn<Object> hourRegistAccount = TBugProgress.hourRegistAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7513221+08:00", comments="Source field: t_bug_progress.hour_update_account")
    public static final SqlColumn<Object> hourUpdateAccount = TBugProgress.hourUpdateAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7513221+08:00", comments="Source field: t_bug_progress.hour_description")
    public static final SqlColumn<Date> hourDescription = TBugProgress.hourDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7513221+08:00", comments="Source field: t_bug_progress.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TBugProgress.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7513221+08:00", comments="Source field: t_bug_progress.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TBugProgress.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7513221+08:00", comments="Source field: t_bug_progress.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TBugProgress.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7513221+08:00", comments="Source field: t_bug_progress.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TBugProgress.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source field: t_bug_progress.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TBugProgress.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7503222+08:00", comments="Source Table: t_bug_progress")
    public static final class TBugProgress extends SqlTable {
        public final SqlColumn<Object> bugId = column("bug_id", JDBCType.OTHER);

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

        public TBugProgress() {
            super("t_bug_progress");
        }
    }
}