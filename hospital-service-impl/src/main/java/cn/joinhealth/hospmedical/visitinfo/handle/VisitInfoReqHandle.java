package cn.joinhealth.hospmedical.visitinfo.handle;

import cn.joinhealth.hospmedical.model.visitinfo.VisitInfoReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class VisitInfoReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: visitInfoReq
     * @return: boolean
     */
    public static boolean validate(VisitInfoReq visitInfoReq) {
        if (!StringUtil.isEmpty(visitInfoReq.getOrganCode())) {
            return false;
        }
        if (visitInfoReq.getPageFlag()) {
            if (!StringUtil.isEmpty(visitInfoReq.getStartDate())
                    || visitInfoReq.getPageNum() <= 0
                    || visitInfoReq.getPageSize() <= 0) {
                return false;
            } else {
                return true;
            }
        } else {
            if (!StringUtil.isEmpty(visitInfoReq.getVisitCardNo())
                    || !StringUtil.isEmpty(visitInfoReq.getPatName())
                    || !StringUtil.isEmpty(visitInfoReq.getReceptTreatDrName())
                    || !StringUtil.isEmpty(visitInfoReq.getVisitDeptName())
                    || (visitInfoReq.getVisitDeptCode() != null && visitInfoReq.getVisitDeptCode().size() > 0)
                    || !StringUtil.isEmpty(visitInfoReq.getDiagName())
                    || !StringUtil.isEmpty(visitInfoReq.getOuthospNo())
                    || !StringUtil.isEmpty(visitInfoReq.getMobileNo())
                    || !StringUtil.isEmpty(visitInfoReq.getOuthospSerialNo())) {
                return true;
            } else {
                return false;
            }
        }
    }
}
