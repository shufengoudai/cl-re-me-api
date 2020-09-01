package com.amis.api.common.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TBugDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3032376+08:00", comments="Source Table: t_bug")
    public static final TBug TBug = new TBug();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3042392+08:00", comments="Source field: t_bug.id")
    public static final SqlColumn<Object> id = TBug.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3042392+08:00", comments="Source field: t_bug.bug_project")
    public static final SqlColumn<Object> bugProject = TBug.bugProject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3042392+08:00", comments="Source field: t_bug.bug_title")
    public static final SqlColumn<String> bugTitle = TBug.bugTitle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3042392+08:00", comments="Source field: t_bug.bug_code")
    public static final SqlColumn<Integer> bugCode = TBug.bugCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3052367+08:00", comments="Source field: t_bug.bug_owner")
    public static final SqlColumn<Object> bugOwner = TBug.bugOwner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3052367+08:00", comments="Source field: t_bug.bug_priority")
    public static final SqlColumn<Integer> bugPriority = TBug.bugPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3052367+08:00", comments="Source field: t_bug.bug_end")
    public static final SqlColumn<Date> bugEnd = TBug.bugEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3052367+08:00", comments="Source field: t_bug.bug_severity")
    public static final SqlColumn<Integer> bugSeverity = TBug.bugSeverity;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3052367+08:00", comments="Source field: t_bug.bug_type")
    public static final SqlColumn<Integer> bugType = TBug.bugType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3052367+08:00", comments="Source field: t_bug.bug_recurrence_probability")
    public static final SqlColumn<Integer> bugRecurrenceProbability = TBug.bugRecurrenceProbability;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3052367+08:00", comments="Source field: t_bug.bug_recurrence_version")
    public static final SqlColumn<Object> bugRecurrenceVersion = TBug.bugRecurrenceVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3052367+08:00", comments="Source field: t_bug.bug_release_version")
    public static final SqlColumn<Object> bugReleaseVersion = TBug.bugReleaseVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3062383+08:00", comments="Source field: t_bug.bug_description")
    public static final SqlColumn<String> bugDescription = TBug.bugDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3062383+08:00", comments="Source field: t_bug.bug_recurrence_step")
    public static final SqlColumn<String> bugRecurrenceStep = TBug.bugRecurrenceStep;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3062383+08:00", comments="Source field: t_bug.bug_cause_analysis")
    public static final SqlColumn<Integer> bugCauseAnalysis = TBug.bugCauseAnalysis;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3062383+08:00", comments="Source field: t_bug.bug_sprint")
    public static final SqlColumn<Object> bugSprint = TBug.bugSprint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3062383+08:00", comments="Source field: t_bug.bug_point")
    public static final SqlColumn<Integer> bugPoint = TBug.bugPoint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3062383+08:00", comments="Source field: t_bug.bug_solution")
    public static final SqlColumn<Integer> bugSolution = TBug.bugSolution;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3062383+08:00", comments="Source field: t_bug.bug_status")
    public static final SqlColumn<Integer> bugStatus = TBug.bugStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3062383+08:00", comments="Source field: t_bug.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TBug.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3072383+08:00", comments="Source field: t_bug.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TBug.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3072383+08:00", comments="Source field: t_bug.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TBug.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3072383+08:00", comments="Source field: t_bug.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TBug.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3072383+08:00", comments="Source field: t_bug.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TBug.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3072383+08:00", comments="Source field: t_bug.bug_hour")
    public static final SqlColumn<BigDecimal> bugHour = TBug.bugHour;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3072383+08:00", comments="Source field: t_bug.bug_fixer")
    public static final SqlColumn<Object> bugFixer = TBug.bugFixer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3072383+08:00", comments="Source field: t_bug.bug_relative_person")
    public static final SqlColumn<Object> bugRelativePerson = TBug.bugRelativePerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3082381+08:00", comments="Source field: t_bug.bug_found_process")
    public static final SqlColumn<Integer> bugFoundProcess = TBug.bugFoundProcess;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3082381+08:00", comments="Source field: t_bug.bug_story")
    public static final SqlColumn<Object> bugStory = TBug.bugStory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3082381+08:00", comments="Source field: t_bug.bug_test_times")
    public static final SqlColumn<Integer> bugTestTimes = TBug.bugTestTimes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3082381+08:00", comments="Source field: t_bug.bug_found_version")
    public static final SqlColumn<String> bugFoundVersion = TBug.bugFoundVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3082381+08:00", comments="Source field: t_bug.bug_found_function")
    public static final SqlColumn<String> bugFoundFunction = TBug.bugFoundFunction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3082381+08:00", comments="Source field: t_bug.bug_start")
    public static final SqlColumn<Date> bugStart = TBug.bugStart;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3032376+08:00", comments="Source Table: t_bug")
    public static final class TBug extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);

        public final SqlColumn<Object> bugProject = column("bug_project", JDBCType.OTHER);

        public final SqlColumn<String> bugTitle = column("bug_title", JDBCType.VARCHAR);

        public final SqlColumn<Integer> bugCode = column("bug_code", JDBCType.INTEGER);

        public final SqlColumn<Object> bugOwner = column("bug_owner", JDBCType.OTHER);

        public final SqlColumn<Integer> bugPriority = column("bug_priority", JDBCType.INTEGER);

        public final SqlColumn<Date> bugEnd = column("bug_end", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> bugSeverity = column("bug_severity", JDBCType.INTEGER);

        public final SqlColumn<Integer> bugType = column("bug_type", JDBCType.INTEGER);

        public final SqlColumn<Integer> bugRecurrenceProbability = column("bug_recurrence_probability", JDBCType.INTEGER);

        public final SqlColumn<Object> bugRecurrenceVersion = column("bug_recurrence_version", JDBCType.OTHER);

        public final SqlColumn<Object> bugReleaseVersion = column("bug_release_version", JDBCType.OTHER);

        public final SqlColumn<String> bugDescription = column("bug_description", JDBCType.VARCHAR);

        public final SqlColumn<String> bugRecurrenceStep = column("bug_recurrence_step", JDBCType.VARCHAR);

        public final SqlColumn<Integer> bugCauseAnalysis = column("bug_cause_analysis", JDBCType.INTEGER);

        public final SqlColumn<Object> bugSprint = column("bug_sprint", JDBCType.OTHER);

        public final SqlColumn<Integer> bugPoint = column("bug_point", JDBCType.INTEGER);

        public final SqlColumn<Integer> bugSolution = column("bug_solution", JDBCType.INTEGER);

        public final SqlColumn<Integer> bugStatus = column("bug_status", JDBCType.INTEGER);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> bugHour = column("bug_hour", JDBCType.NUMERIC);

        public final SqlColumn<Object> bugFixer = column("bug_fixer", JDBCType.OTHER);

        public final SqlColumn<Object> bugRelativePerson = column("bug_relative_person", JDBCType.OTHER);

        public final SqlColumn<Integer> bugFoundProcess = column("bug_found_process", JDBCType.INTEGER);

        public final SqlColumn<Object> bugStory = column("bug_story", JDBCType.OTHER);

        public final SqlColumn<Integer> bugTestTimes = column("bug_test_times", JDBCType.INTEGER);

        public final SqlColumn<String> bugFoundVersion = column("bug_found_version", JDBCType.VARCHAR);

        public final SqlColumn<String> bugFoundFunction = column("bug_found_function", JDBCType.VARCHAR);

        public final SqlColumn<Date> bugStart = column("bug_start", JDBCType.TIMESTAMP);

        public TBug() {
            super("t_bug");
        }
    }
}