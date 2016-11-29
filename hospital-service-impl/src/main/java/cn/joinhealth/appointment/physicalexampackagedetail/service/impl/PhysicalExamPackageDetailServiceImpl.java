package cn.joinhealth.appointment.physicalexampackagedetail.service.impl;

import cn.joinhealth.appointment.model.physicalexampackage.PhysicalExamPackage2;
import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetailReq;
import cn.joinhealth.appointment.physicalexampackagedetail.dao.PhysicalExamPackageDetailMapper;
import cn.joinhealth.appointment.physicalexampackagedetail.service.PhysicalExamPackageDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "physicalExamPackageDetailService")
public class PhysicalExamPackageDetailServiceImpl implements PhysicalExamPackageDetailService {
    @Autowired
    private PhysicalExamPackageDetailMapper physicalExamPackageDetailMapper;

    @Override
    public PhysicalExamPackage2 selectByParams(PhysicalExamPackageDetailReq physicalExamPackageDetailReq) {
        return physicalExamPackageDetailMapper.selectByParams(physicalExamPackageDetailReq);
    }
}
