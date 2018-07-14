package com.redteamobile.dolphin.commons.constant;

public class ErrorCode {

    public static final String UNKNOWN_ISSUE = "RT_ERROR_000";

    /****** validation related error code, starting with 0 ******/
    // Token submitted with the body is invalid
    public final static String INVALID_TOKEN_SUBMITTED = "RT_ERROR_001";
    // No md5sum on header of request
    public final static String NO_SIGNATURE_FOUND_ON_HEADER = "RT_ERROR_002";
    // Failed on md5sum check
    public final static String FAILED_ON_SIGNATURE_CHECK = "RT_ERROR_003";
    // Missing fields in request body
    public final static String MISSING_FIELDS_IN_REQUEST = "RT_ERROR_004";
    // Missing initToken in request
    public final static String MISSING_TOKEN_IN_REQUEST = "RT_ERROR_005";
    // Failed on token check
    public final static String FAILED_ON_TOKEN_CHECK = "RT_ERROR_006";

    /***************************************************************/

    /****** device related error code, starting with 1 ******/

    // The given device id and token does not match what we have in database
    public final static String DEVICE_TOKEN_MISMATCH = "RT_ERROR_101";
    // The given device id does not exist in our database
    public final static String DEVICE_ID_NOT_RECOGNIZED = "RT_ERROR_102";

    /***************************************************************/

    /****** location related error code, starting with 2 ******/

    // The given agent is not assigned with any location
    public final static String NO_LOCATION_FOR_THIS_AGENT = "RT_ERROR_201";

    /***************************************************************/

    /****** data plan related error code, starting with 3 ******/

    // The data plan does not exist or is not in status active.
    public final static String DATA_PLAN_NOT_EXISTS = "RT_ERROR_301";
    // Does not find any data plan that is available to return
    public final static String NO_AVAILABLE_DATA_PLAN = "RT_ERROR_302";
    // Dataplan has no more inventory
    public final static String DATA_PLAN_HAS_NO_MORE_INVENTORY = "RT_ERROR_303";

    public final static String PURCHASED_DAY_INVALID = "RT_ERROR_304";
    /***************************************************************/

    /****** order related error code, starting with 4 ******/

    // The given orderId not exist
    public final static String ORDER_NOT_EXIST = "RT_ERROR_401";
    // The given order's status is invalid
    public final static String INVALID_ORDER_STATUS = "RT_ERROR_402";
    // The given order's parameter is not valid
    public final static String PARAMETER_NOT_VALID = "RT_ERROR_403";

    public final static String NO_VALID_ORDER = "RT_ERROR_404";

    public final static String CHANNEL_ORDER_FAIL = "RT_ERROR_405";

    /***************************************************************/

    /****** Web Serivce related error code, starting with 5 *********/

    // exception happened on web service
    public final static String EXCEPTION_ON_WEBSERVICE = "RT_ERROR_501";
    // success field is false on return
    public final static String WEBSERVIE_RETURN_FALSE = "RT_ERROR_502";

    /***************************************************************/

    /****** imsi related error code, starting with 6 ******/

    public final static String NO_AVAILABLE_IMSI = "RT_ERROR_601";
    public final static String FAILED_ON_ENCRYPTION = "RT_ERROR_602";
    public final static String IMSI_NOT_RECORDED = "RT_ERROR_603";

    /***************************************************************/

    /****** imsi management impl related error code, starting with 7 ******/

    public final static String NO_IMSI_TRANSACION_EXIST = "RT_ERROR_701";
    public final static String WRONG_IMSI_TRANSACTION = "RT_ERROR_702";
    public final static String NO_IMSI_PROFILE_EXIST = "RT_ERROR_703";
    public final static String OPERATOR_RETURN_FALSE = "RT_ERROR_704";
    public final static String IMSI_ALREADY_ACTIVATED = "RT_ERROR_705";
    public final static String INVALID_MERCHANT_CODE = "RT_ERROR_706";

    /***************************************************************/

    public final static String NO_REAL_NAME_AUTHENTICATION = "RT_ERROR_505";
    public final static String DATA_PLAN_WITHOUT_BUNDLE = "RT_ERROR_506";

    public final static String ENCRYPT_ERROR = "RT_ERROR_2002";

    public final static String BUNDLE_ACTIVE_FAIL = "RT_ERROR_507";

}
