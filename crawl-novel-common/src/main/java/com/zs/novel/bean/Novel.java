package com.zs.novel.bean;

import java.util.Calendar;

/**
 * 小说
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-8-18
 * Time: 下午9:28
 * To change this template use File | Settings | File Templates.
 */
public class Novel {
    private long id;
    private String name;
    private String author;
    private String lastChapter;
    private Calendar updateTime;
    private long sourceSiteId;
    private byte isAutoUpdate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLastChapter() {
        return lastChapter;
    }

    public void setLastChapter(String lastChapter) {
        this.lastChapter = lastChapter;
    }

    public Calendar getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Calendar updateTime) {
        this.updateTime = updateTime;
    }

    public long getSourceSiteId() {
        return sourceSiteId;
    }

    public void setSourceSiteId(long sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    public byte getAutoUpdate() {
        return isAutoUpdate;
    }

    public void setAutoUpdate(byte autoUpdate) {
        isAutoUpdate = autoUpdate;
    }
}
