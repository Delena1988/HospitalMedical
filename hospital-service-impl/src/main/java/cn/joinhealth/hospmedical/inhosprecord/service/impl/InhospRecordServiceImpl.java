package cn.joinhealth.hospmedical.inhosprecord.service.impl;

import cn.joinhealth.hospmedical.inhosprecord.dao.InhospRecordMapper;
import cn.joinhealth.hospmedical.inhosprecord.service.InhospRecordService;
import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecord;
import cn.joinhealth.hospmedical.model.inhosprecord.InhospRecordReq;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/2.
 */
@Service("inhospRecordService")
public class InhospRecordServiceImpl implements InhospRecordService {
    @Autowired
    private InhospRecordMapper inhospRecordMapper;

    @Override
    public List<InhospRecord> selectByParamsUnpaged(InhospRecordReq inhospRecordReq) {
        return inhospRecordMapper.selectByParamsUnpaged(inhospRecordReq);
    }

    @Override
    public Page<InhospRecord> selectByParamsPaged(InhospRecordReq inhospRecordReq) {
        return inhospRecordMapper.selectByParamsPaged(inhospRecordReq);
    }

    @Override
    public int selectStatistics(InhospRecordReq inhospRecordReq) {
        return inhospRecordMapper.selectStatistics(inhospRecordReq);
    }
}
