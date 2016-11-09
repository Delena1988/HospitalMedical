package com.lanniuh.appointment.model.cancelregister;

import java.io.Serializable;

public class CancelRegister implements Serializable {
    private static final long serialVersionUID = -7911641680706041112L;
    private String organCode;//组织机构代码
    private String resultCode;//结果代码
    private String resultName;//结果描述

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    @Override
    public String toString() {
        return "CancelRegister{" +
                "organCode='" + organCode + '\'' +
                ", resultCode='" + resultCode + '\'' +
                ", resultName='" + resultName + '\'' +
                '}';
    }
}