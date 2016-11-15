package cn.joinhealth.hospmedical.model.inhospdiag;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 住院诊断请求
 */
public class InhospDiagReq implements Serializable {
    private static final long serialVersionUID = -5351303751568313672L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String inhospSerialNo;//住院流水号

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo;
    }

    @Override
    public String toString() {
        return "InhospDiagReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                '}';
    }
}