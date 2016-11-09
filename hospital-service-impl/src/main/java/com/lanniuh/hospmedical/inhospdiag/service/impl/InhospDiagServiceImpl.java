package com.lanniuh.hospmedical.inhospdiag.service.impl;

import com.lanniuh.hospmedical.inhospdiag.dao.InhospDiagMapper;
import com.lanniuh.hospmedical.inhospdiag.service.InhospDiagService;
import com.lanniuh.hospmedical.model.inhospdiag.InhospDiag;
import com.lanniuh.hospmedical.model.inhospdiag.InhospDiagReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "inhospDiagService")
public class InhospDiagServiceImpl implements InhospDiagService {
    @Autowired
    private InhospDiagMapper inhospDiagMapper;

    @Override
    public List<InhospDiag> selectByParams(InhospDiagReq inhospDiagReq) {
        return inhospDiagMapper.selectByParams(inhospDiagReq);
    }
}
