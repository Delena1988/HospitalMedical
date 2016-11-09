package com.lanniuh.hospmedical.outhospdiag.service.impl;

import com.lanniuh.hospmedical.model.outhospdiag.OuthospDiag;
import com.lanniuh.hospmedical.model.outhospdiag.OuthospDiagReq;
import com.lanniuh.hospmedical.outhospdiag.dao.OuthospDiagMapper;
import com.lanniuh.hospmedical.outhospdiag.service.OuthospDiagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "OuthospDiagService")
public class OuthospDiagServiceImpl implements OuthospDiagService {
    @Autowired
    private OuthospDiagMapper outhospDiagMapper;
    @Override
    public List<OuthospDiag> selectByParams(OuthospDiagReq outhospDiagReq) {
        return outhospDiagMapper.selectByParams(outhospDiagReq);
    }
}
