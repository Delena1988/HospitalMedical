package cn.joinhealth.hospmedical.inhospbalance.service;

import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalance;
import cn.joinhealth.hospmedical.model.inhospbalance.InhospBalanceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospBalanceService {
    /**
     * @Description:查询住院费用结算信息
     * @param: [inhospBalanceReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.inhospbalance.InhospBalance>
     */
    List<InhospBalance> selectByParams(InhospBalanceReq inhospBalanceReq);
}
