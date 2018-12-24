package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.common.JsonResult;
import com.menglei.account.api.accountapi.exception.NoDataException;
import com.menglei.account.api.accountapi.exception.UnknownException;
import com.menglei.account.api.accountapi.service.IFamilyService;
import com.menglei.account.entity.Family;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/add")
    public JsonResult<Boolean> addFamily(@RequestBody Family family)throws UnknownException {
        log.info("【 start execute addFamily，family={} 】",family);
        JsonResult<Boolean> jr = new JsonResult<>();
        try {
            Boolean b = this.familyService.add(family);
            jr.setData(b);
            if (b){
                jr.setMessage("新增Family成功");
                jr.setCode("8200");
            }else {
                jr.setMessage("新增Family失败");
                jr.setCode("8299");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        } finally {
            log.info("【 end execute addFamily，family={} 】",family);
        }
        return jr;
    }

    @GetMapping(value = "/byId/{id}")
    public JsonResult<Family> getFamilyById(@PathVariable(value = "id")Long id)throws NoDataException,UnknownException {
        log.info("【 start execute getFamilyById，id={} 】",id);
        JsonResult<Family> jr = new JsonResult<>();
        try {
            Family family = this.familyService.getById(id);
            if (null == family) {
                throw new NoDataException("未发现符合条件的数据");
            }
            jr.setData(family);
            jr.setMessage("获取Family数据成功");
            jr.setCode("8200");
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        } finally {
            log.info("【 end execute getFamilyById，id={} 】",id);
        }
        return jr;
    }

    @PostMapping(value = "/update")
    public JsonResult<Boolean> updateFamily(@RequestBody Family family)throws UnknownException{
        log.info("【 start execute updateFamily，family={} 】",family);
        JsonResult<Boolean> jr = new JsonResult<>();
        try {
            Boolean b = this.familyService.update(family);
            jr.setData(b);
            if(b){
                jr.setCode("8299");
                jr.setMessage("修改家庭信息失败");
            }else {
                jr.setMessage("修改家庭信息成功");
                jr.setCode("8200");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            log.info("【 end execute updateFamily，family={} 】",family);
        }
        return jr;
    }
}
