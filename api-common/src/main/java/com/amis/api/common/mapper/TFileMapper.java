package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TFileDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TFile;
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
public interface TFileMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7476458+08:00", comments="Source Table: t_file")
    BasicColumn[] selectList = BasicColumn.columnList(id, fileStory, fileTask, fileComment, fileName, filePath, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv, fileType, fileSize, fileBug);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7336476+08:00", comments="Source Table: t_file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7346519+08:00", comments="Source Table: t_file")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7356499+08:00", comments="Source Table: t_file")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<TFile> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7366474+08:00", comments="Source Table: t_file")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TFile> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7376512+08:00", comments="Source Table: t_file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TFileResult")
    Optional<TFile> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7376512+08:00", comments="Source Table: t_file")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TFileResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="file_story", property="fileStory", jdbcType=JdbcType.OTHER),
        @Result(column="file_task", property="fileTask", jdbcType=JdbcType.OTHER),
        @Result(column="file_comment", property="fileComment", jdbcType=JdbcType.OTHER),
        @Result(column="file_name", property="fileName", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="ins_account_id", property="insAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="ins_dt_time", property="insDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="upd_account_id", property="updAccountId", jdbcType=JdbcType.OTHER),
        @Result(column="upd_dt_time", property="updDtTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="logical_del_div", property="logicalDelDiv", jdbcType=JdbcType.INTEGER),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.INTEGER),
        @Result(column="file_size", property="fileSize", jdbcType=JdbcType.VARCHAR),
        @Result(column="file_bug", property="fileBug", jdbcType=JdbcType.OTHER)
    })
    List<TFile> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7396543+08:00", comments="Source Table: t_file")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7406463+08:00", comments="Source Table: t_file")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7416487+08:00", comments="Source Table: t_file")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7426462+08:00", comments="Source Table: t_file")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7426462+08:00", comments="Source Table: t_file")
    default int insert(TFile record) {
        return MyBatis3Utils.insert(this::insert, record, TFile, c ->
            c.map(id).toProperty("id")
            .map(fileStory).toProperty("fileStory")
            .map(fileTask).toProperty("fileTask")
            .map(fileComment).toProperty("fileComment")
            .map(fileName).toProperty("fileName")
            .map(filePath).toProperty("filePath")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(fileType).toProperty("fileType")
            .map(fileSize).toProperty("fileSize")
            .map(fileBug).toProperty("fileBug")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7446465+08:00", comments="Source Table: t_file")
    default int insertMultiple(Collection<TFile> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TFile, c ->
            c.map(id).toProperty("id")
            .map(fileStory).toProperty("fileStory")
            .map(fileTask).toProperty("fileTask")
            .map(fileComment).toProperty("fileComment")
            .map(fileName).toProperty("fileName")
            .map(filePath).toProperty("filePath")
            .map(insAccountId).toProperty("insAccountId")
            .map(insDtTime).toProperty("insDtTime")
            .map(updAccountId).toProperty("updAccountId")
            .map(updDtTime).toProperty("updDtTime")
            .map(logicalDelDiv).toProperty("logicalDelDiv")
            .map(fileType).toProperty("fileType")
            .map(fileSize).toProperty("fileSize")
            .map(fileBug).toProperty("fileBug")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7456471+08:00", comments="Source Table: t_file")
    default int insertSelective(TFile record) {
        return MyBatis3Utils.insert(this::insert, record, TFile, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(fileStory).toPropertyWhenPresent("fileStory", record::getFileStory)
            .map(fileTask).toPropertyWhenPresent("fileTask", record::getFileTask)
            .map(fileComment).toPropertyWhenPresent("fileComment", record::getFileComment)
            .map(fileName).toPropertyWhenPresent("fileName", record::getFileName)
            .map(filePath).toPropertyWhenPresent("filePath", record::getFilePath)
            .map(insAccountId).toPropertyWhenPresent("insAccountId", record::getInsAccountId)
            .map(insDtTime).toPropertyWhenPresent("insDtTime", record::getInsDtTime)
            .map(updAccountId).toPropertyWhenPresent("updAccountId", record::getUpdAccountId)
            .map(updDtTime).toPropertyWhenPresent("updDtTime", record::getUpdDtTime)
            .map(logicalDelDiv).toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv)
            .map(fileType).toPropertyWhenPresent("fileType", record::getFileType)
            .map(fileSize).toPropertyWhenPresent("fileSize", record::getFileSize)
            .map(fileBug).toPropertyWhenPresent("fileBug", record::getFileBug)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7486452+08:00", comments="Source Table: t_file")
    default Optional<TFile> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7496448+08:00", comments="Source Table: t_file")
    default List<TFile> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7496448+08:00", comments="Source Table: t_file")
    default List<TFile> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7496448+08:00", comments="Source Table: t_file")
    default Optional<TFile> selectByPrimaryKey(Object id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7506473+08:00", comments="Source Table: t_file")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TFile, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7506473+08:00", comments="Source Table: t_file")
    static UpdateDSL<UpdateModel> updateAllColumns(TFile record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(fileStory).equalTo(record::getFileStory)
                .set(fileTask).equalTo(record::getFileTask)
                .set(fileComment).equalTo(record::getFileComment)
                .set(fileName).equalTo(record::getFileName)
                .set(filePath).equalTo(record::getFilePath)
                .set(insAccountId).equalTo(record::getInsAccountId)
                .set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId)
                .set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
                .set(fileType).equalTo(record::getFileType)
                .set(fileSize).equalTo(record::getFileSize)
                .set(fileBug).equalTo(record::getFileBug);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7516468+08:00", comments="Source Table: t_file")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TFile record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(fileStory).equalToWhenPresent(record::getFileStory)
                .set(fileTask).equalToWhenPresent(record::getFileTask)
                .set(fileComment).equalToWhenPresent(record::getFileComment)
                .set(fileName).equalToWhenPresent(record::getFileName)
                .set(filePath).equalToWhenPresent(record::getFilePath)
                .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
                .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
                .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
                .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
                .set(fileType).equalToWhenPresent(record::getFileType)
                .set(fileSize).equalToWhenPresent(record::getFileSize)
                .set(fileBug).equalToWhenPresent(record::getFileBug);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7526464+08:00", comments="Source Table: t_file")
    default int updateByPrimaryKey(TFile record) {
        return update(c ->
            c.set(fileStory).equalTo(record::getFileStory)
            .set(fileTask).equalTo(record::getFileTask)
            .set(fileComment).equalTo(record::getFileComment)
            .set(fileName).equalTo(record::getFileName)
            .set(filePath).equalTo(record::getFilePath)
            .set(insAccountId).equalTo(record::getInsAccountId)
            .set(insDtTime).equalTo(record::getInsDtTime)
            .set(updAccountId).equalTo(record::getUpdAccountId)
            .set(updDtTime).equalTo(record::getUpdDtTime)
            .set(logicalDelDiv).equalTo(record::getLogicalDelDiv)
            .set(fileType).equalTo(record::getFileType)
            .set(fileSize).equalTo(record::getFileSize)
            .set(fileBug).equalTo(record::getFileBug)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-06T09:14:33.7536454+08:00", comments="Source Table: t_file")
    default int updateByPrimaryKeySelective(TFile record) {
        return update(c ->
            c.set(fileStory).equalToWhenPresent(record::getFileStory)
            .set(fileTask).equalToWhenPresent(record::getFileTask)
            .set(fileComment).equalToWhenPresent(record::getFileComment)
            .set(fileName).equalToWhenPresent(record::getFileName)
            .set(filePath).equalToWhenPresent(record::getFilePath)
            .set(insAccountId).equalToWhenPresent(record::getInsAccountId)
            .set(insDtTime).equalToWhenPresent(record::getInsDtTime)
            .set(updAccountId).equalToWhenPresent(record::getUpdAccountId)
            .set(updDtTime).equalToWhenPresent(record::getUpdDtTime)
            .set(logicalDelDiv).equalToWhenPresent(record::getLogicalDelDiv)
            .set(fileType).equalToWhenPresent(record::getFileType)
            .set(fileSize).equalToWhenPresent(record::getFileSize)
            .set(fileBug).equalToWhenPresent(record::getFileBug)
            .where(id, isEqualTo(record::getId))
        );
    }
}