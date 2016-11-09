package com.lanniuh.hospmedical.filingpatient.dao;


import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.filingpatient.FilingPatient;
import com.lanniuh.hospmedical.model.filingpatient.FilingPatientReq;

import java.util.List;

public interface FilingPatientMapper {
    List<FilingPatient> selectByParamsUnpaged(FilingPatientReq filingPatientReq);
    Page<FilingPatient> selectByParamsPaged(FilingPatientReq filingPatientReq);
}