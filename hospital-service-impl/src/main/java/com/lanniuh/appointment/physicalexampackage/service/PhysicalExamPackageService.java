package com.lanniuh.appointment.physicalexampackage.service;


import com.lanniuh.appointment.model.physicalexampackage.PhysicalExamPackage;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamPackageService {
    List<PhysicalExamPackage> selectAll();
}
