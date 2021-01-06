package com.cxytiandi.web.exception;

import com.cxytiandi.web.base.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest req, Exception e) {
        logger.error("",e);
        ResponseData r = new ResponseData();
        r.setMessage(e.getMessage());
        if(e instanceof NoHandlerFoundException){
            r.setCode(404);
        }else{
            r.setCode(500);
        }
        r.setData(null);
        r.setStatus(false);
        return r;
    }
}
