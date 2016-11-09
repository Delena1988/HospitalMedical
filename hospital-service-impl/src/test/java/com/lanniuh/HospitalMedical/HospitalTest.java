package com.lanniuh.HospitalMedical;

import cn.joinhealth.bean.reply.ReplyMsg;
import com.alibaba.fastjson.JSON;
import com.lanniuh.hospmedical.model.outhospfee.OuthospFee;
import com.lanniuh.hospmedical.model.outhospfee.OuthospFeeReq;
import com.lanniuh.hospmedical.outhospfee.service.OuthospFeeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linjian
 * 16/11/9.
 */
public class HospitalTest {
    ApplicationContext context;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("test/spring/spring-context.xml");
    }
    @Test
    public void outhospFee(){
        OuthospFeeService outhospFeeService = context.getBean("outhospFeeService", OuthospFeeService.class);
        OuthospFeeReq outhospFeeReq = new OuthospFeeReq();
        outhospFeeReq.setOuthospSerialNo("111");
        ReplyMsg replyMsg = new ReplyMsg();
        replyMsg.setBody(outhospFeeService.selectByParams(outhospFeeReq));
        OuthospFee outhospFee = JSON.parseObject(replyMsg.getBody(),OuthospFee.class);
        System.out.println(JSON.toJSONString(outhospFee));
//        System.out.println(JSON.toJSONString(outhospFeeService.selectByParams(outhospFeeReq)));
    }
}
