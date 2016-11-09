package com.lanniuh.hospmedical.physicalexamresult.service;

import com.lanniuh.hospmedical.model.physicalexamresult.PhysicalExamResult;
import com.lanniuh.hospmedical.model.physicalexamresult.PhysicalExamResultReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamResultService {
    List<PhysicalExamResult> selectByParams(PhysicalExamResultReq physicalExamResultReq);
}
