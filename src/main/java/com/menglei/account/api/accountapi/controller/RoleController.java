package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.service.IRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className RoleController
  * @Description TODO
  * @date 2018/12/14 9:50
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/role")
public class RoleController {
    private Logger log = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private IRoleService roleService;
}
