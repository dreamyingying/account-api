package com.menglei.account.api.accountapi.service;

import com.menglei.account.entity.Family;

import java.util.List;

/**
  * @className IFamilyService
  * Description IFamilyService
  * @author Menglei（lei.meng@cmgplex.com)
  * @date 2018/12/13 17:20
  * @version 1.0
  **/
public interface IFamilyService {

    /**
      * Description 新增家庭
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:49 2018/12/24
      * @param
      * @return
      **/
    Boolean add(Family family);

    /**
      * Description id获取家庭
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:50 2018/12/24
      * @param
      * @return
      **/
    Family getById(Long id);

    /**
      * Description 修改家庭信息
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 14:50 2018/12/24
      * @param
      * @return
      **/
    Boolean update(Family family);

    /**
      * Description 获取所有的家庭
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 16:38 2018/12/25
      * @param
      * @return
      **/
    List<Family> findAll();

    /**
      * Description 通过id和密码获取家庭信息
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 17:10 2018/12/25
      * @param
      * @return
      **/
    Family getByPassword(Long id,String password);

    /**
      * Description 通过名称获取家庭信息
      * @author Menglei（lei.meng@cmgplex.com)
      * @date 22:50 2018/12/25
      * @param
      * @return
      **/
    Family getByName(String name);
}