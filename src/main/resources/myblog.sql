/*
SQL server : MYSQL5.7
Author     : ZL
create time: 2018.5.5

*/

CREATE DATABASE IF NOT EXISTS myblog ;
USE myblog;

-- -----------------------------
-- 文章表 article
-- -----------------------------
DROP TABLE IF EXISTS 'article';
CREATE TABLE 'article'(
  article_id int(10) PRIMARY KEY AUTO_INCREMENT COMMENT'文章自增ID号',
  article_title VARCHAR(128) NOT NULL comment'文章标题',
  article_create_time DATETIME NOT NULL comment'创建时间',#date不显示时分秒。也有用int或bigint的，对应java用long
  article_lastmodify_time DATETIME NOT NULL comment'最近修改时间',
  article_content LONGTEXT COMMENT '文章内容',
  article_author_id INT(10) NOT NULL COMMENT '文章作者id',
  article_click int(10) NOT NULL COMMENT '点击次数',
  article_sort_id int(10) NOT NULL COMMENT '文章分类id'
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

-- -------------------------
-- 文章分类表 article_sort
-- -------------------------
DROP TABLE IF EXISTS 'article_sort';
CREATE TABLE 'article_type'(
  sort_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '文章类别',
  sort_name VARCHAR(30) NOT NULL UNIQUE COMMENT '类别名称'#不能重复
)ENGINE = InnoDB DEFAULT CHARSET =utf8;

-- --------------------------
-- 用户表 user
-- -------------------------
DROP TABLE IF EXISTS 'user';
CREATE TABLE 'user'(
  user_id int(10) PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(10) NOT NULL UNIQUE COMMENT '用户名',# MYSQL5以上，varchar(M)按字符存M个，汉字也可以存M个
  user_pwd VARCHAR(20) NOT NULL,
  user_email VARCHAR(30) UNIQUE DEFAULT NULL
)ENGINE = InnoDB DEFAULT CHARSET =utf8;

-- -------------------------
-- 留言板 message
-- -------------------------
DROP TABLE IF EXISTS 'message';
CREATE TABLE message(
  message_id INT(10) PRIMARY KEY AUTO_INCREMENT,
  message_content VARCHAR(255) NOT NULL,
  sendtime DATETIME,
  user_id INT ,
  CONSTRAINT user_id FOREIGN KEY(user_id) REFERENCES user(user_id)
)ENGINE = InnoDB DEFAULT charset=utf8;