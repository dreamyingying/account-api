package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.service.IBillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className BillController
  * Description 账单对外接口
  * @date 2018/12/13 17:41
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/bill")
public class BillController {
    private Logger log = LoggerFactory.getLogger(BillController.class);

    @Autowired
    private IBillService billService;
}
