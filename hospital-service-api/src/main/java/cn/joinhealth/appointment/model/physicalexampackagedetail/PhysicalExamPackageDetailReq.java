package cn.joinhealth.appointment.model.physicalexampackagedetail;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 体检套餐详情请求
 */
public class PhysicalExamPackageDetailReq implements Serializable{
    private static final long serialVersionUID = 6173886952273731644L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String packageNo;//套餐编号

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

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo;
    }

    @Override
    public String toString() {
        return "PhysicalExamPackageDetailReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", packageNo='" + packageNo + '\'' +
                '}';
    }
}