package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.AuthPermissionDynamicSqlSupport.*;

import com.amis.api.common.model.AuthPermission;
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
public interface AuthPermissionMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3103034+08:00", comments = "Source Table: auth_permission")
    BasicColumn[] selectList = BasicColumn.columnList(roleId, permissionRuleId, type);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AuthPermission> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AuthPermission> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("AuthPermissionResult")
    Optional<AuthPermission> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "AuthPermissionResult", value = {
            @Result(column = "role_id", property = "roleId", jdbcType = JdbcType.INTEGER),
            @Result(column = "permission_rule_id", property = "permissionRuleId", jdbcType = JdbcType.INTEGER),
            @Result(column = "type", property = "type", jdbcType = JdbcType.VARCHAR) })
    List<AuthPermission> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, authPermission, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, authPermission, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    default int insert(AuthPermission record) {
        return MyBatis3Utils.insert(this::insert, record, authPermission, c -> c.map(roleId).toProperty("roleId")
                .map(permissionRuleId).toProperty("permissionRuleId").map(type).toProperty("type"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    default int insertMultiple(Collection<AuthPermission> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, authPermission,
                c -> c.map(roleId).toProperty("roleId").map(permissionRuleId).toProperty("permissionRuleId").map(type)
                        .toProperty("type"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.309305+08:00", comments = "Source Table: auth_permission")
    default int insertSelective(AuthPermission record) {
        return MyBatis3Utils.insert(this::insert, record, authPermission,
                c -> c.map(roleId).toPropertyWhenPresent("roleId", record::getRoleId).map(permissionRuleId)
                        .toPropertyWhenPresent("permissionRuleId", record::getPermissionRuleId).map(type)
                        .toPropertyWhenPresent("type", record::getType));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3103034+08:00", comments = "Source Table: auth_permission")
    default Optional<AuthPermission> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, authPermission, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3103034+08:00", comments = "Source Table: auth_permission")
    default List<AuthPermission> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, authPermission, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3103034+08:00", comments = "Source Table: auth_permission")
    default List<AuthPermission> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, authPermission, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3103034+08:00", comments = "Source Table: auth_permission")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, authPermission, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3103034+08:00", comments = "Source Table: auth_permission")
    static UpdateDSL<UpdateModel> updateAllColumns(AuthPermission record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(roleId).equalTo(record::getRoleId).set(permissionRuleId).equalTo(record::getPermissionRuleId)
                .set(type).equalTo(record::getType);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3103034+08:00", comments = "Source Table: auth_permission")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AuthPermission record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(roleId).equalToWhenPresent(record::getRoleId).set(permissionRuleId)
                .equalToWhenPresent(record::getPermissionRuleId).set(type).equalToWhenPresent(record::getType);
    }
}
