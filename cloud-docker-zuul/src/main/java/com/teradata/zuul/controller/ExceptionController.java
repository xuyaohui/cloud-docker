package com.teradata.zuul.controller;

import com.teradata.zuul.bean.ResponseBean;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class ExceptionController {

    /**
     *  捕捉shiro的异常
     */
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(ShiroException.class)
    public ResponseBean handle401(ShiroException e) {
        return new ResponseBean(401, e.getMessage(), null);
    }

    /**
     * 捕捉UnauthorizedException
     * @return
     */
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseBean handle401() {
        return new ResponseBean(401, "Unauthorized", null);
    }

//    /**
//     * 捕捉其他所有异常
//     * @param request
//     * @param ex
//     * @return
//     */
//    @ExceptionHandler(Exception.class)
//    //@ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseBean globalException(HttpServletRequest request, Throwable ex) {
//        return new ResponseBean(getStatus(request).value(), ex.getMessage(), null);
//    }
//
    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }

    @ExceptionHandler(Exception.class)
    public ResponseBean handleException(HttpServletRequest req, HttpServletResponse res, Exception e) {
        return new ResponseBean(getStatus(req).value(), e.getMessage(), null);
    }

    @ExceptionHandler(ShiroException.class)
    public ResponseBean handleShiroException(ShiroException e) {
        return new ResponseBean(500, e.getMessage(), null);
    }
}

