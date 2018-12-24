package com.menglei.account.api.accountapi.service;

import com.menglei.account.entity.Family;

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
}