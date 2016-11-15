package cn.joinhealth.hospmedical.model.visitinfo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by linjian
 * 16/11/15
 * 就诊信息请求
 */
public class VisitInfoReq implements Serializable{
    private static final long serialVersionUID = 6595369852808452460L;
    private String sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String visitCardNo;//就诊卡号
    private String outhospSerialNo;//门诊流水号
    private String outhospNo;//门诊号
    private String indexNo;//索引号
    private String indexNoType;//索引号类型
    private String patName;//患者姓名
    private String receptTreatDrName;//接诊医生姓名
    private String visitDeptName;//就诊科室名称
    private List<String> visitDeptCode;//就诊科室代码
    private String diagName;//诊断名称
    private String idNumber;//身份证号码
    private String mobileNo;//手机号码
    private String startDate;// 开始日期时间
    private String endDate;//结束日期时间
    private String diagFlag;//诊断标识  1－只取主诊断  2-所有诊断
    private Boolean pageFlag = false;//分页标志 false不分页，true分页
    private int pageNum = 0;//当前的页数
    private int pageSize = 0;//每页显示的条数

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

    public String getVisitCardNo() {
        return visitCardNo;
    }

    public void setVisitCardNo(String visitCardNo) {
        this.visitCardNo = visitCardNo;
    }

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo;
    }

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo;
    }

    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public String getIndexNoType() {
        return indexNoType;
    }

    public void setIndexNoType(String indexNoType) {
        this.indexNoType = indexNoType;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getReceptTreatDrName() {
        return receptTreatDrName;
    }

    public void setReceptTreatDrName(String receptTreatDrName) {
        this.receptTreatDrName = receptTreatDrName;
    }

    public String getVisitDeptName() {
        return visitDeptName;
    }

    public void setVisitDeptName(String visitDeptName) {
        this.visitDeptName = visitDeptName;
    }

    public List<String> getVisitDeptCode() {
        return visitDeptCode;
    }

    public void setVisitDeptCode(List<String> visitDeptCode) {
        this.visitDeptCode = visitDeptCode;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDiagFlag() {
        return diagFlag;
    }

    public void setDiagFlag(String diagFlag) {
        this.diagFlag = diagFlag;
    }

    public Boolean getPageFlag() {
        return pageFlag;
    }

    public void setPageFlag(Boolean pageFlag) {
        this.pageFlag = pageFlag;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "VisitInfoReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", visitCardNo='" + visitCardNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", indexNo='" + indexNo + '\'' +
                ", indexNoType='" + indexNoType + '\'' +
                ", patName='" + patName + '\'' +
                ", receptTreatDrName='" + receptTreatDrName + '\'' +
                ", visitDeptName='" + visitDeptName + '\'' +
                ", visitDeptCode=" + visitDeptCode +
                ", diagName='" + diagName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", diagFlag='" + diagFlag + '\'' +
                ", pageFlag=" + pageFlag +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}