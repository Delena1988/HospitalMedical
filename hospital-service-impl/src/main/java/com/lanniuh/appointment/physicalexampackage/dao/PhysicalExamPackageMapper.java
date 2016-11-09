package com.lanniuh.appointment.physicalexampackage.dao;


import com.lanniuh.appointment.model.physicalexampackage.PhysicalExamPackage;

import java.util.List;

public interface PhysicalExamPackageMapper {
    List<PhysicalExamPackage> selectAll();
}