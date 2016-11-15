package cn.joinhealth.hospmedical.inhospfee.service;

import cn.joinhealth.hospmedical.model.inhospfee.InhospFee;
import cn.joinhealth.hospmedical.model.inhospfee.InhospFeeReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospFeeService {
    /**
     * @Description:查询住院费用信息
     * @param: [inhospFeeReq]
     * @return: cn.joinhealth.hospmedical.model.inhospfee.InhospFee
     */
    InhospFee selectByParams(InhospFeeReq inhospFeeReq);
}
