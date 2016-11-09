package com.lanniuh.hospmedical.signedpatientinfo.service;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import com.lanniuh.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SignedPatientInfoService {
    Page<SignedPatientInfo> selectByParamsPaged(SignedPatientInfoReq signedPatientInfoReq);
}
