package com.lanniuh.hospmedical.inhospfee.service.impl;

import com.lanniuh.hospmedical.inhospfee.dao.InhospFeeMapper;
import com.lanniuh.hospmedical.inhospfee.service.InhospFeeService;
import com.lanniuh.hospmedical.model.inhospfee.InhospFee;
import com.lanniuh.hospmedical.model.inhospfee.InhospFeeReq;
import com.lanniuh.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "inhospFeeService")
public class InhospFeeServiceImpl implements InhospFeeService {
    @Autowired
    private InhospFeeMapper inhospFeeMapper;

    @Override
    public InhospFee selectByParams(InhospFeeReq inhospFeeReq) {
        List<InhospFee> inhospFeeList = inhospFeeMapper.selectByParams(inhospFeeReq);
        InhospFee inhospFee = new InhospFee();
        if (inhospFeeList.size() > 1) {
            inhospFee.setOrganCode("");
            inhospFee.setPatIndexNo("");
            inhospFee.setInhospSerialNo("");
            inhospFee.setDealNo("");
            inhospFee.setMedicareCategory("");
            for (InhospFee fee : inhospFeeList) {
                if (fee.getOrganCode() != null) {
                    inhospFee.setOrganCode(fee.getOrganCode());
                }
                if (fee.getPatIndexNo() != null) {
                    inhospFee.setPatIndexNo(fee.getPatIndexNo());
                }
                if (fee.getInhospSerialNo() != null) {
                    inhospFee.setInhospSerialNo(fee.getInhospSerialNo());
                }
                if (fee.getDealNo() != null) {
                    inhospFee.setDealNo(inhospFee.getDealNo() + fee.getDealNo() + ",");
                }
                if (fee.getMedicareCategory() != null && !"".equals(fee.getMedicareCategory().trim())) {
                    if (inhospFee.getMedicareCategory() == null || "".equals(fee.getMedicareCategory())) {
                        inhospFee.setMedicareCategory(fee.getMedicareCategory() + ",");
                    } else if (!inhospFee.getMedicareCategory().contains(fee.getMedicareCategory())) {
                        inhospFee.setMedicareCategory(inhospFee.getMedicareCategory() + fee.getMedicareCategory() + ",");
                    }
                }
                inhospFee.setMedicalTotalFee(StringUtil.StringAdd(inhospFee.getMedicalTotalFee(), fee.getMedicalTotalFee()));
                inhospFee.setMedicareFee(StringUtil.StringAdd(inhospFee.getMedicareFee(), fee.getMedicareFee()));
                inhospFee.setReduceFee(StringUtil.StringAdd(inhospFee.getReduceFee(), fee.getReduceFee()));
                inhospFee.setSelfExpenseFee(StringUtil.StringAdd(inhospFee.getSelfExpenseFee(), fee.getSelfExpenseFee()));
                inhospFee.setSelfNegativeFee(StringUtil.StringAdd(inhospFee.getSelfNegativeFee(), fee.getSelfNegativeFee()));
                inhospFee.setSelfPaymentFee(StringUtil.StringAdd(inhospFee.getSelfPaymentFee(), fee.getSelfPaymentFee()));
            }
            if (inhospFee.getDealNo() != null && inhospFee.getDealNo().length() > 1) {
                inhospFee.setDealNo(inhospFee.getDealNo().substring(0, inhospFee.getDealNo().length() - 1));
            }
            if (inhospFee.getMedicareCategory() != null && inhospFee.getMedicareCategory().length() > 1) {
                inhospFee.setMedicareCategory(inhospFee.getMedicareCategory().substring(0, inhospFee.getMedicareCategory().length() - 1));
            }
        } else if (inhospFeeList.size() == 1) {
            inhospFee = inhospFeeList.get(0);
        }
        return inhospFee;
    }
}
