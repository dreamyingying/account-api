package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.common.JsonResult;
import com.menglei.account.api.accountapi.common.enums.RetCodeEnum;
import com.menglei.account.api.accountapi.exception.NoDataException;
import com.menglei.account.api.accountapi.exception.UnknownException;
import com.menglei.account.api.accountapi.service.IUserService;
import com.menglei.account.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
  * @className UserController
  * @Description TODO
  * @date 2018/12/5 15:00
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/user")
public class UserController {
    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/list")
    public JsonResult<List<User>> getUserList()throws NoDataException,UnknownException {
        log.info("【 start execute getUserList 】");
        JsonResult<List<User>> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            List<User> userList = this.userService.getUserList();
            if (null == userList || userList.size() == 0) {
                throw new NoDataException();
            }
            jr.setData(userList);
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        }finally {
            log.info("【 end execute getUserList 】");
        }
        return jr;
    }
}
