package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TBugProgressDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TBugProgress;
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
public interface TBugProgressMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    BasicColumn[] selectList = BasicColumn.columnList(bugId, statisticsDate, hourRegist, hourRemain, hourRegistAccount, hourUpdateAccount, hourDescription, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TBugProgress> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TBugProgress> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TBugProgressResult")
    Optional<TBugProgress> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TBugProgressResult", value = {
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="statistics_date", property="statisticsDate", jdbcType=JdbcType.DATE, id=true),
        @Result(column="hour_regist", property="hourRegist", jdbcType=JdbcType.NUMERIC),
        @Result(column="hour_remain", property="hourRemain", jdbcType=JdbcType.NUMERIC),
        @Result(column="hour_regist_account", property="hourRegistAccount", jdbcType=JdbcType.OTHER),
        @Result(column="hour_update_account", property="hourUpdateAccount", jdbcType=JdbcType.OTHER),
        @Result(column="hour_description", property="hourDescription", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER)
    })
    List<TBugProgress> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TBugProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TBugProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    default int deleteByPrimaryKey(Object bugId_, Date statisticsDate_) {
        return delete(c -> 
            c.where(bugId, isEqualTo(bugId_))
            .and(statisticsDate, isEqualTo(statisticsDate_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7523235+08:00", comments="Source Table: t_bug_progress")
    default int insert(TBugProgress record) {
        return MyBatis3Utils.insert(this::insert, record, TBugProgress, c ->
            c.map(bugId).toProperty("bugId")
            .map(statisticsDate).toProperty("statisticsDate")
            .map(hourRegist).toProperty("hourRegist")
            .map(hourRemain).toProperty("hourRemain")
            .map(hourRegistAccount).toProperty("hourRegistAccount")
            .map(hourUpdateAccount).toProperty("hourUpdateAccount")
            .map(hourDescription).toProperty("hourDescription")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    default int insertMultiple(Collection<TBugProgress> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TBugProgress, c ->
            c.map(bugId).toProperty("bugId")
            .map(statisticsDate).toProperty("statisticsDate")
            .map(hourRegist).toProperty("hourRegist")
            .map(hourRemain).toProperty("hourRemain")
            .map(hourRegistAccount).toProperty("hourRegistAccount")
            .map(hourUpdateAccount).toProperty("hourUpdateAccount")
            .map(hourDescription).toProperty("hourDescription")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    default int insertSelective(TBugProgress record) {
        return MyBatis3Utils.insert(this::insert, record, TBugProgress, c ->
            c.map(bugId).toPropertyWhenPresent("bugId", record::getBugId)
            .map(statisticsDate).toPropertyWhenPresent("statisticsDate", record::getStatisticsDate)
            .map(hourRegist).toPropertyWhenPresent("hourRegist", record::getHourRegist)
            .map(hourRemain).toPropertyWhenPresent("hourRemain", record::getHourRemain)
            .map(hourRegistAccount).toPropertyWhenPresent("hourRegistAccount", record::getHourRegistAccount)
            .map(hourUpdateAccount).toPropertyWhenPresent("hourUpdateAccount", record::getHourUpdateAccount)
            .map(hourDescription).toPropertyWhenPresent("hourDescription", record::getHourDescription)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    default Optional<TBugProgress> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TBugProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    default List<TBugProgress> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TBugProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    default List<TBugProgress> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TBugProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    default Optional<TBugProgress> selectByPrimaryKey(Object bugId_, Date statisticsDate_) {
        return selectOne(c ->
            c.where(bugId, isEqualTo(bugId_))
            .and(statisticsDate, isEqualTo(statisticsDate_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TBugProgress, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    static UpdateDSL<UpdateModel> updateAllColumns(TBugProgress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bugId).equalTo(record::getBugId)
                .set(statisticsDate).equalTo(record::getStatisticsDate)
                .set(hourRegist).equalTo(record::getHourRegist)
                .set(hourRemain).equalTo(record::getHourRemain)
                .set(hourRegistAccount).equalTo(record::getHourRegistAccount)
                .set(hourUpdateAccount).equalTo(record::getHourUpdateAccount)
                .set(hourDescription).equalTo(record::getHourDescription)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.753322+08:00", comments="Source Table: t_bug_progress")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TBugProgress record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(bugId).equalToWhenPresent(record::getBugId)
                .set(statisticsDate).equalToWhenPresent(record::getStatisticsDate)
                .set(hourRegist).equalToWhenPresent(record::getHourRegist)
                .set(hourRemain).equalToWhenPresent(record::getHourRemain)
                .set(hourRegistAccount).equalToWhenPresent(record::getHourRegistAccount)
                .set(hourUpdateAccount).equalToWhenPresent(record::getHourUpdateAccount)
                .set(hourDescription).equalToWhenPresent(record::getHourDescription)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7543212+08:00", comments="Source Table: t_bug_progress")
    default int updateByPrimaryKey(TBugProgress record) {
        return update(c ->
            c.set(hourRegist).equalTo(record::getHourRegist)
            .set(hourRemain).equalTo(record::getHourRemain)
            .set(hourRegistAccount).equalTo(record::getHourRegistAccount)
            .set(hourUpdateAccount).equalTo(record::getHourUpdateAccount)
            .set(hourDescription).equalTo(record::getHourDescription)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .where(bugId, isEqualTo(record::getBugId))
            .and(statisticsDate, isEqualTo(record::getStatisticsDate))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-03T17:19:48.7543212+08:00", comments="Source Table: t_bug_progress")
    default int updateByPrimaryKeySelective(TBugProgress record) {
        return update(c ->
            c.set(hourRegist).equalToWhenPresent(record::getHourRegist)
            .set(hourRemain).equalToWhenPresent(record::getHourRemain)
            .set(hourRegistAccount).equalToWhenPresent(record::getHourRegistAccount)
            .set(hourUpdateAccount).equalToWhenPresent(record::getHourUpdateAccount)
            .set(hourDescription).equalToWhenPresent(record::getHourDescription)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .where(bugId, isEqualTo(record::getBugId))
            .and(statisticsDate, isEqualTo(record::getStatisticsDate))
        );
    }
}