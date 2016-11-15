package cn.joinhealth.hospmedical.signedpatientinfo.service;

import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfo;
import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfoReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface SignedPatientInfoService {
    /**
     * @Description:查询签约病人信息  分页
     * @param: [signedPatientInfoReq]
     * @return: com.github.pagehelper.Page<cn.joinhealth.hospmedical.model.signedpatientinfo.SignedPatientInfo>
     */
    Page<SignedPatientInfo> selectByParamsPaged(SignedPatientInfoReq signedPatientInfoReq);
}
