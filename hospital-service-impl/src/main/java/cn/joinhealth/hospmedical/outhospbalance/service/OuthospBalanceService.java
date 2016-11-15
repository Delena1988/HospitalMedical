package cn.joinhealth.hospmedical.outhospbalance.service;

import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalance;
import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalanceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospBalanceService {
    List<OuthospBalance> selectByParams(OuthospBalanceReq outhospBalanceReq);
}
