package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TSprintKptDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5517636+08:00", comments="Source Table: t_sprint_kpt")
    public static final TSprintKpt TSprintKpt = new TSprintKpt();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.552764+08:00", comments="Source field: t_sprint_kpt.sprint_id")
    public static final SqlColumn<Object> sprintId = TSprintKpt.sprintId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5537662+08:00", comments="Source field: t_sprint_kpt.kpt_id")
    public static final SqlColumn<Integer> kptId = TSprintKpt.kptId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5537662+08:00", comments="Source field: t_sprint_kpt.kpt_type")
    public static final SqlColumn<Integer> kptType = TSprintKpt.kptType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5537662+08:00", comments="Source field: t_sprint_kpt.kpt_description")
    public static final SqlColumn<String> kptDescription = TSprintKpt.kptDescription;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5537662+08:00", comments="Source field: t_sprint_kpt.kpt_regist_account")
    public static final SqlColumn<Object> kptRegistAccount = TSprintKpt.kptRegistAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5537662+08:00", comments="Source field: t_sprint_kpt.kpt_update_account")
    public static final SqlColumn<Object> kptUpdateAccount = TSprintKpt.kptUpdateAccount;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5537662+08:00", comments="Source field: t_sprint_kpt.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TSprintKpt.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5537662+08:00", comments="Source field: t_sprint_kpt.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TSprintKpt.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5547662+08:00", comments="Source field: t_sprint_kpt.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TSprintKpt.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5547662+08:00", comments="Source field: t_sprint_kpt.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TSprintKpt.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5547662+08:00", comments="Source field: t_sprint_kpt.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TSprintKpt.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5547662+08:00", comments="Source field: t_sprint_kpt.kpt_role")
    public static final SqlColumn<Integer> kptRole = TSprintKpt.kptRole;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5547662+08:00", comments="Source field: t_sprint_kpt.kpt_status")
    public static final SqlColumn<Integer> kptStatus = TSprintKpt.kptStatus;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.552764+08:00", comments="Source Table: t_sprint_kpt")
    public static final class TSprintKpt extends SqlTable {
        public final SqlColumn<Object> sprintId = column("sprint_id", JDBCType.OTHER);

        public final SqlColumn<Integer> kptId = column("kpt_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> kptType = column("kpt_type", JDBCType.INTEGER);

        public final SqlColumn<String> kptDescription = column("kpt_description", JDBCType.VARCHAR);

        public final SqlColumn<Object> kptRegistAccount = column("kpt_regist_account", JDBCType.OTHER);

        public final SqlColumn<Object> kptUpdateAccount = column("kpt_update_account", JDBCType.OTHER);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public final SqlColumn<Integer> kptRole = column("kpt_role", JDBCType.INTEGER);

        public final SqlColumn<Integer> kptStatus = column("kpt_status", JDBCType.INTEGER);

        public TSprintKpt() {
            super("t_sprint_kpt");
        }
    }
}