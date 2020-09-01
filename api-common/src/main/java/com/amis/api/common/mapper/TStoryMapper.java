package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TStoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TStory;
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
public interface TStoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0783482+08:00", comments="Source Table: t_story")
    BasicColumn[] selectList = BasicColumn.columnList(id, storyProjectId, storyCode, storyTitle, storyType, storyStatus, storyOwner, storyPriority, storyPoint, storyStart, storyEnd, storyDescription, storyReady, storyDone, storySprint, requirementType, requirementOrigin, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv, storyIndex, storyPointActual, storyBusinessValue);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0663497+08:00", comments="Source Table: t_story")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0673496+08:00", comments="Source Table: t_story")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.068349+08:00", comments="Source Table: t_story")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TStory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.068349+08:00", comments="Source Table: t_story")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TStory> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0693503+08:00", comments="Source Table: t_story")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TStoryResult")
    Optional<TStory> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0703517+08:00", comments="Source Table: t_story")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TStoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="story_project_id", property="storyProjectId", jdbcType=JdbcType.OTHER),
        @Result(column="story_code", property="storyCode", jdbcType=JdbcType.INTEGER),
        @Result(column="story_title", property="storyTitle", jdbcType=JdbcType.VARCHAR),
        @Result(column="story_type", property="storyType", jdbcType=JdbcType.INTEGER),
        @Result(column="story_status", property="storyStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="story_owner", property="storyOwner", jdbcType=JdbcType.OTHER),
        @Result(column="story_priority", property="storyPriority", jdbcType=JdbcType.INTEGER),
        @Result(column="story_point", property="storyPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="story_start", property="storyStart", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="story_end", property="storyEnd", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="story_description", property="storyDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="story_ready", property="storyReady", jdbcType=JdbcType.VARCHAR),
        @Result(column="story_done", property="storyDone", jdbcType=JdbcType.VARCHAR),
        @Result(column="story_sprint", property="storySprint", jdbcType=JdbcType.OTHER),
        @Result(column="requirement_type", property="requirementType", jdbcType=JdbcType.INTEGER),
        @Result(column="requirement_origin", property="requirementOrigin", jdbcType=JdbcType.INTEGER),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER),
        @Result(column="story_index", property="storyIndex", jdbcType=JdbcType.INTEGER),
        @Result(column="story_point_actual", property="storyPointActual", jdbcType=JdbcType.INTEGER),
        @Result(column="story_business_value", property="storyBusinessValue", jdbcType=JdbcType.VARCHAR)
    })
    List<TStory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0713534+08:00", comments="Source Table: t_story")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0723505+08:00", comments="Source Table: t_story")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TStory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0723505+08:00", comments="Source Table: t_story")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TStory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.073349+08:00", comments="Source Table: t_story")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.073349+08:00", comments="Source Table: t_story")
    default int insert(TStory record) {
        return MyBatis3Utils.insert(this::insert, record, TStory, c ->
            c.map(id).toProperty("id")
            .map(storyProjectId).toProperty("storyProjectId")
            .map(storyCode).toProperty("storyCode")
            .map(storyTitle).toProperty("storyTitle")
            .map(storyType).toProperty("storyType")
            .map(storyStatus).toProperty("storyStatus")
            .map(storyOwner).toProperty("storyOwner")
            .map(storyPriority).toProperty("storyPriority")
            .map(storyPoint).toProperty("storyPoint")
            .map(storyStart).toProperty("storyStart")
            .map(storyEnd).toProperty("storyEnd")
            .map(storyDescription).toProperty("storyDescription")
            .map(storyReady).toProperty("storyReady")
            .map(storyDone).toProperty("storyDone")
            .map(storySprint).toProperty("storySprint")
            .map(requirementType).toProperty("requirementType")
            .map(requirementOrigin).toProperty("requirementOrigin")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(storyIndex).toProperty("storyIndex")
            .map(storyPointActual).toProperty("storyPointActual")
            .map(storyBusinessValue).toProperty("storyBusinessValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0743516+08:00", comments="Source Table: t_story")
    default int insertMultiple(Collection<TStory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TStory, c ->
            c.map(id).toProperty("id")
            .map(storyProjectId).toProperty("storyProjectId")
            .map(storyCode).toProperty("storyCode")
            .map(storyTitle).toProperty("storyTitle")
            .map(storyType).toProperty("storyType")
            .map(storyStatus).toProperty("storyStatus")
            .map(storyOwner).toProperty("storyOwner")
            .map(storyPriority).toProperty("storyPriority")
            .map(storyPoint).toProperty("storyPoint")
            .map(storyStart).toProperty("storyStart")
            .map(storyEnd).toProperty("storyEnd")
            .map(storyDescription).toProperty("storyDescription")
            .map(storyReady).toProperty("storyReady")
            .map(storyDone).toProperty("storyDone")
            .map(storySprint).toProperty("storySprint")
            .map(requirementType).toProperty("requirementType")
            .map(requirementOrigin).toProperty("requirementOrigin")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(storyIndex).toProperty("storyIndex")
            .map(storyPointActual).toProperty("storyPointActual")
            .map(storyBusinessValue).toProperty("storyBusinessValue")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.075349+08:00", comments="Source Table: t_story")
    default int insertSelective(TStory record) {
        return MyBatis3Utils.insert(this::insert, record, TStory, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(storyProjectId).toPropertyWhenPresent("storyProjectId", record::getStoryProjectId)
            .map(storyCode).toPropertyWhenPresent("storyCode", record::getStoryCode)
            .map(storyTitle).toPropertyWhenPresent("storyTitle", record::getStoryTitle)
            .map(storyType).toPropertyWhenPresent("storyType", record::getStoryType)
            .map(storyStatus).toPropertyWhenPresent("storyStatus", record::getStoryStatus)
            .map(storyOwner).toPropertyWhenPresent("storyOwner", record::getStoryOwner)
            .map(storyPriority).toPropertyWhenPresent("storyPriority", record::getStoryPriority)
            .map(storyPoint).toPropertyWhenPresent("storyPoint", record::getStoryPoint)
            .map(storyStart).toPropertyWhenPresent("storyStart", record::getStoryStart)
            .map(storyEnd).toPropertyWhenPresent("storyEnd", record::getStoryEnd)
            .map(storyDescription).toPropertyWhenPresent("storyDescription", record::getStoryDescription)
            .map(storyReady).toPropertyWhenPresent("storyReady", record::getStoryReady)
            .map(storyDone).toPropertyWhenPresent("storyDone", record::getStoryDone)
            .map(storySprint).toPropertyWhenPresent("storySprint", record::getStorySprint)
            .map(requirementType).toPropertyWhenPresent("requirementType", record::getRequirementType)
            .map(requirementOrigin).toPropertyWhenPresent("requirementOrigin", record::getRequirementOrigin)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
            .map(storyIndex).toPropertyWhenPresent("storyIndex", record::getStoryIndex)
            .map(storyPointActual).toPropertyWhenPresent("storyPointActual", record::getStoryPointActual)
            .map(storyBusinessValue).toPropertyWhenPresent("storyBusinessValue", record::getStoryBusinessValue)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.079348+08:00", comments="Source Table: t_story")
    default Optional<TStory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TStory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0803483+08:00", comments="Source Table: t_story")
    default List<TStory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TStory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0803483+08:00", comments="Source Table: t_story")
    default List<TStory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TStory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0813478+08:00", comments="Source Table: t_story")
    default Optional<TStory> selectByPrimaryKey(Object id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0813478+08:00", comments="Source Table: t_story")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TStory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0823473+08:00", comments="Source Table: t_story")
    static UpdateDSL<UpdateModel> updateAllColumns(TStory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(storyProjectId).equalTo(record::getStoryProjectId)
                .set(storyCode).equalTo(record::getStoryCode)
                .set(storyTitle).equalTo(record::getStoryTitle)
                .set(storyType).equalTo(record::getStoryType)
                .set(storyStatus).equalTo(record::getStoryStatus)
                .set(storyOwner).equalTo(record::getStoryOwner)
                .set(storyPriority).equalTo(record::getStoryPriority)
                .set(storyPoint).equalTo(record::getStoryPoint)
                .set(storyStart).equalTo(record::getStoryStart)
                .set(storyEnd).equalTo(record::getStoryEnd)
                .set(storyDescription).equalTo(record::getStoryDescription)
                .set(storyReady).equalTo(record::getStoryReady)
                .set(storyDone).equalTo(record::getStoryDone)
                .set(storySprint).equalTo(record::getStorySprint)
                .set(requirementType).equalTo(record::getRequirementType)
                .set(requirementOrigin).equalTo(record::getRequirementOrigin)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
                .set(storyIndex).equalTo(record::getStoryIndex)
                .set(storyPointActual).equalTo(record::getStoryPointActual)
                .set(storyBusinessValue).equalTo(record::getStoryBusinessValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0823473+08:00", comments="Source Table: t_story")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TStory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(storyProjectId).equalToWhenPresent(record::getStoryProjectId)
                .set(storyCode).equalToWhenPresent(record::getStoryCode)
                .set(storyTitle).equalToWhenPresent(record::getStoryTitle)
                .set(storyType).equalToWhenPresent(record::getStoryType)
                .set(storyStatus).equalToWhenPresent(record::getStoryStatus)
                .set(storyOwner).equalToWhenPresent(record::getStoryOwner)
                .set(storyPriority).equalToWhenPresent(record::getStoryPriority)
                .set(storyPoint).equalToWhenPresent(record::getStoryPoint)
                .set(storyStart).equalToWhenPresent(record::getStoryStart)
                .set(storyEnd).equalToWhenPresent(record::getStoryEnd)
                .set(storyDescription).equalToWhenPresent(record::getStoryDescription)
                .set(storyReady).equalToWhenPresent(record::getStoryReady)
                .set(storyDone).equalToWhenPresent(record::getStoryDone)
                .set(storySprint).equalToWhenPresent(record::getStorySprint)
                .set(requirementType).equalToWhenPresent(record::getRequirementType)
                .set(requirementOrigin).equalToWhenPresent(record::getRequirementOrigin)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
                .set(storyIndex).equalToWhenPresent(record::getStoryIndex)
                .set(storyPointActual).equalToWhenPresent(record::getStoryPointActual)
                .set(storyBusinessValue).equalToWhenPresent(record::getStoryBusinessValue);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0843509+08:00", comments="Source Table: t_story")
    default int updateByPrimaryKey(TStory record) {
        return update(c ->
            c.set(storyProjectId).equalTo(record::getStoryProjectId)
            .set(storyCode).equalTo(record::getStoryCode)
            .set(storyTitle).equalTo(record::getStoryTitle)
            .set(storyType).equalTo(record::getStoryType)
            .set(storyStatus).equalTo(record::getStoryStatus)
            .set(storyOwner).equalTo(record::getStoryOwner)
            .set(storyPriority).equalTo(record::getStoryPriority)
            .set(storyPoint).equalTo(record::getStoryPoint)
            .set(storyStart).equalTo(record::getStoryStart)
            .set(storyEnd).equalTo(record::getStoryEnd)
            .set(storyDescription).equalTo(record::getStoryDescription)
            .set(storyReady).equalTo(record::getStoryReady)
            .set(storyDone).equalTo(record::getStoryDone)
            .set(storySprint).equalTo(record::getStorySprint)
            .set(requirementType).equalTo(record::getRequirementType)
            .set(requirementOrigin).equalTo(record::getRequirementOrigin)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .set(storyIndex).equalTo(record::getStoryIndex)
            .set(storyPointActual).equalTo(record::getStoryPointActual)
            .set(storyBusinessValue).equalTo(record::getStoryBusinessValue)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-26T09:46:10.0843509+08:00", comments="Source Table: t_story")
    default int updateByPrimaryKeySelective(TStory record) {
        return update(c ->
            c.set(storyProjectId).equalToWhenPresent(record::getStoryProjectId)
            .set(storyCode).equalToWhenPresent(record::getStoryCode)
            .set(storyTitle).equalToWhenPresent(record::getStoryTitle)
            .set(storyType).equalToWhenPresent(record::getStoryType)
            .set(storyStatus).equalToWhenPresent(record::getStoryStatus)
            .set(storyOwner).equalToWhenPresent(record::getStoryOwner)
            .set(storyPriority).equalToWhenPresent(record::getStoryPriority)
            .set(storyPoint).equalToWhenPresent(record::getStoryPoint)
            .set(storyStart).equalToWhenPresent(record::getStoryStart)
            .set(storyEnd).equalToWhenPresent(record::getStoryEnd)
            .set(storyDescription).equalToWhenPresent(record::getStoryDescription)
            .set(storyReady).equalToWhenPresent(record::getStoryReady)
            .set(storyDone).equalToWhenPresent(record::getStoryDone)
            .set(storySprint).equalToWhenPresent(record::getStorySprint)
            .set(requirementType).equalToWhenPresent(record::getRequirementType)
            .set(requirementOrigin).equalToWhenPresent(record::getRequirementOrigin)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .set(storyIndex).equalToWhenPresent(record::getStoryIndex)
            .set(storyPointActual).equalToWhenPresent(record::getStoryPointActual)
            .set(storyBusinessValue).equalToWhenPresent(record::getStoryBusinessValue)
            .where(id, isEqualTo(record::getId))
        );
    }
}