package cn.joinhealth.hospmedical.patientinfo.service.impl;

import cn.joinhealth.hospmedical.patientinfo.service.PatientInfoService;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfo;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfoReq;
import cn.joinhealth.hospmedical.patientinfo.dao.PatientInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "patientInfoService")
public class PatientInfoServiceImpl implements PatientInfoService {
    @Autowired
    private PatientInfoMapper patientInfoMapper;

    @Override
    public List<PatientInfo> selectByParams(PatientInfoReq patientInfoReq) {
        return patientInfoMapper.selectByParams(patientInfoReq);
    }
}
