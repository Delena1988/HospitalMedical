package cn.joinhealth.hospmedical.inhospfeedetail.service.impl;

import cn.joinhealth.hospmedical.inhospfeedetail.service.InhospFeeDetailService;
import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetail;
import cn.joinhealth.hospmedical.inhospfeedetail.dao.InhospFeeDetailMapper;
import cn.joinhealth.hospmedical.model.inhospfeedetail.InhospFeeDetailReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "inhospFeeDetailService")
public class InhospFeeDetailServiceImpl implements InhospFeeDetailService {
    @Autowired
    private InhospFeeDetailMapper inhospFeeDetailMapper;

    @Override
    public List<InhospFeeDetail> selectByParams(InhospFeeDetailReq inhospFeeDetailReq) {
        return inhospFeeDetailMapper.selectByParams(inhospFeeDetailReq);
    }
}
