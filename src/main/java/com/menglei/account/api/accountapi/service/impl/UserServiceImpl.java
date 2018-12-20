package com.menglei.account.api.accountapi.service.impl;

import com.menglei.account.api.accountapi.common.BizData4PageAdminBuilder;
import com.menglei.account.api.accountapi.dao.IUserDAOI;
import com.menglei.account.api.accountapi.service.IUserService;
import com.menglei.account.entity.BizData4PageAdmin;
import com.menglei.account.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private IUserDAOI userDAO;

    @Override
    public List<User> getUserList() {
        return this.userDAO.findAll(null);
    }

    @Override
    public BizData4PageAdmin<User> getUserListPage(Integer pageNumber, Integer pageSize) {
        Map<String,Object> condition = new HashMap<>();
        BizData4PageAdmin<User> biz = BizData4PageAdminBuilder.simpleBuilder(this.userDAO, condition, pageNumber=null==pageNumber?1:pageNumber, pageSize=null==pageSize?20:pageSize);
        return biz;
    }

    @Override
    public User getById(Long id) {
        return this.userDAO.findById(id);
    }

    @Override
    public Boolean update(User user) {
        String userName = "ml";
        user.setUpdater(userName);
        user.setUpdateTime(System.currentTimeMillis());
        return this.userDAO.update(user)==1;
    }

    @Override
    public Boolean del(User user) {
        user.setStatus((byte) 99);
        return this.update(user);
    }

    @Override
    public Boolean add(User user) {
        String userName = "ml";
        user.setCreator(userName);
        user.setCreateTime(System.currentTimeMillis());
        user.setUpdater(userName);
        user.setUpdateTime(user.getCreateTime());
        user.setStatus((byte) 1);
        return this.userDAO.insert(user)==1;
    }

    @Override
    public User login(String userName, String password) {
        Map<String,Object> condition = new HashMap<>(3);
        condition.put("userName",userName);
        condition.put("password",password);
        condition.put("status",(byte)1);
        User user = this.userDAO.queryOne(condition);
        if (null == user){
            Map<String,Object> map = new HashMap<>(3);
            map.put("telephone",userName);
            condition.put("password",password);
            condition.put("status",(byte)1);
            return this.userDAO.queryOne(map);
        }
        return user;
    }

    @Override
    public List<User> getUserListByProperty(String property, Object value) {
        return this.userDAO.findListByProperty(property,value);
    }
}
