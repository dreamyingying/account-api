package com.menglei.account.api.accountapi.exception;

import com.menglei.account.api.accountapi.common.JsonResult;
import com.menglei.account.api.accountapi.common.enums.RetCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
  * @className GlobalExceptionHandler
  * Description 全局异常处理
  * @date 2018/12/5 15:18
  * @author Menglei（lei.meng@cmgplex.com)
  * @version 1.0
  **/
@Controller
@ControllerAdvice(annotations = { RestController.class, Controller.class })
public class GlobalExceptionHandler implements ErrorController {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @Override
    public String getErrorPath() {
        return null;
    }

    /**
     * 拦截所有的默认出错页面
     *
     * @return
     */
    @RequestMapping("/error")
    @ResponseBody
    public JsonResult<String> err404() {
        JsonResult<String> jr = new JsonResult<>();
        jr.setCode(RetCodeEnum.UNIFIED.getCode());
        jr.setMessage(RetCodeEnum.UNIFIED.getMessage());
        return jr;
    }

    /**
     * 拦截自定义异常处理
     *
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        this.logger.error(e.toString(), e);
        return "oh,my god. " + e.toString();
    }

    /**
     * 拦截NoDataException异常
     *
     * @return
     */
    @ExceptionHandler(value = NoDataException.class)
    @ResponseBody
    public JsonResult noDataExceptionHandler(NoDataException e) {
        JsonResult jr = new JsonResult();
        jr.setCode(RetCodeEnum.NODATA.getCode());
        jr.setMessage(RetCodeEnum.NODATA.getMessage() + "," + e.getMessage());
        this.logger.error(e.getMessage(), e);
        return jr;
    }

    /**
     * 拦截UnknownException异常
     *
     * @return
     */
    @ExceptionHandler(value = UnknownException.class)
    @ResponseBody
    public JsonResult unknownExceptionHandler(Exception e) {
        JsonResult jr = new JsonResult();
        jr.setCode(RetCodeEnum.UNKNOWN.getCode());
        jr.setMessage(RetCodeEnum.UNKNOWN.getMessage() + "," + e.getMessage());
        this.logger.error(e.getMessage(), e);
        return jr;
    }
}
