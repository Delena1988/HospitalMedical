package cn.joinhealth.hospmedical.inhospbalance.service;

import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalance;
import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalanceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospBalanceService {
    List<InhospBalance> selectByParams(InhospBalanceReq inhospBalanceReq);
}
