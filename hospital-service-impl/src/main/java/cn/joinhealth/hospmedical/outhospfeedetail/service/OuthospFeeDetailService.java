package cn.joinhealth.hospmedical.outhospfeedetail.service;

import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetail;
import cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetailReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface OuthospFeeDetailService {
    /**
     * @Description:查询门诊费用明细信息
     * @param: [outhospFeeDetailReq]
     * @return: java.util.List<cn.joinhealth.hospmedical.model.outhospfeedetail.OuthospFeeDetail>
     */
    List<OuthospFeeDetail> selectByParams(OuthospFeeDetailReq outhospFeeDetailReq);
}
