package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TSprintKptDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TSprintKpt;
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
public interface TSprintKptMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5687635+08:00", comments="Source Table: t_sprint_kpt")
    BasicColumn[] selectList = BasicColumn.columnList(sprintId, kptId, kptType, kptDescription, kptRegistAccount, kptUpdateAccount, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv, kptRole, kptStatus);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5557676+08:00", comments="Source Table: t_sprint_kpt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5577681+08:00", comments="Source Table: t_sprint_kpt")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5587672+08:00", comments="Source Table: t_sprint_kpt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TSprintKpt> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5597662+08:00", comments="Source Table: t_sprint_kpt")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TSprintKpt> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5597662+08:00", comments="Source Table: t_sprint_kpt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TSprintKptResult")
    Optional<TSprintKpt> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5607668+08:00", comments="Source Table: t_sprint_kpt")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TSprintKptResult", value = {
        @Result(column="sprint_id", property="sprintId", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="kpt_id", property="kptId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="kpt_type", property="kptType", jdbcType=JdbcType.INTEGER),
        @Result(column="kpt_description", property="kptDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="kpt_regist_account", property="kptRegistAccount", jdbcType=JdbcType.OTHER),
        @Result(column="kpt_update_account", property="kptUpdateAccount", jdbcType=JdbcType.OTHER),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER),
        @Result(column="kpt_role", property="kptRole", jdbcType=JdbcType.INTEGER),
        @Result(column="kpt_status", property="kptStatus", jdbcType=JdbcType.INTEGER)
    })
    List<TSprintKpt> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5617647+08:00", comments="Source Table: t_sprint_kpt")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5627639+08:00", comments="Source Table: t_sprint_kpt")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TSprintKpt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5627639+08:00", comments="Source Table: t_sprint_kpt")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TSprintKpt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5637655+08:00", comments="Source Table: t_sprint_kpt")
    default int deleteByPrimaryKey(Object sprintId_, Integer kptId_) {
        return delete(c -> 
            c.where(sprintId, isEqualTo(sprintId_))
            .and(kptId, isEqualTo(kptId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5637655+08:00", comments="Source Table: t_sprint_kpt")
    default int insert(TSprintKpt record) {
        return MyBatis3Utils.insert(this::insert, record, TSprintKpt, c ->
            c.map(sprintId).toProperty("sprintId")
            .map(kptId).toProperty("kptId")
            .map(kptType).toProperty("kptType")
            .map(kptDescription).toProperty("kptDescription")
            .map(kptRegistAccount).toProperty("kptRegistAccount")
            .map(kptUpdateAccount).toProperty("kptUpdateAccount")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(kptRole).toProperty("kptRole")
            .map(kptStatus).toProperty("kptStatus")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.565766+08:00", comments="Source Table: t_sprint_kpt")
    default int insertMultiple(Collection<TSprintKpt> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TSprintKpt, c ->
            c.map(sprintId).toProperty("sprintId")
            .map(kptId).toProperty("kptId")
            .map(kptType).toProperty("kptType")
            .map(kptDescription).toProperty("kptDescription")
            .map(kptRegistAccount).toProperty("kptRegistAccount")
            .map(kptUpdateAccount).toProperty("kptUpdateAccount")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(kptRole).toProperty("kptRole")
            .map(kptStatus).toProperty("kptStatus")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.565766+08:00", comments="Source Table: t_sprint_kpt")
    default int insertSelective(TSprintKpt record) {
        return MyBatis3Utils.insert(this::insert, record, TSprintKpt, c ->
            c.map(sprintId).toPropertyWhenPresent("sprintId", record::getSprintId)
            .map(kptId).toPropertyWhenPresent("kptId", record::getKptId)
            .map(kptType).toPropertyWhenPresent("kptType", record::getKptType)
            .map(kptDescription).toPropertyWhenPresent("kptDescription", record::getKptDescription)
            .map(kptRegistAccount).toPropertyWhenPresent("kptRegistAccount", record::getKptRegistAccount)
            .map(kptUpdateAccount).toPropertyWhenPresent("kptUpdateAccount", record::getKptUpdateAccount)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
            .map(kptRole).toPropertyWhenPresent("kptRole", record::getKptRole)
            .map(kptStatus).toPropertyWhenPresent("kptStatus", record::getKptStatus)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5697662+08:00", comments="Source Table: t_sprint_kpt")
    default Optional<TSprintKpt> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TSprintKpt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5707658+08:00", comments="Source Table: t_sprint_kpt")
    default List<TSprintKpt> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TSprintKpt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5707658+08:00", comments="Source Table: t_sprint_kpt")
    default List<TSprintKpt> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TSprintKpt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5717649+08:00", comments="Source Table: t_sprint_kpt")
    default Optional<TSprintKpt> selectByPrimaryKey(Object sprintId_, Integer kptId_) {
        return selectOne(c ->
            c.where(sprintId, isEqualTo(sprintId_))
            .and(kptId, isEqualTo(kptId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5717649+08:00", comments="Source Table: t_sprint_kpt")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TSprintKpt, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5727664+08:00", comments="Source Table: t_sprint_kpt")
    static UpdateDSL<UpdateModel> updateAllColumns(TSprintKpt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sprintId).equalTo(record::getSprintId)
                .set(kptId).equalTo(record::getKptId)
                .set(kptType).equalTo(record::getKptType)
                .set(kptDescription).equalTo(record::getKptDescription)
                .set(kptRegistAccount).equalTo(record::getKptRegistAccount)
                .set(kptUpdateAccount).equalTo(record::getKptUpdateAccount)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
                .set(kptRole).equalTo(record::getKptRole)
                .set(kptStatus).equalTo(record::getKptStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5727664+08:00", comments="Source Table: t_sprint_kpt")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TSprintKpt record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(sprintId).equalToWhenPresent(record::getSprintId)
                .set(kptId).equalToWhenPresent(record::getKptId)
                .set(kptType).equalToWhenPresent(record::getKptType)
                .set(kptDescription).equalToWhenPresent(record::getKptDescription)
                .set(kptRegistAccount).equalToWhenPresent(record::getKptRegistAccount)
                .set(kptUpdateAccount).equalToWhenPresent(record::getKptUpdateAccount)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
                .set(kptRole).equalToWhenPresent(record::getKptRole)
                .set(kptStatus).equalToWhenPresent(record::getKptStatus);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5737655+08:00", comments="Source Table: t_sprint_kpt")
    default int updateByPrimaryKey(TSprintKpt record) {
        return update(c ->
            c.set(kptType).equalTo(record::getKptType)
            .set(kptDescription).equalTo(record::getKptDescription)
            .set(kptRegistAccount).equalTo(record::getKptRegistAccount)
            .set(kptUpdateAccount).equalTo(record::getKptUpdateAccount)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .set(kptRole).equalTo(record::getKptRole)
            .set(kptStatus).equalTo(record::getKptStatus)
            .where(sprintId, isEqualTo(record::getSprintId))
            .and(kptId, isEqualTo(record::getKptId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-11T11:42:15.5747748+08:00", comments="Source Table: t_sprint_kpt")
    default int updateByPrimaryKeySelective(TSprintKpt record) {
        return update(c ->
            c.set(kptType).equalToWhenPresent(record::getKptType)
            .set(kptDescription).equalToWhenPresent(record::getKptDescription)
            .set(kptRegistAccount).equalToWhenPresent(record::getKptRegistAccount)
            .set(kptUpdateAccount).equalToWhenPresent(record::getKptUpdateAccount)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .set(kptRole).equalToWhenPresent(record::getKptRole)
            .set(kptStatus).equalToWhenPresent(record::getKptStatus)
            .where(sprintId, isEqualTo(record::getSprintId))
            .and(kptId, isEqualTo(record::getKptId))
        );
    }
}