package cn.joinhealth.appointment.physicalexampackagedetail.service;

import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetail;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamPackageDetailService {
    /**
     * @Description:查询体检套餐明细
     * @param: [physicalExamPackageDetailReq]
     * @return: java.util.List<cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetail>
     */
    List<PhysicalExamPackageDetail> selectByParams(PhysicalExamPackageDetailReq physicalExamPackageDetailReq);
}
