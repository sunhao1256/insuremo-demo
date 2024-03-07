package com.ebao.cloud.error;


import com.insuremo.appframework.exception.ExceptionCode;

public class ErrorConstants {

    //200 - success
    //301 - Auth
    //403 - Forbidden
    //500 - ServerError / Need IT guys to handle
    //422 - Need end-user to handle, e.g. invalid IdNo.. underwriting message

    // common
    public static final ExceptionCode INTERNAL_SERVER_ERROR = new ExceptionCode("INTERNAL_SERVER_ERROR", "Internal server error: {}.");

    public static final ExceptionCode MISSING_PARAMETER = new ExceptionCode("MISSING_PARAMETER", "Missing parameter: {}.");
    public static final ExceptionCode INVALID_PARAMETER = new ExceptionCode("INVALID_PARAMETER", "Invalid parameter: {}.");
    
    public static final ExceptionCode INVALID_DATA_TABLE_NAME = new ExceptionCode("INVALID_DATATABLE_NAME", "Invalid DataTableName: {}.");

    // business exception
    // The effective date cannot be {} year(s) later
    public static final String PROPOSAL_RULE_10001 = "EBAO-TENANT-BFF-B10001";

    // Users cannot start more than {} proposals across all products at a time
    public static final String PROPOSAL_CREATION_RULE_10001 = "TENANT-BFF-MSG-B1001";

}
