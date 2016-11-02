package com.lanniuh.hospmedical.inhosprecord.dao;

import com.lanniuh.hospmedical.inhosprecord.model.InhospRecord;

public interface InhospRecordMapper {
    int deleteByPrimaryKey(String inhospSerialNo);

    int insert(InhospRecord record);

    int insertSelective(InhospRecord record);

    InhospRecord selectByPrimaryKey(String inhospSerialNo);

    int updateByPrimaryKeySelective(InhospRecord record);

    int updateByPrimaryKey(InhospRecord record);
}