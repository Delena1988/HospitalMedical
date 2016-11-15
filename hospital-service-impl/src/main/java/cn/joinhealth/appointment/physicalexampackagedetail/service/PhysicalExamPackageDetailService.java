package cn.joinhealth.appointment.physicalexampackagedetail.service;

import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetail;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface PhysicalExamPackageDetailService {
    List<PhysicalExamPackageDetail> selectByParams(PhysicalExamPackageDetailReq physicalExamPackageDetailReq);
}
