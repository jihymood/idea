package zhab.util;

public class ConstantUtils {
    public static final String DATA_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATA_FORMAT2 = "yyyy-MM-dd";

    public static class UserRole {
        public static final String INTERNAL_STAFF = "0";

        public static final String OUT_MANAGER = "1";

        public static final String OUT_STAFF = "2";
    }

    public static class MissionType {
        //待办
        public static final int PENDING = 0;
        //在办
        public static final int HANDLING = 1;
        //未处理
        public static final int UNTREATED = 2;
        //已处理
        public static final int TREATED = 3;
        //我的上报
        public static final int MY_REPORT = 4;
    }
}
