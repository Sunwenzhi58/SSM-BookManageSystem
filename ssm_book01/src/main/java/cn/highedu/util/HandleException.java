package cn.highedu.util;

import com.alibaba.druid.support.json.JSONUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//rest
@RestControllerAdvice //类注解
public class HandleException {
    //方法注解，当出现异常的时候，终止原来的控制器执行，直接转到当前方法执行、
    @ExceptionHandler(Exception.class)
    public ResultUtil doOtherException(Exception e){
        System.out.println("出现异常了~~~");
        return new ResultUtil(Code.SYSTEM_UNKNOW_ERROR,null,"系统繁忙！请联系管理员！");
    }

    @ExceptionHandler(SystemException.class)
    public ResultUtil doSystemException(SystemException e){
        return new ResultUtil(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public ResultUtil doBusinessException(BusinessException e){
        return new ResultUtil(e.getCode(),null,e.getMessage());
    }

}
