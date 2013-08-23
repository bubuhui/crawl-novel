package com.zs.crawl.common.bean;

/**
 * 小说来源网站
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-8-18
 * Time: 下午9:24
 * To change this template use File | Settings | File Templates.
 */
public class SourceSite {
    private long id;
    private String name;
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
