package com.menglei.account.api.accountapi.controller;

import com.menglei.account.api.accountapi.common.JsonResult;
import com.menglei.account.api.accountapi.common.enums.RetCodeEnum;
import com.menglei.account.api.accountapi.exception.NoDataException;
import com.menglei.account.api.accountapi.exception.UnknownException;
import com.menglei.account.api.accountapi.service.IUserService;
import com.menglei.account.entity.BizData4PageAdmin;
import com.menglei.account.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
  * @className UserController
  * @Description TODO
  * @date 2018/12/5 15:00
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@RestController
@RequestMapping("/api/user")
public class UserController {
    private Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/listTest")
    public JsonResult<List<User>> getUserList()throws NoDataException,UnknownException {
        log.info("【 start execute getUserList 】");
        JsonResult<List<User>> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            List<User> userList = this.userService.getUserList();
            if (null == userList || userList.size() == 0) {
                throw new NoDataException();
            }
            jr.setData(userList);
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        }finally {
            log.info("【 end execute getUserList 】");
        }
        return jr;
    }

    @GetMapping(value = "/list")
    public JsonResult<BizData4PageAdmin<User>> getUserListPage(@RequestParam(value = "pageNumber",required = false)Integer pageNumber,
                                                               @RequestParam(value = "pageSize",required = false)Integer pageSize)throws NoDataException,UnknownException {
        log.info("【 start execute getUserListPage 】");
        JsonResult<BizData4PageAdmin<User>> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            BizData4PageAdmin<User> biz = this.userService.getUserListPage(pageNumber, pageSize);
            List<User> userList = biz.getContent();
            if (null == userList || userList.size() == 0){
                throw new NoDataException("未获取到符合条件的数据！");
            }
            jr.setData(biz);
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        }finally {
            log.info("【 end execute getUserListPage 】");
        }
        return jr;
    }

    @GetMapping(value = "/byId/{id}")
    public JsonResult<User> getUserById(@PathVariable(value = "id")Long id)throws NoDataException,UnknownException{
        log.info("【 start execute getUserById，id={} 】",id);
        JsonResult<User> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            User user = this.userService.getById(id);
            if (null == user) {
                throw new NoDataException("此用户不存在！！");
            }
            jr.setData(user);
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        }finally {
            log.info("【 end execute getUserById，id={} 】",id);
        }
        return jr;
    }

    @PostMapping(value = "/add")
    public JsonResult<Boolean> addUser(@RequestBody User user)throws UnknownException{
        log.info("【 start execute addUser，user={} 】",user);
        JsonResult<Boolean> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            Boolean b = this.userService.add(user);
            jr.setData(b);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        }finally {
            log.info("【 end execute addUser，user={} 】",user);
        }
        return jr;
    }

    @PostMapping(value = "/update")
    public JsonResult<Boolean> updateUser(@RequestBody User user)throws UnknownException{
        log.info("【 start execute updateUser，user={} 】",user);
        JsonResult<Boolean> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            Boolean b = this.userService.update(user);
            if (!b){
                jr.setCode(RetCodeEnum.UNIFIED.getCode());
                jr.setMessage("修改失败！");
            }
            jr.setData(b);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        }finally {
            log.info("【 end execute updateUser，user={} 】",user);
        }
        return jr;
    }

    @PostMapping(value = "/del")
    public JsonResult<Boolean> delUser(@RequestBody User user)throws UnknownException{
        log.info("【 start execute delUser，user={} 】",user);
        JsonResult<Boolean> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            Boolean b = this.userService.del(user);
            jr.setData(b);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        }finally {
            log.info("【 end execute delUser，user={} 】",user);
        }
        return jr;
    }

    @GetMapping(value = "/login/{userName}/{password}")
    public JsonResult<User> login(@PathVariable(value = "userName")String userName,@PathVariable(value = "password")String password)throws NoDataException,UnknownException{
        log.info("【 start execute login，userName={} ,password={}】",userName,password);
        JsonResult<User> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            User user = this.userService.login(userName, password);
            if (null == user) {
                throw new NoDataException("账号或密码错误！");
            }
            jr.setData(user);
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        }finally {
            log.info("【 end execute login，userName={} ,password={}】",userName,password);
        }
        return jr;
    }

    @GetMapping(value = "/byProperty/{property}/{value}")
    public JsonResult<List<User>> getUserListByProperty(@PathVariable(value = "property")String property,@PathVariable(value = "value")Object value)throws NoDataException,UnknownException{
        log.info("【 start execute getUserListByProperty，property={} ,value={}】",property,value);
        JsonResult<List<User>> jr = new JsonResult<>(RetCodeEnum.SUCCESS.getCode(),RetCodeEnum.SUCCESS.getMessage(),null);
        try {
            List<User> userList = this.userService.getUserListByProperty(property, value);
            if (null == userList || userList.size() == 0) {
                throw new NoDataException("未发现符合条件的数据！");
            }
            jr.setData(userList);
        } catch (NoDataException e){
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnknownException();
        } finally {
            log.info("【 end execute getUserListByProperty，property={} ,value={}】",property,value);
        }
        return jr;
    }
}
