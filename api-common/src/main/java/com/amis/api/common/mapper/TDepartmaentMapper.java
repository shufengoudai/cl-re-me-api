package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TDepartmaentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TDepartmaent;
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
public interface TDepartmaentMapper {

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  BasicColumn[] selectList =
      BasicColumn.columnList(
          id, departmentName, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source Table: t_departmaent")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  long count(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source Table: t_departmaent")
  @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
  int delete(DeleteStatementProvider deleteStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source Table: t_departmaent")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
  int insert(InsertStatementProvider<TDepartmaent> insertStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.035656+08:00",
      comments = "Source Table: t_departmaent")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
  int insertMultiple(MultiRowInsertStatementProvider<TDepartmaent> multipleInsertStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @ResultMap("TDepartmaentResult")
  Optional<TDepartmaent> selectOne(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @Results(
      id = "TDepartmaentResult",
      value = {
        @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
        @Result(
            column = "department_name",
            property = "departmentName",
            jdbcType = JdbcType.VARCHAR),
        @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.INTEGER),
        @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.INTEGER),
        @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER)
      })
  List<TDepartmaent> selectMany(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
  int update(UpdateStatementProvider updateStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default long count(CountDSLCompleter completer) {
    return MyBatis3Utils.countFrom(this::count, TDepartmaent, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default int delete(DeleteDSLCompleter completer) {
    return MyBatis3Utils.deleteFrom(this::delete, TDepartmaent, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default int deleteByPrimaryKey(Integer id_) {
    return delete(c -> c.where(id, isEqualTo(id_)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default int insert(TDepartmaent record) {
    return MyBatis3Utils.insert(
        this::insert,
        record,
        TDepartmaent,
        c ->
            c.map(id)
                .toProperty("id")
                .map(departmentName)
                .toProperty("departmentName")
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
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default int insertMultiple(Collection<TDepartmaent> records) {
    return MyBatis3Utils.insertMultiple(
        this::insertMultiple,
        records,
        TDepartmaent,
        c ->
            c.map(id)
                .toProperty("id")
                .map(departmentName)
                .toProperty("departmentName")
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
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default int insertSelective(TDepartmaent record) {
    return MyBatis3Utils.insert(
        this::insert,
        record,
        TDepartmaent,
        c ->
            c.map(id)
                .toPropertyWhenPresent("id", record::getId)
                .map(departmentName)
                .toPropertyWhenPresent("departmentName", record::getDepartmentName)
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
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default Optional<TDepartmaent> selectOne(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectOne(this::selectOne, selectList, TDepartmaent, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default List<TDepartmaent> select(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectList(this::selectMany, selectList, TDepartmaent, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0366533+08:00",
      comments = "Source Table: t_departmaent")
  default List<TDepartmaent> selectDistinct(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TDepartmaent, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0376529+08:00",
      comments = "Source Table: t_departmaent")
  default Optional<TDepartmaent> selectByPrimaryKey(Integer id_) {
    return selectOne(c -> c.where(id, isEqualTo(id_)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0376529+08:00",
      comments = "Source Table: t_departmaent")
  default int update(UpdateDSLCompleter completer) {
    return MyBatis3Utils.update(this::update, TDepartmaent, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0376529+08:00",
      comments = "Source Table: t_departmaent")
  static UpdateDSL<UpdateModel> updateAllColumns(TDepartmaent record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(id)
        .equalTo(record::getId)
        .set(departmentName)
        .equalTo(record::getDepartmentName)
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
      date = "2020-05-18T14:46:45.0376529+08:00",
      comments = "Source Table: t_departmaent")
  static UpdateDSL<UpdateModel> updateSelectiveColumns(
      TDepartmaent record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(id)
        .equalToWhenPresent(record::getId)
        .set(departmentName)
        .equalToWhenPresent(record::getDepartmentName)
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
      date = "2020-05-18T14:46:45.0376529+08:00",
      comments = "Source Table: t_departmaent")
  default int updateByPrimaryKey(TDepartmaent record) {
    return update(
        c ->
            c.set(departmentName)
                .equalTo(record::getDepartmentName)
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
                .where(id, isEqualTo(record::getId)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:45.0376529+08:00",
      comments = "Source Table: t_departmaent")
  default int updateByPrimaryKeySelective(TDepartmaent record) {
    return update(
        c ->
            c.set(departmentName)
                .equalToWhenPresent(record::getDepartmentName)
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
                .where(id, isEqualTo(record::getId)));
  }
}
