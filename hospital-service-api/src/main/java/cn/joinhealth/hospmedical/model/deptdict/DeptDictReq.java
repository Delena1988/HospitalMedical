package cn.joinhealth.hospmedical.model.deptdict;

import java.io.Serializable;

public class DeptDictReq implements Serializable{
    private static final long serialVersionUID = 1091739191584871899L;
    private String sysCode;//1-hug 2-interview
    private String deptIndexNo;//科室索引号
    private String deptCode;//科室代码
    private String deptName;//科室名称

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getDeptIndexNo() {
        return deptIndexNo;
    }

    public void setDeptIndexNo(String deptIndexNo) {
        this.deptIndexNo = deptIndexNo;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "DeptDictReq{" +
                "sysCode='" + sysCode + '\'' +
                ", deptIndexNo='" + deptIndexNo + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}