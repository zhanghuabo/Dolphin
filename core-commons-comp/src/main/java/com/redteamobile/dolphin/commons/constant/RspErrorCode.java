package com.redteamobile.dolphin.commons.constant;

public class RspErrorCode {
    // 未知错误
    public static final String UNKNOW_ERROR = "RT_ERROR_000";
    //申请资源失败
    public static final String APPLY_TRANSACTION_FAIL = "RT_ERROR_601";
    //申请资源时的加密密钥错误
    public static final String APPLY_TRANSACTION_ENCRYPT_FAIL = "RT_ERROR_602";
    // 申请资源已达上限
    public static final String APPLY_TRANSACTION_EXCEED_UPPER_LIMIT_FAIL = "RT_ERROR_603";
    //同一个muid正在申请资源导致本次请求失败
    public static final String COMMENT_MUID_APPLY_TRANSACTION_FAIL = "RT_ERROR_604";
    //transaction不存在
    public static final String TRANSACTION_NOT_EXIST = "RT_ERROR_701";
    //错误的transaction
    public static final String TRANSACTION_ERROR = "RT_ERROR_702";
    // imsi 不存在
    public static final String IMSI_NOT_EXIST = "RT_ERROR_703";
    //运营商返回异常
    public static final String OPERATOR_RETURN_EXCEPTION_ = "RT_ERROR_704";
    //imsi已经激活
    public static final String IMSI_ALREADY_ACTIVED = "RT_ERROR_705";
    // merchant不存在
    public static final String MERCHANT_NOT_EXIST = "RT_ERROR_706";
    //不支持更换Key
    public static final String NOT_SUPPORT_CHANGE_KEY = "RT_ERROR_707";
    //merchant与imsi不匹配
    public static final String MERCHANT_IMSI_NOT_MATCH = "RT_ERROR_708";
    //当前imsi没有已经激活的transaction
    public static final String IMSI_NOT_EXIST_ACTIVED_TRANSACTION = "RT_ERROR_709";
    //无法回收Imsi Profile
    public static final String RECYCLE_IMSI_FAIL = "RT_ERROR_712";
    //bundle列表不符合预期
    public static final String BUNDLE_LIST_NOT_EXPECT = "RT_ERROR_714";

    public static final String GET_BUNDLE_FAIL = "RT_ERROR_4001";

    public static final String CARRIER_NOT_SUPPORTED = "RT_ERROR_801";
    public static final String ID_APPLY_IMSI_MAX_COUNT = "RT_ERROR_803";
}
