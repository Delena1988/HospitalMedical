package cn.joinhealth.hospmedical.inhospbalance.dao;


import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalance;
import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalanceReq;

import java.util.List;

public interface InhospBalanceMapper {
    List<InhospBalance> selectByParams(InhospBalanceReq inhospBalanceReq);
}