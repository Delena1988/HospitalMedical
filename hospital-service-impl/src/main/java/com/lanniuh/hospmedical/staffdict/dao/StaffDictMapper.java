package com.lanniuh.hospmedical.staffdict.dao;


import com.lanniuh.hospmedical.model.staffdict.StaffDict;

import java.util.List;

public interface StaffDictMapper {
    List<StaffDict> selectAll();
}