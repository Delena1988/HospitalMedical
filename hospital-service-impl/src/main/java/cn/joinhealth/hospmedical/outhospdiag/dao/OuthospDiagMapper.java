package cn.joinhealth.hospmedical.outhospdiag.dao;


import cn.joinhealth.hospmedical.model.outhospdiag.OuthospDiagReq;
import cn.joinhealth.hospmedical.model.outhospdiag.OuthospDiag;

import java.util.List;

public interface OuthospDiagMapper {
    List<OuthospDiag> selectByParams(OuthospDiagReq outhospDiagReq);
}