package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.service.IRoleResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className RoleResourceController
  * Description 角色资源接口
  * @date 2018/12/14 9:54
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/roleResource")
public class RoleResourceController {
    private Logger log = LoggerFactory.getLogger(RoleResourceController.class);

    @Autowired
    private IRoleResourceService roleResourceService;
}
