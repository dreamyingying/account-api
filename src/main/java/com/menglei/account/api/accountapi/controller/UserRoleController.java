package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.service.IUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className UserRoleController
  * Description 用户角色接口
  * @date 2018/12/14 9:59
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/userRole")
public class UserRoleController {
    private Logger log = LoggerFactory.getLogger(UserRoleController.class);

    @Autowired
    private IUserRoleService userRoleService;
}
