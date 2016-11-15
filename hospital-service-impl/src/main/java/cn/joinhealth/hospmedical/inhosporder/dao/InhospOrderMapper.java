package cn.joinhealth.hospmedical.inhosporder.dao;


import cn.joinhealth.hospmedical.model.inhosporder.InhospOrder;
import cn.joinhealth.hospmedical.model.inhosporder.InhospOrderReq;
import com.github.pagehelper.Page;

;

public interface InhospOrderMapper {
    Page<InhospOrder> selectByParams(InhospOrderReq inhospOrderReq);
}