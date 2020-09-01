package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TSprintDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source Table: t_sprint")
    public static final TSprint TSprint = new TSprint();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.id")
    public static final SqlColumn<Object> id = TSprint.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.sprint_name")
    public static final SqlColumn<String> sprintName = TSprint.sprintName;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.sprint_project")
    public static final SqlColumn<Object> sprintProject = TSprint.sprintProject;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.sprint_status")
    public static final SqlColumn<Integer> sprintStatus = TSprint.sprintStatus;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.sprint_owner")
    public static final SqlColumn<Object> sprintOwner = TSprint.sprintOwner;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.sprint_start")
    public static final SqlColumn<Date> sprintStart = TSprint.sprintStart;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.sprint_end")
    public static final SqlColumn<Date> sprintEnd = TSprint.sprintEnd;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.sprint_description")
    public static final SqlColumn<String> sprintDescription = TSprint.sprintDescription;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TSprint.insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TSprint.insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TSprint.updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TSprint.updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TSprint.logicalDelDiv;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source field: t_sprint.sprint_progress")
    public static final SqlColumn<Float> sprintProgress = TSprint.sprintProgress;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source Table: t_sprint")
    public static final class TSprint extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);
        public final SqlColumn<String> sprintName = column("sprint_name", JDBCType.VARCHAR);
        public final SqlColumn<Object> sprintProject = column("sprint_project", JDBCType.OTHER);
        public final SqlColumn<Integer> sprintStatus = column("sprint_status", JDBCType.INTEGER);
        public final SqlColumn<Object> sprintOwner = column("sprint_owner", JDBCType.OTHER);
        public final SqlColumn<Date> sprintStart = column("sprint_start", JDBCType.TIMESTAMP);
        public final SqlColumn<Date> sprintEnd = column("sprint_end", JDBCType.TIMESTAMP);
        public final SqlColumn<String> sprintDescription = column("sprint_description", JDBCType.VARCHAR);
        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);
        public final SqlColumn<Float> sprintProgress = column("sprint_progress", JDBCType.INTEGER);

        public TSprint() {
            super("t_sprint");
        }
    }
}
