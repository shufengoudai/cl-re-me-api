package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TProjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TProject;
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
public interface TProjectMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    BasicColumn[] selectList = BasicColumn.columnList(id, projectName, projectType, projectIdentify, projectDescription,
            projectStatus, projectStart, projectEnd, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv,
            companyId);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<TProject> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TProject> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("TProjectResult")
    Optional<TProject> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "TProjectResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.OTHER, id = true),
            @Result(column = "project_name", property = "projectName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_type", property = "projectType", jdbcType = JdbcType.INTEGER),
            @Result(column = "project_identify", property = "projectIdentify", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_description", property = "projectDescription", jdbcType = JdbcType.VARCHAR),
            @Result(column = "project_status", property = "projectStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "project_start", property = "projectStart", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "project_end", property = "projectEnd", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER),
            @Result(column = "company_id", property = "companyId", jdbcType = JdbcType.OTHER) })
    List<TProject> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6682791+08:00", comments = "Source Table: t_project")
    default int insert(TProject record) {
        return MyBatis3Utils.insert(this::insert, record, TProject,
                c -> c.map(id).toProperty("id").map(projectName).toProperty("projectName").map(projectType)
                        .toProperty("projectType").map(projectIdentify).toProperty("projectIdentify")
                        .map(projectDescription).toProperty("projectDescription").map(projectStatus)
                        .toProperty("projectStatus").map(projectStart).toProperty("projectStart").map(projectEnd)
                        .toProperty("projectEnd").map(insAccountId).toProperty("insAccountId").map(insDtTime)
                        .toProperty("insDtTime").map(updAccountId).toProperty("updAccountId").map(updDtTime)
                        .toProperty("updDtTime").map(logicalDelDiv).toProperty("logicalDelDiv").map(companyId)
                        .toProperty("companyId"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    default int insertMultiple(Collection<TProject> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TProject,
                c -> c.map(id).toProperty("id").map(projectName).toProperty("projectName").map(projectType)
                        .toProperty("projectType").map(projectIdentify).toProperty("projectIdentify")
                        .map(projectDescription).toProperty("projectDescription").map(projectStatus)
                        .toProperty("projectStatus").map(projectStart).toProperty("projectStart").map(projectEnd)
                        .toProperty("projectEnd").map(insAccountId).toProperty("insAccountId").map(insDtTime)
                        .toProperty("insDtTime").map(updAccountId).toProperty("updAccountId").map(updDtTime)
                        .toProperty("updDtTime").map(logicalDelDiv).toProperty("logicalDelDiv").map(companyId)
                        .toProperty("companyId"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    default int insertSelective(TProject record) {
        return MyBatis3Utils.insert(this::insert, record, TProject,
                c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(projectName)
                        .toPropertyWhenPresent("projectName", record::getProjectName).map(projectType)
                        .toPropertyWhenPresent("projectType", record::getProjectType).map(projectIdentify)
                        .toPropertyWhenPresent("projectIdentify", record::getProjectIdentify).map(projectDescription)
                        .toPropertyWhenPresent("projectDescription", record::getProjectDescription).map(projectStatus)
                        .toPropertyWhenPresent("projectStatus", record::getProjectStatus).map(projectStart)
                        .toPropertyWhenPresent("projectStart", record::getProjectStart).map(projectEnd)
                        .toPropertyWhenPresent("projectEnd", record::getProjectEnd).map(insAccountId)
                        .toPropertyWhenPresent("insAccountId", record::getInsAccountId).map(insDtTime)
                        .toPropertyWhenPresent("insDtTime", record::getInsDtTime).map(updAccountId)
                        .toPropertyWhenPresent("updAccountId", record::getUpdAccountId).map(updDtTime)
                        .toPropertyWhenPresent("updDtTime", record::getUpdDtTime).map(logicalDelDiv)
                        .toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv).map(companyId)
                        .toPropertyWhenPresent("companyId", record::getCompanyId));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    default Optional<TProject> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    default List<TProject> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    default List<TProject> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    default Optional<TProject> selectByPrimaryKey(Object id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TProject, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    static UpdateDSL<UpdateModel> updateAllColumns(TProject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(projectName).equalTo(record::getProjectName).set(projectType)
                .equalTo(record::getProjectType).set(projectIdentify).equalTo(record::getProjectIdentify)
                .set(projectDescription).equalTo(record::getProjectDescription).set(projectStatus)
                .equalTo(record::getProjectStatus).set(projectStart).equalTo(record::getProjectStart).set(projectEnd)
                .equalTo(record::getProjectEnd).set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime)
                .equalTo(record::getInsDtTime).set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime)
                .equalTo(record::getUpdDtTime).set(logicalDelDiv).equalTo(record::getLogicalDelDiv).set(companyId)
                .equalTo(record::getCompanyId);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TProject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(projectName).equalToWhenPresent(record::getProjectName)
                .set(projectType).equalToWhenPresent(record::getProjectType).set(projectIdentify)
                .equalToWhenPresent(record::getProjectIdentify).set(projectDescription)
                .equalToWhenPresent(record::getProjectDescription).set(projectStatus)
                .equalToWhenPresent(record::getProjectStatus).set(projectStart)
                .equalToWhenPresent(record::getProjectStart).set(projectEnd).equalToWhenPresent(record::getProjectEnd)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId).set(insDtTime)
                .equalToWhenPresent(record::getInsDtTime).set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv).set(companyId).equalToWhenPresent(record::getCompanyId);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6692778+08:00", comments = "Source Table: t_project")
    default int updateByPrimaryKey(TProject record) {
        return update(c -> c.set(projectName).equalTo(record::getProjectName).set(projectType)
                .equalTo(record::getProjectType).set(projectIdentify).equalTo(record::getProjectIdentify)
                .set(projectDescription).equalTo(record::getProjectDescription).set(projectStatus)
                .equalTo(record::getProjectStatus).set(projectStart).equalTo(record::getProjectStart).set(projectEnd)
                .equalTo(record::getProjectEnd).set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime)
                .equalTo(record::getInsDtTime).set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime)
                .equalTo(record::getUpdDtTime).set(logicalDelDiv).equalTo(record::getLogicalDelDiv).set(companyId)
                .equalTo(record::getCompanyId).where(id, isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-22T17:38:43.6702775+08:00", comments = "Source Table: t_project")
    default int updateByPrimaryKeySelective(TProject record) {
        return update(c -> c.set(projectName).equalToWhenPresent(record::getProjectName).set(projectType)
                .equalToWhenPresent(record::getProjectType).set(projectIdentify)
                .equalToWhenPresent(record::getProjectIdentify).set(projectDescription)
                .equalToWhenPresent(record::getProjectDescription).set(projectStatus)
                .equalToWhenPresent(record::getProjectStatus).set(projectStart)
                .equalToWhenPresent(record::getProjectStart).set(projectEnd).equalToWhenPresent(record::getProjectEnd)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId).set(insDtTime)
                .equalToWhenPresent(record::getInsDtTime).set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv).set(companyId).equalToWhenPresent(record::getCompanyId)
                .where(id, isEqualTo(record::getId)));
    }
}
