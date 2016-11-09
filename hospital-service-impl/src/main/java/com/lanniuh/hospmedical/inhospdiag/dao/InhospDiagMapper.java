package com.lanniuh.hospmedical.inhospdiag.dao;


import com.lanniuh.hospmedical.model.inhospdiag.InhospDiag;
import com.lanniuh.hospmedical.model.inhospdiag.InhospDiagReq;

import java.util.List;

public interface InhospDiagMapper {
    List<InhospDiag> selectByParams(InhospDiagReq inhospDiagReq);
}