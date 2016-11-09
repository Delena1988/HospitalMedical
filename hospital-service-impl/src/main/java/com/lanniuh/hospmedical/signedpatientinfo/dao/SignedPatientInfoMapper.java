package com.lanniuh.hospmedical.signedpatientinfo.dao;


import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import com.lanniuh.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;

public interface SignedPatientInfoMapper {
    Page<SignedPatientInfo> selectByParamsPaged(SignedPatientInfoReq signedPatientInfoReq);
}