package cn.joinhealth.hospmedical.model.diagdict;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 疾病字典
 */
public class DiagDict implements Serializable {
    private static final long serialVersionUID = 4714945442576198350L;
    private String organCode;//组织机构代码
    private String diagIndexNo;//疾病索引号
    private String diagCode;//疾病代码
    private String diagName;//疾病名称
    private String pinyinCode;//拼音码
    private String diagCodeDict;//疾病代码  疾病ICD-10代码(知识库用)

    public String getDiagIndexNo() {
        return diagIndexNo;
    }

    public void setDiagIndexNo(String diagIndexNo) {
        this.diagIndexNo = diagIndexNo == null ? null : diagIndexNo.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode == null ? null : diagCode.trim();
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName == null ? null : diagName.trim();
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode == null ? null : pinyinCode.trim();
    }

    public String getDiagCodeDict() {
        return diagCodeDict;
    }

    public void setDiagCodeDict(String diagCodeDict) {
        this.diagCodeDict = diagCodeDict == null ? null : diagCodeDict.trim();
    }

    @Override
    public String toString() {
        return "DiagDict{" +
                "diagIndexNo='" + diagIndexNo + '\'' +
                ", organCode='" + organCode + '\'' +
                ", diagCode='" + diagCode + '\'' +
                ", diagName='" + diagName + '\'' +
                ", pinyinCode='" + pinyinCode + '\'' +
                ", diagCodeDict='" + diagCodeDict + '\'' +
                '}';
    }
}