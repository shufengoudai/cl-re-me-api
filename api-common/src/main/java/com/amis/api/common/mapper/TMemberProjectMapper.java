package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TMemberProjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TMemberProject;
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
public interface TMemberProjectMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    BasicColumn[] selectList = BasicColumn.columnList(userId, projectId, projectRole, projecgtAccessDate, projectRemark,
            insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<TMemberProject> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TMemberProject> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("TMemberProjectResult")
    Optional<TMemberProject> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "TMemberProjectResult", value = {
            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.OTHER, id = true),
            @Result(column = "project_id", property = "projectId", jdbcType = JdbcType.OTHER, id = true),
            @Result(column = "project_role", property = "projectRole", jdbcType = JdbcType.INTEGER),
            @Result(column = "projecgt_access_date", property = "projecgtAccessDate", jdbcType = JdbcType.DATE),
            @Result(column = "project_remark", property = "projectRemark", jdbcType = JdbcType.INTEGER),
            @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER) })
    List<TMemberProject> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TMemberProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TMemberProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3402846+08:00", comments = "Source Table: t_member_project")
    default int deleteByPrimaryKey(Object userId_, Object projectId_) {
        return delete(c -> c.where(userId, isEqualTo(userId_)).and(projectId, isEqualTo(projectId_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default int insert(TMemberProject record) {
        return MyBatis3Utils.insert(this::insert, record, TMemberProject,
                c -> c.map(userId).toProperty("userId").map(projectId).toProperty("projectId").map(projectRole)
                        .toProperty("projectRole").map(projecgtAccessDate).toProperty("projecgtAccessDate")
                        .map(projectRemark).toProperty("projectRemark").map(insAccountId).toProperty("insAccountId")
                        .map(insDtTime).toProperty("insDtTime").map(updAccountId).toProperty("updAccountId")
                        .map(updDtTime).toProperty("updDtTime").map(logicalDelDiv).toProperty("logicalDelDiv"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default int insertMultiple(Collection<TMemberProject> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TMemberProject,
                c -> c.map(userId).toProperty("userId").map(projectId).toProperty("projectId").map(projectRole)
                        .toProperty("projectRole").map(projecgtAccessDate).toProperty("projecgtAccessDate")
                        .map(projectRemark).toProperty("projectRemark").map(insAccountId).toProperty("insAccountId")
                        .map(insDtTime).toProperty("insDtTime").map(updAccountId).toProperty("updAccountId")
                        .map(updDtTime).toProperty("updDtTime").map(logicalDelDiv).toProperty("logicalDelDiv"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default int insertSelective(TMemberProject record) {
        return MyBatis3Utils.insert(this::insert, record, TMemberProject,
                c -> c.map(userId).toPropertyWhenPresent("userId", record::getUserId).map(projectId)
                        .toPropertyWhenPresent("projectId", record::getProjectId).map(projectRole)
                        .toPropertyWhenPresent("projectRole", record::getProjectRole).map(projecgtAccessDate)
                        .toPropertyWhenPresent("projecgtAccessDate", record::getProjecgtAccessDate).map(projectRemark)
                        .toPropertyWhenPresent("projectRemark", record::getProjectRemark).map(insAccountId)
                        .toPropertyWhenPresent("insAccountId", record::getInsAccountId).map(insDtTime)
                        .toPropertyWhenPresent("insDtTime", record::getInsDtTime).map(updAccountId)
                        .toPropertyWhenPresent("updAccountId", record::getUpdAccountId).map(updDtTime)
                        .toPropertyWhenPresent("updDtTime", record::getUpdDtTime).map(logicalDelDiv)
                        .toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default Optional<TMemberProject> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TMemberProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default List<TMemberProject> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TMemberProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default List<TMemberProject> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TMemberProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default Optional<TMemberProject> selectByPrimaryKey(Object userId_, Object projectId_) {
        return selectOne(c -> c.where(userId, isEqualTo(userId_)).and(projectId, isEqualTo(projectId_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TMemberProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    static UpdateDSL<UpdateModel> updateAllColumns(TMemberProject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalTo(record::getUserId).set(projectId).equalTo(record::getProjectId).set(projectRole)
                .equalTo(record::getProjectRole).set(projecgtAccessDate).equalTo(record::getProjecgtAccessDate)
                .set(projectRemark).equalTo(record::getProjectRemark).set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime).set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime).set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TMemberProject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalToWhenPresent(record::getUserId).set(projectId)
                .equalToWhenPresent(record::getProjectId).set(projectRole).equalToWhenPresent(record::getProjectRole)
                .set(projecgtAccessDate).equalToWhenPresent(record::getProjecgtAccessDate).set(projectRemark)
                .equalToWhenPresent(record::getProjectRemark).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default int updateByPrimaryKey(TMemberProject record) {
        return update(c -> c.set(projectRole).equalTo(record::getProjectRole).set(projecgtAccessDate)
                .equalTo(record::getProjecgtAccessDate).set(projectRemark).equalTo(record::getProjectRemark)
                .set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv).where(userId, isEqualTo(record::getUserId))
                .and(projectId, isEqualTo(record::getProjectId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3412843+08:00", comments = "Source Table: t_member_project")
    default int updateByPrimaryKeySelective(TMemberProject record) {
        return update(c -> c.set(projectRole).equalToWhenPresent(record::getProjectRole).set(projecgtAccessDate)
                .equalToWhenPresent(record::getProjecgtAccessDate).set(projectRemark)
                .equalToWhenPresent(record::getProjectRemark).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv).where(userId, isEqualTo(record::getUserId))
                .and(projectId, isEqualTo(record::getProjectId)));
    }
}
