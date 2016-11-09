package com.lanniuh.hospmedical.model.deptdict;

import java.io.Serializable;

public class DeptDict implements Serializable{
    private static final long serialVersionUID = 7875207332153184955L;
    private String organCode;//组织机构代码
    private String deptIndexNo;//科室索引号
    private String deptCode;//科室代码
    private String deptName;//科室名称
    private String deptAlias;//科室别名
    private String pinyinCode;//拼音码
    private String oiDeptFlag;//门诊住院科室标志  1、门诊 2、住院
    private String superiorDeptCode;//上级科室代码
    private String superiorDeptName;//上级科室名称
    private String descr;//描述
    private String wardFlag;//病区标志  1、临床科室2、病区3、其他
    private String hospAreaCode;//院区代码
    private String hospAreaName;//院区名称
    private String invalidFlag;//作废标志

    public String getDeptIndexNo() {
        return deptIndexNo;
    }

    public void setDeptIndexNo(String deptIndexNo) {
        this.deptIndexNo = deptIndexNo == null ? null : deptIndexNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptAlias() {
        return deptAlias;
    }

    public void setDeptAlias(String deptAlias) {
        this.deptAlias = deptAlias == null ? null : deptAlias.trim();
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode == null ? null : pinyinCode.trim();
    }

    public String getOiDeptFlag() {
        return oiDeptFlag;
    }

    public void setOiDeptFlag(String oiDeptFlag) {
        this.oiDeptFlag = oiDeptFlag == null ? null : oiDeptFlag.trim();
    }

    public String getSuperiorDeptCode() {
        return superiorDeptCode;
    }

    public void setSuperiorDeptCode(String superiorDeptCode) {
        this.superiorDeptCode = superiorDeptCode == null ? null : superiorDeptCode.trim();
    }

    public String getSuperiorDeptName() {
        return superiorDeptName;
    }

    public void setSuperiorDeptName(String superiorDeptName) {
        this.superiorDeptName = superiorDeptName == null ? null : superiorDeptName.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getWardFlag() {
        return wardFlag;
    }

    public void setWardFlag(String wardFlag) {
        this.wardFlag = wardFlag == null ? null : wardFlag.trim();
    }

    public String getHospAreaCode() {
        return hospAreaCode;
    }

    public void setHospAreaCode(String hospAreaCode) {
        this.hospAreaCode = hospAreaCode == null ? null : hospAreaCode.trim();
    }

    public String getHospAreaName() {
        return hospAreaName;
    }

    public void setHospAreaName(String hospAreaName) {
        this.hospAreaName = hospAreaName == null ? null : hospAreaName.trim();
    }

    public String getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(String invalidFlag) {
        this.invalidFlag = invalidFlag == null ? null : invalidFlag.trim();
    }

    @Override
    public String toString() {
        return "DeptDict{" +
                "deptIndexNo='" + deptIndexNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptAlias='" + deptAlias + '\'' +
                ", pinyinCode='" + pinyinCode + '\'' +
                ", oiDeptFlag='" + oiDeptFlag + '\'' +
                ", superiorDeptCode='" + superiorDeptCode + '\'' +
                ", superiorDeptName='" + superiorDeptName + '\'' +
                ", descr='" + descr + '\'' +
                ", wardFlag='" + wardFlag + '\'' +
                ", hospAreaCode='" + hospAreaCode + '\'' +
                ", hospAreaName='" + hospAreaName + '\'' +
                ", invalidFlag='" + invalidFlag + '\'' +
                '}';
    }
}