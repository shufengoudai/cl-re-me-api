package com.amis.api.common.mapper;

import static com.amis.api.common.mapper.TCommentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.amis.api.common.model.TComment;
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
public interface TCommentMapper {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    BasicColumn[] selectList = BasicColumn.columnList(id, commentType, commentRelativeId, commentInfo, commentAccount,
            commentDate, insAccountId, insDtTime, updAccountId, updDtTime, logicalDelDiv);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source Table: t_comment")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source Table: t_comment")
    @DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source Table: t_comment")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<TComment> insertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source Table: t_comment")
    @InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<TComment> multipleInsertStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.702427+08:00", comments = "Source Table: t_comment")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @ResultMap("TCommentResult")
    Optional<TComment> selectOne(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "TCommentResult", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.OTHER, id = true),
            @Result(column = "comment_type", property = "commentType", jdbcType = JdbcType.INTEGER),
            @Result(column = "comment_relative_id", property = "commentRelativeId", jdbcType = JdbcType.OTHER),
            @Result(column = "comment_info", property = "commentInfo", jdbcType = JdbcType.VARCHAR),
            @Result(column = "comment_account", property = "commentAccount", jdbcType = JdbcType.OTHER),
            @Result(column = "comment_date", property = "commentDate", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "ins_account_id", property = "insAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "ins_dt_time", property = "insDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "upd_account_id", property = "updAccountId", jdbcType = JdbcType.OTHER),
            @Result(column = "upd_dt_time", property = "updDtTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "logical_del_div", property = "logicalDelDiv", jdbcType = JdbcType.INTEGER) })
    List<TComment> selectMany(SelectStatementProvider selectStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    @UpdateProvider(type = SqlProviderAdapter.class, method = "update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, TComment, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, TComment, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default int deleteByPrimaryKey(Object id_) {
        return delete(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default int insert(TComment record) {
        return MyBatis3Utils.insert(this::insert, record, TComment,
                c -> c.map(id).toProperty("id").map(commentType).toProperty("commentType").map(commentRelativeId)
                        .toProperty("commentRelativeId").map(commentInfo).toProperty("commentInfo").map(commentAccount)
                        .toProperty("commentAccount").map(commentDate).toProperty("commentDate").map(insAccountId)
                        .toProperty("insAccountId").map(insDtTime).toProperty("insDtTime").map(updAccountId)
                        .toProperty("updAccountId").map(updDtTime).toProperty("updDtTime").map(logicalDelDiv)
                        .toProperty("logicalDelDiv"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default int insertMultiple(Collection<TComment> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, TComment,
                c -> c.map(id).toProperty("id").map(commentType).toProperty("commentType").map(commentRelativeId)
                        .toProperty("commentRelativeId").map(commentInfo).toProperty("commentInfo").map(commentAccount)
                        .toProperty("commentAccount").map(commentDate).toProperty("commentDate").map(insAccountId)
                        .toProperty("insAccountId").map(insDtTime).toProperty("insDtTime").map(updAccountId)
                        .toProperty("updAccountId").map(updDtTime).toProperty("updDtTime").map(logicalDelDiv)
                        .toProperty("logicalDelDiv"));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default int insertSelective(TComment record) {
        return MyBatis3Utils.insert(this::insert, record, TComment,
                c -> c.map(id).toPropertyWhenPresent("id", record::getId).map(commentType)
                        .toPropertyWhenPresent("commentType", record::getCommentType).map(commentRelativeId)
                        .toPropertyWhenPresent("commentRelativeId", record::getCommentRelativeId).map(commentInfo)
                        .toPropertyWhenPresent("commentInfo", record::getCommentInfo).map(commentAccount)
                        .toPropertyWhenPresent("commentAccount", record::getCommentAccount).map(commentDate)
                        .toPropertyWhenPresent("commentDate", record::getCommentDate).map(insAccountId)
                        .toPropertyWhenPresent("insAccountId", record::getInsAccountId).map(insDtTime)
                        .toPropertyWhenPresent("insDtTime", record::getInsDtTime).map(updAccountId)
                        .toPropertyWhenPresent("updAccountId", record::getUpdAccountId).map(updDtTime)
                        .toPropertyWhenPresent("updDtTime", record::getUpdDtTime).map(logicalDelDiv)
                        .toPropertyWhenPresent("logicalDelDiv", record::getLogicalDelDiv));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default Optional<TComment> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, TComment, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default List<TComment> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, TComment, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default List<TComment> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, TComment, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default Optional<TComment> selectByPrimaryKey(Object id_) {
        return selectOne(c -> c.where(id, isEqualTo(id_)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, TComment, completer);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    static UpdateDSL<UpdateModel> updateAllColumns(TComment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId).set(commentType).equalTo(record::getCommentType)
                .set(commentRelativeId).equalTo(record::getCommentRelativeId).set(commentInfo)
                .equalTo(record::getCommentInfo).set(commentAccount).equalTo(record::getCommentAccount).set(commentDate)
                .equalTo(record::getCommentDate).set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime)
                .equalTo(record::getInsDtTime).set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime)
                .equalTo(record::getUpdDtTime).set(logicalDelDiv).equalTo(record::getLogicalDelDiv);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(TComment record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId).set(commentType).equalToWhenPresent(record::getCommentType)
                .set(commentRelativeId).equalToWhenPresent(record::getCommentRelativeId).set(commentInfo)
                .equalToWhenPresent(record::getCommentInfo).set(commentAccount)
                .equalToWhenPresent(record::getCommentAccount).set(commentDate)
                .equalToWhenPresent(record::getCommentDate).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv);
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default int updateByPrimaryKey(TComment record) {
        return update(c -> c.set(commentType).equalTo(record::getCommentType).set(commentRelativeId)
                .equalTo(record::getCommentRelativeId).set(commentInfo).equalTo(record::getCommentInfo)
                .set(commentAccount).equalTo(record::getCommentAccount).set(commentDate).equalTo(record::getCommentDate)
                .set(insAccountId).equalTo(record::getInsAccountId).set(insDtTime).equalTo(record::getInsDtTime)
                .set(updAccountId).equalTo(record::getUpdAccountId).set(updDtTime).equalTo(record::getUpdDtTime)
                .set(logicalDelDiv).equalTo(record::getLogicalDelDiv).where(id, isEqualTo(record::getId)));
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-29T10:57:28.7034264+08:00", comments = "Source Table: t_comment")
    default int updateByPrimaryKeySelective(TComment record) {
        return update(c -> c.set(commentType).equalToWhenPresent(record::getCommentType).set(commentRelativeId)
                .equalToWhenPresent(record::getCommentRelativeId).set(commentInfo)
                .equalToWhenPresent(record::getCommentInfo).set(commentAccount)
                .equalToWhenPresent(record::getCommentAccount).set(commentDate)
                .equalToWhenPresent(record::getCommentDate).set(insAccountId)
                .equalToWhenPresent(record::getInsAccountId).set(insDtTime).equalToWhenPresent(record::getInsDtTime)
                .set(updAccountId).equalToWhenPresent(record::getUpdAccountId).set(updDtTime)
                .equalToWhenPresent(record::getUpdDtTime).set(logicalDelDiv)
                .equalToWhenPresent(record::getLogicalDelDiv).where(id, isEqualTo(record::getId)));
    }
}
