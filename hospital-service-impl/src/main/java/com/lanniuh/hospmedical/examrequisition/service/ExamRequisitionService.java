package com.lanniuh.hospmedical.examrequisition.service;

import com.lanniuh.hospmedical.model.examrequisition.ExamRequisition;
import com.lanniuh.hospmedical.model.examrequisition.ExamRequisitionReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface ExamRequisitionService {
    List<ExamRequisition> selectByParams(ExamRequisitionReq examRequisitionReq);
}
