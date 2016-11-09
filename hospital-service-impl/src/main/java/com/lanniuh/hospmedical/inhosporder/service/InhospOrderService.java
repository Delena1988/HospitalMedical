package com.lanniuh.hospmedical.inhosporder.service;

import com.github.pagehelper.Page;
import com.lanniuh.hospmedical.model.inhosporder.InhospOrder;
import com.lanniuh.hospmedical.model.inhosporder.InhospOrderReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospOrderService {
    Page<InhospOrder> selectByParams(InhospOrderReq inhospOrderReq);
}
