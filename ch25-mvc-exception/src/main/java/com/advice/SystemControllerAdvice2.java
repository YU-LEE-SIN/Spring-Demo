package com.advice;

import com.vo.ResponseVO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 控制器可以直接返回这个类就可以了
 * ResponseVO类 code=200 是 成功
 * code=500 是失败
 * 如果失败就会执行这个方法
 */
@RestControllerAdvice
public class SystemControllerAdvice2 {
    @ExceptionHandler(RuntimeException.class)
    public ResponseVO handlerRuntimeException(RuntimeException re) {
        ResponseVO responseVO = ResponseVO.fail(re.getMessage(), null);
        return responseVO;
    }
}
