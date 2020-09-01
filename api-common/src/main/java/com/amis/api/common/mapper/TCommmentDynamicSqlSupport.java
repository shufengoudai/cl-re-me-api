package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TCommmentDynamicSqlSupport {
  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source Table: t_commment")
  public static final TCommment TCommment = new TCommment();

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.commment_id")
  public static final SqlColumn<Integer> commmentId = TCommment.commmentId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.comment_type")
  public static final SqlColumn<Integer> commentType = TCommment.commentType;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.comment_relative_id")
  public static final SqlColumn<Integer> commentRelativeId = TCommment.commentRelativeId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.comment_info")
  public static final SqlColumn<String> commentInfo = TCommment.commentInfo;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.comment_account")
  public static final SqlColumn<String> commentAccount = TCommment.commentAccount;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.comment_date")
  public static final SqlColumn<Date> commentDate = TCommment.commentDate;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.ins_account_id")
  public static final SqlColumn<String> insAccountId = TCommment.insAccountId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.ins_dt_time")
  public static final SqlColumn<Date> insDtTime = TCommment.insDtTime;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source field: t_commment.upd_account_id")
  public static final SqlColumn<String> updAccountId = TCommment.updAccountId;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source field: t_commment.upd_dt_time")
  public static final SqlColumn<Date> updDtTime = TCommment.updDtTime;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source field: t_commment.logical_del_div")
  public static final SqlColumn<Integer> logicalDelDiv = TCommment.logicalDelDiv;

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5232383+08:00",
      comments = "Source Table: t_commment")
  public static final class TCommment extends SqlTable {
    public final SqlColumn<Integer> commmentId = column("commment_id", JDBCType.INTEGER);

    public final SqlColumn<Integer> commentType = column("comment_type", JDBCType.INTEGER);

    public final SqlColumn<Integer> commentRelativeId =
        column("comment_relative_id", JDBCType.INTEGER);

    public final SqlColumn<String> commentInfo = column("comment_info", JDBCType.VARCHAR);

    public final SqlColumn<String> commentAccount = column("comment_account", JDBCType.VARCHAR);

    public final SqlColumn<Date> commentDate = column("comment_date", JDBCType.TIMESTAMP);

    public final SqlColumn<String> insAccountId = column("ins_account_id", JDBCType.VARCHAR);

    public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

    public final SqlColumn<String> updAccountId = column("upd_account_id", JDBCType.VARCHAR);

    public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

    public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

    public TCommment() {
      super("t_commment");
    }
  }
}
