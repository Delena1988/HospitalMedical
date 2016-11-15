package cn.joinhealth.hospmedical.outhospbalance.dao;


import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalance;
import cn.joinhealth.hospmedical.model.outhospbalance.OuthospBalanceReq;

import java.util.List;

public interface OuthospBalanceMapper {
    List<OuthospBalance> selectByParams(OuthospBalanceReq outhospBalanceReq);
}