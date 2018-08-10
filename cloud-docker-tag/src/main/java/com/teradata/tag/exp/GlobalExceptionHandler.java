package com.teradata.tag.exp;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xuyaohui
 * @date 2018-8-6
 */
@RestControllerAdvice
public class GlobalExceptionHandler {



    @ExceptionHandler(Exception.class)
    public String handleException(HttpServletRequest req, HttpServletResponse res, Exception e) {
        return e.getMessage();
    }

}
