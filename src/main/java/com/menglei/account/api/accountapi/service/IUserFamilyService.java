package com.menglei.account.api.accountapi.service;

import com.menglei.account.entity.UserFamily;

import java.util.List;

/**
  * @className IUserFamilyService
  * Description IUserFamilyService
  * @author Menglei（lei.meng@cmgplex.com)
  * @date 2018/12/13 17:33
  * @version 1.0
  **/
public interface IUserFamilyService {

    /**
      * Description 新增
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 13:44 2018/12/24
      * @param
      * @return
      **/
    Boolean add(UserFamily userFamily);

    /**
      * Description 获取此用户的家庭信息
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 13:44 2018/12/24
      * @param
      * @return
      **/
    UserFamily getByUserId(Long userId);

    /**
      * Description 获取家庭所有成员信息
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 13:45 2018/12/24
      * @param
      * @return
      **/
    List<UserFamily> getByFamilyId(Long familyId);
}