package com.lanniuh.hospmedical.deptdict.dao;


import com.lanniuh.hospmedical.model.deptdict.DeptDict;

import java.util.List;

public interface DeptDictMapper {
    List<DeptDict> selectByDeptCode(String deptCode);

    DeptDict selectByDeptIndexNo(String deptIndexNo);

    List<DeptDict> selectAll();
}