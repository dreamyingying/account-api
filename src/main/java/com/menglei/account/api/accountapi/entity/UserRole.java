package com.menglei.account.api.accountapi.entity;

import java.io.Serializable;

/**
  * @className UserRole
  * @Description UserRole实体
  * @date 2018/12/13 12:05
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class UserRole implements Serializable {
    private static final long serialVersionUID = -8466982747017568892L;

    private Long userId;
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
