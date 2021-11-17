package me.template.restapi.config.error;

import me.template.restapi.config.error.exceptions.InvalidAPIKeyException;
import me.template.restapi.config.error.exceptions.InvalidParameterException;
import me.template.restapi.config.error.exceptions.NullParameterException;
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

    public CustomErrorHandler() {
        super();
    }

    @ExceptionHandler({ InvalidAPIKeyException.class })
    public ResponseEntity<Object> handleEmptyAPIKeyException(
            final InvalidAPIKeyException ex, final WebRequest request){
        return buildResponseEntity(new CustomErrorResponse(
                HttpStatus.FORBIDDEN, new CustomError(CustomErrorEnum.INVALID_API_KEY)));
    }

    @ExceptionHandler({ InvalidParameterException.class })
    public ResponseEntity<Object> handleInvalidParameterException(
            final InvalidParameterException ex, final WebRequest request){
        return buildResponseEntity(new CustomErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR, new CustomError(CustomErrorEnum.INVALID_PARAMETER)));
    }

    @ExceptionHandler({ NullParameterException.class })
    public ResponseEntity<Object> handleNullParameterException(
            final NullParameterException ex, final WebRequest request){
        return buildResponseEntity(new CustomErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR, new CustomError(CustomErrorEnum.NULL_PARAMETER)));
    }

    @ExceptionHandler({ Exception.class })
    public ResponseEntity<Object> handleAll(
            final Exception ex, final WebRequest request){
        return buildResponseEntity(new CustomErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR, new CustomError(CustomErrorEnum.INTERNAL_SERVER_ERROR)));
    }

    private ResponseEntity<Object> buildResponseEntity(CustomErrorResponse errorResponse) {
        return new ResponseEntity <>(errorResponse, errorResponse.getStatus());
    }

}