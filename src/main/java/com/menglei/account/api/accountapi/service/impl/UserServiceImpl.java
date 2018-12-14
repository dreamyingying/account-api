package com.menglei.account.api.accountapi.service.impl;

import com.menglei.account.api.accountapi.dao.IUserDAO;
import com.menglei.account.api.accountapi.service.IUserService;
import com.menglei.account.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
  * @className UserServiceImpl
  * @Description TODO
  * @date 2018/12/5 14:59
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public List<User> getUserList() {
        return this.userDAO.findAll(null);
    }
}
