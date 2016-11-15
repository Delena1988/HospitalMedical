package cn.joinhealth.hospmedical.inhospdiag.service;

import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiag;
import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiagReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospDiagService {
    List<InhospDiag> selectByParams(InhospDiagReq inhospDiagReq);
}
