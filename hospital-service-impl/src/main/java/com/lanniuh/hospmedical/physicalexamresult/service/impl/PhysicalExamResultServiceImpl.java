package com.lanniuh.hospmedical.physicalexamresult.service.impl;

import com.lanniuh.hospmedical.model.physicalexamresult.PhysicalExamResult;
import com.lanniuh.hospmedical.model.physicalexamresult.PhysicalExamResultReq;
import com.lanniuh.hospmedical.physicalexamresult.dao.PhysicalExamResultMapper;
import com.lanniuh.hospmedical.physicalexamresult.service.PhysicalExamResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "physicalExamResultService")
public class PhysicalExamResultServiceImpl implements PhysicalExamResultService {
    @Autowired
    private PhysicalExamResultMapper physicalExamResultMapper;

    @Override
    public List<PhysicalExamResult> selectByParams(PhysicalExamResultReq physicalExamResultReq) {
        return physicalExamResultMapper.selectByParams(physicalExamResultReq);
    }
}
