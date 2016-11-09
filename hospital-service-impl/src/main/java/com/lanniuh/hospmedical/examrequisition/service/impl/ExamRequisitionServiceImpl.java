package com.lanniuh.hospmedical.examrequisition.service.impl;

import com.lanniuh.hospmedical.examrequisition.dao.ExamRequisitionMapper;
import com.lanniuh.hospmedical.examrequisition.service.ExamRequisitionService;
import com.lanniuh.hospmedical.model.examrequisition.ExamRequisition;
import com.lanniuh.hospmedical.model.examrequisition.ExamRequisitionReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "examRequisitionService")
public class ExamRequisitionServiceImpl implements ExamRequisitionService {
    @Autowired
    private ExamRequisitionMapper examRequisitionMapper;

    @Override
    public List<ExamRequisition> selectByParams(ExamRequisitionReq examRequisitionReq) {
        return examRequisitionMapper.selectByParams(examRequisitionReq);
    }
}
