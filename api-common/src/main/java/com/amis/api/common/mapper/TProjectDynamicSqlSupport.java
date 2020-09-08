package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TProjectDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    public static final TProject TProject = new TProject();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.id")
    public static final SqlColumn<Object> id = TProject.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_name")
    public static final SqlColumn<String> projectName = TProject.projectName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_nation")
    public static final SqlColumn<String> projectNation = TProject.projectNation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_company")
    public static final SqlColumn<Object> projectCompany = TProject.projectCompany;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_contact")
    public static final SqlColumn<Object> projectContact = TProject.projectContact;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_amount")
    public static final SqlColumn<Integer> projectAmount = TProject.projectAmount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_amount_currency")
    public static final SqlColumn<Integer> projectAmountCurrency = TProject.projectAmountCurrency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_type")
    public static final SqlColumn<Integer> projectType = TProject.projectType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_start_plan")
    public static final SqlColumn<Date> projectStartPlan = TProject.projectStartPlan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_end_plan")
    public static final SqlColumn<Date> projectEndPlan = TProject.projectEndPlan;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_start_actual")
    public static final SqlColumn<Date> projectStartActual = TProject.projectStartActual;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_end_actual")
    public static final SqlColumn<Date> projectEndActual = TProject.projectEndActual;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_status")
    public static final SqlColumn<Integer> projectStatus = TProject.projectStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_progress_status")
    public static final SqlColumn<Integer> projectProgressStatus = TProject.projectProgressStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_trace_flag")
    public static final SqlColumn<Integer> projectTraceFlag = TProject.projectTraceFlag;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_trace_from")
    public static final SqlColumn<Date> projectTraceFrom = TProject.projectTraceFrom;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_trace_to")
    public static final SqlColumn<Date> projectTraceTo = TProject.projectTraceTo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_trace_frequency")
    public static final SqlColumn<Integer> projectTraceFrequency = TProject.projectTraceFrequency;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_trace_remind")
    public static final SqlColumn<Integer> projectTraceRemind = TProject.projectTraceRemind;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.project_memo")
    public static final SqlColumn<String> projectMemo = TProject.projectMemo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TProject.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TProject.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TProject.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TProject.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source field: t_project.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TProject.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    public static final class TProject extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);

        public final SqlColumn<String> projectName = column("project_name", JDBCType.VARCHAR);

        public final SqlColumn<String> projectNation = column("project_nation", JDBCType.VARCHAR);

        public final SqlColumn<Object> projectCompany = column("project_company", JDBCType.OTHER);

        public final SqlColumn<Object> projectContact = column("project_contact", JDBCType.OTHER);

        public final SqlColumn<Integer> projectAmount = column("project_amount", JDBCType.INTEGER);

        public final SqlColumn<Integer> projectAmountCurrency = column("project_amount_currency", JDBCType.INTEGER);

        public final SqlColumn<Integer> projectType = column("project_type", JDBCType.INTEGER);

        public final SqlColumn<Date> projectStartPlan = column("project_start_plan", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> projectEndPlan = column("project_end_plan", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> projectStartActual = column("project_start_actual", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> projectEndActual = column("project_end_actual", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> projectStatus = column("project_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> projectProgressStatus = column("project_progress_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> projectTraceFlag = column("project_trace_flag", JDBCType.INTEGER);

        public final SqlColumn<Date> projectTraceFrom = column("project_trace_from", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> projectTraceTo = column("project_trace_to", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> projectTraceFrequency = column("project_trace_frequency", JDBCType.INTEGER);

        public final SqlColumn<Integer> projectTraceRemind = column("project_trace_remind", JDBCType.INTEGER);

        public final SqlColumn<String> projectMemo = column("project_memo", JDBCType.VARCHAR);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public TProject() {
            super("t_project");
        }
    }
}
