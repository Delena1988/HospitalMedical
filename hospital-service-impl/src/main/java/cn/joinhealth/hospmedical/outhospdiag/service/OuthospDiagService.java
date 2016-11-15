package cn.joinhealth.hospmedical.outhospdiag.service;

import cn.joinhealth.hospmedical.model.outhospdiag.OuthospDiag;
import cn.joinhealth.hospmedical.model.outhospdiag.OuthospDiagReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospDiagService {
    List<OuthospDiag> selectByParams(OuthospDiagReq outhospDiagReq);
}
