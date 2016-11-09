package com.lanniuh.hospmedical.outhospbalance.service;

import com.lanniuh.hospmedical.model.outhospbalance.OuthospBalance;
import com.lanniuh.hospmedical.model.outhospbalance.OuthospBalanceReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospBalanceService {
    List<OuthospBalance> selectByParams(OuthospBalanceReq outhospBalanceReq);
}
