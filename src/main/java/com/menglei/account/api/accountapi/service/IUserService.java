package com.menglei.account.api.accountapi.service;

import com.menglei.account.entity.BizData4PageAdmin;
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

    /**
      * Description 分页获取用户列表
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 11:44 2018/12/18
      * @param
      * @return BizData4PageAdmin
      **/
    BizData4PageAdmin<User> getUserListPage(Integer pageNumber,Integer pageSize);

    /**
      * Description 主键获取用户信息
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:44 2018/12/18
      * @param
      * @return user
      **/
    User getById(Long id);

    /**
      * Description 修改用户信息
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:36 2018/12/18
      * @param
      * @return boolean
      **/
    Boolean update(User user);

    /**
      * Description 删除用户
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:36 2018/12/18
      * @param
      * @return boolean
      **/
    Boolean del(User user);

    /**
      * Description 新增用户
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:37 2018/12/18
      * @param
      * @return Boolean
      **/
    Boolean add(User user);

    /**
      * Description 用户登陆
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 10:00 2018/12/20
      * @param
      * @return User
      **/
    User login(String userName,String password);

    /**
      * Description 单条件获取用户信息
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 10:14 2018/12/20
      * @param
      * @return List<User>
      **/
    List<User> getUserListByProperty(String property,Object value);
}