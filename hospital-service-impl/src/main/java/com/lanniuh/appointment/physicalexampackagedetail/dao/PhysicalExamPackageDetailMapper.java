package com.lanniuh.appointment.physicalexampackagedetail.dao;


import com.lanniuh.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetail;
import com.lanniuh.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;

import java.util.List;

public interface PhysicalExamPackageDetailMapper {
    List<PhysicalExamPackageDetail> selectByParams(PhysicalExamPackageDetailReq physicalExamPackageDetailReq);
}