package cn.joinhealth.appointment.physicalexampackage.service;


import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamPackageService {
    List<PhysicalExamPackage> selectAll();
}
