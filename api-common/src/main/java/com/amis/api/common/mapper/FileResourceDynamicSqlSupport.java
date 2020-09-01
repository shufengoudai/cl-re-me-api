package com.amis.api.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class FileResourceDynamicSqlSupport {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    public static final FileResource fileResource = new FileResource();
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source field: file_resource.id")
    public static final SqlColumn<Integer> id = fileResource.id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source field: file_resource.tag_id")
    public static final SqlColumn<Integer> tagId = fileResource.tagId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source field: file_resource.type")
    public static final SqlColumn<Short> type = fileResource.type;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source field: file_resource.filename")
    public static final SqlColumn<String> filename = fileResource.filename;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source field: file_resource.path")
    public static final SqlColumn<String> path = fileResource.path;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source field: file_resource.size")
    public static final SqlColumn<Integer> size = fileResource.size;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source field: file_resource.ext")
    public static final SqlColumn<String> ext = fileResource.ext;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source field: file_resource.create_time")
    public static final SqlColumn<Date> createTime = fileResource.createTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3182985+08:00", comments = "Source Table: file_resource")
    public static final class FileResource extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);
        public final SqlColumn<Integer> tagId = column("tag_id", JDBCType.INTEGER);
        public final SqlColumn<Short> type = column("type", JDBCType.SMALLINT);
        public final SqlColumn<String> filename = column("filename", JDBCType.VARCHAR);
        public final SqlColumn<String> path = column("path", JDBCType.VARCHAR);
        public final SqlColumn<Integer> size = column("size", JDBCType.INTEGER);
        public final SqlColumn<String> ext = column("ext", JDBCType.VARCHAR);
        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public FileResource() {
            super("file_resource");
        }
    }
}
