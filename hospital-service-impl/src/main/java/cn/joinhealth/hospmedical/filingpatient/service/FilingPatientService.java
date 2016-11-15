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
    List<FilingPatient> selectByParamsUnpaged(FilingPatientReq filingPatientReq);
    Page<FilingPatient> selectByParamsPaged(FilingPatientReq filingPatientReq);
}
