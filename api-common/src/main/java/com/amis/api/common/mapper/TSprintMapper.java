package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TSprintDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TSprint;
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
public interface TSprintMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    BasicColumn[] selectList = BasicColumn.columnList(id, sprintName, sprintProject, sprintStatus, sprintOwner,
            sprintStart, sprintEnd, sprintDescription, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv,
            sprintProgress);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3492794+08:00", comments = "Source Table: t_sprint")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<TSprint> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TSprint> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("TSprintResult")
    Optional<TSprint> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "TSprintResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.OTHER, id = true),
            @Result(column = "sprint_name", property = "sprintName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "sprint_project", property = "sprintProject", jdbcType = JdbcType.OTHER),
            @Result(column = "sprint_status", property = "sprintStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "sprint_owner", property = "sprintOwner", jdbcType = JdbcType.OTHER),
            @Result(column = "sprint_start", property = "sprintStart", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "sprint_end", property = "sprintEnd", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "sprint_description", property = "sprintDescription", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER),
            @Result(column = "sprint_progress", property = "sprintProgress", jdbcType = JdbcType.INTEGER) })
    List<TSprint> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TSprint, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TSprint, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default int insert(TSprint record) {
        return MyBatis3Utils.insert(this::insert, record, TSprint,
                c -> c.map(id).toProperty("id").map(sprintName).toProperty("sprintName").map(sprintProject)
                        .toProperty("sprintProject").map(sprintStatus).toProperty("sprintStatus").map(sprintOwner)
                        .toProperty("sprintOwner").map(sprintStart).toProperty("sprintStart").map(sprintEnd)
                        .toProperty("sprintEnd").map(sprintDescription).toProperty("sprintDescription")
                        .map(insAccountId).toProperty("insAccountId").map(insDtTime).toProperty("insDtTime")
                        .map(updAccountId).toProperty("updAccountId").map(updDtTime).toProperty("updDtTime")
                        .map(logicalDelDiv).toProperty("logicalDelDiv").map(sprintProgress)
                        .toProperty("sprintProgress"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default int insertMultiple(Collection<TSprint> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TSprint,
                c -> c.map(id).toProperty("id").map(sprintName).toProperty("sprintName").map(sprintProject)
                        .toProperty("sprintProject").map(sprintStatus).toProperty("sprintStatus").map(sprintOwner)
                        .toProperty("sprintOwner").map(sprintStart).toProperty("sprintStart").map(sprintEnd)
                        .toProperty("sprintEnd").map(sprintDescription).toProperty("sprintDescription")
                        .map(insAccountId).toProperty("insAccountId").map(insDtTime).toProperty("insDtTime")
                        .map(updAccountId).toProperty("updAccountId").map(updDtTime).toProperty("updDtTime")
                        .map(logicalDelDiv).toProperty("logicalDelDiv").map(sprintProgress)
                        .toProperty("sprintProgress"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default int insertSelective(TSprint record) {
        return MyBatis3Utils.insert(this::insert, record, TSprint,
                c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(sprintName)
                        .toPropertyWhenPresent("sprintName", record::getSprintName).map(sprintProject)
                        .toPropertyWhenPresent("sprintProject", record::getSprintProject).map(sprintStatus)
                        .toPropertyWhenPresent("sprintStatus", record::getSprintStatus).map(sprintOwner)
                        .toPropertyWhenPresent("sprintOwner", record::getSprintOwner).map(sprintStart)
                        .toPropertyWhenPresent("sprintStart", record::getSprintStart).map(sprintEnd)
                        .toPropertyWhenPresent("sprintEnd", record::getSprintEnd).map(sprintDescription)
                        .toPropertyWhenPresent("sprintDescription", record::getSprintDescription).map(insAccountId)
                        .toPropertyWhenPresent("insAccountId", record::getInsAccountId).map(insDtTime)
                        .toPropertyWhenPresent("insDtTime", record::getInsDtTime).map(updAccountId)
                        .toPropertyWhenPresent("updAccountId", record::getUpdAccountId).map(updDtTime)
                        .toPropertyWhenPresent("updDtTime", record::getUpdDtTime).map(logicalDelDiv)
                        .toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv).map(sprintProgress)
                        .toPropertyWhenPresent("sprintProgress", record::getSprintProgress));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default Optional<TSprint> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TSprint, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default List<TSprint> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TSprint, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default List<TSprint> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TSprint, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3502815+08:00", comments = "Source Table: t_sprint")
    default Optional<TSprint> selectByPrimaryKey(Object id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.351279+08:00", comments = "Source Table: t_sprint")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TSprint, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.351279+08:00", comments = "Source Table: t_sprint")
    static UpdateDSL<UpdateModel> updateAllColumns(TSprint record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(sprintName).equalTo(record::getSprintName).set(sprintProject)
                .equalTo(record::getSprintProject).set(sprintStatus).equalTo(record::getSprintStatus).set(sprintOwner)
                .equalTo(record::getSprintOwner).set(sprintStart).equalTo(record::getSprintStart).set(sprintEnd)
                .equalTo(record::getSprintEnd).set(sprintDescription).equalTo(record::getSprintDescription)
                .set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv).set(sprintProgress)
                .equalTo(record::getSprintProgress);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.351279+08:00", comments = "Source Table: t_sprint")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TSprint record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(sprintName).equalToWhenPresent(record::getSprintName)
                .set(sprintProject).equalToWhenPresent(record::getSprintProject).set(sprintStatus)
                .equalToWhenPresent(record::getSprintStatus).set(sprintOwner).equalToWhenPresent(record::getSprintOwner)
                .set(sprintStart).equalToWhenPresent(record::getSprintStart).set(sprintEnd)
                .equalToWhenPresent(record::getSprintEnd).set(sprintDescription)
                .equalToWhenPresent(record::getSprintDescription).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv).set(sprintProgress)
                .equalToWhenPresent(record::getSprintProgress);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.351279+08:00", comments = "Source Table: t_sprint")
    default int updateByPrimaryKey(TSprint record) {
        return update(c -> c.set(sprintName).equalTo(record::getSprintName).set(sprintProject)
                .equalTo(record::getSprintProject).set(sprintStatus).equalTo(record::getSprintStatus).set(sprintOwner)
                .equalTo(record::getSprintOwner).set(sprintStart).equalTo(record::getSprintStart).set(sprintEnd)
                .equalTo(record::getSprintEnd).set(sprintDescription).equalTo(record::getSprintDescription)
                .set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv).set(sprintProgress)
                .equalTo(record::getSprintProgress).where(id, isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.351279+08:00", comments = "Source Table: t_sprint")
    default int updateByPrimaryKeySelective(TSprint record) {
        return update(c -> c.set(sprintName).equalToWhenPresent(record::getSprintName).set(sprintProject)
                .equalToWhenPresent(record::getSprintProject).set(sprintStatus)
                .equalToWhenPresent(record::getSprintStatus).set(sprintOwner).equalToWhenPresent(record::getSprintOwner)
                .set(sprintStart).equalToWhenPresent(record::getSprintStart).set(sprintEnd)
                .equalToWhenPresent(record::getSprintEnd).set(sprintDescription)
                .equalToWhenPresent(record::getSprintDescription).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv).set(sprintProgress)
                .equalToWhenPresent(record::getSprintProgress).where(id, isEqualTo(record::getId)));
    }
}
