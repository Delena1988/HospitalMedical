package cn.joinhealth.hospmedical.outhospfeedetail.service.impl;

import cn.joinhealth.hospmedical.outhospfeedetail.service.OuthospFeeDetailService;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;
import cn.joinhealth.hospmedical.outhospfeedetail.dao.OuthospFeeDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "outhospFeeDetailService")
public class OuthospFeeDetailServiceImpl implements OuthospFeeDetailService {
    @Autowired
    private OuthospFeeDetailMapper outhospFeeDetailMapper;

    @Override
    public List<OuthospFeeDetail> selectByParams(OuthospFeeDetailReq outhospFeeDetailReq) {
        return outhospFeeDetailMapper.selectByParams(outhospFeeDetailReq);
    }
}
