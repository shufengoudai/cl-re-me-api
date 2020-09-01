package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TTaskDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TTask;
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
public interface TTaskMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    BasicColumn[] selectList = BasicColumn.columnList(id, taskStory, taskCode, hourRemain, taskName, taskType,
            taskStatus, taskOwner, taskPriority, taskStart, taskEnd, taskHour, taskDescription, insAccountId, insDtTime,
            updAccountId, updDtTime, logicalDelDiv);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<TTask> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TTask> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("TTaskResult")
    Optional<TTask> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "TTaskResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.OTHER, id = true),
            @Result(column = "task_story", property = "taskStory", jdbcType = JdbcType.OTHER),
            @Result(column = "task_code", property = "taskCode", jdbcType = JdbcType.INTEGER),
            @Result(column = "hour_remain", property = "hourRemain", jdbcType = JdbcType.NUMERIC),
            @Result(column = "task_name", property = "taskName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "task_type", property = "taskType", jdbcType = JdbcType.INTEGER),
            @Result(column = "task_status", property = "taskStatus", jdbcType = JdbcType.INTEGER),
            @Result(column = "task_owner", property = "taskOwner", jdbcType = JdbcType.OTHER),
            @Result(column = "task_priority", property = "taskPriority", jdbcType = JdbcType.INTEGER),
            @Result(column = "task_start", property = "taskStart", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "task_end", property = "taskEnd", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "task_hour", property = "taskHour", jdbcType = JdbcType.NUMERIC),
            @Result(column = "task_description", property = "taskDescription", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER) })
    List<TTask> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TTask, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.533559+08:00", comments = "Source Table: t_task")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TTask, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default int insert(TTask record) {
        return MyBatis3Utils.insert(this::insert, record, TTask,
                c -> c.map(id).toProperty("id").map(taskStory).toProperty("taskStory").map(taskCode)
                        .toProperty("taskCode").map(hourRemain).toProperty("hourRemain").map(taskName)
                        .toProperty("taskName").map(taskType).toProperty("taskType").map(taskStatus)
                        .toProperty("taskStatus").map(taskOwner).toProperty("taskOwner").map(taskPriority)
                        .toProperty("taskPriority").map(taskStart).toProperty("taskStart").map(taskEnd)
                        .toProperty("taskEnd").map(taskHour).toProperty("taskHour").map(taskDescription)
                        .toProperty("taskDescription").map(insAccountId).toProperty("insAccountId").map(insDtTime)
                        .toProperty("insDtTime").map(updAccountId).toProperty("updAccountId").map(updDtTime)
                        .toProperty("updDtTime").map(logicalDelDiv).toProperty("logicalDelDiv"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default int insertMultiple(Collection<TTask> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TTask,
                c -> c.map(id).toProperty("id").map(taskStory).toProperty("taskStory").map(taskCode)
                        .toProperty("taskCode").map(hourRemain).toProperty("hourRemain").map(taskName)
                        .toProperty("taskName").map(taskType).toProperty("taskType").map(taskStatus)
                        .toProperty("taskStatus").map(taskOwner).toProperty("taskOwner").map(taskPriority)
                        .toProperty("taskPriority").map(taskStart).toProperty("taskStart").map(taskEnd)
                        .toProperty("taskEnd").map(taskHour).toProperty("taskHour").map(taskDescription)
                        .toProperty("taskDescription").map(insAccountId).toProperty("insAccountId").map(insDtTime)
                        .toProperty("insDtTime").map(updAccountId).toProperty("updAccountId").map(updDtTime)
                        .toProperty("updDtTime").map(logicalDelDiv).toProperty("logicalDelDiv"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default int insertSelective(TTask record) {
        return MyBatis3Utils.insert(this::insert, record, TTask,
                c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(taskStory)
                        .toPropertyWhenPresent("taskStory", record::getTaskStory).map(taskCode)
                        .toPropertyWhenPresent("taskCode", record::getTaskCode).map(hourRemain)
                        .toPropertyWhenPresent("hourRemain", record::getHourRemain).map(taskName)
                        .toPropertyWhenPresent("taskName", record::getTaskName).map(taskType)
                        .toPropertyWhenPresent("taskType", record::getTaskType).map(taskStatus)
                        .toPropertyWhenPresent("taskStatus", record::getTaskStatus).map(taskOwner)
                        .toPropertyWhenPresent("taskOwner", record::getTaskOwner).map(taskPriority)
                        .toPropertyWhenPresent("taskPriority", record::getTaskPriority).map(taskStart)
                        .toPropertyWhenPresent("taskStart", record::getTaskStart).map(taskEnd)
                        .toPropertyWhenPresent("taskEnd", record::getTaskEnd).map(taskHour)
                        .toPropertyWhenPresent("taskHour", record::getTaskHour).map(taskDescription)
                        .toPropertyWhenPresent("taskDescription", record::getTaskDescription).map(insAccountId)
                        .toPropertyWhenPresent("insAccountId", record::getInsAccountId).map(insDtTime)
                        .toPropertyWhenPresent("insDtTime", record::getInsDtTime).map(updAccountId)
                        .toPropertyWhenPresent("updAccountId", record::getUpdAccountId).map(updDtTime)
                        .toPropertyWhenPresent("updDtTime", record::getUpdDtTime).map(logicalDelDiv)
                        .toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default Optional<TTask> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TTask, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default List<TTask> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TTask, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default List<TTask> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TTask, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default Optional<TTask> selectByPrimaryKey(Object id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TTask, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    static UpdateDSL<UpdateModel> updateAllColumns(TTask record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(taskStory).equalTo(record::getTaskStory).set(taskCode)
                .equalTo(record::getTaskCode).set(hourRemain).equalTo(record::getHourRemain).set(taskName)
                .equalTo(record::getTaskName).set(taskType).equalTo(record::getTaskType).set(taskStatus)
                .equalTo(record::getTaskStatus).set(taskOwner).equalTo(record::getTaskOwner).set(taskPriority)
                .equalTo(record::getTaskPriority).set(taskStart).equalTo(record::getTaskStart).set(taskEnd)
                .equalTo(record::getTaskEnd).set(taskHour).equalTo(record::getTaskHour).set(taskDescription)
                .equalTo(record::getTaskDescription).set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime)
                .equalTo(record::getInsDtTime).set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime)
                .equalTo(record::getUpdDtTime).set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TTask record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(taskStory).equalToWhenPresent(record::getTaskStory)
                .set(taskCode).equalToWhenPresent(record::getTaskCode).set(hourRemain)
                .equalToWhenPresent(record::getHourRemain).set(taskName).equalToWhenPresent(record::getTaskName)
                .set(taskType).equalToWhenPresent(record::getTaskType).set(taskStatus)
                .equalToWhenPresent(record::getTaskStatus).set(taskOwner).equalToWhenPresent(record::getTaskOwner)
                .set(taskPriority).equalToWhenPresent(record::getTaskPriority).set(taskStart)
                .equalToWhenPresent(record::getTaskStart).set(taskEnd).equalToWhenPresent(record::getTaskEnd)
                .set(taskHour).equalToWhenPresent(record::getTaskHour).set(taskDescription)
                .equalToWhenPresent(record::getTaskDescription).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default int updateByPrimaryKey(TTask record) {
        return update(c -> c.set(taskStory).equalTo(record::getTaskStory).set(taskCode).equalTo(record::getTaskCode)
                .set(hourRemain).equalTo(record::getHourRemain).set(taskName).equalTo(record::getTaskName).set(taskType)
                .equalTo(record::getTaskType).set(taskStatus).equalTo(record::getTaskStatus).set(taskOwner)
                .equalTo(record::getTaskOwner).set(taskPriority).equalTo(record::getTaskPriority).set(taskStart)
                .equalTo(record::getTaskStart).set(taskEnd).equalTo(record::getTaskEnd).set(taskHour)
                .equalTo(record::getTaskHour).set(taskDescription).equalTo(record::getTaskDescription).set(insAccountId)
                .equalTo(record::getInsAccountId).set(insDtTime).equalTo(record::getInsDtTime).set(updAccountId)
                .equalTo(record::getUpdAccountId).set(updDtTime).equalTo(record::getUpdDtTime).set(logicalDelDiv)
                .equalTo(record::getLogicalDelDiv).where(id, isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-06-15T14:25:31.5345575+08:00", comments = "Source Table: t_task")
    default int updateByPrimaryKeySelective(TTask record) {
        return update(c -> c.set(taskStory).equalToWhenPresent(record::getTaskStory).set(taskCode)
                .equalToWhenPresent(record::getTaskCode).set(hourRemain).equalToWhenPresent(record::getHourRemain)
                .set(taskName).equalToWhenPresent(record::getTaskName).set(taskType)
                .equalToWhenPresent(record::getTaskType).set(taskStatus).equalToWhenPresent(record::getTaskStatus)
                .set(taskOwner).equalToWhenPresent(record::getTaskOwner).set(taskPriority)
                .equalToWhenPresent(record::getTaskPriority).set(taskStart).equalToWhenPresent(record::getTaskStart)
                .set(taskEnd).equalToWhenPresent(record::getTaskEnd).set(taskHour)
                .equalToWhenPresent(record::getTaskHour).set(taskDescription)
                .equalToWhenPresent(record::getTaskDescription).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv).where(id, isEqualTo(record::getId)));
    }
}
