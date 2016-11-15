package cn.joinhealth.appointment.physicalexampackage.dao;


import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage;

import java.util.List;

public interface PhysicalExamPackageMapper {
    List<PhysicalExamPackage> selectAll();
}