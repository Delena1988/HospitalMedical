package cn.joinhealth.hospmedical.inhospdiag.service;

import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiag;
import cn.joinhealth.hospmedical.model.inhospdiag.InhospDiagReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospDiagService {
    /**
     * @Description:查询住院诊断信息
     * @param: [inhospDiagReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.inhospdiag.InhospDiag>
     */
    List<InhospDiag> selectByParams(InhospDiagReq inhospDiagReq);
}
