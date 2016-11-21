package cn.joinhealth.webservice.service.impl;

import cn.joinhealth.webservice.service.WebServiceI;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * Createdby linjian
 * 16/11/21
 * webService示例
 */
@WebService(serviceName = "MyService", targetNamespace = "http://www.joinhealth.cn")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class WebServiceImpl implements WebServiceI {
    @Override
    @WebResult(name = "output")
    public String sayHello(@WebParam(name = "input")String name) {
        return "Hello " + name;
    }
}
