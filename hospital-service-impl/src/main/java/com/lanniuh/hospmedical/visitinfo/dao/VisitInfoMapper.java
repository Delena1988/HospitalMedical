package com.lanniuh.hospmedical.visitinfo.dao;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.visitinfo.VisitInfo;
import com.lanniuh.hospmedical.model.visitinfo.VisitInfoReq;

import java.util.List;

public interface VisitInfoMapper {
    List<VisitInfo> selectByParamsUnpaged(VisitInfoReq visitInfoReq);
    Page<VisitInfo> selectByParamsPaged(VisitInfoReq visitInfoReq);
}