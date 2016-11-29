package cn.joinhealth.hospmedical.model.testsample;

import java.io.Serializable;
import java.util.List;

/**
 * Created by linjian
 * 16/11/15
 * 检验样本请求
 */
public class TestSampleReq implements Serializable {
    private static final long serialVersionUID = 4107440591204919417L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String patIndexNo;//患者索引号
    private String outhospNo;//门诊号
    private String outhospSerialNo;//门诊流水号
    private String inhospNo;//住院号
    private String inhospSerialNo;//住院流水号
    private List<String> requisitionNo;//申请单编号
    private List<String> requisitionNoItem;//申请单分项目序号
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

    public String getPatIndexNo() {
        return patIndexNo;
    }

    public void setPatIndexNo(String patIndexNo) {
        this.patIndexNo = patIndexNo;
    }

    public String getOuthospNo() {
        return outhospNo;
    }

    public void setOuthospNo(String outhospNo) {
        this.outhospNo = outhospNo;
    }

    public String getOuthospSerialNo() {
        return outhospSerialNo;
    }

    public void setOuthospSerialNo(String outhospSerialNo) {
        this.outhospSerialNo = outhospSerialNo;
    }

    public String getInhospNo() {
        return inhospNo;
    }

    public void setInhospNo(String inhospNo) {
        this.inhospNo = inhospNo;
    }

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo;
    }

    public List<String> getRequisitionNo() {
        return requisitionNo;
    }

    public void setRequisitionNo(List<String> requisitionNo) {
        this.requisitionNo = requisitionNo;
    }

    public List<String> getRequisitionNoItem() {
        return requisitionNoItem;
    }

    public void setRequisitionNoItem(List<String> requisitionNoItem) {
        this.requisitionNoItem = requisitionNoItem;
    }

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "TestSampleReq{" +
                "sysCode=" + sysCode +
                ", organCode='" + organCode + '\'' +
                ", patIndexNo='" + patIndexNo + '\'' +
                ", outhospNo='" + outhospNo + '\'' +
                ", outhospSerialNo='" + outhospSerialNo + '\'' +
                ", inhospNo='" + inhospNo + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", requisitionNo=" + requisitionNo +
                ", requisitionNoItem=" + requisitionNoItem +
                ", dataSourceType=" + dataSourceType +
                '}';
    }
}