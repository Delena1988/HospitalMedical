package com.lanniuh.hospmedical.patientinfo.dao;


import com.lanniuh.hospmedical.model.patientinfo.PatientInfo;
import com.lanniuh.hospmedical.model.patientinfo.PatientInfoReq;

import java.util.List;

public interface PatientInfoMapper {
    List<PatientInfo> selectByParams(PatientInfoReq patientInfoReq);
}