package com.lanniuh.hospmedical.api;

import cn.joinhealth.bean.reply.ReplyMsg;
import cn.joinhealth.bean.request.RequestMsg;

/**
 * Created by linjian
 * 16/11/2.
 */
public interface HospitalMedicalService {
    //住院记录
    public ReplyMsg getInhospRecord(RequestMsg requestMsg);
    //就诊记录
    public ReplyMsg getVisitInfo(RequestMsg requestMsg);
}
