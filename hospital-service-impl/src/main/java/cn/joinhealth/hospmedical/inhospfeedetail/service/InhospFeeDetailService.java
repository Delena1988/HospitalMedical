package cn.joinhealth.hospmedical.inhospfeedetail.service;

import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetail;
import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetailReq;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospFeeDetailService {
    List<InhospFeeDetail> selectByParams(InhospFeeDetailReq inhospFeeDetailReq);
}
