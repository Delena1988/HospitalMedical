package cn.joinhealth.hospmedical.outhospbalance.service;

import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalance;
import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalanceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospBalanceService {
    /**
     * @Description:查询门诊费用结算
     * @param: [outhospBalanceReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalance>
     */
    List<OuthospBalance> selectByParams(OuthospBalanceReq outhospBalanceReq);
}
