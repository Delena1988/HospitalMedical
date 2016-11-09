package com.lanniuh.hospmedical.filingpatient.service;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.filingpatient.FilingPatient;
import com.lanniuh.hospmedical.model.filingpatient.FilingPatientReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface FilingPatientService {
    List<FilingPatient> selectByParamsUnpaged(FilingPatientReq filingPatientReq);
    Page<FilingPatient> selectByParamsPaged(FilingPatientReq filingPatientReq);
}
