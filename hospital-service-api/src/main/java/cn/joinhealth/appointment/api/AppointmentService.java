package cn.joinhealth.appointment.api;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;

/**
 * Created by linjian
 * 16/11/15
 * 预约相关接口
 */
public interface AppointmentService {
    /**
    * @Description:排班信息
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getScheduling(RequestMsg requestMsg);

    /**
    * @Description:号源信息
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getNoSource(RequestMsg requestMsg);

    /**
    * @Description:剩余号源
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getRemainingNoSource(RequestMsg requestMsg);

    /**
    * @Description:预约挂号
    * @param: RequestMsg
    * @return:
    */
    ReplyMsg register(RequestMsg requestMsg);

    /**
    * @Description:取消预约
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg cancelRegister(RequestMsg requestMsg);

    /**
    * @Description:预约历史记录
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getRegisterHistory(RequestMsg requestMsg);

    /**
    * @Description:体检套餐字典
    * @param: RequestMsg
    * @return:
    */
    ReplyMsg getPhysicalExamPackage(RequestMsg requestMsg);

    /**
    * @Description:体检套餐详情
    * @param: RequestMsg
    * @return: ReplyMsg
    */
    ReplyMsg getPhysicalExamPackageDetail(RequestMsg requestMsg);
}
