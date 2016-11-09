package com.lanniuh.hospmedical.surgeryrecord.service;

import com.lanniuh.hospmedical.model.surgeryrecord.SurgeryRecord;
import com.lanniuh.hospmedical.model.surgeryrecord.SurgeryRecordReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SurgeryRecordService {
    List<SurgeryRecord> selectByParams(SurgeryRecordReq surgeryRecordReq);
}
