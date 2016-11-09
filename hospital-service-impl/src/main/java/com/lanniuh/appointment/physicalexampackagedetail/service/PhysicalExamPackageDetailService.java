package com.lanniuh.appointment.physicalexampackagedetail.service;

import com.lanniuh.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetail;
import com.lanniuh.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamPackageDetailService {
    List<PhysicalExamPackageDetail> selectByParams(PhysicalExamPackageDetailReq physicalExamPackageDetailReq);
}
