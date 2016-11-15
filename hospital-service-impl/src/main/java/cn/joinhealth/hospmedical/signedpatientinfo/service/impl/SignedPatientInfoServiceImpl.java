package cn.joinhealth.hospmedical.signedpatientinfo.service.impl;

import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;
import cn.joinhealth.hospmedical.signedpatientinfo.dao.SignedPatientInfoMapper;
import cn.joinhealth.hospmedical.signedpatientinfo.service.SignedPatientInfoService;
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
