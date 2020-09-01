package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TMemberProjectDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3392854+08:00", comments = "Source Table: t_member_project")
    public static final TMemberProject TMemberProject = new TMemberProject();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3392854+08:00", comments = "Source field: t_member_project.user_id")
    public static final SqlColumn<Object> userId = TMemberProject.userId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3392854+08:00", comments = "Source field: t_member_project.project_id")
    public static final SqlColumn<Object> projectId = TMemberProject.projectId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source field: t_member_project.project_role")
    public static final SqlColumn<Integer> projectRole = TMemberProject.projectRole;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source field: t_member_project.projecgt_access_date")
    public static final SqlColumn<Date> projecgtAccessDate = TMemberProject.projecgtAccessDate;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source field: t_member_project.project_remark")
    public static final SqlColumn<Integer> projectRemark = TMemberProject.projectRemark;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source field: t_member_project.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TMemberProject.insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source field: t_member_project.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TMemberProject.insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source field: t_member_project.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TMemberProject.updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source field: t_member_project.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TMemberProject.updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source field: t_member_project.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TMemberProject.logicalDelDiv;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3392854+08:00", comments = "Source Table: t_member_project")
    public static final class TMemberProject extends SqlTable {
        public final SqlColumn<Object> userId = column("user_id", JDBCType.OTHER);
        public final SqlColumn<Object> projectId = column("project_id", JDBCType.OTHER);
        public final SqlColumn<Integer> projectRole = column("project_role", JDBCType.INTEGER);
        public final SqlColumn<Date> projecgtAccessDate = column("projecgt_access_date", JDBCType.DATE);
        public final SqlColumn<Integer> projectRemark = column("project_remark", JDBCType.INTEGER);
        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public TMemberProject() {
            super("t_member_project");
        }
    }
}
