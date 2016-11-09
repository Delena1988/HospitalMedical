package com.lanniuh.hospmedical.signedpatientinfo.service.impl;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import com.lanniuh.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;
import com.lanniuh.hospmedical.signedpatientinfo.dao.SignedPatientInfoMapper;
import com.lanniuh.hospmedical.signedpatientinfo.service.SignedPatientInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "signedPatientInfoService")
public class SignedPatientInfoServiceImpl implements SignedPatientInfoService {
    @Autowired
    private SignedPatientInfoMapper signedPatientInfoMapper;

    @Override
    public Page<SignedPatientInfo> selectByParamsPaged(SignedPatientInfoReq signedPatientInfoReq) {
        return signedPatientInfoMapper.selectByParamsPaged(signedPatientInfoReq);
    }
}
