package com.lanniuh.appointment.physicalexampackage.service.impl;

import com.lanniuh.appointment.model.physicalexampackage.PhysicalExamPackage;
import com.lanniuh.appointment.physicalexampackage.dao.PhysicalExamPackageMapper;
import com.lanniuh.appointment.physicalexampackage.service.PhysicalExamPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "physicalExamPackageService")
public class PhysicalExamPackageServiceImpl implements PhysicalExamPackageService {
    @Autowired
    private PhysicalExamPackageMapper physicalExamPackageMapper;

    @Override
    public List<PhysicalExamPackage> selectAll() {
        return physicalExamPackageMapper.selectAll();
    }
}
