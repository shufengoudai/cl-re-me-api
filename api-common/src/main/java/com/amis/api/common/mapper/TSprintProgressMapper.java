package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TSprintProgressDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TSprintProgress;
import java.util.Collection;
import java.util.Date;
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
public interface TSprintProgressMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    BasicColumn[] selectList = BasicColumn.columnList(sprintId, statisticsDate, sprintRemainHours, sprintRemainPoint, sprintRemainStory, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TSprintProgress> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TSprintProgress> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TSprintProgressResult")
    Optional<TSprintProgress> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TSprintProgressResult", value = {
        @Result(column="sprint_id", property="sprintId", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="statistics_date", property="statisticsDate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="sprint_remain_hours", property="sprintRemainHours", jdbcType=JdbcType.NUMERIC),
        @Result(column="sprint_remain_point", property="sprintRemainPoint", jdbcType=JdbcType.INTEGER),
        @Result(column="sprint_remain_story", property="sprintRemainStory", jdbcType=JdbcType.INTEGER),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER)
    })
    List<TSprintProgress> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TSprintProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TSprintProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default int deleteByPrimaryKey(Object sprintId_, Date statisticsDate_) {
        return delete(c -> 
            c.where(sprintId, isEqualTo(sprintId_))
            .and(statisticsDate, isEqualTo(statisticsDate_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default int insert(TSprintProgress record) {
        return MyBatis3Utils.insert(this::insert, record, TSprintProgress, c ->
            c.map(sprintId).toProperty("sprintId")
            .map(statisticsDate).toProperty("statisticsDate")
            .map(sprintRemainHours).toProperty("sprintRemainHours")
            .map(sprintRemainPoint).toProperty("sprintRemainPoint")
            .map(sprintRemainStory).toProperty("sprintRemainStory")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default int insertMultiple(Collection<TSprintProgress> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TSprintProgress, c ->
            c.map(sprintId).toProperty("sprintId")
            .map(statisticsDate).toProperty("statisticsDate")
            .map(sprintRemainHours).toProperty("sprintRemainHours")
            .map(sprintRemainPoint).toProperty("sprintRemainPoint")
            .map(sprintRemainStory).toProperty("sprintRemainStory")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default int insertSelective(TSprintProgress record) {
        return MyBatis3Utils.insert(this::insert, record, TSprintProgress, c ->
            c.map(sprintId).toPropertyWhenPresent("sprintId", record::getSprintId)
            .map(statisticsDate).toPropertyWhenPresent("statisticsDate", record::getStatisticsDate)
            .map(sprintRemainHours).toPropertyWhenPresent("sprintRemainHours", record::getSprintRemainHours)
            .map(sprintRemainPoint).toPropertyWhenPresent("sprintRemainPoint", record::getSprintRemainPoint)
            .map(sprintRemainStory).toPropertyWhenPresent("sprintRemainStory", record::getSprintRemainStory)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default Optional<TSprintProgress> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TSprintProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default List<TSprintProgress> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TSprintProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default List<TSprintProgress> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TSprintProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default Optional<TSprintProgress> selectByPrimaryKey(Object sprintId_, Date statisticsDate_) {
        return selectOne(c ->
            c.where(sprintId, isEqualTo(sprintId_))
            .and(statisticsDate, isEqualTo(statisticsDate_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4593631+08:00", comments="Source Table: t_sprint_progress")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TSprintProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4603696+08:00", comments="Source Table: t_sprint_progress")
    static UpdateDSL<UpdateModel> updateAllColumns(TSprintProgress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sprintId).equalTo(record::getSprintId)
                .set(statisticsDate).equalTo(record::getStatisticsDate)
                .set(sprintRemainHours).equalTo(record::getSprintRemainHours)
                .set(sprintRemainPoint).equalTo(record::getSprintRemainPoint)
                .set(sprintRemainStory).equalTo(record::getSprintRemainStory)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4603696+08:00", comments="Source Table: t_sprint_progress")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TSprintProgress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sprintId).equalToWhenPresent(record::getSprintId)
                .set(statisticsDate).equalToWhenPresent(record::getStatisticsDate)
                .set(sprintRemainHours).equalToWhenPresent(record::getSprintRemainHours)
                .set(sprintRemainPoint).equalToWhenPresent(record::getSprintRemainPoint)
                .set(sprintRemainStory).equalToWhenPresent(record::getSprintRemainStory)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4603696+08:00", comments="Source Table: t_sprint_progress")
    default int updateByPrimaryKey(TSprintProgress record) {
        return update(c ->
            c.set(sprintRemainHours).equalTo(record::getSprintRemainHours)
            .set(sprintRemainPoint).equalTo(record::getSprintRemainPoint)
            .set(sprintRemainStory).equalTo(record::getSprintRemainStory)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .where(sprintId, isEqualTo(record::getSprintId))
            .and(statisticsDate, isEqualTo(record::getStatisticsDate))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-06-09T16:38:05.4603696+08:00", comments="Source Table: t_sprint_progress")
    default int updateByPrimaryKeySelective(TSprintProgress record) {
        return update(c ->
            c.set(sprintRemainHours).equalToWhenPresent(record::getSprintRemainHours)
            .set(sprintRemainPoint).equalToWhenPresent(record::getSprintRemainPoint)
            .set(sprintRemainStory).equalToWhenPresent(record::getSprintRemainStory)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .where(sprintId, isEqualTo(record::getSprintId))
            .and(statisticsDate, isEqualTo(record::getStatisticsDate))
        );
    }
}