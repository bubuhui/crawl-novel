package com.zs.crawl.service.test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.zs.novel.common.service.CrawlTestService;

import java.net.MalformedURLException;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-8-23
 * Time: 下午9:05
 * To change this template use File | Settings | File Templates.
 */
public class HessianTest {
    public static void main(String[] args){
        String url = "http://localhost:8080/crawl-novel-server/remoting/crawlTestService";
        HessianProxyFactory factory = new HessianProxyFactory();
        try {
            CrawlTestService service = (CrawlTestService) factory.create(CrawlTestService.class,url);
            System.out.println(service.findNovelNameById());
        } catch (MalformedURLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
