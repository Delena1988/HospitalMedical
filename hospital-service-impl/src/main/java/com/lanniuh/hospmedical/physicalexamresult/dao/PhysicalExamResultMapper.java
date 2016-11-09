package com.lanniuh.hospmedical.physicalexamresult.dao;


import com.lanniuh.hospmedical.model.physicalexamresult.PhysicalExamResult;
import com.lanniuh.hospmedical.model.physicalexamresult.PhysicalExamResultReq;

import java.util.List;

public interface PhysicalExamResultMapper {
    List<PhysicalExamResult> selectByParams(PhysicalExamResultReq physicalExamResultReq);
}