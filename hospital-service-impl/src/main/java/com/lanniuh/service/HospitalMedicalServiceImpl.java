package com.lanniuh.service;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;
import com.lanniuh.hospmedical.api.HospitalMedicalService;
import com.lanniuh.hospmedical.inhosprecord.model.InhospRecord;
import com.lanniuh.hospmedical.inhosprecord.service.InhospRecordService;
import com.lanniuh.hospmedical.visitinfo.model.VisitInfo;
import com.lanniuh.hospmedical.visitinfo.service.VisitInfoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by linjian
 * 16/11/2.
 */
public class HospitalMedicalServiceImpl implements HospitalMedicalService {
    @Autowired
    InhospRecordService inhospRecordService;
    @Autowired
    VisitInfoService visitInfoService;
    @Override
    public ReplyMsg getInhospRecord(RequestMsg requestMsg) {
        InhospRecord inhospRecord = inhospRecordService.getInhospRecord("");
        ReplyMsg replyMsg = new ReplyMsg();
        replyMsg.setBody(inhospRecord);
        return replyMsg;
    }

    @Override
    public ReplyMsg getVisitInfo(RequestMsg requestMsg) {
        VisitInfo visitInfo = visitInfoService.getVisitInfo("");
        ReplyMsg replyMsg = new ReplyMsg();
        replyMsg.setBody(visitInfo);
        return replyMsg;
    }
}
