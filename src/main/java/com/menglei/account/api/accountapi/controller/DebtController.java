package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.service.IDebtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className DebtController
  * Description 债务接口
  * @date 2018/12/14 9:35
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/debt")
public class DebtController {
    private Logger log = LoggerFactory.getLogger(DebtController.class);

    @Autowired
    private IDebtService debtService;
}
