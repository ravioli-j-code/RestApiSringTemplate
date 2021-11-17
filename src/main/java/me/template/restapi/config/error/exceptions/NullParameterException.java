package me.template.restapi.config.error.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 17 오후 1:33
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class NullParameterException extends RuntimeException{
    public NullParameterException() {
        super();
    }

    public NullParameterException(String message) {
        super(message);
    }

    public NullParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullParameterException(Throwable cause) {
        super(cause);
    }
}