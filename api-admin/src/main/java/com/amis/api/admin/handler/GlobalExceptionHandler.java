package com.amis.api.admin.handler;

import com.amis.api.admin.exception.JsonException;
import com.amis.api.common.enums.ResultEnum;
import com.amis.api.common.res.BaseResponse;
import com.amis.api.common.util.ResultVOUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/** 错误回调 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  // 拦截API异常
  @SuppressWarnings("rawtypes")
  @ExceptionHandler(value = JsonException.class)
  public BaseResponse handlerJsonException(JsonException e) {
    e.printStackTrace();
    // 返回对应的错误信息
    return ResultVOUtils.error(e.getCode(), e.getMessage());
  }

  // 拦截API异常
  @SuppressWarnings("rawtypes")
  @ExceptionHandler(value = RuntimeException.class)
  public BaseResponse handlerRuntimeException(RuntimeException e) {
    e.printStackTrace();
    log.error(e.getMessage());
    // 返回对应的错误信息
    return ResultVOUtils.error(ResultEnum.NOT_NETWORK);
  }
}
