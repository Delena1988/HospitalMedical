package com.lanniuh.hospmedical.microbetestresult.service.impl;

import com.lanniuh.hospmedical.microbetestresult.dao.MicrobeTestResultMapper;
import com.lanniuh.hospmedical.microbetestresult.service.MicrobeTestResultService;
import com.lanniuh.hospmedical.model.microbetestresult.MicrobeTestResult;
import com.lanniuh.hospmedical.model.microbetestresult.MicrobeTestResultReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "microbeTestResultService")
public class MicrobeTestResultServiceImpl implements MicrobeTestResultService {
    @Autowired
    private MicrobeTestResultMapper microbeTestResultMapper;

    @Override
    public List<MicrobeTestResult> selectByParams(MicrobeTestResultReq microbeTestResultReq) {
        return microbeTestResultMapper.selectByParams(microbeTestResultReq);
    }
}
