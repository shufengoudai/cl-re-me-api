package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.MessageMasterDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.MessageMaster;
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
public interface MessageMasterMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2761468+08:00", comments="Source Table: message_master")
    BasicColumn[] selectList = BasicColumn.columnList(messageType, messageId, messageLang, messageText, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2641483+08:00", comments="Source Table: message_master")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2651474+08:00", comments="Source Table: message_master")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2651474+08:00", comments="Source Table: message_master")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MessageMaster> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2661483+08:00", comments="Source Table: message_master")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MessageMaster> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2671475+08:00", comments="Source Table: message_master")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MessageMasterResult")
    Optional<MessageMaster> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2671475+08:00", comments="Source Table: message_master")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MessageMasterResult", value = {
        @Result(column="message_type", property="messageType", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="message_id", property="messageId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="message_lang", property="messageLang", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="message_text", property="messageText", jdbcType=JdbcType.VARCHAR),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER)
    })
    List<MessageMaster> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2691505+08:00", comments="Source Table: message_master")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2701524+08:00", comments="Source Table: message_master")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, messageMaster, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2701524+08:00", comments="Source Table: message_master")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, messageMaster, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2711485+08:00", comments="Source Table: message_master")
    default int deleteByPrimaryKey(String messageType_, Integer messageId_, Integer messageLang_) {
        return delete(c -> 
            c.where(messageType, isEqualTo(messageType_))
            .and(messageId, isEqualTo(messageId_))
            .and(messageLang, isEqualTo(messageLang_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2721465+08:00", comments="Source Table: message_master")
    default int insert(MessageMaster record) {
        return MyBatis3Utils.insert(this::insert, record, messageMaster, c ->
            c.map(messageType).toProperty("messageType")
            .map(messageId).toProperty("messageId")
            .map(messageLang).toProperty("messageLang")
            .map(messageText).toProperty("messageText")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2731474+08:00", comments="Source Table: message_master")
    default int insertMultiple(Collection<MessageMaster> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, messageMaster, c ->
            c.map(messageType).toProperty("messageType")
            .map(messageId).toProperty("messageId")
            .map(messageLang).toProperty("messageLang")
            .map(messageText).toProperty("messageText")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2741468+08:00", comments="Source Table: message_master")
    default int insertSelective(MessageMaster record) {
        return MyBatis3Utils.insert(this::insert, record, messageMaster, c ->
            c.map(messageType).toPropertyWhenPresent("messageType", record::getMessageType)
            .map(messageId).toPropertyWhenPresent("messageId", record::getMessageId)
            .map(messageLang).toPropertyWhenPresent("messageLang", record::getMessageLang)
            .map(messageText).toPropertyWhenPresent("messageText", record::getMessageText)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.278148+08:00", comments="Source Table: message_master")
    default Optional<MessageMaster> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, messageMaster, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.278148+08:00", comments="Source Table: message_master")
    default List<MessageMaster> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, messageMaster, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2791479+08:00", comments="Source Table: message_master")
    default List<MessageMaster> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, messageMaster, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2791479+08:00", comments="Source Table: message_master")
    default Optional<MessageMaster> selectByPrimaryKey(String messageType_, Integer messageId_, Integer messageLang_) {
        return selectOne(c ->
            c.where(messageType, isEqualTo(messageType_))
            .and(messageId, isEqualTo(messageId_))
            .and(messageLang, isEqualTo(messageLang_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2801494+08:00", comments="Source Table: message_master")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, messageMaster, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2801494+08:00", comments="Source Table: message_master")
    static UpdateDSL<UpdateModel> updateAllColumns(MessageMaster record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(messageType).equalTo(record::getMessageType)
                .set(messageId).equalTo(record::getMessageId)
                .set(messageLang).equalTo(record::getMessageLang)
                .set(messageText).equalTo(record::getMessageText)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2811473+08:00", comments="Source Table: message_master")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MessageMaster record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(messageType).equalToWhenPresent(record::getMessageType)
                .set(messageId).equalToWhenPresent(record::getMessageId)
                .set(messageLang).equalToWhenPresent(record::getMessageLang)
                .set(messageText).equalToWhenPresent(record::getMessageText)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2821467+08:00", comments="Source Table: message_master")
    default int updateByPrimaryKey(MessageMaster record) {
        return update(c ->
            c.set(messageText).equalTo(record::getMessageText)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .where(messageType, isEqualTo(record::getMessageType))
            .and(messageId, isEqualTo(record::getMessageId))
            .and(messageLang, isEqualTo(record::getMessageLang))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-17T15:58:23.2831579+08:00", comments="Source Table: message_master")
    default int updateByPrimaryKeySelective(MessageMaster record) {
        return update(c ->
            c.set(messageText).equalToWhenPresent(record::getMessageText)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .where(messageType, isEqualTo(record::getMessageType))
            .and(messageId, isEqualTo(record::getMessageId))
            .and(messageLang, isEqualTo(record::getMessageLang))
        );
    }
}