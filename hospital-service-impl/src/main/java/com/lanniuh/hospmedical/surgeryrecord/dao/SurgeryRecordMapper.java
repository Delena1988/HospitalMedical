package com.lanniuh.hospmedical.surgeryrecord.dao;


import com.lanniuh.hospmedical.model.surgeryrecord.SurgeryRecord;
import com.lanniuh.hospmedical.model.surgeryrecord.SurgeryRecordReq;

import java.util.List;

public interface SurgeryRecordMapper {
    List<SurgeryRecord> selectByParams(SurgeryRecordReq surgeryRecordReq);
}