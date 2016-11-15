package cn.joinhealth.hospmedical.examrequisition.dao;


import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisition;
import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisitionReq;

import java.util.List;

public interface ExamRequisitionMapper {
    List<ExamRequisition> selectByParams(ExamRequisitionReq examRequisitionReq);
}