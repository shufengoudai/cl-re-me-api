package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TUploadFileDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TUploadFile;
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
public interface TUploadFileMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8151082+08:00", comments="Source Table: t_upload_file")
    BasicColumn[] selectList = BasicColumn.columnList(id, fileRelativeType, fileRelativeId, fileName, filePath, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv, fileType, fileSize);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8031037+08:00", comments="Source Table: t_upload_file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8041031+08:00", comments="Source Table: t_upload_file")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8051072+08:00", comments="Source Table: t_upload_file")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TUploadFile> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8061144+08:00", comments="Source Table: t_upload_file")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TUploadFile> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.807111+08:00", comments="Source Table: t_upload_file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TUploadFileResult")
    Optional<TUploadFile> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.807111+08:00", comments="Source Table: t_upload_file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TUploadFileResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="file_relative_type", property="fileRelativeType", jdbcType=JdbcType.INTEGER),
        @Result(column="file_relative_id", property="fileRelativeId", jdbcType=JdbcType.OTHER),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.INTEGER),
        @Result(column="file_size", property="fileSize", jdbcType=JdbcType.VARCHAR)
    })
    List<TUploadFile> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8081113+08:00", comments="Source Table: t_upload_file")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8091108+08:00", comments="Source Table: t_upload_file")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TUploadFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8091108+08:00", comments="Source Table: t_upload_file")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TUploadFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8101102+08:00", comments="Source Table: t_upload_file")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8101102+08:00", comments="Source Table: t_upload_file")
    default int insert(TUploadFile record) {
        return MyBatis3Utils.insert(this::insert, record, TUploadFile, c ->
            c.map(id).toProperty("id")
            .map(fileRelativeType).toProperty("fileRelativeType")
            .map(fileRelativeId).toProperty("fileRelativeId")
            .map(fileName).toProperty("fileName")
            .map(filePath).toProperty("filePath")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(fileType).toProperty("fileType")
            .map(fileSize).toProperty("fileSize")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8121044+08:00", comments="Source Table: t_upload_file")
    default int insertMultiple(Collection<TUploadFile> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TUploadFile, c ->
            c.map(id).toProperty("id")
            .map(fileRelativeType).toProperty("fileRelativeType")
            .map(fileRelativeId).toProperty("fileRelativeId")
            .map(fileName).toProperty("fileName")
            .map(filePath).toProperty("filePath")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(fileType).toProperty("fileType")
            .map(fileSize).toProperty("fileSize")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8121044+08:00", comments="Source Table: t_upload_file")
    default int insertSelective(TUploadFile record) {
        return MyBatis3Utils.insert(this::insert, record, TUploadFile, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(fileRelativeType).toPropertyWhenPresent("fileRelativeType", record::getFileRelativeType)
            .map(fileRelativeId).toPropertyWhenPresent("fileRelativeId", record::getFileRelativeId)
            .map(fileName).toPropertyWhenPresent("fileName", record::getFileName)
            .map(filePath).toPropertyWhenPresent("filePath", record::getFilePath)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
            .map(fileType).toPropertyWhenPresent("fileType", record::getFileType)
            .map(fileSize).toPropertyWhenPresent("fileSize", record::getFileSize)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8161124+08:00", comments="Source Table: t_upload_file")
    default Optional<TUploadFile> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TUploadFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8161124+08:00", comments="Source Table: t_upload_file")
    default List<TUploadFile> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TUploadFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8171109+08:00", comments="Source Table: t_upload_file")
    default List<TUploadFile> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TUploadFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8171109+08:00", comments="Source Table: t_upload_file")
    default Optional<TUploadFile> selectByPrimaryKey(Object id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8181105+08:00", comments="Source Table: t_upload_file")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TUploadFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8181105+08:00", comments="Source Table: t_upload_file")
    static UpdateDSL<UpdateModel> updateAllColumns(TUploadFile record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(fileRelativeType).equalTo(record::getFileRelativeType)
                .set(fileRelativeId).equalTo(record::getFileRelativeId)
                .set(fileName).equalTo(record::getFileName)
                .set(filePath).equalTo(record::getFilePath)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
                .set(fileType).equalTo(record::getFileType)
                .set(fileSize).equalTo(record::getFileSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8191096+08:00", comments="Source Table: t_upload_file")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TUploadFile record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(fileRelativeType).equalToWhenPresent(record::getFileRelativeType)
                .set(fileRelativeId).equalToWhenPresent(record::getFileRelativeId)
                .set(fileName).equalToWhenPresent(record::getFileName)
                .set(filePath).equalToWhenPresent(record::getFilePath)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
                .set(fileType).equalToWhenPresent(record::getFileType)
                .set(fileSize).equalToWhenPresent(record::getFileSize);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8201104+08:00", comments="Source Table: t_upload_file")
    default int updateByPrimaryKey(TUploadFile record) {
        return update(c ->
            c.set(fileRelativeType).equalTo(record::getFileRelativeType)
            .set(fileRelativeId).equalTo(record::getFileRelativeId)
            .set(fileName).equalTo(record::getFileName)
            .set(filePath).equalTo(record::getFilePath)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .set(fileType).equalTo(record::getFileType)
            .set(fileSize).equalTo(record::getFileSize)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8201104+08:00", comments="Source Table: t_upload_file")
    default int updateByPrimaryKeySelective(TUploadFile record) {
        return update(c ->
            c.set(fileRelativeType).equalToWhenPresent(record::getFileRelativeType)
            .set(fileRelativeId).equalToWhenPresent(record::getFileRelativeId)
            .set(fileName).equalToWhenPresent(record::getFileName)
            .set(filePath).equalToWhenPresent(record::getFilePath)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .set(fileType).equalToWhenPresent(record::getFileType)
            .set(fileSize).equalToWhenPresent(record::getFileSize)
            .where(id, isEqualTo(record::getId))
        );
    }
}