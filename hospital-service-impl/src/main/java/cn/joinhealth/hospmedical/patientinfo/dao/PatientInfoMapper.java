package cn.joinhealth.hospmedical.patientinfo.dao;


import cn.joinhealth.hospmedical.model.patientinfo.PatientInfo;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfoReq;

import java.util.List;

public interface PatientInfoMapper {
    List<PatientInfo> selectByParams(PatientInfoReq patientInfoReq);
}