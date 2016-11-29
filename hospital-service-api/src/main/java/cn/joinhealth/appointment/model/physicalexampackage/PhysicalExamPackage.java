package cn.joinhealth.appointment.model.physicalexampackage;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 体检套餐
 */
public class PhysicalExamPackage implements Serializable {
    private static final long serialVersionUID = 6329358625433856740L;
    private String organCode;//组织机构代码
    private String packageNo;//套餐编号
    private String packageName;//套餐名称
    private String packageTyep;//套餐类别

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

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageTyep() {
        return packageTyep;
    }

    public void setPackageTyep(String packageTyep) {
        this.packageTyep = packageTyep;
    }

    @Override
    public String toString() {
        return "PhysicalExamPackage{" +
                "organCode='" + organCode + '\'' +
                ", packageNo='" + packageNo + '\'' +
                ", packageName='" + packageName + '\'' +
                ", packageTyep='" + packageTyep + '\'' +
                '}';
    }
}