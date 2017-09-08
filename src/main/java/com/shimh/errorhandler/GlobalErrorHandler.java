package com.shimh.errorhandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * *****************************************************************
 * Created on 2017年9月1日 上午10:08:55
 * @author shimh 
 * 	
 * 	全局异常处理器
 *	
 *    
 * 
 * Update: ------ empty log ------
 ******************************************************************
 */
/*@RestControllerAdvice
public class GlobalErrorHandler {

	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)  
    @ExceptionHandler(value = Exception.class)
    public String errorHandlerOverJson(HttpServletRequest request, Exception exception) {
    	exception.printStackTrace();
        return "报错了";
    }
	
	
	
}*/
@RestControllerAdvice
public class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
        HttpStatus status = getStatus(request);
        return new ResponseEntity<>("报错了",status);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }

}
