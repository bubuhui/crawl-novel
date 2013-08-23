package com.zs.crawl.scheduler;

import java.util.Calendar;

import org.springframework.stereotype.Component;

/**
 * 
 * @project crawl-novel-server
 * @author zs
 * @date 2013年8月23日
 * Copyright (C) 2010-2013 www.2caipiao.com Inc. All rights reserved.
 */
@Component
public class TestTask {

    public void run(){
        System.out.println(Calendar.getInstance());
    }
}
