package com.lanniuh.hospmedical.inhospdiag.service;

import com.lanniuh.hospmedical.model.inhospdiag.InhospDiag;
import com.lanniuh.hospmedical.model.inhospdiag.InhospDiagReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospDiagService {
    List<InhospDiag> selectByParams(InhospDiagReq inhospDiagReq);
}
