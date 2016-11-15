package cn.joinhealth.hospmedical.diagdict.service.impl;

import cn.joinhealth.hospmedical.diagdict.dao.DiagDictMapper;
import cn.joinhealth.hospmedical.diagdict.service.DiagDictService;
import cn.joinhealth.hospmedical.model.diagdict.DiagDict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "diagDictService")
public class DiagDictServiceImpl implements DiagDictService {
    @Autowired
    DiagDictMapper diagDictMapper;

    @Override
    public List<DiagDict> selectAll() {
        return diagDictMapper.selectAll();
    }
}
