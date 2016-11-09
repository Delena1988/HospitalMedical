package com.lanniuh.hospmedical.outhospdiag.dao;


import com.lanniuh.hospmedical.model.outhospdiag.OuthospDiag;
import com.lanniuh.hospmedical.model.outhospdiag.OuthospDiagReq;

import java.util.List;

public interface OuthospDiagMapper {
    List<OuthospDiag> selectByParams(OuthospDiagReq outhospDiagReq);
}