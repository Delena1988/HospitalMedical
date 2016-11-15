package cn.joinhealth.hospmedical.inhospfeedetail.dao;


import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetail;
import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetailReq;

import java.util.List;

public interface InhospFeeDetailMapper {
    List<InhospFeeDetail> selectByParams(InhospFeeDetailReq inhospFeeDetailReq);
}