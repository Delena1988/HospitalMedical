package cn.joinhealth.hospmedical.model.inhosporder;

import java.io.Serializable;

/**
 * Created by linjian
 * 16/11/15
 * 住院医嘱请求
 */
public class InhospOrderReq implements Serializable {
    private static final long serialVersionUID = -8243227296982692269L;
    private int sysCode;//1-hug 2-interview
    private String organCode;//组织机构代码
    private String inhospSerialNo;//住院流水号
    private String startDate;//开始日期时间
    private String endDate;//结束日期时间
    private int dataSourceType;//数据源类型 1、oracle 2、sqlserver 3、mysql

    private Boolean pageFlag = false;//分页标志 false不分页，true分页
    private int pageNum = 0;//当前的页数
    private int pageSize = 0;//每页显示的条数


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

    public String getInhospSerialNo() {
        return inhospSerialNo;
    }

    public void setInhospSerialNo(String inhospSerialNo) {
        this.inhospSerialNo = inhospSerialNo;
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

    public int getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(int dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    @Override
    public String toString() {
        return "InhospOrderReq{" +
                "sysCode='" + sysCode + '\'' +
                ", organCode='" + organCode + '\'' +
                ", inhospSerialNo='" + inhospSerialNo + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", dataSourceType=" + dataSourceType +
                ", pageFlag=" + pageFlag +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}