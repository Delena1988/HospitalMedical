package com.lanniuh.hospmedical.visitinfo.service.impl;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.visitinfo.VisitInfo;
import com.lanniuh.hospmedical.model.visitinfo.VisitInfoReq;
import com.lanniuh.hospmedical.visitinfo.dao.VisitInfoMapper;
import com.lanniuh.hospmedical.visitinfo.service.VisitInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/2.
 */
@Service(value = "visitInfoService")
public class VisitInfoServiceImpl implements VisitInfoService {
    @Autowired
    private VisitInfoMapper visitInfoMapper;

    @Override
    public List<VisitInfo> selectByParamsUnpaged(VisitInfoReq visitInfoReq) {
        return visitInfoMapper.selectByParamsUnpaged(visitInfoReq);
    }

    @Override
    public Page<VisitInfo> selectByParamsPaged(VisitInfoReq visitInfoReq) {
        return visitInfoMapper.selectByParamsPaged(visitInfoReq);
    }
}
