package zhab.config.security;

/**
 * Created by LOG on 2017/3/11.
 * 所有的角色实体都需要继承这个对象
 */
public abstract class AbstractRole {
    /**
     * 获得角色名称,必须唯一
     */
    public abstract String getRoleName();

    /**
     * 获得继承的角色，将获得角色的所有权限
     */
    public abstract AbstractRole getParentRole();
}
