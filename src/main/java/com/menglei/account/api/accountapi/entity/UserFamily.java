package com.menglei.account.api.accountapi.entity;

import java.io.Serializable;

/**
  * @className UserFamily
  * Description UserFamily
  * @date 2018/12/13 16:45
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
public class UserFamily implements Serializable {

    private static final long serialVersionUID = 7463689504228403004L;

    private Long userId;
    private Long familyId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Long familyId) {
        this.familyId = familyId;
    }

    @Override
    public String toString() {
        return "UserFamily{" +
                "userId=" + userId +
                ", familyId=" + familyId +
                '}';
    }
}
