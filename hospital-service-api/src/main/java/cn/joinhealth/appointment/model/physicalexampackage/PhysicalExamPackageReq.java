package cn.joinhealth.appointment.model.physicalexampackage;

import java.io.Serializable;
/**
 * Created by linjian
 * 16/11/15
 * 体检套餐请求
 */
public class PhysicalExamPackageReq implements Serializable{
    private static final long serialVersionUID = -18644458244397739L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String packageNo;//套餐编号
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

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "PhysicalExamPackageReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", packageNo='" + packageNo + '\'' +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}