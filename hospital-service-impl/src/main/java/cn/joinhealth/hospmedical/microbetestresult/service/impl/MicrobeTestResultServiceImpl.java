package cn.joinhealth.hospmedical.microbetestresult.service.impl;

import cn.joinhealth.hospmedical.microbetestresult.dao.MicrobeTestResultMapper;
import cn.joinhealth.hospmedical.microbetestresult.service.MicrobeTestResultService;
import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResult;
import cn.joinhealth.hospmedical.model.microbetestresult.MicrobeTestResultReq;
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
