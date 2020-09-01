package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.AuthRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.AuthRole;
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
public interface AuthRoleMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, pid, status, remark, createTime, updateTime, listorder);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AuthRole> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AuthRole> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("AuthRoleResult")
    Optional<AuthRole> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "AuthRoleResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "name", property = "name", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pid", property = "pid", jdbcType = JdbcType.INTEGER),
            @Result(column = "status", property = "status", jdbcType = JdbcType.SMALLINT),
            @Result(column = "remark", property = "remark", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "update_time", property = "updateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "listorder", property = "listorder", jdbcType = JdbcType.INTEGER) })
    List<AuthRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, authRole, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3153012+08:00", comments = "Source Table: auth_role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, authRole, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default int insert(AuthRole record) {
        return MyBatis3Utils.insert(this::insert, record, authRole,
                c -> c.map(id).toProperty("id").map(name).toProperty("name").map(pid).toProperty("pid").map(status)
                        .toProperty("status").map(remark).toProperty("remark").map(createTime).toProperty("createTime")
                        .map(updateTime).toProperty("updateTime").map(listorder).toProperty("listorder"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default int insertMultiple(Collection<AuthRole> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, authRole,
                c -> c.map(id).toProperty("id").map(name).toProperty("name").map(pid).toProperty("pid").map(status)
                        .toProperty("status").map(remark).toProperty("remark").map(createTime).toProperty("createTime")
                        .map(updateTime).toProperty("updateTime").map(listorder).toProperty("listorder"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default int insertSelective(AuthRole record) {
        return MyBatis3Utils.insert(this::insert, record, authRole,
                c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(name)
                        .toPropertyWhenPresent("name", record::getName).map(pid)
                        .toPropertyWhenPresent("pid", record::getPid).map(status)
                        .toPropertyWhenPresent("status", record::getStatus).map(remark)
                        .toPropertyWhenPresent("remark", record::getRemark).map(createTime)
                        .toPropertyWhenPresent("createTime", record::getCreateTime).map(updateTime)
                        .toPropertyWhenPresent("updateTime", record::getUpdateTime).map(listorder)
                        .toPropertyWhenPresent("listorder", record::getListorder));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default Optional<AuthRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, authRole, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default List<AuthRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, authRole, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default List<AuthRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, authRole, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default Optional<AuthRole> selectByPrimaryKey(Integer id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, authRole, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    static UpdateDSL<UpdateModel> updateAllColumns(AuthRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(name).equalTo(record::getName).set(pid).equalTo(record::getPid)
                .set(status).equalTo(record::getStatus).set(remark).equalTo(record::getRemark).set(createTime)
                .equalTo(record::getCreateTime).set(updateTime).equalTo(record::getUpdateTime).set(listorder)
                .equalTo(record::getListorder);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AuthRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(name).equalToWhenPresent(record::getName).set(pid)
                .equalToWhenPresent(record::getPid).set(status).equalToWhenPresent(record::getStatus).set(remark)
                .equalToWhenPresent(record::getRemark).set(createTime).equalToWhenPresent(record::getCreateTime)
                .set(updateTime).equalToWhenPresent(record::getUpdateTime).set(listorder)
                .equalToWhenPresent(record::getListorder);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default int updateByPrimaryKey(AuthRole record) {
        return update(c -> c.set(name).equalTo(record::getName).set(pid).equalTo(record::getPid).set(status)
                .equalTo(record::getStatus).set(remark).equalTo(record::getRemark).set(createTime)
                .equalTo(record::getCreateTime).set(updateTime).equalTo(record::getUpdateTime).set(listorder)
                .equalTo(record::getListorder).where(id, isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3162999+08:00", comments = "Source Table: auth_role")
    default int updateByPrimaryKeySelective(AuthRole record) {
        return update(c -> c.set(name).equalToWhenPresent(record::getName).set(pid).equalToWhenPresent(record::getPid)
                .set(status).equalToWhenPresent(record::getStatus).set(remark).equalToWhenPresent(record::getRemark)
                .set(createTime).equalToWhenPresent(record::getCreateTime).set(updateTime)
                .equalToWhenPresent(record::getUpdateTime).set(listorder).equalToWhenPresent(record::getListorder)
                .where(id, isEqualTo(record::getId)));
    }
}
