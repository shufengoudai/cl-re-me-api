package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.FileResourceTagDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.FileResourceTag;
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
public interface FileResourceTagMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    BasicColumn[] selectList = BasicColumn.columnList(id, tag, createTime);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<FileResourceTag> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<FileResourceTag> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("FileResourceTagResult")
    Optional<FileResourceTag> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "FileResourceTagResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "tag", property = "tag", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
    List<FileResourceTag> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source Table: file_resource_tag")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, fileResourceTag, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, fileResourceTag, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default int insert(FileResourceTag record) {
        return MyBatis3Utils.insert(this::insert, record, fileResourceTag,
                c -> c.map(id).toProperty("id").map(tag).toProperty("tag").map(createTime).toProperty("createTime"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default int insertMultiple(Collection<FileResourceTag> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, fileResourceTag,
                c -> c.map(id).toProperty("id").map(tag).toProperty("tag").map(createTime).toProperty("createTime"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default int insertSelective(FileResourceTag record) {
        return MyBatis3Utils.insert(this::insert, record, fileResourceTag,
                c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(tag)
                        .toPropertyWhenPresent("tag", record::getTag).map(createTime)
                        .toPropertyWhenPresent("createTime", record::getCreateTime));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default Optional<FileResourceTag> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, fileResourceTag, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default List<FileResourceTag> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, fileResourceTag, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default List<FileResourceTag> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, fileResourceTag, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default Optional<FileResourceTag> selectByPrimaryKey(Integer id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3282931+08:00", comments = "Source Table: file_resource_tag")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, fileResourceTag, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3292918+08:00", comments = "Source Table: file_resource_tag")
    static UpdateDSL<UpdateModel> updateAllColumns(FileResourceTag record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(tag).equalTo(record::getTag).set(createTime)
                .equalTo(record::getCreateTime);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3292918+08:00", comments = "Source Table: file_resource_tag")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(FileResourceTag record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(tag).equalToWhenPresent(record::getTag).set(createTime)
                .equalToWhenPresent(record::getCreateTime);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3292918+08:00", comments = "Source Table: file_resource_tag")
    default int updateByPrimaryKey(FileResourceTag record) {
        return update(c -> c.set(tag).equalTo(record::getTag).set(createTime).equalTo(record::getCreateTime).where(id,
                isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3292918+08:00", comments = "Source Table: file_resource_tag")
    default int updateByPrimaryKeySelective(FileResourceTag record) {
        return update(c -> c.set(tag).equalToWhenPresent(record::getTag).set(createTime)
                .equalToWhenPresent(record::getCreateTime).where(id, isEqualTo(record::getId)));
    }
}
