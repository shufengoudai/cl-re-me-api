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
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    BasicColumn[] selectList = BasicColumn.columnList(id, projectName, projectNation, projectCompany, projectContact, projectAmount, projectAmountCurrency, projectType, projectStartPlan, projectEndPlan, projectStartActual, projectEndActual, projectStatus, projectProgressStatus, projectTraceFlag, projectTraceFrom, projectTraceTo, projectTraceFrequency, projectTraceRemind, projectMemo, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TProject> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TProject> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TProjectResult")
    Optional<TProject> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TProjectResult", value = {
            @Result(column="id", property="id", jdbcType=JdbcType.OTHER, id=true),
            @Result(column="project_name", property="projectName", jdbcType=JdbcType.VARCHAR),
            @Result(column="project_nation", property="projectNation", jdbcType=JdbcType.VARCHAR),
            @Result(column="project_company", property="projectCompany", jdbcType=JdbcType.OTHER),
            @Result(column="project_contact", property="projectContact", jdbcType=JdbcType.OTHER),
            @Result(column="project_amount", property="projectAmount", jdbcType=JdbcType.INTEGER),
            @Result(column="project_amount_currency", property="projectAmountCurrency", jdbcType=JdbcType.INTEGER),
            @Result(column="project_type", property="projectType", jdbcType=JdbcType.INTEGER),
            @Result(column="project_start_plan", property="projectStartPlan", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="project_end_plan", property="projectEndPlan", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="project_start_actual", property="projectStartActual", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="project_end_actual", property="projectEndActual", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="project_status", property="projectStatus", jdbcType=JdbcType.INTEGER),
            @Result(column="project_progress_status", property="projectProgressStatus", jdbcType=JdbcType.INTEGER),
            @Result(column="project_trace_flag", property="projectTraceFlag", jdbcType=JdbcType.INTEGER),
            @Result(column="project_trace_from", property="projectTraceFrom", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="project_trace_to", property="projectTraceTo", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="project_trace_frequency", property="projectTraceFrequency", jdbcType=JdbcType.INTEGER),
            @Result(column="project_trace_remind", property="projectTraceRemind", jdbcType=JdbcType.INTEGER),
            @Result(column="project_memo", property="projectMemo", jdbcType=JdbcType.VARCHAR),
            @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
            @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
            @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER)
    })
    List<TProject> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TProject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TProject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5239028+08:00", comments="Source Table: t_project")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c ->
                c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default int insert(TProject record) {
        return MyBatis3Utils.insert(this::insert, record, TProject, c ->
                c.map(id).toProperty("id")
                        .map(projectName).toProperty("projectName")
                        .map(projectNation).toProperty("projectNation")
                        .map(projectCompany).toProperty("projectCompany")
                        .map(projectContact).toProperty("projectContact")
                        .map(projectAmount).toProperty("projectAmount")
                        .map(projectAmountCurrency).toProperty("projectAmountCurrency")
                        .map(projectType).toProperty("projectType")
                        .map(projectStartPlan).toProperty("projectStartPlan")
                        .map(projectEndPlan).toProperty("projectEndPlan")
                        .map(projectStartActual).toProperty("projectStartActual")
                        .map(projectEndActual).toProperty("projectEndActual")
                        .map(projectStatus).toProperty("projectStatus")
                        .map(projectProgressStatus).toProperty("projectProgressStatus")
                        .map(projectTraceFlag).toProperty("projectTraceFlag")
                        .map(projectTraceFrom).toProperty("projectTraceFrom")
                        .map(projectTraceTo).toProperty("projectTraceTo")
                        .map(projectTraceFrequency).toProperty("projectTraceFrequency")
                        .map(projectTraceRemind).toProperty("projectTraceRemind")
                        .map(projectMemo).toProperty("projectMemo")
                        .map(insAccountId).toProperty("insAccountId")
                        .map(insDtTime).toProperty("insDtTime")
                        .map(updAccountId).toProperty("updAccountId")
                        .map(updDtTime).toProperty("updDtTime")
                        .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default int insertMultiple(Collection<TProject> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TProject, c ->
                c.map(id).toProperty("id")
                        .map(projectName).toProperty("projectName")
                        .map(projectNation).toProperty("projectNation")
                        .map(projectCompany).toProperty("projectCompany")
                        .map(projectContact).toProperty("projectContact")
                        .map(projectAmount).toProperty("projectAmount")
                        .map(projectAmountCurrency).toProperty("projectAmountCurrency")
                        .map(projectType).toProperty("projectType")
                        .map(projectStartPlan).toProperty("projectStartPlan")
                        .map(projectEndPlan).toProperty("projectEndPlan")
                        .map(projectStartActual).toProperty("projectStartActual")
                        .map(projectEndActual).toProperty("projectEndActual")
                        .map(projectStatus).toProperty("projectStatus")
                        .map(projectProgressStatus).toProperty("projectProgressStatus")
                        .map(projectTraceFlag).toProperty("projectTraceFlag")
                        .map(projectTraceFrom).toProperty("projectTraceFrom")
                        .map(projectTraceTo).toProperty("projectTraceTo")
                        .map(projectTraceFrequency).toProperty("projectTraceFrequency")
                        .map(projectTraceRemind).toProperty("projectTraceRemind")
                        .map(projectMemo).toProperty("projectMemo")
                        .map(insAccountId).toProperty("insAccountId")
                        .map(insDtTime).toProperty("insDtTime")
                        .map(updAccountId).toProperty("updAccountId")
                        .map(updDtTime).toProperty("updDtTime")
                        .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default int insertSelective(TProject record) {
        return MyBatis3Utils.insert(this::insert, record, TProject, c ->
                c.map(id).toPropertyWhenPresent("id", record::getId)
                        .map(projectName).toPropertyWhenPresent("projectName", record::getProjectName)
                        .map(projectNation).toPropertyWhenPresent("projectNation", record::getProjectNation)
                        .map(projectCompany).toPropertyWhenPresent("projectCompany", record::getProjectCompany)
                        .map(projectContact).toPropertyWhenPresent("projectContact", record::getProjectContact)
                        .map(projectAmount).toPropertyWhenPresent("projectAmount", record::getProjectAmount)
                        .map(projectAmountCurrency).toPropertyWhenPresent("projectAmountCurrency", record::getProjectAmountCurrency)
                        .map(projectType).toPropertyWhenPresent("projectType", record::getProjectType)
                        .map(projectStartPlan).toPropertyWhenPresent("projectStartPlan", record::getProjectStartPlan)
                        .map(projectEndPlan).toPropertyWhenPresent("projectEndPlan", record::getProjectEndPlan)
                        .map(projectStartActual).toPropertyWhenPresent("projectStartActual", record::getProjectStartActual)
                        .map(projectEndActual).toPropertyWhenPresent("projectEndActual", record::getProjectEndActual)
                        .map(projectStatus).toPropertyWhenPresent("projectStatus", record::getProjectStatus)
                        .map(projectProgressStatus).toPropertyWhenPresent("projectProgressStatus", record::getProjectProgressStatus)
                        .map(projectTraceFlag).toPropertyWhenPresent("projectTraceFlag", record::getProjectTraceFlag)
                        .map(projectTraceFrom).toPropertyWhenPresent("projectTraceFrom", record::getProjectTraceFrom)
                        .map(projectTraceTo).toPropertyWhenPresent("projectTraceTo", record::getProjectTraceTo)
                        .map(projectTraceFrequency).toPropertyWhenPresent("projectTraceFrequency", record::getProjectTraceFrequency)
                        .map(projectTraceRemind).toPropertyWhenPresent("projectTraceRemind", record::getProjectTraceRemind)
                        .map(projectMemo).toPropertyWhenPresent("projectMemo", record::getProjectMemo)
                        .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
                        .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
                        .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
                        .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
                        .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default Optional<TProject> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TProject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default List<TProject> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TProject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default List<TProject> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TProject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default Optional<TProject> selectByPrimaryKey(Object id_) {
        return selectOne(c ->
                c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TProject, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    static UpdateDSL<UpdateModel> updateAllColumns(TProject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(projectName).equalTo(record::getProjectName)
                .set(projectNation).equalTo(record::getProjectNation)
                .set(projectCompany).equalTo(record::getProjectCompany)
                .set(projectContact).equalTo(record::getProjectContact)
                .set(projectAmount).equalTo(record::getProjectAmount)
                .set(projectAmountCurrency).equalTo(record::getProjectAmountCurrency)
                .set(projectType).equalTo(record::getProjectType)
                .set(projectStartPlan).equalTo(record::getProjectStartPlan)
                .set(projectEndPlan).equalTo(record::getProjectEndPlan)
                .set(projectStartActual).equalTo(record::getProjectStartActual)
                .set(projectEndActual).equalTo(record::getProjectEndActual)
                .set(projectStatus).equalTo(record::getProjectStatus)
                .set(projectProgressStatus).equalTo(record::getProjectProgressStatus)
                .set(projectTraceFlag).equalTo(record::getProjectTraceFlag)
                .set(projectTraceFrom).equalTo(record::getProjectTraceFrom)
                .set(projectTraceTo).equalTo(record::getProjectTraceTo)
                .set(projectTraceFrequency).equalTo(record::getProjectTraceFrequency)
                .set(projectTraceRemind).equalTo(record::getProjectTraceRemind)
                .set(projectMemo).equalTo(record::getProjectMemo)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TProject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(projectName).equalToWhenPresent(record::getProjectName)
                .set(projectNation).equalToWhenPresent(record::getProjectNation)
                .set(projectCompany).equalToWhenPresent(record::getProjectCompany)
                .set(projectContact).equalToWhenPresent(record::getProjectContact)
                .set(projectAmount).equalToWhenPresent(record::getProjectAmount)
                .set(projectAmountCurrency).equalToWhenPresent(record::getProjectAmountCurrency)
                .set(projectType).equalToWhenPresent(record::getProjectType)
                .set(projectStartPlan).equalToWhenPresent(record::getProjectStartPlan)
                .set(projectEndPlan).equalToWhenPresent(record::getProjectEndPlan)
                .set(projectStartActual).equalToWhenPresent(record::getProjectStartActual)
                .set(projectEndActual).equalToWhenPresent(record::getProjectEndActual)
                .set(projectStatus).equalToWhenPresent(record::getProjectStatus)
                .set(projectProgressStatus).equalToWhenPresent(record::getProjectProgressStatus)
                .set(projectTraceFlag).equalToWhenPresent(record::getProjectTraceFlag)
                .set(projectTraceFrom).equalToWhenPresent(record::getProjectTraceFrom)
                .set(projectTraceTo).equalToWhenPresent(record::getProjectTraceTo)
                .set(projectTraceFrequency).equalToWhenPresent(record::getProjectTraceFrequency)
                .set(projectTraceRemind).equalToWhenPresent(record::getProjectTraceRemind)
                .set(projectMemo).equalToWhenPresent(record::getProjectMemo)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default int updateByPrimaryKey(TProject record) {
        return update(c ->
                c.set(projectName).equalTo(record::getProjectName)
                        .set(projectNation).equalTo(record::getProjectNation)
                        .set(projectCompany).equalTo(record::getProjectCompany)
                        .set(projectContact).equalTo(record::getProjectContact)
                        .set(projectAmount).equalTo(record::getProjectAmount)
                        .set(projectAmountCurrency).equalTo(record::getProjectAmountCurrency)
                        .set(projectType).equalTo(record::getProjectType)
                        .set(projectStartPlan).equalTo(record::getProjectStartPlan)
                        .set(projectEndPlan).equalTo(record::getProjectEndPlan)
                        .set(projectStartActual).equalTo(record::getProjectStartActual)
                        .set(projectEndActual).equalTo(record::getProjectEndActual)
                        .set(projectStatus).equalTo(record::getProjectStatus)
                        .set(projectProgressStatus).equalTo(record::getProjectProgressStatus)
                        .set(projectTraceFlag).equalTo(record::getProjectTraceFlag)
                        .set(projectTraceFrom).equalTo(record::getProjectTraceFrom)
                        .set(projectTraceTo).equalTo(record::getProjectTraceTo)
                        .set(projectTraceFrequency).equalTo(record::getProjectTraceFrequency)
                        .set(projectTraceRemind).equalTo(record::getProjectTraceRemind)
                        .set(projectMemo).equalTo(record::getProjectMemo)
                        .set(insAccountId).equalTo(record::getInsAccountId)
                        .set(insDtTime).equalTo(record::getInsDtTime)
                        .set(updAccountId).equalTo(record::getUpdAccountId)
                        .set(updDtTime).equalTo(record::getUpdDtTime)
                        .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
                        .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-09-07T16:50:20.5395296+08:00", comments="Source Table: t_project")
    default int updateByPrimaryKeySelective(TProject record) {
        return update(c ->
                c.set(projectName).equalToWhenPresent(record::getProjectName)
                        .set(projectNation).equalToWhenPresent(record::getProjectNation)
                        .set(projectCompany).equalToWhenPresent(record::getProjectCompany)
                        .set(projectContact).equalToWhenPresent(record::getProjectContact)
                        .set(projectAmount).equalToWhenPresent(record::getProjectAmount)
                        .set(projectAmountCurrency).equalToWhenPresent(record::getProjectAmountCurrency)
                        .set(projectType).equalToWhenPresent(record::getProjectType)
                        .set(projectStartPlan).equalToWhenPresent(record::getProjectStartPlan)
                        .set(projectEndPlan).equalToWhenPresent(record::getProjectEndPlan)
                        .set(projectStartActual).equalToWhenPresent(record::getProjectStartActual)
                        .set(projectEndActual).equalToWhenPresent(record::getProjectEndActual)
                        .set(projectStatus).equalToWhenPresent(record::getProjectStatus)
                        .set(projectProgressStatus).equalToWhenPresent(record::getProjectProgressStatus)
                        .set(projectTraceFlag).equalToWhenPresent(record::getProjectTraceFlag)
                        .set(projectTraceFrom).equalToWhenPresent(record::getProjectTraceFrom)
                        .set(projectTraceTo).equalToWhenPresent(record::getProjectTraceTo)
                        .set(projectTraceFrequency).equalToWhenPresent(record::getProjectTraceFrequency)
                        .set(projectTraceRemind).equalToWhenPresent(record::getProjectTraceRemind)
                        .set(projectMemo).equalToWhenPresent(record::getProjectMemo)
                        .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                        .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                        .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                        .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                        .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
                        .where(id, isEqualTo(record::getId))
        );
    }
}
