package com.amis.api.common.model;

import java.util.Date;
import javax.annotation.Generated;

public class FileResource {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.id")
    private Integer id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.tag_id")
    private Integer tagId;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.type")
    private Short type;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.filename")
    private String filename;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.path")
    private String path;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.size")
    private Integer size;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.ext")
    private String ext;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.create_time")
    private Date createTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.id")
    public Integer getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.tag_id")
    public Integer getTagId() {
        return tagId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.tag_id")
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.type")
    public Short getType() {
        return type;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.type")
    public void setType(Short type) {
        this.type = type;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.filename")
    public String getFilename() {
        return filename;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.path")
    public String getPath() {
        return path;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.path")
    public void setPath(String path) {
        this.path = path;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.size")
    public Integer getSize() {
        return size;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.ext")
    public String getExt() {
        return ext;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.ext")
    public void setExt(String ext) {
        this.ext = ext;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3172995+08:00", comments = "Source field: file_resource.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
