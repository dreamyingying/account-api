package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.service.IResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className ResourceController
  * @Description 资源接口
  * @date 2018/12/14 9:49
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/resource")
public class ResourceController {
    private Logger log = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    private IResourceService resourceService;
}
