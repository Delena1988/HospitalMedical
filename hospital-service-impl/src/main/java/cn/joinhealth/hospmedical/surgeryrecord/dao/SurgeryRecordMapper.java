package cn.joinhealth.hospmedical.surgeryrecord.dao;


import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecord;
import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecordReq;

import java.util.List;

public interface SurgeryRecordMapper {
    List<SurgeryRecord> selectByParams(SurgeryRecordReq surgeryRecordReq);
}