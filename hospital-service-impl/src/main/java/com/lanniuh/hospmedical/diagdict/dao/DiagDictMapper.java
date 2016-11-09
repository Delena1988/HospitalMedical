package com.lanniuh.hospmedical.diagdict.dao;


import com.lanniuh.hospmedical.model.diagdict.DiagDict;

import java.util.List;

public interface DiagDictMapper {
    List<DiagDict> selectAll();
}