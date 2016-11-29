package cn.joinhealth.appointment.physicalexampackagedetail.dao;


import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage2;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;

public interface PhysicalExamPackageDetailMapper {
    PhysicalExamPackage2 selectByParams(PhysicalExamPackageDetailReq physicalExamPackageDetailReq);
}