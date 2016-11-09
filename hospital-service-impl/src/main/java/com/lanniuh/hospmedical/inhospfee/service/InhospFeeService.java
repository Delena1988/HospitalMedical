package com.lanniuh.hospmedical.inhospfee.service;

import com.lanniuh.hospmedical.model.inhospfee.InhospFee;
import com.lanniuh.hospmedical.model.inhospfee.InhospFeeReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospFeeService {
    InhospFee selectByParams(InhospFeeReq inhospFeeReq);
}
