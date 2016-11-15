package cn.joinhealth.hospmedical.surgeryrecord.service.impl;

import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecordReq;
import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecord;
import cn.joinhealth.hospmedical.surgeryrecord.dao.SurgeryRecordMapper;
import cn.joinhealth.hospmedical.surgeryrecord.service.SurgeryRecordService;
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
