package com.lanniuh.hospmedical.outhospdiag.service;

import com.lanniuh.hospmedical.model.outhospdiag.OuthospDiag;
import com.lanniuh.hospmedical.model.outhospdiag.OuthospDiagReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospDiagService {
    List<OuthospDiag> selectByParams(OuthospDiagReq outhospDiagReq);
}
