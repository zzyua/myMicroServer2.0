package com.zyu.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 自定义异常 处理类
 * @author  zhangzy
 */
@RestControllerAdvice
public class ExceptionHandle {

    private  static  final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);


    /**
     * 处理 restFul的返回异常,主要返回是json对象
     * ResponseBody 的返回形式
     * @param e RestDymaicException
     * @return json
     */
    @ExceptionHandler(value = RestDymaicException.class)
    @ResponseBody
    public  static  Result handler(Exception e ){
//        if(e instanceof  RestDymaicException){
            RestDymaicException dymaicException = (RestDymaicException) e;
            return ResultUtil.error(dymaicException.getCode(), dymaicException.getMessage());
//        }else {
//            logger.error("【系统异常】：{}",e.getMessage());
//            return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
//        }

    }



    /**
     * 处理
     * @param e  未正常抛出的异常Exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public  static  Result handlere(Exception e ){
            logger.error("【系统异常】：{}",e);
            return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
    }



}
