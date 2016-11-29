package cn.joinhealth.appointment.model.physicalexampackage;

import cn.joinhealth.appointment.model.physicalexampackagedetail.PhysicalExamPackageDetail;

import java.io.Serializable;
import java.util.List;

/**
 * Created by linjian
 * 16/11/24
 * 体检套餐
 */
public class PhysicalExamPackage2 implements Serializable {
    private static final long serialVersionUID = 5601148668355499068L;
    private String organCode;//组织机构代码
    private String packageNo;//套餐编号
    private String price;//价格
    private String introduce;//介绍
    private String applicableGender;//适用性别
    private String applicableCrowd;//适用人群
    private String feature;//特点
    private String invalidFlag;//作废标志
    private List<PhysicalExamPackageDetail> physicalExamPackageDetailList;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getApplicableGender() {
        return applicableGender;
    }

    public void setApplicableGender(String applicableGender) {
        this.applicableGender = applicableGender;
    }

    public String getApplicableCrowd() {
        return applicableCrowd;
    }

    public void setApplicableCrowd(String applicableCrowd) {
        this.applicableCrowd = applicableCrowd;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(String invalidFlag) {
        this.invalidFlag = invalidFlag;
    }

    public List<PhysicalExamPackageDetail> getPhysicalExamPackageDetailList() {
        return physicalExamPackageDetailList;
    }

    public void setPhysicalExamPackageDetailList(List<PhysicalExamPackageDetail> physicalExamPackageDetailList) {
        this.physicalExamPackageDetailList = physicalExamPackageDetailList;
    }

    @Override
    public String toString() {
        return "PhysicalExamPackage2{" +
                "organCode='" + organCode + '\'' +
                ", packageNo='" + packageNo + '\'' +
                ", price='" + price + '\'' +
                ", introduce='" + introduce + '\'' +
                ", applicableGender='" + applicableGender + '\'' +
                ", applicableCrowd='" + applicableCrowd + '\'' +
                ", feature='" + feature + '\'' +
                ", invalidFlag='" + invalidFlag + '\'' +
                ", physicalExamPackageDetailList=" + physicalExamPackageDetailList +
                '}';
    }
}
