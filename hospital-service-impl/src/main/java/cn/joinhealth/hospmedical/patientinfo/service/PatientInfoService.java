package cn.joinhealth.hospmedical.patientinfo.service;

import cn.joinhealth.hospmedical.model.patientinfo.PatientInfo;
import cn.joinhealth.hospmedical.model.patientinfo.PatientInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PatientInfoService {

    /**
     * @Description:查询患者基本信息
     * @param: [patientInfoReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.patientinfo.PatientInfo>
     */
    List<PatientInfo> selectByParams(PatientInfoReq patientInfoReq);
}
