package com.lanniuh.hospmedical.visitinfo.service.impl;

import com.lanniuh.hospmedical.visitinfo.dao.VisitInfoMapper;
import com.lanniuh.hospmedical.visitinfo.model.VisitInfo;
import com.lanniuh.hospmedical.visitinfo.service.VisitInfoService;
import com.lanniuh.util.MultipleDataSource;
import com.lanniuh.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linjian
 * 16/11/2.
 */
@Service(value = "visitInfoService")
public class VisitInfoServiceImpl implements VisitInfoService {
    @Autowired
    private VisitInfoMapper visitInfoMapper;

    @Override
    public VisitInfo getVisitInfo(String outhospSerialNo) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getVisitInfo"));
        outhospSerialNo = "95279";
        return visitInfoMapper.selectByPrimaryKey(outhospSerialNo);
    }
}
