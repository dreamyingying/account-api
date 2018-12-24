package com.menglei.account.api.accountapi.service.impl;

import com.menglei.account.api.accountapi.dao.IFamilyDAO;
import com.menglei.account.api.accountapi.service.IFamilyService;
import com.menglei.account.entity.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
  * @className FamilyServiceImpl
  * Description 家庭业务逻辑类
  * @date 2018/12/13 17:21
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@Service("familyService")
public class FamilyServiceImpl implements IFamilyService {

    @Autowired
    private IFamilyDAO familyDAO;

    @Override
    public Boolean add(Family family) {
        return this.familyDAO.insert(family)==1;
    }

    @Override
    public Family getById(Long id) {
        return this.familyDAO.findById(id);
    }

    @Override
    public Boolean update(Family family) {
        return this.familyDAO.update(family)==1;
    }
}
