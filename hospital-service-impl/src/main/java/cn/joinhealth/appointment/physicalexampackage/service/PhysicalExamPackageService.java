package cn.joinhealth.appointment.physicalexampackage.service;


import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamPackageService {
    /**
     * @Description:查询体检套餐
     * @param: []
     * @return: java.util.List<cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage>
     */
    List<PhysicalExamPackage> selectAll();
}
