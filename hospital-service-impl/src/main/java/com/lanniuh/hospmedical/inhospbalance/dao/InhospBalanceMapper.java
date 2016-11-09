package com.lanniuh.hospmedical.inhospbalance.dao;


import com.lanniuh.hospmedical.model.inhospbalance.InhospBalance;
import com.lanniuh.hospmedical.model.inhospbalance.InhospBalanceReq;

import java.util.List;

public interface InhospBalanceMapper {
    List<InhospBalance> selectByParams(InhospBalanceReq inhospBalanceReq);
}