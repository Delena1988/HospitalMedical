package cn.joinhealth.hospmedical.inhosporder.service;

import com.github.pagehelper.Page;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrder;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrderReq;

/**
 * Created by linjian
 * 16/11/4.
 */
public interface InhospOrderService {
    Page<InhospOrder> selectByParams(InhospOrderReq inhospOrderReq);
}
