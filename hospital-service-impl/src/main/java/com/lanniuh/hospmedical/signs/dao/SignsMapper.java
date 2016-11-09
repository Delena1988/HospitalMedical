package com.lanniuh.hospmedical.signs.dao;


import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.signs.Signs;
import com.lanniuh.hospmedical.model.signs.SignsReq;

import java.util.List;

public interface SignsMapper {
    List<Signs> selectByParamsUnpaged(SignsReq signsReq);
    Page<Signs> selectByParamsPaged(SignsReq signsReq);
}