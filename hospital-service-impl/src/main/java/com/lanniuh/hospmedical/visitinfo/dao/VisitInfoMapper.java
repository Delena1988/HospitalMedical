package com.lanniuh.hospmedical.visitinfo.dao;

import com.lanniuh.hospmedical.visitinfo.model.VisitInfo;

public interface VisitInfoMapper {
    int deleteByPrimaryKey(String outhospSerialNo);

    int insert(VisitInfo record);

    int insertSelective(VisitInfo record);

    VisitInfo selectByPrimaryKey(String outhospSerialNo);

    int updateByPrimaryKeySelective(VisitInfo record);

    int updateByPrimaryKey(VisitInfo record);
}