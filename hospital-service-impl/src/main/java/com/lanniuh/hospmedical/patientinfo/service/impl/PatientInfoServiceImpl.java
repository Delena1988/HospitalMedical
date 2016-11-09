package com.lanniuh.hospmedical.patientinfo.service.impl;

import com.lanniuh.hospmedical.model.patientinfo.PatientInfo;
import com.lanniuh.hospmedical.model.patientinfo.PatientInfoReq;
import com.lanniuh.hospmedical.patientinfo.dao.PatientInfoMapper;
import com.lanniuh.hospmedical.patientinfo.service.PatientInfoService;
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
