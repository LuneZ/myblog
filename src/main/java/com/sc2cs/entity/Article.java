package com.sc2cs.entity;

import java.util.Date;

public class Article {

    private Integer id;
    private String title;
    private Integer typeId;
    private String content;
    private Integer author;
    private Integer clickNum;
    private String imgPath;
    private Date createTime;
    private Date lastModifyTime;

    public Article(){

    }
    public Article(String title, Integer typeId, String content,
                   Integer author, Integer clickNum, String imgPath,
                   Date createTime, Date lastModifyTime) {
        this.title = title;
        this.typeId = typeId;
        this.content = content;
        this.author = author;
        this.clickNum = clickNum;
        this.imgPath = imgPath;
        this.createTime = createTime;
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", typeId=" + typeId +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", clickNum=" + clickNum +
                ", imgPath='" + imgPath + '\'' +
                ", createTime=" + createTime +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }
}
