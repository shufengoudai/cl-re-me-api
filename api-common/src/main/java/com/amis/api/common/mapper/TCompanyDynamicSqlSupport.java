package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TCompanyDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6685767+08:00", comments="Source Table: t_company")
    public static final TCompany TCompany = new TCompany();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6685767+08:00", comments="Source field: t_company.id")
    public static final SqlColumn<Object> id = TCompany.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6695783+08:00", comments="Source field: t_company.company_name")
    public static final SqlColumn<String> companyName = TCompany.companyName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6695783+08:00", comments="Source field: t_company.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TCompany.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6695783+08:00", comments="Source field: t_company.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TCompany.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6695783+08:00", comments="Source field: t_company.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TCompany.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6695783+08:00", comments="Source field: t_company.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TCompany.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6695783+08:00", comments="Source field: t_company.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TCompany.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6695783+08:00", comments="Source field: t_company.company_identify")
    public static final SqlColumn<String> companyIdentify = TCompany.companyIdentify;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6685767+08:00", comments="Source Table: t_company")
    public static final class TCompany extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);

        public final SqlColumn<String> companyName = column("company_name", JDBCType.VARCHAR);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public final SqlColumn<String> companyIdentify = column("company_identify", JDBCType.VARCHAR);

        public TCompany() {
            super("t_company");
        }
    }
}