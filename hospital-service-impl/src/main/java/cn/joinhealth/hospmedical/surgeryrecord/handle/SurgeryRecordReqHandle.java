package cn.joinhealth.hospmedical.surgeryrecord.handle;

import cn.joinhealth.hospmedical.model.surgeryrecord.SurgeryRecordReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class SurgeryRecordReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: surgeryRecordReq
     * @return: boolean
     */
    public static boolean validate(SurgeryRecordReq surgeryRecordReq) {
        if (!StringUtil.isEmpty(surgeryRecordReq.getOrganCode())) {
            return false;
        }
        if (!StringUtil.isEmpty(surgeryRecordReq.getInhospSerialNo())
                || !StringUtil.isEmpty(surgeryRecordReq.getOuthospSerialNo())) {
            return true;
        }
        return false;
    }
}
