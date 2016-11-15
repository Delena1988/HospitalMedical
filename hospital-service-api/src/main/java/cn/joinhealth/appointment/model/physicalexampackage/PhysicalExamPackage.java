package cn.joinhealth.appointment.model.physicalexampackage;

import java.io.Serializable;

public class PhysicalExamPackage implements Serializable {
    private static final long serialVersionUID = 6329358625433856740L;
    private String organCode;//组织机构代码
    private String packageNo;//套餐编号
    private String packageName;//套餐名称
    private String packageTyep;//套餐类别
    private String price;//价格
    private String introduce;//介绍
    private String applicableGender;//适用性别
    private String applicableCrowd;//适用人群
    private String feature;//特点
    private String invalidFlag;//作废标志

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo == null ? null : packageNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getPackageTyep() {
        return packageTyep;
    }

    public void setPackageTyep(String packageTyep) {
        this.packageTyep = packageTyep == null ? null : packageTyep.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getApplicableGender() {
        return applicableGender;
    }

    public void setApplicableGender(String applicableGender) {
        this.applicableGender = applicableGender == null ? null : applicableGender.trim();
    }

    public String getApplicableCrowd() {
        return applicableCrowd;
    }

    public void setApplicableCrowd(String applicableCrowd) {
        this.applicableCrowd = applicableCrowd == null ? null : applicableCrowd.trim();
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature == null ? null : feature.trim();
    }

    public String getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(String invalidFlag) {
        this.invalidFlag = invalidFlag == null ? null : invalidFlag.trim();
    }

    @Override
    public String toString() {
        return "PhysicalExamPackage{" +
                "packageNo='" + packageNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", packageName='" + packageName + '\'' +
                ", packageTyep='" + packageTyep + '\'' +
                ", price='" + price + '\'' +
                ", introduce='" + introduce + '\'' +
                ", applicableGender='" + applicableGender + '\'' +
                ", applicableCrowd='" + applicableCrowd + '\'' +
                ", feature='" + feature + '\'' +
                ", invalidFlag='" + invalidFlag + '\'' +
                '}';
    }
}