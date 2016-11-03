package com.lanniuh.hospmedical.inhosprecord.service.impl;

import com.lanniuh.hospmedical.inhosprecord.dao.InhospRecordMapper;
import com.lanniuh.hospmedical.inhosprecord.model.InhospRecord;
import com.lanniuh.hospmedical.inhosprecord.service.InhospRecordService;
import com.lanniuh.util.MultipleDataSource;
import com.lanniuh.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by linjian
 * 16/11/2.
 */
@Service("inhospRecordService")
public class InhospRecordServiceImpl implements InhospRecordService {
    @Autowired
    private InhospRecordMapper inhospRecordMapper;

    @Override
    public InhospRecord getInhospRecord(String inhospSerialNo) {
        MultipleDataSource.setDataSourceKey(PropertiesUtil.getInstanse().get("getInhospRecord"));
        inhospSerialNo = "95275";
        return inhospRecordMapper.selectByPrimaryKey(inhospSerialNo);
    }
}
