package com.redteamobile.dolphin.commons.constant;

public class ServiceConstant {

    public static final String VERSION = "1.0";

    /** 请求中的header或者cookie的字段约定 */
    public static class RequestHeaderNames {

        /** i18n当中，客户端设置的语言header字段 */
        public static final String ACCEPT_LANGUAGE_HEADER_NAME = "Accept-Language";

        /** 目前加密策略的字段 */
        public static final String MD5CHECK_SUM_HEADER_NAME = "md5sum";

    }

    /** 各个接口当中的请求的参数名 */
    public static class RequestParamsNames {

        /** 手机的设备id,目前作为我们账号系统的唯一标识符号标识用户 */
        public static final String DEVICE_ID = "deviceId";

        /** 设备的token */
        public static final String DEVICE_TOKEN = "token";

        /** 操作系统平台 ios/android */
        public static final String APP_OS = "os";

        /** 目前是用agentId来区分我们预装的手机厂商，实际上，我们用它来作为我们app发布渠道的各种类型,包括应用市场 */
        public static final String APP_AGENT_ID = "agentId";

        /** initialize token **/
        public static final String INIT_TOKEN = "initToken";

        /** sim卡合作商标识 */
        public static final String SIMCARD_COLLABORATOR = "collaborator";

        /** sim卡合作商的用户标识 */
        public static final String SIMCARD_COLLABORATOR_USER_ID = "collaboratorUserId";

        /** sim卡上的puk */
        public static final String PUK_VALUE = "pukValue";

        /** sim卡上的iccid,这个是可选参数，后面最好做成不同合作商使用不同的service */
        public static final String ICCID_KEY = "iccid";

        /** orderId for iOS app */
        public static final String ORDER_ID = "orderId";

        /** requestId sent to RPS */
        public static final String REQUEST_ID = "RequestID";

        /** the result of the provision */ 
        public static final String UPDATE_RESULT = "update-result";

        /** user id */
        public static final String  UID = "uid";

        /** imsi */
        public static final String IMSI = "imsi";

        /** couponCode */
        public static final String COUPON_CODE = "couponCode";

        /** discountPlanId */
        public static final String DISCOUNT_PLAN_ID = "discountPlanId";

        /** model */
        public static final String MODEL = "model";
    }

    /** 各个接口中返回值的参数名称 */
    public static class ResponseParamsNames {

        /** 请求处理结果 */
        public static final String REQUEST_OPREATION_RESULT = "success";

        /** 目前发布的最新的app版本号信息 */
        public static final String LATEST_APP_VERSION = "latestVersion";

        /** 最新版本app下载地址 */
        public static final String LATEST_VERSION_DOWNLOAD_URL = "downloadUrl";

        /** 新版本功能特性描述 */
        public static final String LATEST_VERSION_DESCRIPTION = "description";

        public static final String SPLASH_PAGE_UPDATE = "hasUpdate";

        public static final String SPLASH_PAGE_URL = "pageUrl";

        /** sim卡版本app的硬件id */
        public static final String CARD_DEVICE_ID = "cardDeviceId";

        /** redtea account的统一用户标识id */
        public static final String REDTEA_ACCOUNT_UID = "uid";

        /** 登录sim卡版本app的硬件token */
        public static final String CARD_DEVICE_TOKEN = "token";

    }

    /** 有些参数，比如加密方式，需要单独指定值 */
    public static class RequestParamsValues {

        /** 红茶移动自己官方发布的版本agentId = 5 */
        public static final int REDTEA_OFFICIAL_APP_AGENT_ID = 5;
    }
}
