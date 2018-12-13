package com.menglei.account.api.accountapi.entity;

import java.io.Serializable;

/**
  * @className RoleResource
  * @Description RoleResource实体
  * @date 2018/12/13 12:17
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class RoleResource implements Serializable {
    private static final long serialVersionUID = 905535501972499403L;

    private Long roleId;
    private Long resourceId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "RoleResource{" +
                "roleId=" + roleId +
                ", resourceId=" + resourceId +
                '}';
    }
}
