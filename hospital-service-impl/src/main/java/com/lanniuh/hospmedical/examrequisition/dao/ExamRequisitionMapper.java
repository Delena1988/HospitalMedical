package com.lanniuh.hospmedical.examrequisition.dao;


import com.lanniuh.hospmedical.model.examrequisition.ExamRequisition;
import com.lanniuh.hospmedical.model.examrequisition.ExamRequisitionReq;

import java.util.List;

public interface ExamRequisitionMapper {
    List<ExamRequisition> selectByParams(ExamRequisitionReq examRequisitionReq);
}