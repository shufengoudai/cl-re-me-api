package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TBugNewDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3362375+08:00", comments="Source Table: t_bug_new")
    public static final TBugNew TBugNew = new TBugNew();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3362375+08:00", comments="Source field: t_bug_new.id")
    public static final SqlColumn<Object> id = TBugNew.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3362375+08:00", comments="Source field: t_bug_new.bug_code")
    public static final SqlColumn<String> bugCode = TBugNew.bugCode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3362375+08:00", comments="Source field: t_bug_new.bug_project")
    public static final SqlColumn<Object> bugProject = TBugNew.bugProject;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3362375+08:00", comments="Source field: t_bug_new.bug_title")
    public static final SqlColumn<String> bugTitle = TBugNew.bugTitle;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_owner")
    public static final SqlColumn<Object> bugOwner = TBugNew.bugOwner;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_priority")
    public static final SqlColumn<Integer> bugPriority = TBugNew.bugPriority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_end")
    public static final SqlColumn<Date> bugEnd = TBugNew.bugEnd;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_fixer")
    public static final SqlColumn<Object> bugFixer = TBugNew.bugFixer;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_related_person")
    public static final SqlColumn<Object> bugRelatedPerson = TBugNew.bugRelatedPerson;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_sprint")
    public static final SqlColumn<Object> bugSprint = TBugNew.bugSprint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_found_process")
    public static final SqlColumn<Integer> bugFoundProcess = TBugNew.bugFoundProcess;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_story")
    public static final SqlColumn<Object> bugStory = TBugNew.bugStory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3372366+08:00", comments="Source field: t_bug_new.bug_test_times")
    public static final SqlColumn<Integer> bugTestTimes = TBugNew.bugTestTimes;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_found_version")
    public static final SqlColumn<String> bugFoundVersion = TBugNew.bugFoundVersion;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_found_function")
    public static final SqlColumn<String> bugFoundFunction = TBugNew.bugFoundFunction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_recurrence_probability")
    public static final SqlColumn<Integer> bugRecurrenceProbability = TBugNew.bugRecurrenceProbability;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_type")
    public static final SqlColumn<Integer> bugType = TBugNew.bugType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_recurrence_step")
    public static final SqlColumn<String> bugRecurrenceStep = TBugNew.bugRecurrenceStep;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_description")
    public static final SqlColumn<String> bugDescription = TBugNew.bugDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_status")
    public static final SqlColumn<Integer> bugStatus = TBugNew.bugStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_division")
    public static final SqlColumn<Integer> bugDivision = TBugNew.bugDivision;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3382384+08:00", comments="Source field: t_bug_new.bug_cause_analysis")
    public static final SqlColumn<Integer> bugCauseAnalysis = TBugNew.bugCauseAnalysis;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.bug_caused_sprint")
    public static final SqlColumn<Object> bugCausedSprint = TBugNew.bugCausedSprint;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.bug_caused_process")
    public static final SqlColumn<Integer> bugCausedProcess = TBugNew.bugCausedProcess;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.bug_caused_story")
    public static final SqlColumn<Object> bugCausedStory = TBugNew.bugCausedStory;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.bug_fix_method")
    public static final SqlColumn<String> bugFixMethod = TBugNew.bugFixMethod;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TBugNew.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TBugNew.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TBugNew.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TBugNew.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3392376+08:00", comments="Source field: t_bug_new.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TBugNew.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3362375+08:00", comments="Source Table: t_bug_new")
    public static final class TBugNew extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);

        public final SqlColumn<String> bugCode = column("bug_code", JDBCType.VARCHAR);

        public final SqlColumn<Object> bugProject = column("bug_project", JDBCType.OTHER);

        public final SqlColumn<String> bugTitle = column("bug_title", JDBCType.VARCHAR);

        public final SqlColumn<Object> bugOwner = column("bug_owner", JDBCType.OTHER);

        public final SqlColumn<Integer> bugPriority = column("bug_priority", JDBCType.INTEGER);

        public final SqlColumn<Date> bugEnd = column("bug_end", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> bugFixer = column("bug_fixer", JDBCType.OTHER);

        public final SqlColumn<Object> bugRelatedPerson = column("bug_related_person", JDBCType.OTHER);

        public final SqlColumn<Object> bugSprint = column("bug_sprint", JDBCType.OTHER);

        public final SqlColumn<Integer> bugFoundProcess = column("bug_found_process", JDBCType.INTEGER);

        public final SqlColumn<Object> bugStory = column("bug_story", JDBCType.OTHER);

        public final SqlColumn<Integer> bugTestTimes = column("bug_test_times", JDBCType.INTEGER);

        public final SqlColumn<String> bugFoundVersion = column("bug_found_version", JDBCType.VARCHAR);

        public final SqlColumn<String> bugFoundFunction = column("bug_found_function", JDBCType.VARCHAR);

        public final SqlColumn<Integer> bugRecurrenceProbability = column("bug_recurrence_probability", JDBCType.INTEGER);

        public final SqlColumn<Integer> bugType = column("bug_type", JDBCType.INTEGER);

        public final SqlColumn<String> bugRecurrenceStep = column("bug_recurrence_step", JDBCType.VARCHAR);

        public final SqlColumn<String> bugDescription = column("bug_description", JDBCType.VARCHAR);

        public final SqlColumn<Integer> bugStatus = column("bug_status", JDBCType.INTEGER);

        public final SqlColumn<Integer> bugDivision = column("bug_division", JDBCType.INTEGER);

        public final SqlColumn<Integer> bugCauseAnalysis = column("bug_cause_analysis", JDBCType.INTEGER);

        public final SqlColumn<Object> bugCausedSprint = column("bug_caused_sprint", JDBCType.OTHER);

        public final SqlColumn<Integer> bugCausedProcess = column("bug_caused_process", JDBCType.INTEGER);

        public final SqlColumn<Object> bugCausedStory = column("bug_caused_story", JDBCType.OTHER);

        public final SqlColumn<String> bugFixMethod = column("bug_fix_method", JDBCType.VARCHAR);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public TBugNew() {
            super("t_bug_new");
        }
    }
}