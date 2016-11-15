package cn.joinhealth.hospmedical.visitinfo.service;

import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfo;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfoReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/2.
 */
public interface VisitInfoService {
    List<VisitInfo> selectByParamsUnpaged(VisitInfoReq visitInfoReq);
    Page<VisitInfo> selectByParamsPaged(VisitInfoReq visitInfoReq);
}
