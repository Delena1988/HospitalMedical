package cn.joinhealth.hospmedical.surgeryrecord.service;

import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecordReq;
import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecord;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SurgeryRecordService {
    List<SurgeryRecord> selectByParams(SurgeryRecordReq surgeryRecordReq);
}
