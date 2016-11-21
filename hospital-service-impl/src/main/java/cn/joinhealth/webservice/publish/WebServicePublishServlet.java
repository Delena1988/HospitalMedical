package cn.joinhealth.webservice.publish;

import cn.joinhealth.webservice.service.impl.WebServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;

/**
 * Created by linjian
 * 16/11/21
 * 用于发布WebService的Servlet
 */
//@WebServlet(value = "", loadOnStartup = 0)
public class WebServicePublishServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        //WebService的发布地址
        String address = "http://127.0.0.1:8989/WebService";
        //发布WebService，WebServiceImpl类是WebServie接口的具体实现类
        Endpoint.publish(address, new WebServiceImpl());
        System.out.println("使用WebServicePublishServlet发布webservice成功!");
    }
}
