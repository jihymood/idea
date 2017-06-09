package zhab.util;

/**
 * Created by LOG on 2017/4/5.
 */
public class Constant {


    public static String qz = "";

    private static String URL_DB = "/%sweboa/system/taskbox.nsf/WebUnProcessedTask?OpenForm";

    private static String URL_ZB = "/%sweboa/system/taskbox.nsf/WebProcessingTask?OpenForm";


    public static String URL_AB = "http://132.228.226.11:80/NewSecurity";

    /**
     * @param domain2 domain第一个点前面的
     * @return
     */
    public static String URL_DB(String domain2) {
        return String.format(URL_DB, domain2);
    }

    /**
     * @param domain2 domain第一个点前面的
     * @return
     */
    public static String URL_ZB(String domain2) {
        return String.format(URL_ZB, domain2);
    }


    public static String OA_SESSION_COOKIE_VALUE = "OA_SESSION_COOKIE_VALUE";
    public static String OA_SESSION_COOKIE_KEY = "OA_SESSION_COOKIE_KEY";
    public static String OA_SESSION_DOMAIN = "OA_SESSION_DOMAIN";
    public static String SYSTEM_CURRENT_DISPATCH_URL = "SYSTEM_CURRENT_DISPATCH_URL";

    public static String SYSTEM_CURRENT_DOCID = "SYSTEM_CURRENT_DOCID";
    public static String SYSTEM_CURRENT_DBPATH = "SYSTEM_CURRENT_DBPATH";
    public static String SYSTEM_CURRENT_DBSERVER = "SYSTEM_CURRENT_DBSERVER";
    public static String SYSTEM_CURRENT_PORTAL_ID = "SYSTEM_CURRENT_PORTAL_ID";


    public static String SYSTEM_CURRENT_YQJ_REQUEST_URL = "SYSTEM_CURRENT_YQJ_REQUEST_URL";


    public static String SYSTEM_USER_NAME = "SYSTEM_USER_NAME";
    public static String SYSTEM_USER_COMPANY_CODE = "SYSTEM_USER_COMPANY_CODE";
    public static String SYSTEM_USER_COMPANY_NAME= "SYSTEM_USER_COMPANY_NAME";

    public static String OA_SESSION_SUB_COMPANY = "OA_SESSION_SUB_COMPANY";
    public static String OA_SESSION_COMPANY = "OA_SESSION_COMPANY";


    public static String SYSTEM_CURRENT_DUTY_DEPT_URL = "SYSTEM_CURRENT_DUTY_DEPT_URL";
    public static String SYSTEM_CURRENT_DUTY_PERSON_URL = "SYSTEM_CURRENT_DUTY_PERSON_URL";


    public static String OA_LOGIN_URL= "http://132.228.213.42:8089/YouxinInterface/mobilelogin?loginname=%s&password=%s";



}
