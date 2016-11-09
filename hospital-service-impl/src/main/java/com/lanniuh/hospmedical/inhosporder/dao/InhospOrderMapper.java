package com.lanniuh.hospmedical.inhosporder.dao;


import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.inhosporder.InhospOrder;
import com.lanniuh.hospmedical.model.inhosporder.InhospOrderReq;

public interface InhospOrderMapper {
    Page<InhospOrder> selectByParams(InhospOrderReq inhospOrderReq);
}