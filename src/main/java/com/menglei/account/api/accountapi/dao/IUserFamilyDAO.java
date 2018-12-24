package com.menglei.account.api.accountapi.dao;

import com.menglei.account.entity.UserFamily;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
  * @className IUserFamilyDAO
  * Description IUserFamilyDAO
  * @author Menglei（lei.meng@cmgplex.com)
  * @date 2018/12/13 16:47
  * @version 1.0
  **/
@Repository
public interface IUserFamilyDAO {

    Integer add(UserFamily userFamily);

    UserFamily getByUserId(Long userId);

    List<UserFamily> getByFamilyId(Long familyId);
}