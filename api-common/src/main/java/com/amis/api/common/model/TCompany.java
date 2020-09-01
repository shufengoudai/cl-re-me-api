package com.amis.api.common.model;

import java.util.Date;
import javax.annotation.Generated;

public class TCompany {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6605775+08:00", comments="Source field: t_company.id")
    private Object id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6625772+08:00", comments="Source field: t_company.company_name")
    private String companyName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6625772+08:00", comments="Source field: t_company.ins_account_id")
    private Object insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.ins_dt_time")
    private Date insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.upd_account_id")
    private Object updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.upd_dt_time")
    private Date updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.logical_del_div")
    private Integer logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.company_identify")
    private String companyIdentify;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6625772+08:00", comments="Source field: t_company.id")
    public Object getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6625772+08:00", comments="Source field: t_company.id")
    public void setId(Object id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6625772+08:00", comments="Source field: t_company.company_name")
    public String getCompanyName() {
        return companyName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6625772+08:00", comments="Source field: t_company.company_name")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6625772+08:00", comments="Source field: t_company.ins_account_id")
    public Object getInsAccountId() {
        return insAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6625772+08:00", comments="Source field: t_company.ins_account_id")
    public void setInsAccountId(Object insAccountId) {
        this.insAccountId = insAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.ins_dt_time")
    public Date getInsDtTime() {
        return insDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.ins_dt_time")
    public void setInsDtTime(Date insDtTime) {
        this.insDtTime = insDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.upd_account_id")
    public Object getUpdAccountId() {
        return updAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.upd_account_id")
    public void setUpdAccountId(Object updAccountId) {
        this.updAccountId = updAccountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.upd_dt_time")
    public Date getUpdDtTime() {
        return updDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.upd_dt_time")
    public void setUpdDtTime(Date updDtTime) {
        this.updDtTime = updDtTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.logical_del_div")
    public Integer getLogicalDelDiv() {
        return logicalDelDiv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.logical_del_div")
    public void setLogicalDelDiv(Integer logicalDelDiv) {
        this.logicalDelDiv = logicalDelDiv;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.company_identify")
    public String getCompanyIdentify() {
        return companyIdentify;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6635764+08:00", comments="Source field: t_company.company_identify")
    public void setCompanyIdentify(String companyIdentify) {
        this.companyIdentify = companyIdentify;
    }
}