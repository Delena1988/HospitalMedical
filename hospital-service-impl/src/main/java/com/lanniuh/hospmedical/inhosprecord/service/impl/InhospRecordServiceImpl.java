package com.lanniuh.hospmedical.inhosprecord.service.impl;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.inhosprecord.dao.InhospRecordMapper;
import com.lanniuh.hospmedical.inhosprecord.service.InhospRecordService;
import com.lanniuh.hospmedical.model.inhosprecord.InhospRecord;
import com.lanniuh.hospmedical.model.inhosprecord.InhospRecordReq;
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
