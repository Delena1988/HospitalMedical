package com.lanniuh.hospmedical.staffdict.service.impl;

import com.lanniuh.hospmedical.model.staffdict.StaffDict;
import com.lanniuh.hospmedical.staffdict.dao.StaffDictMapper;
import com.lanniuh.hospmedical.staffdict.service.StaffDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "staffDictService")
public class StaffDictServiceImpl implements StaffDictService {
    @Autowired
    private StaffDictMapper staffDictMapper;

    @Override
    public List<StaffDict> selectAll() {
        return staffDictMapper.selectAll();
    }
}
