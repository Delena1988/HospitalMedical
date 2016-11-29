package cn.joinhealth.hospmedical.inhosprecord.handle;

import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecordReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class InhospRecordReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: inhospRecordReq
     * @return: boolean
     */
    public static boolean validate(InhospRecordReq inhospRecordReq) {
        if (!StringUtil.isEmpty(inhospRecordReq.getOrganCode())) {
            return false;
        }
        if (inhospRecordReq.getPageFlag()) {
            if (!StringUtil.isEmpty(inhospRecordReq.getAdmitStartDate())
                    && !StringUtil.isEmpty(inhospRecordReq.getDischargeStartDate())
                    || inhospRecordReq.getPageNum() <= 0
                    || inhospRecordReq.getPageSize() <= 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (!StringUtil.isEmpty(inhospRecordReq.getPatIndexNo())
                    || !StringUtil.isEmpty(inhospRecordReq.getVisitCardNo())
                    || !StringUtil.isEmpty(inhospRecordReq.getInhospNo())
                    || !StringUtil.isEmpty(inhospRecordReq.getInhospSerialNo())
                    || !StringUtil.isEmpty(inhospRecordReq.getPatName())
                    || !StringUtil.isEmpty(inhospRecordReq.getIdNumber())
                    || !StringUtil.isEmpty(inhospRecordReq.getMobileNo())
                    || (inhospRecordReq.getDeptCode() != null && inhospRecordReq.getDeptCode().size() > 0)
                    || !StringUtil.isEmpty(inhospRecordReq.getDeptName())
                    || (inhospRecordReq.getWardCode() != null && inhospRecordReq.getWardCode().size() > 0)
                    || !StringUtil.isEmpty(inhospRecordReq.getWardName())
                    || !StringUtil.isEmpty(inhospRecordReq.getAttendDrName())
                    || (inhospRecordReq.getDischargeDiagCode() != null && inhospRecordReq.getDischargeDiagCode().size() > 0)
                    || !StringUtil.isEmpty(inhospRecordReq.getDischargeDiagName())) {
                return true;
            }

        }
        return false;
    }
}
