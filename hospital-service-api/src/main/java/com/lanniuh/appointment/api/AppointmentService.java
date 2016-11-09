package com.lanniuh.appointment.api;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface AppointmentService {
    //排班信息
    ReplyMsg getScheduling(RequestMsg requestMsg);

    //号源信息
    ReplyMsg getNoSource(RequestMsg requestMsg);

    //剩余号源
    ReplyMsg getRemainingNoSource(RequestMsg requestMsg);

    //预约挂号
    ReplyMsg register(RequestMsg requestMsg);

    //取消预约
    ReplyMsg cancelRegister(RequestMsg requestMsg);

    //预约历史记录
    ReplyMsg getRegisterHistory(RequestMsg requestMsg);

    //体检套餐字典
    ReplyMsg getPhysicalExamPackage(RequestMsg requestMsg);

    //体检套餐详情
    ReplyMsg getPhysicalExamPackageDetail(RequestMsg requestMsg);
}
