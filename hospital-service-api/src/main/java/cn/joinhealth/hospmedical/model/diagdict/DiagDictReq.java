package cn.joinhealth.hospmedical.model.diagdict;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 疾病字典请求
 */
public class DiagDictReq implements Serializable {
    private static final long serialVersionUID = -6825075333519548001L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String diagCode;//疾病代码
    private int dataSourceType;//数据源类型 1、oracle 2、sqlserver 3、mysql

    public int getSysCode() {
        return sysCode;
    }

    public void setSysCode(int sysCode) {
        this.sysCode = sysCode;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "DiagDictReq{" +
                "sysCode=" + sysCode +
                ", organCode='" + organCode + '\'' +
                ", diagCode='" + diagCode + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}