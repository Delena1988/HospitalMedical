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
    /**
     * @Description:查询就诊信息 不分页
     * @param: [visitInfoReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.visitinfo.VisitInfo>
     */
    List<VisitInfo> selectByParamsUnpaged(VisitInfoReq visitInfoReq);

    /**
     * @Description:查询就诊信息 分页
     * @param: [visitInfoReq]
     * @return: com.github.pagehelper.Page<cn.joinhealth.hospmedical.model.visitinfo.VisitInfo>
     */
    Page<VisitInfo> selectByParamsPaged(VisitInfoReq visitInfoReq);
}
