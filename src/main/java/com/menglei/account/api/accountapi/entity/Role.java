package com.menglei.account.api.accountapi.entity;/**
  * @className Role
  * Description 角色实体
  * @date 2018/12/13 12:01
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class Role extends BaseEntity{
    private static final long serialVersionUID = 7198338075885358733L;

    /**
     * 角色名
     */
    private String name;

    /**
     * 角色key
     */
    private String roleKey;

    /**
     * 状态
     */
    private Byte status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", roleKey='" + roleKey + '\'' +
                ", status=" + status +
                "} " + super.toString();
    }
}
