package cn.joinhealth.hospmedical.filingpatient.service;

import cn.joinhealth.hospmedical.model.filingpatient.FilingPatient;
import cn.joinhealth.hospmedical.model.filingpatient.FilingPatientReq;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface FilingPatientService {

    /**
     * @Description:查询建档患者信息  不分页
     * @param: [filingPatientReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.filingpatient.FilingPatient>
     */
    List<FilingPatient> selectByParamsUnpaged(FilingPatientReq filingPatientReq);

    /**
     * @Description:查询建档患者信息 分页
     * @param: [filingPatientReq]
     * @return: com.github.pagehelper.Page<cn.joinhealth.hospmedical.model.filingpatient.FilingPatient>
     */
    Page<FilingPatient> selectByParamsPaged(FilingPatientReq filingPatientReq);
}
