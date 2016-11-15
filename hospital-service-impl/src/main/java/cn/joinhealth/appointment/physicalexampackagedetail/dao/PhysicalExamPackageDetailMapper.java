package cn.joinhealth.appointment.physicalexampackagedetail.dao;


import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetail;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;

import java.util.List;

public interface PhysicalExamPackageDetailMapper {
    List<PhysicalExamPackageDetail> selectByParams(PhysicalExamPackageDetailReq physicalExamPackageDetailReq);
}