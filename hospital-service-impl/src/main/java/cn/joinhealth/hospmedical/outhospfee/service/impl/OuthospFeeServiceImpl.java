package cn.joinhealth.hospmedical.outhospfee.service.impl;

import cn.joinhealth.hospmedical.outhospfee.service.OuthospFeeService;
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFee;
import cn.joinhealth.hospmedical.model.outhospfee.OuthospFeeReq;
import cn.joinhealth.hospmedical.outhospfee.dao.OuthospFeeMapper;
import cn.joinhealth.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "outhospFeeService")
public class OuthospFeeServiceImpl implements OuthospFeeService {
    @Autowired
    private OuthospFeeMapper outhospFeeMapper;
    @Override
    public OuthospFee selectByParams(OuthospFeeReq outhospFeeReq) {
        List<OuthospFee> outhospFeeList = outhospFeeMapper.selectByParams(outhospFeeReq);
        OuthospFee outhospFee = new OuthospFee();
        if (outhospFeeList.size() > 1) {
            outhospFee.setOrganCode("");
            outhospFee.setPatIndexNo("");
            outhospFee.setOuthospSerialNo("");
            outhospFee.setDealNo("");
            outhospFee.setMedicareCategory("");
            for (OuthospFee fee : outhospFeeList) {
                if (fee.getOrganCode() != null) {
                    outhospFee.setOrganCode(fee.getOrganCode());
                }
                if (fee.getPatIndexNo() != null) {
                    outhospFee.setPatIndexNo(fee.getPatIndexNo());
                }
                if (fee.getOuthospSerialNo() != null) {
                    outhospFee.setOuthospSerialNo(fee.getOuthospSerialNo());
                }
                if (fee.getDealNo() != null) {
                    outhospFee.setDealNo(outhospFee.getDealNo() + fee.getDealNo().trim() + ",");
                }
                if (fee.getMedicareCategory() != null && !"".equals(fee.getMedicareCategory())) {
                    if (outhospFee.getMedicareCategory() == null || "".equals(fee.getMedicareCategory())) {
                        outhospFee.setMedicareCategory(fee.getMedicareCategory() + ",");
                    } else if (!outhospFee.getMedicareCategory().contains(fee.getMedicareCategory())) {
                        outhospFee.setMedicareCategory(outhospFee.getMedicareCategory() + fee.getMedicareCategory() + ",");
                    }
                }
                outhospFee.setMedicalTotalFee(StringUtil.StringAdd(outhospFee.getMedicalTotalFee(), fee.getMedicalTotalFee()));
                outhospFee.setMedicareFee(StringUtil.StringAdd(outhospFee.getMedicareFee(), fee.getMedicareFee()));
                outhospFee.setReduceFee(StringUtil.StringAdd(outhospFee.getReduceFee(), fee.getReduceFee()));
                outhospFee.setSelfExpenseFee(StringUtil.StringAdd(outhospFee.getSelfExpenseFee(), fee.getSelfExpenseFee()));
                outhospFee.setSelfNegativeFee(StringUtil.StringAdd(outhospFee.getSelfNegativeFee(), fee.getSelfNegativeFee()));
                outhospFee.setSelfPaymentFee(StringUtil.StringAdd(outhospFee.getSelfPaymentFee(), fee.getSelfPaymentFee()));
            }
            if (outhospFee.getDealNo() != null && outhospFee.getDealNo().length() > 1) {
                outhospFee.setDealNo(outhospFee.getDealNo().substring(0, outhospFee.getDealNo().length() - 1));
            }
            if (outhospFee.getMedicareCategory() != null && outhospFee.getMedicareCategory().length() > 1) {
                outhospFee.setMedicareCategory(outhospFee.getMedicareCategory().substring(0, outhospFee.getMedicareCategory().length() - 1));
            }
            if (outhospFee.getMedicalTotalFee() != null && Double.parseDouble(outhospFee.getMedicalTotalFee()) > 0) {
                outhospFee.setRefundFlag("0");
            } else {
                outhospFee.setRefundFlag("1");
            }
        }else if (outhospFeeList.size() == 1){
            outhospFee = outhospFeeList.get(0);
        }

        return outhospFee;
    }
}
