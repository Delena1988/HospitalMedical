package cn.joinhealth.hospmedical.model.staffdict;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 职工字典请求
 */
public class StaffDictReq implements Serializable {
    private static final long serialVersionUID = 6550207402428606839L;
    private int sysCode;//1-hug 2-interview
    private String staffIndexNo;//组织机构代码
    private String organCode;//职工索引号
    private String staffCode;//职工工号
    private String staffName;//职工姓名
    private int dataSourceType;//数据源类型 1、oracle 2、sqlserver 3、mysql

    public int getSysCode() {
        return sysCode;
    }

    public void setSysCode(int sysCode) {
        this.sysCode = sysCode;
    }

    public String getStaffIndexNo() {
        return staffIndexNo;
    }

    public void setStaffIndexNo(String staffIndexNo) {
        this.staffIndexNo = staffIndexNo;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "StaffDictReq{" +
                "sysCode=" + sysCode +
                ", staffIndexNo='" + staffIndexNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", staffCode='" + staffCode + '\'' +
                ", staffName='" + staffName + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}