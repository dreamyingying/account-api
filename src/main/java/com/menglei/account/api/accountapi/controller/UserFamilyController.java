package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.common.JsonResult;
import com.menglei.account.api.accountapi.exception.NoDataException;
import com.menglei.account.api.accountapi.exception.UnknownException;
import com.menglei.account.api.accountapi.service.IUserFamilyService;
import com.menglei.account.entity.UserFamily;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping(value = "/add")
    public JsonResult<Boolean> addUserFamily(@RequestBody UserFamily userFamily)throws UnknownException{
        log.info("【 start execute addUserFamily，userFamily={} 】",userFamily);
        JsonResult<Boolean> jr = new JsonResult<>();
        try {
            Boolean b = this.userFamilyService.add(userFamily);
            jr.setData(b);
            if (b){
                jr.setMessage("新增UserFamily成功");
                jr.setCode("8200");
            }else {
                jr.setMessage("新增UserFamily失败");
                jr.setCode("8299");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        } finally {
            log.info("【 end execute addUserFamily，userFamily={} 】",userFamily);
        }
        return jr;
    }

    @GetMapping(value = "/byUserId/{userId}")
    public JsonResult<UserFamily> getUserFamilyByUserId(@PathVariable(value = "userId")Long userId)throws NoDataException,UnknownException {
        log.info("【 start execute getUserFamilyByUserId，userId={} 】",userId);
        JsonResult<UserFamily> jr = new JsonResult<>();
        try {
            UserFamily userFamily = this.userFamilyService.getByUserId(userId);
            if (null == userFamily) {
                throw new NoDataException("未查询到符合条件的数据");
            }
            jr.setCode("8200");
            jr.setMessage("获取UserFamily成功");
            jr.setData(userFamily);
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        } finally {
            log.info("【 end execute getUserFamilyByUserId，userId={} 】",userId);
        }
        return jr;
    }

    @GetMapping(value = "/byFamilyId/{familyId}")
    public JsonResult<List<UserFamily>> getUserFamilyByFamilyId(@PathVariable(value = "familyId")Long familyId)throws NoDataException,UnknownException {
        log.info("【 start execute getUserFamilyByFamilyId，userId={} 】",familyId);
        JsonResult<List<UserFamily>> jr = new JsonResult<>();
        try {
            List<UserFamily> userFamilyList = this.userFamilyService.getByFamilyId(familyId);
            if (null == userFamilyList || userFamilyList.size() == 0) {
                throw new NoDataException("未查询到符合条件的数据");
            }
            jr.setCode("8200");
            jr.setMessage("获取UserFamily成功");
            jr.setData(userFamilyList);
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        } finally {
            log.info("【 end execute getUserFamilyByFamilyId，userId={} 】",familyId);
        }
        return jr;
    }
}
