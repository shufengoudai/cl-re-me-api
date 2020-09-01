package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.AuthPermissionRuleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.AuthPermissionRule;
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
public interface AuthPermissionRuleMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    BasicColumn[] selectList = BasicColumn.columnList(id, pid, name, title, status, condition, listorder, createTime,
            updateTime);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AuthPermissionRule> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AuthPermissionRule> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("AuthPermissionRuleResult")
    Optional<AuthPermissionRule> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "AuthPermissionRuleResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "pid", property = "pid", jdbcType = JdbcType.INTEGER),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "title", property = "title", jdbcType = JdbcType.VARCHAR),
            @Result(column = "status", property = "status", jdbcType = JdbcType.SMALLINT),
            @Result(column = "condition", property = "condition", jdbcType = JdbcType.VARCHAR),
            @Result(column = "listorder", property = "listorder", jdbcType = JdbcType.INTEGER),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP) })
    List<AuthPermissionRule> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, authPermissionRule, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, authPermissionRule, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    default int insert(AuthPermissionRule record) {
        return MyBatis3Utils.insert(this::insert, record, authPermissionRule,
                c -> c.map(id).toProperty("id").map(pid).toProperty("pid").map(name).toProperty("name").map(title)
                        .toProperty("title").map(status).toProperty("status").map(condition).toProperty("condition")
                        .map(listorder).toProperty("listorder").map(createTime).toProperty("createTime").map(updateTime)
                        .toProperty("updateTime"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    default int insertMultiple(Collection<AuthPermissionRule> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, authPermissionRule,
                c -> c.map(id).toProperty("id").map(pid).toProperty("pid").map(name).toProperty("name").map(title)
                        .toProperty("title").map(status).toProperty("status").map(condition).toProperty("condition")
                        .map(listorder).toProperty("listorder").map(createTime).toProperty("createTime").map(updateTime)
                        .toProperty("updateTime"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3123028+08:00", comments = "Source Table: auth_permission_rule")
    default int insertSelective(AuthPermissionRule record) {
        return MyBatis3Utils.insert(this::insert, record, authPermissionRule,
                c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(pid)
                        .toPropertyWhenPresent("pid", record::getPid).map(name)
                        .toPropertyWhenPresent("name", record::getName).map(title)
                        .toPropertyWhenPresent("title", record::getTitle).map(status)
                        .toPropertyWhenPresent("status", record::getStatus).map(condition)
                        .toPropertyWhenPresent("condition", record::getCondition).map(listorder)
                        .toPropertyWhenPresent("listorder", record::getListorder).map(createTime)
                        .toPropertyWhenPresent("createTime", record::getCreateTime).map(updateTime)
                        .toPropertyWhenPresent("updateTime", record::getUpdateTime));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    default Optional<AuthPermissionRule> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, authPermissionRule, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    default List<AuthPermissionRule> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, authPermissionRule, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    default List<AuthPermissionRule> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, authPermissionRule, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    default Optional<AuthPermissionRule> selectByPrimaryKey(Integer id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, authPermissionRule, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    static UpdateDSL<UpdateModel> updateAllColumns(AuthPermissionRule record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(pid).equalTo(record::getPid).set(name).equalTo(record::getName)
                .set(title).equalTo(record::getTitle).set(status).equalTo(record::getStatus).set(condition)
                .equalTo(record::getCondition).set(listorder).equalTo(record::getListorder).set(createTime)
                .equalTo(record::getCreateTime).set(updateTime).equalTo(record::getUpdateTime);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AuthPermissionRule record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(pid).equalToWhenPresent(record::getPid).set(name)
                .equalToWhenPresent(record::getName).set(title).equalToWhenPresent(record::getTitle).set(status)
                .equalToWhenPresent(record::getStatus).set(condition).equalToWhenPresent(record::getCondition)
                .set(listorder).equalToWhenPresent(record::getListorder).set(createTime)
                .equalToWhenPresent(record::getCreateTime).set(updateTime).equalToWhenPresent(record::getUpdateTime);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    default int updateByPrimaryKey(AuthPermissionRule record) {
        return update(c -> c.set(pid).equalTo(record::getPid).set(name).equalTo(record::getName).set(title)
                .equalTo(record::getTitle).set(status).equalTo(record::getStatus).set(condition)
                .equalTo(record::getCondition).set(listorder).equalTo(record::getListorder).set(createTime)
                .equalTo(record::getCreateTime).set(updateTime).equalTo(record::getUpdateTime)
                .where(id, isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3133021+08:00", comments = "Source Table: auth_permission_rule")
    default int updateByPrimaryKeySelective(AuthPermissionRule record) {
        return update(c -> c.set(pid).equalToWhenPresent(record::getPid).set(name).equalToWhenPresent(record::getName)
                .set(title).equalToWhenPresent(record::getTitle).set(status).equalToWhenPresent(record::getStatus)
                .set(condition).equalToWhenPresent(record::getCondition).set(listorder)
                .equalToWhenPresent(record::getListorder).set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime).where(id, isEqualTo(record::getId)));
    }
}
