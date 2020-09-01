package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TBugDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TBug;
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
public interface TBugMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3212375+08:00", comments="Source Table: t_bug")
    BasicColumn[] selectList = BasicColumn.columnList(id, bugProject, bugTitle, bugCode, bugOwner, bugPriority, bugEnd, bugSeverity, bugType, bugRecurrenceProbability, bugRecurrenceVersion, bugReleaseVersion, bugDescription, bugRecurrenceStep, bugCauseAnalysis, bugSprint, bugPoint, bugSolution, bugStatus, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv, bugHour, bugFixer, bugRelativePerson, bugFoundProcess, bugStory, bugTestTimes, bugFoundVersion, bugFoundFunction, bugStart);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3092395+08:00", comments="Source Table: t_bug")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3102394+08:00", comments="Source Table: t_bug")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.311238+08:00", comments="Source Table: t_bug")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TBug> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.311238+08:00", comments="Source Table: t_bug")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TBug> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3122382+08:00", comments="Source Table: t_bug")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TBugResult")
    Optional<TBug> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3122382+08:00", comments="Source Table: t_bug")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TBugResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="bug_project", property="bugProject", jdbcType=JdbcType.OTHER),
        @Result(column="bug_title", property="bugTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_code", property="bugCode", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_owner", property="bugOwner", jdbcType=JdbcType.OTHER),
        @Result(column="bug_priority", property="bugPriority", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_end", property="bugEnd", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="bug_severity", property="bugSeverity", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_type", property="bugType", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_recurrence_probability", property="bugRecurrenceProbability", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_recurrence_version", property="bugRecurrenceVersion", jdbcType=JdbcType.OTHER),
        @Result(column="bug_release_version", property="bugReleaseVersion", jdbcType=JdbcType.OTHER),
        @Result(column="bug_description", property="bugDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_recurrence_step", property="bugRecurrenceStep", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_cause_analysis", property="bugCauseAnalysis", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_sprint", property="bugSprint", jdbcType=JdbcType.OTHER),
        @Result(column="bug_point", property="bugPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_solution", property="bugSolution", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_status", property="bugStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_hour", property="bugHour", jdbcType=JdbcType.NUMERIC),
        @Result(column="bug_fixer", property="bugFixer", jdbcType=JdbcType.OTHER),
        @Result(column="bug_relative_person", property="bugRelativePerson", jdbcType=JdbcType.OTHER),
        @Result(column="bug_found_process", property="bugFoundProcess", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_story", property="bugStory", jdbcType=JdbcType.OTHER),
        @Result(column="bug_test_times", property="bugTestTimes", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_found_version", property="bugFoundVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_found_function", property="bugFoundFunction", jdbcType=JdbcType.VARCHAR),
        @Result(column="bug_start", property="bugStart", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TBug> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.314239+08:00", comments="Source Table: t_bug")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3152368+08:00", comments="Source Table: t_bug")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TBug, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3152368+08:00", comments="Source Table: t_bug")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TBug, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3162409+08:00", comments="Source Table: t_bug")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3162409+08:00", comments="Source Table: t_bug")
    default int insert(TBug record) {
        return MyBatis3Utils.insert(this::insert, record, TBug, c ->
            c.map(id).toProperty("id")
            .map(bugProject).toProperty("bugProject")
            .map(bugTitle).toProperty("bugTitle")
            .map(bugCode).toProperty("bugCode")
            .map(bugOwner).toProperty("bugOwner")
            .map(bugPriority).toProperty("bugPriority")
            .map(bugEnd).toProperty("bugEnd")
            .map(bugSeverity).toProperty("bugSeverity")
            .map(bugType).toProperty("bugType")
            .map(bugRecurrenceProbability).toProperty("bugRecurrenceProbability")
            .map(bugRecurrenceVersion).toProperty("bugRecurrenceVersion")
            .map(bugReleaseVersion).toProperty("bugReleaseVersion")
            .map(bugDescription).toProperty("bugDescription")
            .map(bugRecurrenceStep).toProperty("bugRecurrenceStep")
            .map(bugCauseAnalysis).toProperty("bugCauseAnalysis")
            .map(bugSprint).toProperty("bugSprint")
            .map(bugPoint).toProperty("bugPoint")
            .map(bugSolution).toProperty("bugSolution")
            .map(bugStatus).toProperty("bugStatus")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(bugHour).toProperty("bugHour")
            .map(bugFixer).toProperty("bugFixer")
            .map(bugRelativePerson).toProperty("bugRelativePerson")
            .map(bugFoundProcess).toProperty("bugFoundProcess")
            .map(bugStory).toProperty("bugStory")
            .map(bugTestTimes).toProperty("bugTestTimes")
            .map(bugFoundVersion).toProperty("bugFoundVersion")
            .map(bugFoundFunction).toProperty("bugFoundFunction")
            .map(bugStart).toProperty("bugStart")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3182389+08:00", comments="Source Table: t_bug")
    default int insertMultiple(Collection<TBug> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TBug, c ->
            c.map(id).toProperty("id")
            .map(bugProject).toProperty("bugProject")
            .map(bugTitle).toProperty("bugTitle")
            .map(bugCode).toProperty("bugCode")
            .map(bugOwner).toProperty("bugOwner")
            .map(bugPriority).toProperty("bugPriority")
            .map(bugEnd).toProperty("bugEnd")
            .map(bugSeverity).toProperty("bugSeverity")
            .map(bugType).toProperty("bugType")
            .map(bugRecurrenceProbability).toProperty("bugRecurrenceProbability")
            .map(bugRecurrenceVersion).toProperty("bugRecurrenceVersion")
            .map(bugReleaseVersion).toProperty("bugReleaseVersion")
            .map(bugDescription).toProperty("bugDescription")
            .map(bugRecurrenceStep).toProperty("bugRecurrenceStep")
            .map(bugCauseAnalysis).toProperty("bugCauseAnalysis")
            .map(bugSprint).toProperty("bugSprint")
            .map(bugPoint).toProperty("bugPoint")
            .map(bugSolution).toProperty("bugSolution")
            .map(bugStatus).toProperty("bugStatus")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(bugHour).toProperty("bugHour")
            .map(bugFixer).toProperty("bugFixer")
            .map(bugRelativePerson).toProperty("bugRelativePerson")
            .map(bugFoundProcess).toProperty("bugFoundProcess")
            .map(bugStory).toProperty("bugStory")
            .map(bugTestTimes).toProperty("bugTestTimes")
            .map(bugFoundVersion).toProperty("bugFoundVersion")
            .map(bugFoundFunction).toProperty("bugFoundFunction")
            .map(bugStart).toProperty("bugStart")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3182389+08:00", comments="Source Table: t_bug")
    default int insertSelective(TBug record) {
        return MyBatis3Utils.insert(this::insert, record, TBug, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(bugProject).toPropertyWhenPresent("bugProject", record::getBugProject)
            .map(bugTitle).toPropertyWhenPresent("bugTitle", record::getBugTitle)
            .map(bugCode).toPropertyWhenPresent("bugCode", record::getBugCode)
            .map(bugOwner).toPropertyWhenPresent("bugOwner", record::getBugOwner)
            .map(bugPriority).toPropertyWhenPresent("bugPriority", record::getBugPriority)
            .map(bugEnd).toPropertyWhenPresent("bugEnd", record::getBugEnd)
            .map(bugSeverity).toPropertyWhenPresent("bugSeverity", record::getBugSeverity)
            .map(bugType).toPropertyWhenPresent("bugType", record::getBugType)
            .map(bugRecurrenceProbability).toPropertyWhenPresent("bugRecurrenceProbability", record::getBugRecurrenceProbability)
            .map(bugRecurrenceVersion).toPropertyWhenPresent("bugRecurrenceVersion", record::getBugRecurrenceVersion)
            .map(bugReleaseVersion).toPropertyWhenPresent("bugReleaseVersion", record::getBugReleaseVersion)
            .map(bugDescription).toPropertyWhenPresent("bugDescription", record::getBugDescription)
            .map(bugRecurrenceStep).toPropertyWhenPresent("bugRecurrenceStep", record::getBugRecurrenceStep)
            .map(bugCauseAnalysis).toPropertyWhenPresent("bugCauseAnalysis", record::getBugCauseAnalysis)
            .map(bugSprint).toPropertyWhenPresent("bugSprint", record::getBugSprint)
            .map(bugPoint).toPropertyWhenPresent("bugPoint", record::getBugPoint)
            .map(bugSolution).toPropertyWhenPresent("bugSolution", record::getBugSolution)
            .map(bugStatus).toPropertyWhenPresent("bugStatus", record::getBugStatus)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
            .map(bugHour).toPropertyWhenPresent("bugHour", record::getBugHour)
            .map(bugFixer).toPropertyWhenPresent("bugFixer", record::getBugFixer)
            .map(bugRelativePerson).toPropertyWhenPresent("bugRelativePerson", record::getBugRelativePerson)
            .map(bugFoundProcess).toPropertyWhenPresent("bugFoundProcess", record::getBugFoundProcess)
            .map(bugStory).toPropertyWhenPresent("bugStory", record::getBugStory)
            .map(bugTestTimes).toPropertyWhenPresent("bugTestTimes", record::getBugTestTimes)
            .map(bugFoundVersion).toPropertyWhenPresent("bugFoundVersion", record::getBugFoundVersion)
            .map(bugFoundFunction).toPropertyWhenPresent("bugFoundFunction", record::getBugFoundFunction)
            .map(bugStart).toPropertyWhenPresent("bugStart", record::getBugStart)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3222391+08:00", comments="Source Table: t_bug")
    default Optional<TBug> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TBug, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3232381+08:00", comments="Source Table: t_bug")
    default List<TBug> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TBug, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3232381+08:00", comments="Source Table: t_bug")
    default List<TBug> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TBug, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.324238+08:00", comments="Source Table: t_bug")
    default Optional<TBug> selectByPrimaryKey(Object id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.324238+08:00", comments="Source Table: t_bug")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TBug, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3252375+08:00", comments="Source Table: t_bug")
    static UpdateDSL<UpdateModel> updateAllColumns(TBug record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(bugProject).equalTo(record::getBugProject)
                .set(bugTitle).equalTo(record::getBugTitle)
                .set(bugCode).equalTo(record::getBugCode)
                .set(bugOwner).equalTo(record::getBugOwner)
                .set(bugPriority).equalTo(record::getBugPriority)
                .set(bugEnd).equalTo(record::getBugEnd)
                .set(bugSeverity).equalTo(record::getBugSeverity)
                .set(bugType).equalTo(record::getBugType)
                .set(bugRecurrenceProbability).equalTo(record::getBugRecurrenceProbability)
                .set(bugRecurrenceVersion).equalTo(record::getBugRecurrenceVersion)
                .set(bugReleaseVersion).equalTo(record::getBugReleaseVersion)
                .set(bugDescription).equalTo(record::getBugDescription)
                .set(bugRecurrenceStep).equalTo(record::getBugRecurrenceStep)
                .set(bugCauseAnalysis).equalTo(record::getBugCauseAnalysis)
                .set(bugSprint).equalTo(record::getBugSprint)
                .set(bugPoint).equalTo(record::getBugPoint)
                .set(bugSolution).equalTo(record::getBugSolution)
                .set(bugStatus).equalTo(record::getBugStatus)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
                .set(bugHour).equalTo(record::getBugHour)
                .set(bugFixer).equalTo(record::getBugFixer)
                .set(bugRelativePerson).equalTo(record::getBugRelativePerson)
                .set(bugFoundProcess).equalTo(record::getBugFoundProcess)
                .set(bugStory).equalTo(record::getBugStory)
                .set(bugTestTimes).equalTo(record::getBugTestTimes)
                .set(bugFoundVersion).equalTo(record::getBugFoundVersion)
                .set(bugFoundFunction).equalTo(record::getBugFoundFunction)
                .set(bugStart).equalTo(record::getBugStart);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3262376+08:00", comments="Source Table: t_bug")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TBug record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(bugProject).equalToWhenPresent(record::getBugProject)
                .set(bugTitle).equalToWhenPresent(record::getBugTitle)
                .set(bugCode).equalToWhenPresent(record::getBugCode)
                .set(bugOwner).equalToWhenPresent(record::getBugOwner)
                .set(bugPriority).equalToWhenPresent(record::getBugPriority)
                .set(bugEnd).equalToWhenPresent(record::getBugEnd)
                .set(bugSeverity).equalToWhenPresent(record::getBugSeverity)
                .set(bugType).equalToWhenPresent(record::getBugType)
                .set(bugRecurrenceProbability).equalToWhenPresent(record::getBugRecurrenceProbability)
                .set(bugRecurrenceVersion).equalToWhenPresent(record::getBugRecurrenceVersion)
                .set(bugReleaseVersion).equalToWhenPresent(record::getBugReleaseVersion)
                .set(bugDescription).equalToWhenPresent(record::getBugDescription)
                .set(bugRecurrenceStep).equalToWhenPresent(record::getBugRecurrenceStep)
                .set(bugCauseAnalysis).equalToWhenPresent(record::getBugCauseAnalysis)
                .set(bugSprint).equalToWhenPresent(record::getBugSprint)
                .set(bugPoint).equalToWhenPresent(record::getBugPoint)
                .set(bugSolution).equalToWhenPresent(record::getBugSolution)
                .set(bugStatus).equalToWhenPresent(record::getBugStatus)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
                .set(bugHour).equalToWhenPresent(record::getBugHour)
                .set(bugFixer).equalToWhenPresent(record::getBugFixer)
                .set(bugRelativePerson).equalToWhenPresent(record::getBugRelativePerson)
                .set(bugFoundProcess).equalToWhenPresent(record::getBugFoundProcess)
                .set(bugStory).equalToWhenPresent(record::getBugStory)
                .set(bugTestTimes).equalToWhenPresent(record::getBugTestTimes)
                .set(bugFoundVersion).equalToWhenPresent(record::getBugFoundVersion)
                .set(bugFoundFunction).equalToWhenPresent(record::getBugFoundFunction)
                .set(bugStart).equalToWhenPresent(record::getBugStart);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3272385+08:00", comments="Source Table: t_bug")
    default int updateByPrimaryKey(TBug record) {
        return update(c ->
            c.set(bugProject).equalTo(record::getBugProject)
            .set(bugTitle).equalTo(record::getBugTitle)
            .set(bugCode).equalTo(record::getBugCode)
            .set(bugOwner).equalTo(record::getBugOwner)
            .set(bugPriority).equalTo(record::getBugPriority)
            .set(bugEnd).equalTo(record::getBugEnd)
            .set(bugSeverity).equalTo(record::getBugSeverity)
            .set(bugType).equalTo(record::getBugType)
            .set(bugRecurrenceProbability).equalTo(record::getBugRecurrenceProbability)
            .set(bugRecurrenceVersion).equalTo(record::getBugRecurrenceVersion)
            .set(bugReleaseVersion).equalTo(record::getBugReleaseVersion)
            .set(bugDescription).equalTo(record::getBugDescription)
            .set(bugRecurrenceStep).equalTo(record::getBugRecurrenceStep)
            .set(bugCauseAnalysis).equalTo(record::getBugCauseAnalysis)
            .set(bugSprint).equalTo(record::getBugSprint)
            .set(bugPoint).equalTo(record::getBugPoint)
            .set(bugSolution).equalTo(record::getBugSolution)
            .set(bugStatus).equalTo(record::getBugStatus)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .set(bugHour).equalTo(record::getBugHour)
            .set(bugFixer).equalTo(record::getBugFixer)
            .set(bugRelativePerson).equalTo(record::getBugRelativePerson)
            .set(bugFoundProcess).equalTo(record::getBugFoundProcess)
            .set(bugStory).equalTo(record::getBugStory)
            .set(bugTestTimes).equalTo(record::getBugTestTimes)
            .set(bugFoundVersion).equalTo(record::getBugFoundVersion)
            .set(bugFoundFunction).equalTo(record::getBugFoundFunction)
            .set(bugStart).equalTo(record::getBugStart)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-31T13:24:14.3282375+08:00", comments="Source Table: t_bug")
    default int updateByPrimaryKeySelective(TBug record) {
        return update(c ->
            c.set(bugProject).equalToWhenPresent(record::getBugProject)
            .set(bugTitle).equalToWhenPresent(record::getBugTitle)
            .set(bugCode).equalToWhenPresent(record::getBugCode)
            .set(bugOwner).equalToWhenPresent(record::getBugOwner)
            .set(bugPriority).equalToWhenPresent(record::getBugPriority)
            .set(bugEnd).equalToWhenPresent(record::getBugEnd)
            .set(bugSeverity).equalToWhenPresent(record::getBugSeverity)
            .set(bugType).equalToWhenPresent(record::getBugType)
            .set(bugRecurrenceProbability).equalToWhenPresent(record::getBugRecurrenceProbability)
            .set(bugRecurrenceVersion).equalToWhenPresent(record::getBugRecurrenceVersion)
            .set(bugReleaseVersion).equalToWhenPresent(record::getBugReleaseVersion)
            .set(bugDescription).equalToWhenPresent(record::getBugDescription)
            .set(bugRecurrenceStep).equalToWhenPresent(record::getBugRecurrenceStep)
            .set(bugCauseAnalysis).equalToWhenPresent(record::getBugCauseAnalysis)
            .set(bugSprint).equalToWhenPresent(record::getBugSprint)
            .set(bugPoint).equalToWhenPresent(record::getBugPoint)
            .set(bugSolution).equalToWhenPresent(record::getBugSolution)
            .set(bugStatus).equalToWhenPresent(record::getBugStatus)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .set(bugHour).equalToWhenPresent(record::getBugHour)
            .set(bugFixer).equalToWhenPresent(record::getBugFixer)
            .set(bugRelativePerson).equalToWhenPresent(record::getBugRelativePerson)
            .set(bugFoundProcess).equalToWhenPresent(record::getBugFoundProcess)
            .set(bugStory).equalToWhenPresent(record::getBugStory)
            .set(bugTestTimes).equalToWhenPresent(record::getBugTestTimes)
            .set(bugFoundVersion).equalToWhenPresent(record::getBugFoundVersion)
            .set(bugFoundFunction).equalToWhenPresent(record::getBugFoundFunction)
            .set(bugStart).equalToWhenPresent(record::getBugStart)
            .where(id, isEqualTo(record::getId))
        );
    }
}