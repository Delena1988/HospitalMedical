package cn.joinhealth.hospmedical.model.deptdict;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 科室字典请求
 */
public class DeptDictReq implements Serializable{
    private static final long serialVersionUID = 1091739191584871899L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String deptIndexNo;//科室索引号
    private String deptCode;//科室代码
    private String deptName;//科室名称
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

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "DeptDictReq{" +
                "sysCode=" + sysCode +
                ", organCode='" + organCode + '\'' +
                ", deptIndexNo='" + deptIndexNo + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}