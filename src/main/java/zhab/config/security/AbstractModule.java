package zhab.config.security;

import java.util.List;

/**
 * Created by LOG on 2017/3/11.
 * 需要对URL进行权限判断的对象都需要继承这个对象
 */
public abstract class AbstractModule {


    /**
     * 从属Module
     */
    public abstract AbstractModule getParentModule();
    /**
     * Module的URL
     */

    public abstract String getUrl();
    /**
     * Module的名称
     */

    public abstract String getModuleName();
    /**
     * Module的角色
     */

    public abstract List<? extends AbstractRole> getRoles();

    /**
     * 获得当前模块的权限表达式
     * @return 表达式
     */
    public String getSecrityExpress() {
        StringBuilder result = new StringBuilder();
        result.append("hasAnyRole(");
        List<? extends AbstractRole> roles = getRoles();
        if (roles != null && roles.size() > 0) {
            for (AbstractRole role : roles) {
                result.append("'ROLE_" + role.getRoleName());
                result.append("',");
            }
        }
        result.deleteCharAt(result.length() - 1);
        result.append(")");
        return result.toString();
    }
}
