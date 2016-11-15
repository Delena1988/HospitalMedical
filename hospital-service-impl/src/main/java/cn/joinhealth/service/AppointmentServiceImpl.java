package cn.joinhealth.service;

import cn.joinhealth.appointment.api.AppointmentService;
import cn.joinhealth.appointment.model.nosource.NoSource;
import cn.joinhealth.appointment.model.nosource.NoSourceReq;
import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage;
import cn.joinhealth.appointment.model.registerhistory.RegisterHistoryReq;
import cn.joinhealth.appointment.physicalexampackage.service.PhysicalExamPackageService;
import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;
import cn.joinhealth.util.PropertiesUtil;
import com.alibaba.fastjson.JSON;
import cn.joinhealth.appointment.cancelregister.service.CancelRegisterService;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetail;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;
import cn.joinhealth.appointment.model.registerhistory.RegisterHistory;
import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSource;
import cn.joinhealth.appointment.model.remainingnosource.RemainingNoSourceReq;
import cn.joinhealth.appointment.model.scheduling.Scheduling;
import cn.joinhealth.appointment.model.scheduling.SchedulingReq;
import cn.joinhealth.appointment.nosource.service.NoSourceService;
import cn.joinhealth.appointment.physicalexampackagedetail.service.PhysicalExamPackageDetailService;
import cn.joinhealth.appointment.register.service.RegisterService;
import cn.joinhealth.appointment.registerhistory.service.RegisterHistoryService;
import cn.joinhealth.appointment.remainingnosource.service.RemainingNoSourceService;
import cn.joinhealth.appointment.scheduling.service.SchedulingService;
import cn.joinhealth.util.MultipleDataSource;
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
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getScheduling"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<Scheduling> schedulingList;
        SchedulingReq schedulingReq = JSON.parseObject(requestMsg.getBody(), SchedulingReq.class);
        schedulingList = schedulingService.selectByParams(schedulingReq);
        replyMsg.setBody(schedulingList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getNoSource(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getNoSource"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<NoSource> noSourceList;
        NoSourceReq noSourceReq = JSON.parseObject(requestMsg.getBody(), NoSourceReq.class);
        noSourceList = noSourceService.selectByParams(noSourceReq);
        replyMsg.setBody(noSourceList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getRemainingNoSource(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getRemainingNoSource"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<RemainingNoSource> remainingNoSourceList;
        RemainingNoSourceReq remainingNoSourceReq = JSON.parseObject(requestMsg.getBody(), RemainingNoSourceReq.class);
        remainingNoSourceList = remainingNoSourceService.selectByParams(remainingNoSourceReq);
        replyMsg.setBody(remainingNoSourceList);
        return replyMsg;
    }

    @Override
    public ReplyMsg register(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("register"));
        ReplyMsg replyMsg = new ReplyMsg();

        return replyMsg;
    }

    @Override
    public ReplyMsg cancelRegister(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("cancelRegister"));
        ReplyMsg replyMsg = new ReplyMsg();

        return replyMsg;
    }

    @Override
    public ReplyMsg getRegisterHistory(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getRegisterHistory"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<RegisterHistory> registerHistoryList;
        RegisterHistoryReq registerHistoryReq = JSON.parseObject(requestMsg.getBody(), RegisterHistoryReq.class);
        registerHistoryList = registerHistoryService.selectByParams(registerHistoryReq);
        replyMsg.setBody(registerHistoryList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getPhysicalExamPackage(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPhysicalExamPackage"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<PhysicalExamPackage> physicalExamPackageList;
        physicalExamPackageList = physicalExamPackageService.selectAll();
        replyMsg.setBody(physicalExamPackageList);
        return replyMsg;
    }

    @Override
    public ReplyMsg getPhysicalExamPackageDetail(RequestMsg requestMsg) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getPhysicalExamPackageDetail"));
        ReplyMsg replyMsg = new ReplyMsg();
        List<PhysicalExamPackageDetail> physicalExamPackageDetailList;
        PhysicalExamPackageDetailReq physicalExamPackageDetailReq = JSON.parseObject(requestMsg.getBody(),PhysicalExamPackageDetailReq.class);
        physicalExamPackageDetailList = physicalExamPackageDetailService.selectByParams(physicalExamPackageDetailReq);
        replyMsg.setBody(physicalExamPackageDetailList);
        return replyMsg;
    }
}
