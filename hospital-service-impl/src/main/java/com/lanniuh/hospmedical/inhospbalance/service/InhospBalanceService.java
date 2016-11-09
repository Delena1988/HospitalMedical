package com.lanniuh.hospmedical.inhospbalance.service;

import com.lanniuh.hospmedical.model.inhospbalance.InhospBalance;
import com.lanniuh.hospmedical.model.inhospbalance.InhospBalanceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospBalanceService {
    List<InhospBalance> selectByParams(InhospBalanceReq inhospBalanceReq);
}
