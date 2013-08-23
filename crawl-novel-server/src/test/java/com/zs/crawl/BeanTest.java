package com.zs.crawl;


import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @project crawl-novel-server
 * @author zs
 * @date 2013年8月23日
 * Copyright (C) 2010-2013 www.2caipiao.com Inc. All rights reserved.
 */
public class BeanTest extends BaseTest{

    @Autowired
    private CrawlNovel crawlNovel;
    
    @Test
    public void testFindNovel(){
        String novelSite = crawlNovel.findNovel();
        System.out.print(novelSite);
        assertTrue("site is error",novelSite != null);
    }
}
