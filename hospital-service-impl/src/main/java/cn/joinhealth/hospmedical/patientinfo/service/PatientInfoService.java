package cn.joinhealth.hospmedical.patientinfo.service;

import cn.joinhealth.hospmedical.model.patientinfo.PatientInfo;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PatientInfoService {
    List<PatientInfo> selectByParams(PatientInfoReq patientInfoReq);
}