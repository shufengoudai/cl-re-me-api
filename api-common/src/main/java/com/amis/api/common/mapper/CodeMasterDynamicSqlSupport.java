package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CodeMasterDynamicSqlSupport {
  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9816761+08:00",
      comments = "Source Table: code_master")
  public static final CodeMaster codeMaster = new CodeMaster();

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9816761+08:00",
      comments = "Source field: code_master.code_section")
  public static final SqlColumn<String> codeSection = codeMaster.codeSection;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9816761+08:00",
      comments = "Source field: code_master.code_key")
  public static final SqlColumn<Integer> codeKey = codeMaster.codeKey;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9816761+08:00",
      comments = "Source field: code_master.code_lang")
  public static final SqlColumn<Integer> codeLang = codeMaster.codeLang;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9816761+08:00",
      comments = "Source field: code_master.code_value")
  public static final SqlColumn<String> codeValue = codeMaster.codeValue;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9826754+08:00",
      comments = "Source field: code_master.ins_account_id")
  public static final SqlColumn<String> insAccountId = codeMaster.insAccountId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9826754+08:00",
      comments = "Source field: code_master.ins_dt_time")
  public static final SqlColumn<Date> insDtTime = codeMaster.insDtTime;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9826754+08:00",
      comments = "Source field: code_master.upd_account_id")
  public static final SqlColumn<String> updAccountId = codeMaster.updAccountId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9826754+08:00",
      comments = "Source field: code_master.upd_dt_time")
  public static final SqlColumn<Date> updDtTime = codeMaster.updDtTime;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9826754+08:00",
      comments = "Source field: code_master.logical_del_div")
  public static final SqlColumn<Integer> logicalDelDiv = codeMaster.logicalDelDiv;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9816761+08:00",
      comments = "Source Table: code_master")
  public static final class CodeMaster extends SqlTable {
    public final SqlColumn<String> codeSection = column("code_section", JDBCType.VARCHAR);

    public final SqlColumn<Integer> codeKey = column("code_key", JDBCType.INTEGER);

    public final SqlColumn<Integer> codeLang = column("code_lang", JDBCType.INTEGER);

    public final SqlColumn<String> codeValue = column("code_value", JDBCType.VARCHAR);

    public final SqlColumn<String> insAccountId = column("ins_account_id", JDBCType.VARCHAR);

    public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

    public final SqlColumn<String> updAccountId = column("upd_account_id", JDBCType.VARCHAR);

    public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

    public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

    public CodeMaster() {
      super("code_master");
    }
  }
}
