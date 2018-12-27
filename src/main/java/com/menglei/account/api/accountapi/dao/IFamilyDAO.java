package com.menglei.account.api.accountapi.dao;

import com.menglei.account.entity.Family;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
  * @className IFamilyDAOI
  * Description 家庭DAO
  * @author Menglei（lei.meng@cmgplex.com)
  * @date 2018/12/13 16:35
  * @version 1.0
  **/
@Repository
public interface IFamilyDAO extends IBaseDAO<Family> {

    Family getByPassword(@Param(value = "id")Long id,@Param(value = "password")String password);
}