package cn.joinhealth.appointment.physicalexampackagedetail.service;

import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage2;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamPackageDetailService {
    /**
     * @Description:查询体检套餐明细
     * @param: [physicalExamPackageDetailReq]
     * @return: PhysicalExamPackage2
     */
    PhysicalExamPackage2 selectByParams(PhysicalExamPackageDetailReq physicalExamPackageDetailReq);
}
