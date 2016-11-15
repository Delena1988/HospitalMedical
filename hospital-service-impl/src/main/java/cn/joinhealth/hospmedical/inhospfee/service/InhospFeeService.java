package cn.joinhealth.hospmedical.inhospfee.service;

import cn.joinhealth.hospmedical.model.inhospfee.InhospFee;
import cn.joinhealth.hospmedical.model.inhospfee.InhospFeeReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospFeeService {
    InhospFee selectByParams(InhospFeeReq inhospFeeReq);
}
