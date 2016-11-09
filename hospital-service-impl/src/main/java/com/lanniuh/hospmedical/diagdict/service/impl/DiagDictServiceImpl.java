package com.lanniuh.hospmedical.diagdict.service.impl;

import com.lanniuh.hospmedical.diagdict.dao.DiagDictMapper;
import com.lanniuh.hospmedical.diagdict.service.DiagDictService;
import com.lanniuh.hospmedical.model.diagdict.DiagDict;
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
