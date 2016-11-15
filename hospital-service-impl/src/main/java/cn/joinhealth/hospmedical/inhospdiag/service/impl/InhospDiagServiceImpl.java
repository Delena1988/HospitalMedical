package cn.joinhealth.hospmedical.inhospdiag.service.impl;

import cn.joinhealth.hospmedical.inhospdiag.dao.InhospDiagMapper;
import cn.joinhealth.hospmedical.inhospdiag.service.InhospDiagService;
import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiag;
import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiagReq;
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
