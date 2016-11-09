package com.lanniuh.hospmedical.inhospfee.dao;


import com.lanniuh.hospmedical.model.inhospfee.InhospFee;
import com.lanniuh.hospmedical.model.inhospfee.InhospFeeReq;

import java.util.List;

public interface InhospFeeMapper {
    List<InhospFee> selectByParams(InhospFeeReq inhospFeeReq);
}