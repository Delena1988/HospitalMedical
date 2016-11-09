package com.lanniuh.hospmedical.surgeryrecord.service.impl;

import com.lanniuh.hospmedical.model.surgeryrecord.SurgeryRecord;
import com.lanniuh.hospmedical.model.surgeryrecord.SurgeryRecordReq;
import com.lanniuh.hospmedical.surgeryrecord.dao.SurgeryRecordMapper;
import com.lanniuh.hospmedical.surgeryrecord.service.SurgeryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "surgeryRecordService")
public class SurgeryRecordServiceImpl implements SurgeryRecordService {
    @Autowired
    private SurgeryRecordMapper surgeryRecordMapper;

    @Override
    public List<SurgeryRecord> selectByParams(SurgeryRecordReq surgeryRecordReq) {
        return surgeryRecordMapper.selectByParams(surgeryRecordReq);
    }
}
