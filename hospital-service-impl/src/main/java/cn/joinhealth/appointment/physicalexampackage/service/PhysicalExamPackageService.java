package cn.joinhealth.appointment.physicalexampackage.service;


import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage;
import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackageReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamPackageService {
    /**
     * @Description:查询体检套餐列表
     * @param: physicalExamPackageReq
     * @return: List<PhysicalExamPackage>
     */
    List<PhysicalExamPackage> selectAll(PhysicalExamPackageReq physicalExamPackageReq);
}
