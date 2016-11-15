package cn.joinhealth.hospmedical.examrequisition.service.impl;

import cn.joinhealth.hospmedical.examrequisition.dao.ExamRequisitionMapper;
import cn.joinhealth.hospmedical.examrequisition.service.ExamRequisitionService;
import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisitionReq;
import cn.joinhealth.hospmedical.model.examrequisition.ExamRequisition;
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
