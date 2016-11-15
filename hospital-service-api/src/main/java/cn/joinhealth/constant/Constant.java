package cn.joinhealth.constant;

/**
 * Created by linjian
 * 16/11/9.
 */
public class Constant {
    public static final String RESULT_CODE_SUCCESS = "1";//返回代码  成功
    public static final String RESULT_CODE_FAIL = "-1";//返回代码  失败

    public static final String SCHEDULING_AM = "A";//班次 上午
    public static final String SCHEDULING_PM = "P";//班次 下午

    public static final String NO_SOURCE_STATUS_USABLE = "1";//号源状态  可用
    public static final String NO_SOURCE_STATUS_UNUSABLE = "-1";//号源状态  不可用

    public static final String INVALID_FLAG_VALID = "1";//有效
    public static final String INVALID_FLAG_INVALID = "0";//无效

    public static final String REGISTER_HISTORY_STATUS_CANCEL = "-1";//取消预约
    public static final String REGISTER_HISTORY_STATUS_VISIT = "-1";//就诊
    public static final String REGISTER_HISTORY_STATUS_NON_VISIT = "1";//未就诊

    public static final String SCHEDULING_STATUS_CLOSE = "-1";//停诊
    public static final String SCHEDULING_STATUS_OPEN = "1";//就诊

    public static final String VISIT_CARD_TYPE_OUTHOSP = "1";//就诊卡
    public static final String VISIT_CARD_TYPE_INHOSP = "2";//住院卡
    public static final String VISIT_CARD_TYPE_MEDICAL_INSURANCE = "3";//医保卡

    public static final String OI_DEPT_FLAG_OUTHOSP = "1";//门诊
    public static final String OI_DEPT_FLAG_INHOSP = "2";//住院

    public static final String WARD_FLAG_DEPT = "1";//临床科室
    public static final String WARD_FLAG_WARD = "2";//病区
    public static final String WARD_FLAG_OTHERS = "3";//其他

    public static final String DIAG_TYPE_CODE_PRIMARY = "1";//诊断类型代码  主诊断
    public static final String DIAG_TYPE_CODE_SECONDARY = "2";//诊断类型代码  次诊断

    public static final String REFUND_FLAG_REFUND = "1";//退费标志  退费
    public static final String REFUND_FLAG_CHARGE = "0";//退费标志  默认（正常结算）

    public static final String BASE_AUX_DRUG_FLAG_PRIMARY = "1";//主副药标志  主药
    public static final String BASE_AUX_DRUG_FLAG_SECONDARY = "0";//主副药标志  非主药

    public static final String DISCHARGE_ORDER_FLAG_IN = "0";//出院医嘱标志  非出院医嘱
    public static final String DISCHARGE_ORDER_FLAG_OUT = "1";//出院医嘱标志  出院医嘱

    public static final String INHOSP_STATUS_OUT = "1";//在院状态  出院
    public static final String INHOSP_STATUS_IN = "2";//在院状态  在院

    public static final String SELF_DRUG_FLAG_SELF = "1";//自备药标志  自备药
    public static final String SELF_DRUG_FLAG__NOT_SELF = "0";//自备药标志  非自备药

    public static final String GROUP_FLAG_GROUP = "1";//成组标志  成组
    public static final String GROUP_FLAG__NOT_GROUP = "0";//成组标志  不成组

    public static final String CHARGE_FLAG_CHARGED = "1";//收费标志  已收费
    public static final String CHARGE_FLAG_NOT_CHARGED = "0";//收费标志  未收费

    public static final String VALUATION_FLAG_VALUATION = "1";//计价标志  计价
    public static final String VALUATION_FLAG_NOT_VALUATION = "0";//计价标志  未计价

    public static final String EXAM_TYPE_PERSON = "1";//体检类别  个人
    public static final String EXAM_TYPE_GROUP = "2";//体检类别  团体

    public static final String MICROBE_TEST_FLAG_MICROBE = "1";//微生物检验标志  微生物
    public static final String MICROBE_TEST_FLAG_NOT_MICROBE = "0";//微生物检验标志  非微生物

}
