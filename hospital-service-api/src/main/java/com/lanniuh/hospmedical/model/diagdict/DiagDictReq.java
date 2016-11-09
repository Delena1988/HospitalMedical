package com.lanniuh.hospmedical.model.diagdict;

import java.io.Serializable;

public class DiagDictReq implements Serializable {
    private static final long serialVersionUID = -6825075333519548001L;
    private String sysCode;//1-hug 2-interview
    private String diagCode;//疾病代码

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    @Override
    public String toString() {
        return "DiagDictReq{" +
                "sysCode='" + sysCode + '\'' +
                ", diagCode='" + diagCode + '\'' +
                '}';
    }
}