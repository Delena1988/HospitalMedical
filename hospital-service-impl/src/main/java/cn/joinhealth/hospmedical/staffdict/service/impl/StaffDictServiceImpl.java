package cn.joinhealth.hospmedical.staffdict.service.impl;

import cn.joinhealth.hospmedical.model.staffdict.StaffDict;
import cn.joinhealth.hospmedical.staffdict.dao.StaffDictMapper;
import cn.joinhealth.hospmedical.staffdict.service.StaffDictService;
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
