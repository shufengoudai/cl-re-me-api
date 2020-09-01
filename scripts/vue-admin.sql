/*
Navicat MySQL Data Transfer

Source Server         : php
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : vue-admin

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2018-11-20 18:59:57
*/

/* SET FOREIGN_KEY_CHECKS=0; */

-- ----------------------------
-- Table structure for ad
-- ----------------------------
DROP TABLE IF EXISTS ad;
CREATE SEQUENCE ad_seq;

CREATE TABLE ad (
  ad_id int NOT NULL DEFAULT NEXTVAL ('ad_seq') ,
  title varchar(255) NOT NULL ,
  describe varchar(255) NOT NULL DEFAULT '' ,
  pic varchar(255) NOT NULL DEFAULT '' ,
  jump_type smallint check (jump_type > 0) NOT NULL DEFAULT '0' ,
  jump_url varchar(255) NOT NULL DEFAULT '' ,
  ios_url varchar(255) NOT NULL DEFAULT '' ,
  android_url varchar(255) NOT NULL DEFAULT '' ,
  wxa_appid varchar(50) NOT NULL DEFAULT '' ,
  channel_type smallint NOT NULL DEFAULT '0' ,
  channel_list varchar(255) NOT NULL DEFAULT '' ,
  android_version_type smallint check (android_version_type > 0) NOT NULL DEFAULT '0' ,
  android_version_list varchar(255) NOT NULL DEFAULT '' ,
  ios_version_type smallint check (ios_version_type > 0) NOT NULL DEFAULT '0' ,
  ios_version_list varchar(255) NOT NULL DEFAULT '' ,
  new_show_start_num int NOT NULL DEFAULT '0' ,
  new_show_max_num int NOT NULL DEFAULT '0' ,
  old_show_start_num int NOT NULL DEFAULT '0' ,
  old_show_max_num int NOT NULL DEFAULT '0' ,
  start_time timestamp(0) DEFAULT NULL ,
  end_time timestamp(0) DEFAULT NULL ,
  event_name varchar(255) NOT NULL DEFAULT '' ,
  status smallint NOT NULL DEFAULT '0' ,
  create_time timestamp(0) NOT NULL ,
  modified_time timestamp(0) NOT NULL ,
  PRIMARY KEY (ad_id)
)  ;

-- ----------------------------
-- Table structure for ad_site
-- ----------------------------
DROP TABLE IF EXISTS ad_site;
CREATE SEQUENCE ad_site_seq;

CREATE TABLE ad_site (
  site_id int NOT NULL DEFAULT NEXTVAL ('ad_site_seq') ,
  site_name varchar(255) NOT NULL ,
  describe varchar(255) NOT NULL DEFAULT '' ,
  ad_ids varchar(255) NOT NULL DEFAULT '' ,
  create_time timestamp(0) NOT NULL ,
  modified_time timestamp(0) NOT NULL ,
  PRIMARY KEY (site_id)
)  ;

-- ----------------------------
-- Table structure for auth_admin
-- ----------------------------
DROP TABLE IF EXISTS auth_admin;
CREATE SEQUENCE auth_admin_seq;

CREATE TABLE auth_admin (
  id bigint check (id > 0) NOT NULL DEFAULT NEXTVAL ('auth_admin_seq'),
  username varchar(60) NOT NULL DEFAULT '' ,
  password varchar(64) NOT NULL DEFAULT '' ,
  tel varchar(50) NOT NULL DEFAULT '' ,
  email varchar(100) NOT NULL DEFAULT '' ,
  avatar varchar(255) NOT NULL DEFAULT '' ,
  sex smallint NOT NULL DEFAULT '0' ,
  last_login_ip varchar(16) NOT NULL DEFAULT '' ,
  last_login_time timestamp(0) NOT NULL ,
  create_time timestamp(0) NOT NULL ,
  status int NOT NULL DEFAULT '1' ,
  PRIMARY KEY (id)
)   ;

ALTER SEQUENCE auth_admin_seq RESTART WITH 2;

CREATE INDEX user_login_key ON auth_admin (username);

-- ----------------------------
-- Records of auth_admin
-- ----------------------------
INSERT INTO auth_admin VALUES ('1', 'admin', 'c3284d0f94606de1fd2af172aba15bf3', 'admin', 'lmxdawn@gmail.com', 'sssss', '0', '127.0.0.1', '2018-07-06 17:19:00', '2018-07-06 17:19:00', '1');

-- ----------------------------
-- Table structure for auth_permission
-- ----------------------------
DROP TABLE IF EXISTS auth_permission;
CREATE TABLE auth_permission (
  role_id int check (role_id > 0) NOT NULL ,
  permission_rule_id int NOT NULL DEFAULT '0' ,
  type varchar(30) DEFAULT NULL 
)  ;

-- ----------------------------
-- Records of auth_permission
-- ----------------------------
INSERT INTO auth_permission VALUES ('1', '4', 'admin');
INSERT INTO auth_permission VALUES ('1', '3', 'admin');
INSERT INTO auth_permission VALUES ('1', '2', 'admin');
INSERT INTO auth_permission VALUES ('1', '1', 'admin');

-- ----------------------------
-- Table structure for auth_permission_rule
-- ----------------------------
DROP TABLE IF EXISTS auth_permission_rule;
CREATE SEQUENCE auth_permission_rule_seq;

CREATE TABLE auth_permission_rule (
  id int check (id > 0) NOT NULL DEFAULT NEXTVAL ('auth_permission_rule_seq') ,
  pid int NOT NULL DEFAULT '0' ,
  name char(80) NOT NULL DEFAULT '' ,
  title char(20) NOT NULL DEFAULT '' ,
  status smallint NOT NULL DEFAULT '1' ,
  condition char(100) NOT NULL DEFAULT '' ,
  listorder int NOT NULL DEFAULT '0' ,
  create_time timestamp(0) NOT NULL ,
  update_time timestamp(0) NOT NULL ,
  PRIMARY KEY (id),
  CONSTRAINT name UNIQUE  (name)
)   ;

ALTER SEQUENCE auth_permission_rule_seq RESTART WITH 26;

-- ----------------------------
-- Records of auth_permission_rule
-- ----------------------------
INSERT INTO auth_permission_rule VALUES ('1', '0', 'user_manage', '用户管理', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('2', '1', 'user_manage/admin_manage', '管理组', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('3', '2', 'admin/auth_admin/index', '管理员管理', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('4', '3', 'admin/auth_admin/save', '添加管理员', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('5', '3', 'admin/auth_admin/edit', '编辑管理员', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('6', '3', 'admin/auth_admin/delete', '删除管理员', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('7', '2', 'admin/auth_role/index', '角色管理', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('8', '7', 'admin/auth_role/save', '添加角色', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('9', '7', 'admin/auth_role/edit', '编辑角色', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('10', '7', 'admin/auth_role/delete', '删除角色', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('11', '7', 'admin/auth_role/auth', '角色授权', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('12', '2', 'admin/auth_permission_rule/index', '权限管理', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('13', '12', 'admin/auth_permission_rule/save', '添加权限', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('14', '12', 'admin/auth_permission_rule/edit', '编辑权限', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('15', '12', 'admin/auth_permission_rule/delete', '删除权限', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('16', '0', 'ad_manage', '广告相关', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('17', '16', 'admin/ad_site/index', '广告位管理', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('18', '17', 'admin/ad_site/save', '广告位添加', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('19', '17', 'admin/ad_site/edit', '广告位编辑', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('20', '17', 'admin/ad_site/delete', '广告位删除', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('21', '16', 'admin/ad/index', '广告管理', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('22', '21', 'admin/ad/save', '广告添加', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('23', '21', 'admin/ad/edit', '广告编辑', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('24', '21', 'admin/ad/delete', '广告删除', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');
INSERT INTO auth_permission_rule VALUES ('25', '17', 'admin/ad_site/adlist', '广告位选择时的广告列表', '1', '', '999', '2018-07-06 17:19:00', '2018-07-06 17:19:00');

-- ----------------------------
-- Table structure for auth_role
-- ----------------------------
DROP TABLE IF EXISTS auth_role;
CREATE SEQUENCE auth_role_seq;

CREATE TABLE auth_role (
  id int check (id > 0) NOT NULL DEFAULT NEXTVAL ('auth_role_seq'),
  name varchar(20) NOT NULL ,
  pid int check (pid > 0) NOT NULL DEFAULT '0' ,
  status smallint check (status > 0) NOT NULL DEFAULT '0' ,
  remark varchar(255) NOT NULL DEFAULT '' ,
  create_time timestamp(0) NOT NULL ,
  update_time timestamp(0) NOT NULL ,
  listorder int NOT NULL DEFAULT '0' ,
  PRIMARY KEY (id)
)   ;

ALTER SEQUENCE auth_role_seq RESTART WITH 2;

-- ----------------------------
-- Records of auth_role
-- ----------------------------
INSERT INTO auth_role VALUES ('1', '超级管理员', '1', '1', '拥有网站最高管理员权限！', '2018-07-06 17:19:00', '2018-07-06 17:19:00', '0');

-- ----------------------------
-- Table structure for auth_role_admin
-- ----------------------------
DROP TABLE IF EXISTS auth_role_admin;
CREATE TABLE auth_role_admin (
  role_id int check (role_id > 0) DEFAULT '0' ,
  admin_id int DEFAULT '0' 
)  ;

-- ----------------------------
-- Records of auth_role_admin
-- ----------------------------

-- ----------------------------
-- Table structure for file_resource
-- ----------------------------
DROP TABLE IF EXISTS file_resource;
CREATE SEQUENCE file_resource_seq;

CREATE TABLE file_resource (
  id int NOT NULL DEFAULT NEXTVAL ('file_resource_seq') ,
  tag_id int NOT NULL DEFAULT '0' ,
  type smallint NOT NULL DEFAULT '0' ,
  filename varchar(255) NOT NULL DEFAULT '' ,
  path varchar(255) NOT NULL DEFAULT '' ,
  size int NOT NULL DEFAULT '0' ,
  ext varchar(10) NOT NULL DEFAULT '' ,
  create_time timestamp(0) NOT NULL ,
  PRIMARY KEY (id)
)   ;

ALTER SEQUENCE file_resource_seq RESTART WITH 12;

-- ----------------------------
-- Records of file_resource
-- ----------------------------
INSERT INTO file_resource VALUES ('1', '1', '0', 'Group 5.png', 'resources/image/20180530/854ae62758c585be5128cf344a511242.png', '7539', 'png', '2018-05-30 20:41:54');
INSERT INTO file_resource VALUES ('2', '0', '0', '643353_sdfaf123.png', 'resources/image/20180823/c356ca140f631a512f1c3a5e37a15dc1.png', '11507', 'png', '2018-08-23 13:38:42');
INSERT INTO file_resource VALUES ('3', '0', '0', '643353_sdfaf123.png', 'resources/image/20180823/4549c39e9c07c35681ee9fa94e0fc07e.png', '11507', 'png', '2018-08-23 14:05:18');
INSERT INTO file_resource VALUES ('4', '0', '0', '', '', '0', '', '2018-08-23 15:45:21');
INSERT INTO file_resource VALUES ('5', '0', '0', '', '', '2000000', '', '2018-08-23 15:45:21');
INSERT INTO file_resource VALUES ('6', '0', '0', '', '', '0', '', '2018-08-23 15:45:21');
INSERT INTO file_resource VALUES ('7', '0', '0', '', '', '0', '', '2018-08-23 15:45:21');
INSERT INTO file_resource VALUES ('8', '0', '0', '643353_sdfaf123.png', 'resources/image/20180823/0c424412b231eb8cb969377e15dbb812.png', '11507', 'png', '2018-08-23 15:53:32');
INSERT INTO file_resource VALUES ('9', '0', '0', '232826334630444283.png', 'FjBRVPOPF9gLeNBCAvK7jbif4yg8', '9668', 'png', '2018-08-23 16:08:13');
INSERT INTO file_resource VALUES ('10', '0', '0', '232826334630444283.png', 'FjBRVPOPF9gLeNBCAvK7jbif4yg8', '9668', 'png', '2018-08-23 16:09:07');
INSERT INTO file_resource VALUES ('11', '0', '0', '643353_sdfaf123.png', 'resources/image/20180823/52af5f8556a3af84cee696972b61baf4.png', '11507', 'png', '2018-08-23 17:06:05');

-- ----------------------------
-- Table structure for file_resource_tag
-- ----------------------------
DROP TABLE IF EXISTS file_resource_tag;
CREATE SEQUENCE file_resource_tag_seq;

CREATE TABLE file_resource_tag (
  id int NOT NULL DEFAULT NEXTVAL ('file_resource_tag_seq') ,
  tag varchar(255) NOT NULL DEFAULT '' ,
  create_time timestamp(0) NOT NULL ,
  PRIMARY KEY (id)
)   ;

ALTER SEQUENCE file_resource_tag_seq RESTART WITH 2;

-- ----------------------------
-- Records of file_resource_tag
-- ----------------------------
INSERT INTO file_resource_tag VALUES ('1', '测试', '2018-05-30 20:41:48');
