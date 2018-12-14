package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.service.IFamilyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className FamilyController
  * Description 家庭接口
  * @date 2018/12/14 9:43
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/family")
public class FamilyController {
    private Logger log = LoggerFactory.getLogger(FamilyController.class);

    @Autowired
    private IFamilyService familyService;
}
