package cn.joinhealth.webservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by linjian
 * 16/11/21
 * weService 接口
 */
@WebService
public interface WebServiceI {
    @WebMethod
    String sayHello(@WebParam(name = "input")String name);
}
