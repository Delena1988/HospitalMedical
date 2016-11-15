package cn.joinhealth.hospmedical.inhospdiag.dao;


import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiag;
import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiagReq;

import java.util.List;

public interface InhospDiagMapper {
    List<InhospDiag> selectByParams(InhospDiagReq inhospDiagReq);
}