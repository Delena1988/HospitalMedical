package cn.joinhealth.hospmedical.inhospfee.dao;


import cn.joinhealth.hospmedical.model.inhospfee.InhospFee;
import cn.joinhealth.hospmedical.model.inhospfee.InhospFeeReq;

import java.util.List;

public interface InhospFeeMapper {
    List<InhospFee> selectByParams(InhospFeeReq inhospFeeReq);
}