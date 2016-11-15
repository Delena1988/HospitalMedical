package cn.joinhealth.hospmedical.signedpatientinfo.service;

import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SignedPatientInfoService {
    Page<SignedPatientInfo> selectByParamsPaged(SignedPatientInfoReq signedPatientInfoReq);
}
