package cn.joinhealth.hospmedical.visitinfo.service.impl;

import cn.joinhealth.hospmedical.model.visitinfo.VisitInfo;
import cn.joinhealth.hospmedical.model.visitinfo.VisitInfoReq;
import cn.joinhealth.hospmedical.visitinfo.dao.VisitInfoMapper;
import cn.joinhealth.hospmedical.visitinfo.service.VisitInfoService;
import com.github.pagehelper.Page;
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
