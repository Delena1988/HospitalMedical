package cn.joinhealth.hospmedical.filingpatient.dao;


import cn.joinhealth.hospmedical.model.filingpatient.FilingPatient;
import cn.joinhealth.hospmedical.model.filingpatient.FilingPatientReq;
import com.github.pagehelper.Page;

import java.util.List;

public interface FilingPatientMapper {
    List<FilingPatient> selectByParamsUnpaged(FilingPatientReq filingPatientReq);
    Page<FilingPatient> selectByParamsPaged(FilingPatientReq filingPatientReq);
}