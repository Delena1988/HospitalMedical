package cn.joinhealth.hospmedical.signedpatientinfo.dao;


import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;

public interface SignedPatientInfoMapper {
    Page<SignedPatientInfo> selectByParamsPaged(SignedPatientInfoReq signedPatientInfoReq);
}