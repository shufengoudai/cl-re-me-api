package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.CodeMasterDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.CodeMaster;
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
public interface CodeMasterMapper {
  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9916807+08:00",
      comments = "Source Table: code_master")
  BasicColumn[] selectList =
      BasicColumn.columnList(
          codeSection,
          codeKey,
          codeLang,
          codeValue,
          insAccountId,
          insDtTime,
          updAccountId,
          updDtTime,
          logicalDelDiv);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9836747+08:00",
      comments = "Source Table: code_master")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  long count(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9842535+08:00",
      comments = "Source Table: code_master")
  @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
  int delete(DeleteStatementProvider deleteStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9842535+08:00",
      comments = "Source Table: code_master")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
  int insert(InsertStatementProvider<CodeMaster> insertStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9852555+08:00",
      comments = "Source Table: code_master")
  @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
  int insertMultiple(MultiRowInsertStatementProvider<CodeMaster> multipleInsertStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9862548+08:00",
      comments = "Source Table: code_master")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @ResultMap("CodeMasterResult")
  Optional<CodeMaster> selectOne(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9862548+08:00",
      comments = "Source Table: code_master")
  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @Results(
      id = "CodeMasterResult",
      value = {
        @Result(
            column = "code_section",
            property = "codeSection",
            jdbcType = JdbcType.VARCHAR,
            id = true),
        @Result(column = "code_key", property = "codeKey", jdbcType = JdbcType.INTEGER, id = true),
        @Result(
            column = "code_lang",
            property = "codeLang",
            jdbcType = JdbcType.INTEGER,
            id = true),
        @Result(column = "code_value", property = "codeValue", jdbcType = JdbcType.VARCHAR),
        @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
        @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER)
      })
  List<CodeMaster> selectMany(SelectStatementProvider selectStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9872542+08:00",
      comments = "Source Table: code_master")
  @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
  int update(UpdateStatementProvider updateStatement);

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9872542+08:00",
      comments = "Source Table: code_master")
  default long count(CountDSLCompleter completer) {
    return MyBatis3Utils.countFrom(this::count, codeMaster, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.988254+08:00",
      comments = "Source Table: code_master")
  default int delete(DeleteDSLCompleter completer) {
    return MyBatis3Utils.deleteFrom(this::delete, codeMaster, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.988254+08:00",
      comments = "Source Table: code_master")
  default int deleteByPrimaryKey(String codeSection_, Integer codeKey_, Integer codeLang_) {
    return delete(
        c ->
            c.where(codeSection, isEqualTo(codeSection_))
                .and(codeKey, isEqualTo(codeKey_))
                .and(codeLang, isEqualTo(codeLang_)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9892529+08:00",
      comments = "Source Table: code_master")
  default int insert(CodeMaster record) {
    return MyBatis3Utils.insert(
        this::insert,
        record,
        codeMaster,
        c ->
            c.map(codeSection)
                .toProperty("codeSection")
                .map(codeKey)
                .toProperty("codeKey")
                .map(codeLang)
                .toProperty("codeLang")
                .map(codeValue)
                .toProperty("codeValue")
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
      date = "2020-05-18T14:46:44.9906814+08:00",
      comments = "Source Table: code_master")
  default int insertMultiple(Collection<CodeMaster> records) {
    return MyBatis3Utils.insertMultiple(
        this::insertMultiple,
        records,
        codeMaster,
        c ->
            c.map(codeSection)
                .toProperty("codeSection")
                .map(codeKey)
                .toProperty("codeKey")
                .map(codeLang)
                .toProperty("codeLang")
                .map(codeValue)
                .toProperty("codeValue")
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
      date = "2020-05-18T14:46:44.9906814+08:00",
      comments = "Source Table: code_master")
  default int insertSelective(CodeMaster record) {
    return MyBatis3Utils.insert(
        this::insert,
        record,
        codeMaster,
        c ->
            c.map(codeSection)
                .toPropertyWhenPresent("codeSection", record::getCodeSection)
                .map(codeKey)
                .toPropertyWhenPresent("codeKey", record::getCodeKey)
                .map(codeLang)
                .toPropertyWhenPresent("codeLang", record::getCodeLang)
                .map(codeValue)
                .toPropertyWhenPresent("codeValue", record::getCodeValue)
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
      date = "2020-05-18T14:46:44.9926799+08:00",
      comments = "Source Table: code_master")
  default Optional<CodeMaster> selectOne(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectOne(this::selectOne, selectList, codeMaster, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9926799+08:00",
      comments = "Source Table: code_master")
  default List<CodeMaster> select(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectList(this::selectMany, selectList, codeMaster, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9936792+08:00",
      comments = "Source Table: code_master")
  default List<CodeMaster> selectDistinct(SelectDSLCompleter completer) {
    return MyBatis3Utils.selectDistinct(this::selectMany, selectList, codeMaster, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9936792+08:00",
      comments = "Source Table: code_master")
  default Optional<CodeMaster> selectByPrimaryKey(
      String codeSection_, Integer codeKey_, Integer codeLang_) {
    return selectOne(
        c ->
            c.where(codeSection, isEqualTo(codeSection_))
                .and(codeKey, isEqualTo(codeKey_))
                .and(codeLang, isEqualTo(codeLang_)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9936792+08:00",
      comments = "Source Table: code_master")
  default int update(UpdateDSLCompleter completer) {
    return MyBatis3Utils.update(this::update, codeMaster, completer);
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9946785+08:00",
      comments = "Source Table: code_master")
  static UpdateDSL<UpdateModel> updateAllColumns(CodeMaster record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(codeSection)
        .equalTo(record::getCodeSection)
        .set(codeKey)
        .equalTo(record::getCodeKey)
        .set(codeLang)
        .equalTo(record::getCodeLang)
        .set(codeValue)
        .equalTo(record::getCodeValue)
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
      date = "2020-05-18T14:46:44.9946785+08:00",
      comments = "Source Table: code_master")
  static UpdateDSL<UpdateModel> updateSelectiveColumns(
      CodeMaster record, UpdateDSL<UpdateModel> dsl) {
    return dsl.set(codeSection)
        .equalToWhenPresent(record::getCodeSection)
        .set(codeKey)
        .equalToWhenPresent(record::getCodeKey)
        .set(codeLang)
        .equalToWhenPresent(record::getCodeLang)
        .set(codeValue)
        .equalToWhenPresent(record::getCodeValue)
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
      date = "2020-05-18T14:46:44.9956782+08:00",
      comments = "Source Table: code_master")
  default int updateByPrimaryKey(CodeMaster record) {
    return update(
        c ->
            c.set(codeValue)
                .equalTo(record::getCodeValue)
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
                .where(codeSection, isEqualTo(record::getCodeSection))
                .and(codeKey, isEqualTo(record::getCodeKey))
                .and(codeLang, isEqualTo(record::getCodeLang)));
  }

  @Generated(
      value = "org.mybatis.generator.api.MyBatisGenerator",
      date = "2020-05-18T14:46:44.9956782+08:00",
      comments = "Source Table: code_master")
  default int updateByPrimaryKeySelective(CodeMaster record) {
    return update(
        c ->
            c.set(codeValue)
                .equalToWhenPresent(record::getCodeValue)
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
                .where(codeSection, isEqualTo(record::getCodeSection))
                .and(codeKey, isEqualTo(record::getCodeKey))
                .and(codeLang, isEqualTo(record::getCodeLang)));
  }
}
