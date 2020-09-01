package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TCompanyDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TCompany;
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
public interface TCompanyMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6815762+08:00", comments="Source Table: t_company")
    BasicColumn[] selectList = BasicColumn.columnList(id, companyName, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv, companyIdentify);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6705766+08:00", comments="Source Table: t_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6715785+08:00", comments="Source Table: t_company")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6725761+08:00", comments="Source Table: t_company")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TCompany> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6735769+08:00", comments="Source Table: t_company")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TCompany> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6735769+08:00", comments="Source Table: t_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TCompanyResult")
    Optional<TCompany> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6745766+08:00", comments="Source Table: t_company")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TCompanyResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="company_name", property="companyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER),
        @Result(column="company_identify", property="companyIdentify", jdbcType=JdbcType.VARCHAR)
    })
    List<TCompany> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.675577+08:00", comments="Source Table: t_company")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.675577+08:00", comments="Source Table: t_company")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TCompany, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6765763+08:00", comments="Source Table: t_company")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TCompany, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6765763+08:00", comments="Source Table: t_company")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6775779+08:00", comments="Source Table: t_company")
    default int insert(TCompany record) {
        return MyBatis3Utils.insert(this::insert, record, TCompany, c ->
            c.map(id).toProperty("id")
            .map(companyName).toProperty("companyName")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(companyIdentify).toProperty("companyIdentify")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.678579+08:00", comments="Source Table: t_company")
    default int insertMultiple(Collection<TCompany> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TCompany, c ->
            c.map(id).toProperty("id")
            .map(companyName).toProperty("companyName")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(companyIdentify).toProperty("companyIdentify")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6795786+08:00", comments="Source Table: t_company")
    default int insertSelective(TCompany record) {
        return MyBatis3Utils.insert(this::insert, record, TCompany, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(companyName).toPropertyWhenPresent("companyName", record::getCompanyName)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
            .map(companyIdentify).toPropertyWhenPresent("companyIdentify", record::getCompanyIdentify)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6835763+08:00", comments="Source Table: t_company")
    default Optional<TCompany> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TCompany, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6835763+08:00", comments="Source Table: t_company")
    default List<TCompany> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TCompany, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6835763+08:00", comments="Source Table: t_company")
    default List<TCompany> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TCompany, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6845779+08:00", comments="Source Table: t_company")
    default Optional<TCompany> selectByPrimaryKey(Object id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6845779+08:00", comments="Source Table: t_company")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TCompany, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.685578+08:00", comments="Source Table: t_company")
    static UpdateDSL<UpdateModel> updateAllColumns(TCompany record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(companyName).equalTo(record::getCompanyName)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
                .set(companyIdentify).equalTo(record::getCompanyIdentify);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.685578+08:00", comments="Source Table: t_company")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TCompany record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(companyName).equalToWhenPresent(record::getCompanyName)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
                .set(companyIdentify).equalToWhenPresent(record::getCompanyIdentify);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.686576+08:00", comments="Source Table: t_company")
    default int updateByPrimaryKey(TCompany record) {
        return update(c ->
            c.set(companyName).equalTo(record::getCompanyName)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .set(companyIdentify).equalTo(record::getCompanyIdentify)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-14T17:08:03.6875782+08:00", comments="Source Table: t_company")
    default int updateByPrimaryKeySelective(TCompany record) {
        return update(c ->
            c.set(companyName).equalToWhenPresent(record::getCompanyName)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .set(companyIdentify).equalToWhenPresent(record::getCompanyIdentify)
            .where(id, isEqualTo(record::getId))
        );
    }
}