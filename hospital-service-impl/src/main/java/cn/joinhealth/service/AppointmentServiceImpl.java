package cn.joinhealth.service;

import cn.joinhealth.appointment.api.AppointmentService;
import cn.joinhealth.appointment.cancelregister.handle.CancelRegisterReqHandle;
import cn.joinhealth.appointment.cancelregister.service.CancelRegisterService;
import cn.joinhealth.appointment.model.cancelregister.CancelRegisterReq;
import cn.joinhealth.appointment.model.nosource.NoSource;
import cn.joinhealth.appointment.model.nosource.NoSourceReq;
import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage;
import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage2;
import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackageReq;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;
import cn.joinhealth.appointment.model.register.RegisterReq;
import cn.joinhealth.appointment.model.registerhistory.RegisterHistory;
import cn.joinhealth.appointment.model.registerhistory.RegisterHistoryReq;
import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSource;
import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSourceReq;
import cn.joinhealth.appointment.model.scheduling.Scheduling;
import cn.joinhealth.appointment.model.scheduling.SchedulingReq;
import cn.joinhealth.appointment.nosource.handle.NoSourceReqHandle;
import cn.joinhealth.appointment.nosource.service.NoSourceService;
import cn.joinhealth.appointment.physicalexampackage.handle.PhysicalExamPackageReqHandle;
import cn.joinhealth.appointment.physicalexampackage.service.PhysicalExamPackageService;
import cn.joinhealth.appointment.physicalexampackagedetail.handle.PhysicalExamPackageDetailReqHandle;
import cn.joinhealth.appointment.physicalexampackagedetail.service.PhysicalExamPackageDetailService;
import cn.joinhealth.appointment.register.handle.RegisterReqHandle;
import cn.joinhealth.appointment.register.service.RegisterService;
import cn.joinhealth.appointment.registerhistory.handle.RegisterHistoryReqHandle;
import cn.joinhealth.appointment.registerhistory.service.RegisterHistoryService;
import cn.joinhealth.appointment.remainingnosource.handle.RemainingNoSourceReqHandle;
import cn.joinhealth.appointment.remainingnosource.service.RemainingNoSourceService;
import cn.joinhealth.appointment.scheduling.handle.SchedulingReqHandle;
import cn.joinhealth.appointment.scheduling.service.SchedulingService;
import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;
import cn.joinhealth.constant.Constant;
import cn.joinhealth.util.DataSourceTypeUtil;
import cn.joinhealth.util.MultipleDataSource;
import cn.joinhealth.util.PropertiesUtil;
import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private SchedulingService schedulingService;
    @Autowired
    private NoSourceService noSourceService;
    @Autowired
    private RemainingNoSourceService remainingNoSourceService;
    @Autowired
    private RegisterService registerService;
    @Autowired
    private CancelRegisterService cancelRegisterService;
    @Autowired
    private RegisterHistoryService registerHistoryService;
    @Autowired
    private PhysicalExamPackageService physicalExamPackageService;
    @Autowired
    private PhysicalExamPackageDetailService physicalExamPackageDetailService;

    @Override
    public ReplyMsg getScheduling(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(AppointmentService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getScheduling"));
        SchedulingReq schedulingReq = JSON.parseObject(requestMsg.getBody(), SchedulingReq.class);
        schedulingReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getScheduling"));
        reqLogger.info("getScheduling req: " + JSON.toJSONString(schedulingReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!SchedulingReqHandle.validate(schedulingReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getScheduling result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<Scheduling> schedulingList = schedulingService.selectByParams(schedulingReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(schedulingList);
                reqLogger.info("getScheduling result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getScheduling exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getNoSource(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(AppointmentService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getNoSource"));
        NoSourceReq noSourceReq = JSON.parseObject(requestMsg.getBody(), NoSourceReq.class);
        noSourceReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getNoSource"));
        reqLogger.info("getNoSource req: " + JSON.toJSONString(noSourceReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!NoSourceReqHandle.validate(noSourceReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getNoSource result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<NoSource> noSourceList = noSourceService.selectByParams(noSourceReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(noSourceList);
                reqLogger.info("getNoSource result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getNoSource exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getRemainingNoSource(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(AppointmentService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getRemainingNoSource"));
        RemainingNoSourceReq remainingNoSourceReq = JSON.parseObject(requestMsg.getBody(), RemainingNoSourceReq.class);
        remainingNoSourceReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getRemainingNoSource"));
        reqLogger.info("getRemainingNoSource req: " + JSON.toJSONString(remainingNoSourceReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!RemainingNoSourceReqHandle.validate(remainingNoSourceReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getRemainingNoSource result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<RemainingNoSource> remainingNoSourceList = remainingNoSourceService.selectByParams(remainingNoSourceReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(remainingNoSourceList);
                reqLogger.info("getRemainingNoSource result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getRemainingNoSource exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg register(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(AppointmentService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("register"));
        RegisterReq registerReq = JSON.parseObject(requestMsg.getBody(), RegisterReq.class);
        registerReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("register"));
        reqLogger.info("register req: " + JSON.toJSONString(registerReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!RegisterReqHandle.validate(registerReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("register result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                //TODO  register
                replyMsg.setRes(Constant.RES_SUCCESS);
                reqLogger.info("register result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("register exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg cancelRegister(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(AppointmentService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("cancelRegister"));
        CancelRegisterReq cancelRegisterReq = JSON.parseObject(requestMsg.getBody(), CancelRegisterReq.class);
        cancelRegisterReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("cancelRegister"));
        reqLogger.info("cancelRegister req: " + JSON.toJSONString(cancelRegisterReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!CancelRegisterReqHandle.validate(cancelRegisterReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("cancelRegister result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                //TODO  cancelRegister
                replyMsg.setRes(Constant.RES_SUCCESS);
                reqLogger.info("cancelRegister result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("cancelRegister exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getRegisterHistory(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(AppointmentService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getRegisterHistory"));
        RegisterHistoryReq registerHistoryReq = JSON.parseObject(requestMsg.getBody(), RegisterHistoryReq.class);
        registerHistoryReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getRegisterHistory"));
        reqLogger.info("getRegisterHistory req: " + JSON.toJSONString(registerHistoryReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!RegisterHistoryReqHandle.validate(registerHistoryReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getRegisterHistory result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<RegisterHistory> registerHistoryList = registerHistoryService.selectByParams(registerHistoryReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(registerHistoryList);
                reqLogger.info("getRegisterHistory result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getRegisterHistory exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getPhysicalExamPackage(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(AppointmentService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPhysicalExamPackage"));
        PhysicalExamPackageReq physicalExamPackageReq = JSON.parseObject(requestMsg.getBody(), PhysicalExamPackageReq.class);
        physicalExamPackageReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getPhysicalExamPackage"));
        reqLogger.info("getPhysicalExamPackage req: " + JSON.toJSONString(physicalExamPackageReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!PhysicalExamPackageReqHandle.validate(physicalExamPackageReq)) {
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getPhysicalExamPackage result: " + JSON.toJSONString(replyMsg));
        } else {
            try {
                List<PhysicalExamPackage> physicalExamPackageList = physicalExamPackageService.selectAll(physicalExamPackageReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(physicalExamPackageList);
                reqLogger.info("getPhysicalExamPackage result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getPhysicalExamPackage exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }

    @Override
    public ReplyMsg getPhysicalExamPackageDetail(RequestMsg requestMsg) {
        Logger errorLogger = Logger.getLogger(Exception.class);
        Logger reqLogger = Logger.getLogger(AppointmentService.class);

        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPhysicalExamPackageDetail"));
        PhysicalExamPackageDetailReq physicalExamPackageDetailReq = JSON.parseObject(requestMsg.getBody(), PhysicalExamPackageDetailReq.class);
        physicalExamPackageDetailReq.setDataSourceType(DataSourceTypeUtil.getInstanse().getDatasourceType("getPhysicalExamPackageDetail"));
        reqLogger.info("getPhysicalExamPackageDetail req: " + JSON.toJSONString(physicalExamPackageDetailReq));
        ReplyMsg replyMsg = new ReplyMsg();
        if (!PhysicalExamPackageDetailReqHandle.validate(physicalExamPackageDetailReq)){
            replyMsg.setRes(Constant.RES_FAILED);
            replyMsg.setMsg(Constant.ERROR_MSG_PARAM_INVALID);
            reqLogger.info("getPhysicalExamPackageDetail result: " + JSON.toJSONString(replyMsg));
        }else {
            try {
                PhysicalExamPackage2 physicalExamPackage2 = physicalExamPackageDetailService.selectByParams(physicalExamPackageDetailReq);
                replyMsg.setRes(Constant.RES_SUCCESS);
                replyMsg.setBody(physicalExamPackage2);
                reqLogger.info("getPhysicalExamPackageDetail result: " + JSON.toJSONString(replyMsg));
            } catch (Exception e) {
                replyMsg.setRes(Constant.RES_FAILED);
                replyMsg.setMsg(e.getMessage());
                errorLogger.error("getPhysicalExamPackageDetail exception: " + e.getMessage());
            }
        }
        return replyMsg;
    }
}
