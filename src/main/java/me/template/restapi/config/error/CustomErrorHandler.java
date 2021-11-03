package me.template.restapi.config.error;

import me.template.restapi.config.error.exceptions.EmptyAPIKeyException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 02 오후 5:57
 */
@ControllerAdvice
public class CustomErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ EmptyAPIKeyException.class })
    public ResponseEntity<Object> handleEmptyAPIKeyException(Exception ex, HttpStatus status, WebRequest request){
        CustomErrorResponse customErr = new CustomErrorResponse(
                status, CustomErrorEnum.EMPTY_API_KEY, "Error Occurred.");
        return new ResponseEntity <>(customErr, new HttpHeaders(), customErr.getStatus());
    }

    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Object> handleAll(Exception ex, WebRequest request){
        CustomErrorResponse customErr = new CustomErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR, CustomErrorEnum.INTERNAL_SERVER_ERROR, "Error Occurred.");
        return new ResponseEntity <>(customErr, new HttpHeaders(), customErr.getStatus());
    }

}