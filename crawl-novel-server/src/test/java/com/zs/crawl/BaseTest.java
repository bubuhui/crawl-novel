package com.zs.crawl;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/serverConfig/spring-server.xml"})
//@Transactional
public abstract class BaseTest extends AbstractJUnit4SpringContextTests{
    
}
