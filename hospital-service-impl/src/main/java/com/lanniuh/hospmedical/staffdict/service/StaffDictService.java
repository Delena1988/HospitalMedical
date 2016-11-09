package com.lanniuh.hospmedical.staffdict.service;


import com.lanniuh.hospmedical.model.staffdict.StaffDict;

import java.util.List;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface StaffDictService {
    List<StaffDict> selectAll();
}
