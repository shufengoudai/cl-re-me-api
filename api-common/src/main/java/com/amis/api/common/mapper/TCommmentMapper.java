package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TCommmentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TCommment;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface TCommmentMapper {
  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  BasicColumn[] selectList =
      BasicColumn.columnList(
          commmentId,
          commentType,
          commentRelativeId,
          commentInfo,
          commentAccount,
          commentDate,
          insAccountId,
          insDtTime,
          updAccountId,
          updDtTime,
          logicalDelDiv);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  long count(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
  int delete(DeleteStatementProvider deleteStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
  int insert(InsertStatementProvider<TCommment> insertStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
  int insertMultiple(MultiRowInsertStatementProvider<TCommment> multipleInsertStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @ResultMap("TCommmentResult")
  Optional<TCommment> selectOne(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @Results(
      id = "TCommmentResult",
      value = {
        @Result(
            column = "commment_id",
            property = "commmentId",
            jdbcType = JdbcType.INTEGER,
            id = true),
        @Result(column = "comment_type", property = "commentType", jdbcType = JdbcType.INTEGER),
        @Result(
            column = "comment_relative_id",
            property = "commentRelativeId",
            jdbcType = JdbcType.INTEGER),
        @Result(column = "comment_info", property = "commentInfo", jdbcType = JdbcType.VARCHAR),
        @Result(
            column = "comment_account",
            property = "commentAccount",
            jdbcType = JdbcType.VARCHAR),
        @Result(column = "comment_date", property = "commentDate", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER)
      })
  List<TCommment> selectMany(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
  int update(UpdateStatementProvider updateStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  default long count(CountDSLCompleter completer) {
    return MyBatis3Utils.countFrom(this::count, TCommment, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  default int delete(DeleteDSLCompleter completer) {
    return MyBatis3Utils.deleteFrom(this::delete, TCommment, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  default int deleteByPrimaryKey(Integer commmentId_) {
    return delete(c -> c.where(commmentId, isEqualTo(commmentId_)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5242373+08:00",
      comments = "Source Table: t_commment")
  default int insert(TCommment record) {
    return MyBatis3Utils.insert(
        this::insert,
        record,
        TCommment,
        c ->
            c.map(commmentId)
                .toProperty("commmentId")
                .map(commentType)
                .toProperty("commentType")
                .map(commentRelativeId)
                .toProperty("commentRelativeId")
                .map(commentInfo)
                .toProperty("commentInfo")
                .map(commentAccount)
                .toProperty("commentAccount")
                .map(commentDate)
                .toProperty("commentDate")
                .map(insAccountId)
                .toProperty("insAccountId")
                .map(insDtTime)
                .toProperty("insDtTime")
                .map(updAccountId)
                .toProperty("updAccountId")
                .map(updDtTime)
                .toProperty("updDtTime")
                .map(logicalDelDiv)
                .toProperty("logicalDelDiv"));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default int insertMultiple(Collection<TCommment> records) {
    return MyBatis3Utils.insertMultiple(
        this::insertMultiple,
        records,
        TCommment,
        c ->
            c.map(commmentId)
                .toProperty("commmentId")
                .map(commentType)
                .toProperty("commentType")
                .map(commentRelativeId)
                .toProperty("commentRelativeId")
                .map(commentInfo)
                .toProperty("commentInfo")
                .map(commentAccount)
                .toProperty("commentAccount")
                .map(commentDate)
                .toProperty("commentDate")
                .map(insAccountId)
                .toProperty("insAccountId")
                .map(insDtTime)
                .toProperty("insDtTime")
                .map(updAccountId)
                .toProperty("updAccountId")
                .map(updDtTime)
                .toProperty("updDtTime")
                .map(logicalDelDiv)
                .toProperty("logicalDelDiv"));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default int insertSelective(TCommment record) {
    return MyBatis3Utils.insert(
        this::insert,
        record,
        TCommment,
        c ->
            c.map(commmentId)
                .toPropertyWhenPresent("commmentId", record::getCommmentId)
                .map(commentType)
                .toPropertyWhenPresent("commentType", record::getCommentType)
                .map(commentRelativeId)
                .toPropertyWhenPresent("commentRelativeId", record::getCommentRelativeId)
                .map(commentInfo)
                .toPropertyWhenPresent("commentInfo", record::getCommentInfo)
                .map(commentAccount)
                .toPropertyWhenPresent("commentAccount", record::getCommentAccount)
                .map(commentDate)
                .toPropertyWhenPresent("commentDate", record::getCommentDate)
                .map(insAccountId)
                .toPropertyWhenPresent("insAccountId", record::getInsAccountId)
                .map(insDtTime)
                .toPropertyWhenPresent("insDtTime", record::getInsDtTime)
                .map(updAccountId)
                .toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
                .map(updDtTime)
                .toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
                .map(logicalDelDiv)
                .toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default Optional<TCommment> selectOne(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectOne(this::selectOne, selectList, TCommment, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default List<TCommment> select(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectList(this::selectMany, selectList, TCommment, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default List<TCommment> selectDistinct(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TCommment, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default Optional<TCommment> selectByPrimaryKey(Integer commmentId_) {
    return selectOne(c -> c.where(commmentId, isEqualTo(commmentId_)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default int update(UpdateDSLCompleter completer) {
    return MyBatis3Utils.update(this::update, TCommment, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  static UpdateDSL<UpdateModel> updateAllColumns(TCommment record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(commmentId)
        .equalTo(record::getCommmentId)
        .set(commentType)
        .equalTo(record::getCommentType)
        .set(commentRelativeId)
        .equalTo(record::getCommentRelativeId)
        .set(commentInfo)
        .equalTo(record::getCommentInfo)
        .set(commentAccount)
        .equalTo(record::getCommentAccount)
        .set(commentDate)
        .equalTo(record::getCommentDate)
        .set(insAccountId)
        .equalTo(record::getInsAccountId)
        .set(insDtTime)
        .equalTo(record::getInsDtTime)
        .set(updAccountId)
        .equalTo(record::getUpdAccountId)
        .set(updDtTime)
        .equalTo(record::getUpdDtTime)
        .set(logicalDelDiv)
        .equalTo(record::getLogicalDelDiv);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  static UpdateDSL<UpdateModel> updateSelectiveColumns(
      TCommment record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(commmentId)
        .equalToWhenPresent(record::getCommmentId)
        .set(commentType)
        .equalToWhenPresent(record::getCommentType)
        .set(commentRelativeId)
        .equalToWhenPresent(record::getCommentRelativeId)
        .set(commentInfo)
        .equalToWhenPresent(record::getCommentInfo)
        .set(commentAccount)
        .equalToWhenPresent(record::getCommentAccount)
        .set(commentDate)
        .equalToWhenPresent(record::getCommentDate)
        .set(insAccountId)
        .equalToWhenPresent(record::getInsAccountId)
        .set(insDtTime)
        .equalToWhenPresent(record::getInsDtTime)
        .set(updAccountId)
        .equalToWhenPresent(record::getUpdAccountId)
        .set(updDtTime)
        .equalToWhenPresent(record::getUpdDtTime)
        .set(logicalDelDiv)
        .equalToWhenPresent(record::getLogicalDelDiv);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default int updateByPrimaryKey(TCommment record) {
    return update(
        c ->
            c.set(commentType)
                .equalTo(record::getCommentType)
                .set(commentRelativeId)
                .equalTo(record::getCommentRelativeId)
                .set(commentInfo)
                .equalTo(record::getCommentInfo)
                .set(commentAccount)
                .equalTo(record::getCommentAccount)
                .set(commentDate)
                .equalTo(record::getCommentDate)
                .set(insAccountId)
                .equalTo(record::getInsAccountId)
                .set(insDtTime)
                .equalTo(record::getInsDtTime)
                .set(updAccountId)
                .equalTo(record::getUpdAccountId)
                .set(updDtTime)
                .equalTo(record::getUpdDtTime)
                .set(logicalDelDiv)
                .equalTo(record::getLogicalDelDiv)
                .where(commmentId, isEqualTo(record::getCommmentId)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-15T13:59:15.5252369+08:00",
      comments = "Source Table: t_commment")
  default int updateByPrimaryKeySelective(TCommment record) {
    return update(
        c ->
            c.set(commentType)
                .equalToWhenPresent(record::getCommentType)
                .set(commentRelativeId)
                .equalToWhenPresent(record::getCommentRelativeId)
                .set(commentInfo)
                .equalToWhenPresent(record::getCommentInfo)
                .set(commentAccount)
                .equalToWhenPresent(record::getCommentAccount)
                .set(commentDate)
                .equalToWhenPresent(record::getCommentDate)
                .set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime)
                .equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId)
                .equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv)
                .where(commmentId, isEqualTo(record::getCommmentId)));
  }
}
