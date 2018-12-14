package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.service.IUserFamilyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className UserFamilyController
  * Description 用户家庭接口
  * @date 2018/12/14 9:57
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/userFamily")
public class UserFamilyController {
    private Logger log = LoggerFactory.getLogger(UserFamilyController.class);

    @Autowired
    private IUserFamilyService userFamilyService;
}
