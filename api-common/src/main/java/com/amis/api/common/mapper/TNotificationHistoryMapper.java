package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TNotificationHistoryDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TNotificationHistory;
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
public interface TNotificationHistoryMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    BasicColumn[] selectList = BasicColumn.columnList(id, notifyMember, notifyContent, notifyTime, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TNotificationHistory> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TNotificationHistory> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TNotificationHistoryResult")
    Optional<TNotificationHistory> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TNotificationHistoryResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="notify_member", property="notifyMember", jdbcType=JdbcType.OTHER),
        @Result(column="notify_content", property="notifyContent", jdbcType=JdbcType.VARCHAR),
        @Result(column="notify_time", property="notifyTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER)
    })
    List<TNotificationHistory> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TNotificationHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TNotificationHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    default int insert(TNotificationHistory record) {
        return MyBatis3Utils.insert(this::insert, record, TNotificationHistory, c ->
            c.map(id).toProperty("id")
            .map(notifyMember).toProperty("notifyMember")
            .map(notifyContent).toProperty("notifyContent")
            .map(notifyTime).toProperty("notifyTime")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    default int insertMultiple(Collection<TNotificationHistory> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TNotificationHistory, c ->
            c.map(id).toProperty("id")
            .map(notifyMember).toProperty("notifyMember")
            .map(notifyContent).toProperty("notifyContent")
            .map(notifyTime).toProperty("notifyTime")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0382787+08:00", comments="Source Table: t_notification_history")
    default int insertSelective(TNotificationHistory record) {
        return MyBatis3Utils.insert(this::insert, record, TNotificationHistory, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(notifyMember).toPropertyWhenPresent("notifyMember", record::getNotifyMember)
            .map(notifyContent).toPropertyWhenPresent("notifyContent", record::getNotifyContent)
            .map(notifyTime).toPropertyWhenPresent("notifyTime", record::getNotifyTime)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    default Optional<TNotificationHistory> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TNotificationHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    default List<TNotificationHistory> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TNotificationHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    default List<TNotificationHistory> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TNotificationHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    default Optional<TNotificationHistory> selectByPrimaryKey(Object id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TNotificationHistory, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    static UpdateDSL<UpdateModel> updateAllColumns(TNotificationHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(notifyMember).equalTo(record::getNotifyMember)
                .set(notifyContent).equalTo(record::getNotifyContent)
                .set(notifyTime).equalTo(record::getNotifyTime)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TNotificationHistory record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(notifyMember).equalToWhenPresent(record::getNotifyMember)
                .set(notifyContent).equalToWhenPresent(record::getNotifyContent)
                .set(notifyTime).equalToWhenPresent(record::getNotifyTime)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    default int updateByPrimaryKey(TNotificationHistory record) {
        return update(c ->
            c.set(notifyMember).equalTo(record::getNotifyMember)
            .set(notifyContent).equalTo(record::getNotifyContent)
            .set(notifyTime).equalTo(record::getNotifyTime)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-07-22T17:45:46.0392795+08:00", comments="Source Table: t_notification_history")
    default int updateByPrimaryKeySelective(TNotificationHistory record) {
        return update(c ->
            c.set(notifyMember).equalToWhenPresent(record::getNotifyMember)
            .set(notifyContent).equalToWhenPresent(record::getNotifyContent)
            .set(notifyTime).equalToWhenPresent(record::getNotifyTime)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .where(id, isEqualTo(record::getId))
        );
    }
}