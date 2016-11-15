package cn.joinhealth.hospmedical.visitinfo.dao;

import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfo;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfoReq;

import java.util.List;

public interface VisitInfoMapper {
    List<VisitInfo> selectByParamsUnpaged(VisitInfoReq visitInfoReq);
    Page<VisitInfo> selectByParamsPaged(VisitInfoReq visitInfoReq);
}