package com.menglei.account.api.accountapi.service;

import com.menglei.account.entity.User;

import java.util.List;

/**
  * @className IUserService
  * @Description TODO
  * @author Menglei（lei.meng@cmgplex.com)
  * @date 2018/12/5 14:57
  * @version 1.0
  **/
public interface IUserService {

    /**
      * Description 获取所有用户信息（测试）
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:58 2018/12/5
      * @param
      * @return
      **/
    List<User> getUserList();
}