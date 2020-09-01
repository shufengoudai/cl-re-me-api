package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TDepartmaentDynamicSqlSupport {

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source Table: t_departmaent")
  public static final TDepartmaent TDepartmaent = new TDepartmaent();

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source field: t_departmaent.id")
  public static final SqlColumn<Integer> id = TDepartmaent.id;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source field: t_departmaent.department_name")
  public static final SqlColumn<String> departmentName = TDepartmaent.departmentName;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source field: t_departmaent.ins_account_id")
  public static final SqlColumn<Integer> insAccountId = TDepartmaent.insAccountId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source field: t_departmaent.ins_dt_time")
  public static final SqlColumn<Date> insDtTime = TDepartmaent.insDtTime;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source field: t_departmaent.upd_account_id")
  public static final SqlColumn<Integer> updAccountId = TDepartmaent.updAccountId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source field: t_departmaent.upd_dt_time")
  public static final SqlColumn<Date> updDtTime = TDepartmaent.updDtTime;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source field: t_departmaent.logical_del_div")
  public static final SqlColumn<Integer> logicalDelDiv = TDepartmaent.logicalDelDiv;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source Table: t_departmaent")
  public static final class TDepartmaent extends SqlTable {
    public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);
    public final SqlColumn<String> departmentName = column("department_name", JDBCType.VARCHAR);
    public final SqlColumn<Integer> insAccountId = column("ins_account_id", JDBCType.INTEGER);
    public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);
    public final SqlColumn<Integer> updAccountId = column("upd_account_id", JDBCType.INTEGER);
    public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);
    public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

    public TDepartmaent() {
      super("t_departmaent");
    }
  }
}
