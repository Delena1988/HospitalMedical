package cn.joinhealth.hospmedical.physicalexamresult.dao;


import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResult;
import cn.joinhealth.hospmedical.model.physicalexamresult.PhysicalExamResultReq;

import java.util.List;

public interface PhysicalExamResultMapper {
    List<PhysicalExamResult> selectByParams(PhysicalExamResultReq physicalExamResultReq);
}