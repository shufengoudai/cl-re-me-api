package com.amis.api.common.model;

import java.util.Date;
import javax.annotation.Generated;

public class FileResourceTag {

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3202979+08:00", comments = "Source field: file_resource_tag.id")
    private Integer id;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3202979+08:00", comments = "Source field: file_resource_tag.tag")
    private String tag;
    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source field: file_resource_tag.create_time")
    private Date createTime;

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3202979+08:00", comments = "Source field: file_resource_tag.id")
    public Integer getId() {
        return id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3202979+08:00", comments = "Source field: file_resource_tag.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3202979+08:00", comments = "Source field: file_resource_tag.tag")
    public String getTag() {
        return tag;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3262943+08:00", comments = "Source field: file_resource_tag.tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source field: file_resource_tag.create_time")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-05-26T15:10:56.3272937+08:00", comments = "Source field: file_resource_tag.create_time")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
