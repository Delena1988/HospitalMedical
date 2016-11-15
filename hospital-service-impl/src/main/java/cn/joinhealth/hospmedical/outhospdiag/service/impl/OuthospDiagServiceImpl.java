package cn.joinhealth.hospmedical.outhospdiag.service.impl;

import cn.joinhealth.hospmedical.model.outhospdiag.OuthospDiagReq;
import cn.joinhealth.hospmedical.outhospdiag.dao.OuthospDiagMapper;
import cn.joinhealth.hospmedical.model.outhospdiag.OuthospDiag;
import cn.joinhealth.hospmedical.outhospdiag.service.OuthospDiagService;
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
