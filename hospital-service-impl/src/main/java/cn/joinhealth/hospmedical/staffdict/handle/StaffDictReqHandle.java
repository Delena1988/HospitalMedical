package cn.joinhealth.hospmedical.staffdict.handle;

import cn.joinhealth.hospmedical.model.staffdict.StaffDictReq;
import cn.joinhealth.util.StringUtil;

/**
 * Created by linjian
 * 16/11/25
 */
public class StaffDictReqHandle {
    /**
     * @Description: 校验参数 true 通过 false 不通过
     * @param: staffDictReq
     * @return: boolean
     */
    public static boolean validate(StaffDictReq staffDictReq) {
        if (!StringUtil.isEmpty(staffDictReq.getOrganCode())) {
            return false;
        } else {
            return true;
        }
    }
}
