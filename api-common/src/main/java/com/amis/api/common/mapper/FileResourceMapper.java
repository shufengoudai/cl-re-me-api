package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.FileResourceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.FileResource;
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
public interface FileResourceMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    BasicColumn[] selectList = BasicColumn.columnList(id, tagId, type, filename, path, size, ext, createTime);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<FileResource> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<FileResource> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("FileResourceResult")
    Optional<FileResource> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "FileResourceResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "tag_id", property = "tagId", jdbcType = JdbcType.INTEGER),
            @Result(column = "type", property = "type", jdbcType = JdbcType.SMALLINT),
            @Result(column = "filename", property = "filename", jdbcType = JdbcType.VARCHAR),
            @Result(column = "path", property = "path", jdbcType = JdbcType.VARCHAR),
            @Result(column = "size", property = "size", jdbcType = JdbcType.INTEGER),
            @Result(column = "ext", property = "ext", jdbcType = JdbcType.VARCHAR),
            @Result(column = "create_time", property = "createTime", jdbcType = JdbcType.TIMESTAMP) })
    List<FileResource> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, fileResource, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, fileResource, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default int insert(FileResource record) {
        return MyBatis3Utils.insert(this::insert, record, fileResource,
                c -> c.map(id).toProperty("id").map(tagId).toProperty("tagId").map(type).toProperty("type")
                        .map(filename).toProperty("filename").map(path).toProperty("path").map(size).toProperty("size")
                        .map(ext).toProperty("ext").map(createTime).toProperty("createTime"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default int insertMultiple(Collection<FileResource> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, fileResource,
                c -> c.map(id).toProperty("id").map(tagId).toProperty("tagId").map(type).toProperty("type")
                        .map(filename).toProperty("filename").map(path).toProperty("path").map(size).toProperty("size")
                        .map(ext).toProperty("ext").map(createTime).toProperty("createTime"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default int insertSelective(FileResource record) {
        return MyBatis3Utils.insert(this::insert, record, fileResource, c -> c.map(id)
                .toPropertyWhenPresent("id", record::getId).map(tagId).toPropertyWhenPresent("tagId", record::getTagId)
                .map(type).toPropertyWhenPresent("type", record::getType).map(filename)
                .toPropertyWhenPresent("filename", record::getFilename).map(path)
                .toPropertyWhenPresent("path", record::getPath).map(size).toPropertyWhenPresent("size", record::getSize)
                .map(ext).toPropertyWhenPresent("ext", record::getExt).map(createTime)
                .toPropertyWhenPresent("createTime", record::getCreateTime));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default Optional<FileResource> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, fileResource, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default List<FileResource> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, fileResource, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default List<FileResource> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, fileResource, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default Optional<FileResource> selectByPrimaryKey(Integer id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, fileResource, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    static UpdateDSL<UpdateModel> updateAllColumns(FileResource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(tagId).equalTo(record::getTagId).set(type)
                .equalTo(record::getType).set(filename).equalTo(record::getFilename).set(path).equalTo(record::getPath)
                .set(size).equalTo(record::getSize).set(ext).equalTo(record::getExt).set(createTime)
                .equalTo(record::getCreateTime);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(FileResource record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(tagId).equalToWhenPresent(record::getTagId).set(type)
                .equalToWhenPresent(record::getType).set(filename).equalToWhenPresent(record::getFilename).set(path)
                .equalToWhenPresent(record::getPath).set(size).equalToWhenPresent(record::getSize).set(ext)
                .equalToWhenPresent(record::getExt).set(createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default int updateByPrimaryKey(FileResource record) {
        return update(c -> c.set(tagId).equalTo(record::getTagId).set(type).equalTo(record::getType).set(filename)
                .equalTo(record::getFilename).set(path).equalTo(record::getPath).set(size).equalTo(record::getSize)
                .set(ext).equalTo(record::getExt).set(createTime).equalTo(record::getCreateTime)
                .where(id, isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3192976+08:00", comments = "Source Table: file_resource")
    default int updateByPrimaryKeySelective(FileResource record) {
        return update(c -> c.set(tagId).equalToWhenPresent(record::getTagId).set(type)
                .equalToWhenPresent(record::getType).set(filename).equalToWhenPresent(record::getFilename).set(path)
                .equalToWhenPresent(record::getPath).set(size).equalToWhenPresent(record::getSize).set(ext)
                .equalToWhenPresent(record::getExt).set(createTime).equalToWhenPresent(record::getCreateTime)
                .where(id, isEqualTo(record::getId)));
    }
}
