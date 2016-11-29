package cn.joinhealth.webservice.publish;


import cn.joinhealth.webservice.service.impl.WebServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.ws.Endpoint;

/**
 * Created by linjian
 * 16/11/21
 * 用于发布WebService的监听器
 */
//@WebListener
public class WebServicePublishListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //定义WebService的发布地址，这个地址就是提供给外界访问Webervice的URL地址，URL地址格式为：http://ip:端口号/xxxx
        String address = "http://127.0.0.1:8989/WebService";
        // 使用Endpoint类提供的publish方法发布WebService，发布时要保证使用的端口号没有被其他应用程序占用
        Endpoint.publish(address, new WebServiceImpl());
        System.out.println("使用WebServicePublishListener发布webservice成功!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}
