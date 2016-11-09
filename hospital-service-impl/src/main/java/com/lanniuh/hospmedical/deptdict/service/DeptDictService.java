package com.lanniuh.hospmedical.deptdict.service;


import com.lanniuh.hospmedical.model.deptdict.DeptDict;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface DeptDictService {
    List<DeptDict> selectByDeptCode(String deptCode);

    DeptDict selectByDeptIndexNo(String deptIndexNo);

    List<DeptDict> selectAll();
}
