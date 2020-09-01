package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TBugNewDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TBugNew;
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
public interface TBugNewMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3432382+08:00", comments="Source Table: t_bug_new")
    BasicColumn[] selectList = BasicColumn.columnList(id, bugCode, bugProject, bugTitle, bugOwner, bugPriority, bugEnd, bugFixer, bugRelatedPerson, bugSprint, bugFoundProcess, bugStory, bugTestTimes, bugFoundVersion, bugFoundFunction, bugRecurrenceProbability, bugType, bugRecurrenceStep, bugDescription, bugStatus, bugDivision, bugCauseAnalysis, bugCausedSprint, bugCausedProcess, bugCausedStory, bugFixMethod, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3402365+08:00", comments="Source Table: t_bug_new")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3402365+08:00", comments="Source Table: t_bug_new")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3402365+08:00", comments="Source Table: t_bug_new")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TBugNew> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3402365+08:00", comments="Source Table: t_bug_new")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TBugNew> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3402365+08:00", comments="Source Table: t_bug_new")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TBugNewResult")
    Optional<TBugNew> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3402365+08:00", comments="Source Table: t_bug_new")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TBugNewResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="bug_code", property="bugCode", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="bug_project", property="bugProject", jdbcType=JdbcType.OTHER),
        @Result(column="bug_title", property="bugTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_owner", property="bugOwner", jdbcType=JdbcType.OTHER),
        @Result(column="bug_priority", property="bugPriority", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_end", property="bugEnd", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bug_fixer", property="bugFixer", jdbcType=JdbcType.OTHER),
        @Result(column="bug_related_person", property="bugRelatedPerson", jdbcType=JdbcType.OTHER),
        @Result(column="bug_sprint", property="bugSprint", jdbcType=JdbcType.OTHER),
        @Result(column="bug_found_process", property="bugFoundProcess", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_story", property="bugStory", jdbcType=JdbcType.OTHER),
        @Result(column="bug_test_times", property="bugTestTimes", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_found_version", property="bugFoundVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_found_function", property="bugFoundFunction", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_recurrence_probability", property="bugRecurrenceProbability", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_type", property="bugType", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_recurrence_step", property="bugRecurrenceStep", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_description", property="bugDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_status", property="bugStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_division", property="bugDivision", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_cause_analysis", property="bugCauseAnalysis", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_caused_sprint", property="bugCausedSprint", jdbcType=JdbcType.OTHER),
        @Result(column="bug_caused_process", property="bugCausedProcess", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_caused_story", property="bugCausedStory", jdbcType=JdbcType.OTHER),
        @Result(column="bug_fix_method", property="bugFixMethod", jdbcType=JdbcType.VARCHAR),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER)
    })
    List<TBugNew> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3412385+08:00", comments="Source Table: t_bug_new")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3412385+08:00", comments="Source Table: t_bug_new")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TBugNew, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3412385+08:00", comments="Source Table: t_bug_new")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TBugNew, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3412385+08:00", comments="Source Table: t_bug_new")
    default int deleteByPrimaryKey(Object id_, String bugCode_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
            .and(bugCode, isEqualTo(bugCode_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.342239+08:00", comments="Source Table: t_bug_new")
    default int insert(TBugNew record) {
        return MyBatis3Utils.insert(this::insert, record, TBugNew, c ->
            c.map(id).toProperty("id")
            .map(bugCode).toProperty("bugCode")
            .map(bugProject).toProperty("bugProject")
            .map(bugTitle).toProperty("bugTitle")
            .map(bugOwner).toProperty("bugOwner")
            .map(bugPriority).toProperty("bugPriority")
            .map(bugEnd).toProperty("bugEnd")
            .map(bugFixer).toProperty("bugFixer")
            .map(bugRelatedPerson).toProperty("bugRelatedPerson")
            .map(bugSprint).toProperty("bugSprint")
            .map(bugFoundProcess).toProperty("bugFoundProcess")
            .map(bugStory).toProperty("bugStory")
            .map(bugTestTimes).toProperty("bugTestTimes")
            .map(bugFoundVersion).toProperty("bugFoundVersion")
            .map(bugFoundFunction).toProperty("bugFoundFunction")
            .map(bugRecurrenceProbability).toProperty("bugRecurrenceProbability")
            .map(bugType).toProperty("bugType")
            .map(bugRecurrenceStep).toProperty("bugRecurrenceStep")
            .map(bugDescription).toProperty("bugDescription")
            .map(bugStatus).toProperty("bugStatus")
            .map(bugDivision).toProperty("bugDivision")
            .map(bugCauseAnalysis).toProperty("bugCauseAnalysis")
            .map(bugCausedSprint).toProperty("bugCausedSprint")
            .map(bugCausedProcess).toProperty("bugCausedProcess")
            .map(bugCausedStory).toProperty("bugCausedStory")
            .map(bugFixMethod).toProperty("bugFixMethod")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.342239+08:00", comments="Source Table: t_bug_new")
    default int insertMultiple(Collection<TBugNew> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TBugNew, c ->
            c.map(id).toProperty("id")
            .map(bugCode).toProperty("bugCode")
            .map(bugProject).toProperty("bugProject")
            .map(bugTitle).toProperty("bugTitle")
            .map(bugOwner).toProperty("bugOwner")
            .map(bugPriority).toProperty("bugPriority")
            .map(bugEnd).toProperty("bugEnd")
            .map(bugFixer).toProperty("bugFixer")
            .map(bugRelatedPerson).toProperty("bugRelatedPerson")
            .map(bugSprint).toProperty("bugSprint")
            .map(bugFoundProcess).toProperty("bugFoundProcess")
            .map(bugStory).toProperty("bugStory")
            .map(bugTestTimes).toProperty("bugTestTimes")
            .map(bugFoundVersion).toProperty("bugFoundVersion")
            .map(bugFoundFunction).toProperty("bugFoundFunction")
            .map(bugRecurrenceProbability).toProperty("bugRecurrenceProbability")
            .map(bugType).toProperty("bugType")
            .map(bugRecurrenceStep).toProperty("bugRecurrenceStep")
            .map(bugDescription).toProperty("bugDescription")
            .map(bugStatus).toProperty("bugStatus")
            .map(bugDivision).toProperty("bugDivision")
            .map(bugCauseAnalysis).toProperty("bugCauseAnalysis")
            .map(bugCausedSprint).toProperty("bugCausedSprint")
            .map(bugCausedProcess).toProperty("bugCausedProcess")
            .map(bugCausedStory).toProperty("bugCausedStory")
            .map(bugFixMethod).toProperty("bugFixMethod")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.342239+08:00", comments="Source Table: t_bug_new")
    default int insertSelective(TBugNew record) {
        return MyBatis3Utils.insert(this::insert, record, TBugNew, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(bugCode).toPropertyWhenPresent("bugCode", record::getBugCode)
            .map(bugProject).toPropertyWhenPresent("bugProject", record::getBugProject)
            .map(bugTitle).toPropertyWhenPresent("bugTitle", record::getBugTitle)
            .map(bugOwner).toPropertyWhenPresent("bugOwner", record::getBugOwner)
            .map(bugPriority).toPropertyWhenPresent("bugPriority", record::getBugPriority)
            .map(bugEnd).toPropertyWhenPresent("bugEnd", record::getBugEnd)
            .map(bugFixer).toPropertyWhenPresent("bugFixer", record::getBugFixer)
            .map(bugRelatedPerson).toPropertyWhenPresent("bugRelatedPerson", record::getBugRelatedPerson)
            .map(bugSprint).toPropertyWhenPresent("bugSprint", record::getBugSprint)
            .map(bugFoundProcess).toPropertyWhenPresent("bugFoundProcess", record::getBugFoundProcess)
            .map(bugStory).toPropertyWhenPresent("bugStory", record::getBugStory)
            .map(bugTestTimes).toPropertyWhenPresent("bugTestTimes", record::getBugTestTimes)
            .map(bugFoundVersion).toPropertyWhenPresent("bugFoundVersion", record::getBugFoundVersion)
            .map(bugFoundFunction).toPropertyWhenPresent("bugFoundFunction", record::getBugFoundFunction)
            .map(bugRecurrenceProbability).toPropertyWhenPresent("bugRecurrenceProbability", record::getBugRecurrenceProbability)
            .map(bugType).toPropertyWhenPresent("bugType", record::getBugType)
            .map(bugRecurrenceStep).toPropertyWhenPresent("bugRecurrenceStep", record::getBugRecurrenceStep)
            .map(bugDescription).toPropertyWhenPresent("bugDescription", record::getBugDescription)
            .map(bugStatus).toPropertyWhenPresent("bugStatus", record::getBugStatus)
            .map(bugDivision).toPropertyWhenPresent("bugDivision", record::getBugDivision)
            .map(bugCauseAnalysis).toPropertyWhenPresent("bugCauseAnalysis", record::getBugCauseAnalysis)
            .map(bugCausedSprint).toPropertyWhenPresent("bugCausedSprint", record::getBugCausedSprint)
            .map(bugCausedProcess).toPropertyWhenPresent("bugCausedProcess", record::getBugCausedProcess)
            .map(bugCausedStory).toPropertyWhenPresent("bugCausedStory", record::getBugCausedStory)
            .map(bugFixMethod).toPropertyWhenPresent("bugFixMethod", record::getBugFixMethod)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3432382+08:00", comments="Source Table: t_bug_new")
    default Optional<TBugNew> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TBugNew, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3432382+08:00", comments="Source Table: t_bug_new")
    default List<TBugNew> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TBugNew, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3432382+08:00", comments="Source Table: t_bug_new")
    default List<TBugNew> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TBugNew, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3432382+08:00", comments="Source Table: t_bug_new")
    default Optional<TBugNew> selectByPrimaryKey(Object id_, String bugCode_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
            .and(bugCode, isEqualTo(bugCode_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3432382+08:00", comments="Source Table: t_bug_new")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TBugNew, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3432382+08:00", comments="Source Table: t_bug_new")
    static UpdateDSL<UpdateModel> updateAllColumns(TBugNew record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(bugCode).equalTo(record::getBugCode)
                .set(bugProject).equalTo(record::getBugProject)
                .set(bugTitle).equalTo(record::getBugTitle)
                .set(bugOwner).equalTo(record::getBugOwner)
                .set(bugPriority).equalTo(record::getBugPriority)
                .set(bugEnd).equalTo(record::getBugEnd)
                .set(bugFixer).equalTo(record::getBugFixer)
                .set(bugRelatedPerson).equalTo(record::getBugRelatedPerson)
                .set(bugSprint).equalTo(record::getBugSprint)
                .set(bugFoundProcess).equalTo(record::getBugFoundProcess)
                .set(bugStory).equalTo(record::getBugStory)
                .set(bugTestTimes).equalTo(record::getBugTestTimes)
                .set(bugFoundVersion).equalTo(record::getBugFoundVersion)
                .set(bugFoundFunction).equalTo(record::getBugFoundFunction)
                .set(bugRecurrenceProbability).equalTo(record::getBugRecurrenceProbability)
                .set(bugType).equalTo(record::getBugType)
                .set(bugRecurrenceStep).equalTo(record::getBugRecurrenceStep)
                .set(bugDescription).equalTo(record::getBugDescription)
                .set(bugStatus).equalTo(record::getBugStatus)
                .set(bugDivision).equalTo(record::getBugDivision)
                .set(bugCauseAnalysis).equalTo(record::getBugCauseAnalysis)
                .set(bugCausedSprint).equalTo(record::getBugCausedSprint)
                .set(bugCausedProcess).equalTo(record::getBugCausedProcess)
                .set(bugCausedStory).equalTo(record::getBugCausedStory)
                .set(bugFixMethod).equalTo(record::getBugFixMethod)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3432382+08:00", comments="Source Table: t_bug_new")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TBugNew record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(bugCode).equalToWhenPresent(record::getBugCode)
                .set(bugProject).equalToWhenPresent(record::getBugProject)
                .set(bugTitle).equalToWhenPresent(record::getBugTitle)
                .set(bugOwner).equalToWhenPresent(record::getBugOwner)
                .set(bugPriority).equalToWhenPresent(record::getBugPriority)
                .set(bugEnd).equalToWhenPresent(record::getBugEnd)
                .set(bugFixer).equalToWhenPresent(record::getBugFixer)
                .set(bugRelatedPerson).equalToWhenPresent(record::getBugRelatedPerson)
                .set(bugSprint).equalToWhenPresent(record::getBugSprint)
                .set(bugFoundProcess).equalToWhenPresent(record::getBugFoundProcess)
                .set(bugStory).equalToWhenPresent(record::getBugStory)
                .set(bugTestTimes).equalToWhenPresent(record::getBugTestTimes)
                .set(bugFoundVersion).equalToWhenPresent(record::getBugFoundVersion)
                .set(bugFoundFunction).equalToWhenPresent(record::getBugFoundFunction)
                .set(bugRecurrenceProbability).equalToWhenPresent(record::getBugRecurrenceProbability)
                .set(bugType).equalToWhenPresent(record::getBugType)
                .set(bugRecurrenceStep).equalToWhenPresent(record::getBugRecurrenceStep)
                .set(bugDescription).equalToWhenPresent(record::getBugDescription)
                .set(bugStatus).equalToWhenPresent(record::getBugStatus)
                .set(bugDivision).equalToWhenPresent(record::getBugDivision)
                .set(bugCauseAnalysis).equalToWhenPresent(record::getBugCauseAnalysis)
                .set(bugCausedSprint).equalToWhenPresent(record::getBugCausedSprint)
                .set(bugCausedProcess).equalToWhenPresent(record::getBugCausedProcess)
                .set(bugCausedStory).equalToWhenPresent(record::getBugCausedStory)
                .set(bugFixMethod).equalToWhenPresent(record::getBugFixMethod)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3442383+08:00", comments="Source Table: t_bug_new")
    default int updateByPrimaryKey(TBugNew record) {
        return update(c ->
            c.set(bugProject).equalTo(record::getBugProject)
            .set(bugTitle).equalTo(record::getBugTitle)
            .set(bugOwner).equalTo(record::getBugOwner)
            .set(bugPriority).equalTo(record::getBugPriority)
            .set(bugEnd).equalTo(record::getBugEnd)
            .set(bugFixer).equalTo(record::getBugFixer)
            .set(bugRelatedPerson).equalTo(record::getBugRelatedPerson)
            .set(bugSprint).equalTo(record::getBugSprint)
            .set(bugFoundProcess).equalTo(record::getBugFoundProcess)
            .set(bugStory).equalTo(record::getBugStory)
            .set(bugTestTimes).equalTo(record::getBugTestTimes)
            .set(bugFoundVersion).equalTo(record::getBugFoundVersion)
            .set(bugFoundFunction).equalTo(record::getBugFoundFunction)
            .set(bugRecurrenceProbability).equalTo(record::getBugRecurrenceProbability)
            .set(bugType).equalTo(record::getBugType)
            .set(bugRecurrenceStep).equalTo(record::getBugRecurrenceStep)
            .set(bugDescription).equalTo(record::getBugDescription)
            .set(bugStatus).equalTo(record::getBugStatus)
            .set(bugDivision).equalTo(record::getBugDivision)
            .set(bugCauseAnalysis).equalTo(record::getBugCauseAnalysis)
            .set(bugCausedSprint).equalTo(record::getBugCausedSprint)
            .set(bugCausedProcess).equalTo(record::getBugCausedProcess)
            .set(bugCausedStory).equalTo(record::getBugCausedStory)
            .set(bugFixMethod).equalTo(record::getBugFixMethod)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .where(id, isEqualTo(record::getId))
            .and(bugCode, isEqualTo(record::getBugCode))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3442383+08:00", comments="Source Table: t_bug_new")
    default int updateByPrimaryKeySelective(TBugNew record) {
        return update(c ->
            c.set(bugProject).equalToWhenPresent(record::getBugProject)
            .set(bugTitle).equalToWhenPresent(record::getBugTitle)
            .set(bugOwner).equalToWhenPresent(record::getBugOwner)
            .set(bugPriority).equalToWhenPresent(record::getBugPriority)
            .set(bugEnd).equalToWhenPresent(record::getBugEnd)
            .set(bugFixer).equalToWhenPresent(record::getBugFixer)
            .set(bugRelatedPerson).equalToWhenPresent(record::getBugRelatedPerson)
            .set(bugSprint).equalToWhenPresent(record::getBugSprint)
            .set(bugFoundProcess).equalToWhenPresent(record::getBugFoundProcess)
            .set(bugStory).equalToWhenPresent(record::getBugStory)
            .set(bugTestTimes).equalToWhenPresent(record::getBugTestTimes)
            .set(bugFoundVersion).equalToWhenPresent(record::getBugFoundVersion)
            .set(bugFoundFunction).equalToWhenPresent(record::getBugFoundFunction)
            .set(bugRecurrenceProbability).equalToWhenPresent(record::getBugRecurrenceProbability)
            .set(bugType).equalToWhenPresent(record::getBugType)
            .set(bugRecurrenceStep).equalToWhenPresent(record::getBugRecurrenceStep)
            .set(bugDescription).equalToWhenPresent(record::getBugDescription)
            .set(bugStatus).equalToWhenPresent(record::getBugStatus)
            .set(bugDivision).equalToWhenPresent(record::getBugDivision)
            .set(bugCauseAnalysis).equalToWhenPresent(record::getBugCauseAnalysis)
            .set(bugCausedSprint).equalToWhenPresent(record::getBugCausedSprint)
            .set(bugCausedProcess).equalToWhenPresent(record::getBugCausedProcess)
            .set(bugCausedStory).equalToWhenPresent(record::getBugCausedStory)
            .set(bugFixMethod).equalToWhenPresent(record::getBugFixMethod)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .where(id, isEqualTo(record::getId))
            .and(bugCode, isEqualTo(record::getBugCode))
        );
    }
}