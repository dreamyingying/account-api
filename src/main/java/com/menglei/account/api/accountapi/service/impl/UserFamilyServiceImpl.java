package com.menglei.account.api.accountapi.service.impl;

import com.menglei.account.api.accountapi.dao.IUserFamilyDAO;
import com.menglei.account.api.accountapi.service.IUserFamilyService;
import com.menglei.account.entity.UserFamily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
  * @className UserFamilyServiceImpl
  * Description 用户和家庭关系的业务逻辑
  * @date 2018/12/13 17:34
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@Service("userFamilyService")
public class UserFamilyServiceImpl implements IUserFamilyService {

    @Autowired
    private IUserFamilyDAO userFamilyDAO;

    @Override
    public Boolean add(UserFamily userFamily) {
        return this.userFamilyDAO.add(userFamily)==1;
    }

    @Override
    public UserFamily getByUserId(Long userId) {
        return this.userFamilyDAO.getByUserId(userId);
    }

    @Override
    public List<UserFamily> getByFamilyId(Long familyId) {
        return this.userFamilyDAO.getByFamilyId(familyId);
    }
}
