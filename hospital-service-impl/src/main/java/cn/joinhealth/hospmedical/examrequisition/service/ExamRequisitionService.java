package cn.joinhealth.hospmedical.examrequisition.service;

import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisition;
import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisitionReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface ExamRequisitionService {
    List<ExamRequisition> selectByParams(ExamRequisitionReq examRequisitionReq);
}
