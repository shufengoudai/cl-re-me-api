package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TUploadFileDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8001032+08:00", comments="Source Table: t_upload_file")
    public static final TUploadFile TUploadFile = new TUploadFile();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8001032+08:00", comments="Source field: t_upload_file.id")
    public static final SqlColumn<Object> id = TUploadFile.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8011063+08:00", comments="Source field: t_upload_file.file_relative_type")
    public static final SqlColumn<Integer> fileRelativeType = TUploadFile.fileRelativeType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8011063+08:00", comments="Source field: t_upload_file.file_relative_id")
    public static final SqlColumn<Object> fileRelativeId = TUploadFile.fileRelativeId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8011063+08:00", comments="Source field: t_upload_file.file_name")
    public static final SqlColumn<String> fileName = TUploadFile.fileName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8011063+08:00", comments="Source field: t_upload_file.file_path")
    public static final SqlColumn<String> filePath = TUploadFile.filePath;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8011063+08:00", comments="Source field: t_upload_file.ins_account_id")
    public static final SqlColumn<Object> insAccountId = TUploadFile.insAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8021043+08:00", comments="Source field: t_upload_file.ins_dt_time")
    public static final SqlColumn<Date> insDtTime = TUploadFile.insDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8021043+08:00", comments="Source field: t_upload_file.upd_account_id")
    public static final SqlColumn<Object> updAccountId = TUploadFile.updAccountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8021043+08:00", comments="Source field: t_upload_file.upd_dt_time")
    public static final SqlColumn<Date> updDtTime = TUploadFile.updDtTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8021043+08:00", comments="Source field: t_upload_file.logical_del_div")
    public static final SqlColumn<Integer> logicalDelDiv = TUploadFile.logicalDelDiv;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8021043+08:00", comments="Source field: t_upload_file.file_type")
    public static final SqlColumn<Integer> fileType = TUploadFile.fileType;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8021043+08:00", comments="Source field: t_upload_file.file_size")
    public static final SqlColumn<String> fileSize = TUploadFile.fileSize;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-08-18T16:01:58.8001032+08:00", comments="Source Table: t_upload_file")
    public static final class TUploadFile extends SqlTable {
        public final SqlColumn<Object> id = column("id", JDBCType.OTHER);

        public final SqlColumn<Integer> fileRelativeType = column("file_relative_type", JDBCType.INTEGER);

        public final SqlColumn<Object> fileRelativeId = column("file_relative_id", JDBCType.OTHER);

        public final SqlColumn<String> fileName = column("file_name", JDBCType.VARCHAR);

        public final SqlColumn<String> filePath = column("file_path", JDBCType.VARCHAR);

        public final SqlColumn<Object> insAccountId = column("ins_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> insDtTime = column("ins_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Object> updAccountId = column("upd_account_id", JDBCType.OTHER);

        public final SqlColumn<Date> updDtTime = column("upd_dt_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> logicalDelDiv = column("logical_del_div", JDBCType.INTEGER);

        public final SqlColumn<Integer> fileType = column("file_type", JDBCType.INTEGER);

        public final SqlColumn<String> fileSize = column("file_size", JDBCType.VARCHAR);

        public TUploadFile() {
            super("t_upload_file");
        }
    }
}