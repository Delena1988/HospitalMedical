package cn.joinhealth.hospmedical.deptdict.service.impl;

import cn.joinhealth.hospmedical.deptdict.dao.DeptDictMapper;
import cn.joinhealth.hospmedical.model.deptdict.DeptDict;
import cn.joinhealth.hospmedical.deptdict.service.DeptDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
@Service(value = "deptDictService")
public class DeptDictServiceImpl implements DeptDictService {
    @Autowired
    private DeptDictMapper deptDictMapper;

    @Override
    public List<DeptDict> selectByDeptCode(String deptCode) {
        return deptDictMapper.selectByDeptCode(deptCode);
    }

    @Override
    public DeptDict selectByDeptIndexNo(String deptIndexNo) {
        return deptDictMapper.selectByDeptIndexNo(deptIndexNo);
    }

    @Override
    public List<DeptDict> selectAll() {
        return deptDictMapper.selectAll();
    }
}