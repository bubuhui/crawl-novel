package com.zs.crawl.common.bean;

/**
 * 小说搜索结果
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-8-18
 * Time: 下午9:34
 * To change this template use File | Settings | File Templates.
 */
public class SearchResult {
    private long id;
    private long novelId;
    private long searchSiteId;
    private String chapterName;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNovelId() {
        return novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public long getSearchSiteId() {
        return searchSiteId;
    }

    public void setSearchSiteId(long searchSiteId) {
        this.searchSiteId = searchSiteId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }
}
