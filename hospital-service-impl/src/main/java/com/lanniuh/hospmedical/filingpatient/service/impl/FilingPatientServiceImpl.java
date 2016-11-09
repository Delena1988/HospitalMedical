package com.lanniuh.hospmedical.filingpatient.service.impl;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.filingpatient.dao.FilingPatientMapper;
import com.lanniuh.hospmedical.filingpatient.service.FilingPatientService;
import com.lanniuh.hospmedical.model.filingpatient.FilingPatient;
import com.lanniuh.hospmedical.model.filingpatient.FilingPatientReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "filingPatientService")
public class FilingPatientServiceImpl implements FilingPatientService {
    @Autowired
    private FilingPatientMapper filingPatientMapper;

    @Override
    public List<FilingPatient> selectByParamsUnpaged(FilingPatientReq filingPatientReq) {
        return filingPatientMapper.selectByParamsUnpaged(filingPatientReq);
    }

    @Override
    public Page<FilingPatient> selectByParamsPaged(FilingPatientReq filingPatientReq) {
        return filingPatientMapper.selectByParamsPaged(filingPatientReq);
    }
}
