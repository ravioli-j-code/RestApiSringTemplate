package me.template.restapi.config.error.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 03 오전 10:15
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class InvalidParameterException extends RuntimeException{
    public InvalidParameterException() {
        super();
    }

    public InvalidParameterException(String message) {
        super(message);
    }

    public InvalidParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParameterException(Throwable cause) {
        super(cause);
    }
}