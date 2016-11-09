package com.lanniuh.hospmedical.outhospbalance.dao;


import com.lanniuh.hospmedical.model.outhospbalance.OuthospBalance;
import com.lanniuh.hospmedical.model.outhospbalance.OuthospBalanceReq;

import java.util.List;

public interface OuthospBalanceMapper {
    List<OuthospBalance> selectByParams(OuthospBalanceReq outhospBalanceReq);
}