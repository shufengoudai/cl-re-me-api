package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TProjectDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source Table: t_project")
    public static final TProject TProject = new TProject();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.id")
    public static final SqlColumn<Object> id = TProject.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.project_name")
    public static final SqlColumn<String> projectName = TProject.projectName;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.project_type")
    public static final SqlColumn<Integer> projectType = TProject.projectType;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.project_identify")
    public static final SqlColumn<String> projectIdentify = TProject.projectIdentify;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.project_description")
    public static final SqlColumn<String> projectDescription = TProject.projectDescription;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.project_status")
    public static final SqlColumn<Integer> projectStatus = TProject.projectStatus;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.project_start")
    public static final SqlColumn<Date> projectStart = TProject.projectStart;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.project_end")
    public static final SqlColumn<Date> projectEnd = TProject.projectEnd;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TProject.insAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source field: t_project.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TProject.insDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source field: t_project.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TProject.updAccountId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source field: t_project.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TProject.updDtTime;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source field: t_project.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TProject.logicalDelDiv;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source field: t_project.company_id")
    public static final SqlColumn<Object> companyId = TProject.companyId;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6672798+08:00", comments = "Source Table: t_project")
    public static final class TProject extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);
        public final SqlColumn<String> projectName = column("project_name", JDBCType.VARCHAR);
        public final SqlColumn<Integer> projectType = column("project_type", JDBCType.INTEGER);
        public final SqlColumn<String> projectIdentify = column("project_identify", JDBCType.VARCHAR);
        public final SqlColumn<String> projectDescription = column("project_description", JDBCType.VARCHAR);
        public final SqlColumn<Integer> projectStatus = column("project_status", JDBCType.INTEGER);
        public final SqlColumn<Date> projectStart = column("project_start", JDBCType.TIMESTAMP);
        public final SqlColumn<Date> projectEnd = column("project_end", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);
        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);
        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);
        public final SqlColumn<Object> companyId = column("company_id", JDBCType.OTHER);

        public TProject() {
            super("t_project");
        }
    }
}
