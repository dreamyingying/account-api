package com.menglei.account.api.accountapi.service.impl;

import com.menglei.account.api.accountapi.dao.IFamilyDAO;
import com.menglei.account.api.accountapi.dao.IUserFamilyDAO;
import com.menglei.account.api.accountapi.service.IFamilyService;
import com.menglei.account.entity.Family;
import com.menglei.account.entity.UserFamily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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
    @Autowired
    private IUserFamilyDAO userFamilyDAO;

    @Override
    public Boolean add(Family family) {
        family.setCreateTime(System.currentTimeMillis());
        family.setUpdateTime(family.getCreateTime());
        family.setDescription(family.getAddress());
        family.setStatus((byte)1);
        BigDecimal bigDecimal = new BigDecimal(0);
        family.setDeposit(bigDecimal);
        family.setReceivable(bigDecimal);
        family.setPayable(bigDecimal);
        int i = this.familyDAO.insert(family);
        if (1==i){
            UserFamily userFamily = new UserFamily();
            userFamily.setFamilyId(family.getId());
            userFamily.setUserId(family.getUserId());
            return this.userFamilyDAO.add(userFamily)==1;
        }
        return false;
    }

    @Override
    public Family getById(Long id) {
        return this.familyDAO.findById(id);
    }

    @Override
    public Boolean update(Family family) {
        return this.familyDAO.update(family)==1;
    }

    @Override
    public List<Family> findAll() {
        return this.familyDAO.findAll(null);
    }

    @Override
    public Family getByPassword(Long id, String password) {
        return this.familyDAO.getByPassword(id,password);
    }

    @Override
    public Family getByName(String name) {
        return this.familyDAO.findByProperty("name",name);
    }
}
