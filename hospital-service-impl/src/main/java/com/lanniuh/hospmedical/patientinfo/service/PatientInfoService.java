package com.lanniuh.hospmedical.patientinfo.service;

import com.lanniuh.hospmedical.model.patientinfo.PatientInfo;
import com.lanniuh.hospmedical.model.patientinfo.PatientInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PatientInfoService {
    List<PatientInfo> selectByParams(PatientInfoReq patientInfoReq);
}
