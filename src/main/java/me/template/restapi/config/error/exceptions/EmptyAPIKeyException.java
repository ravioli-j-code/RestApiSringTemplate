package me.template.restapi.config.error.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 03 오전 10:15
 */
@ResponseStatus(value = HttpStatus.OK)
public class EmptyAPIKeyException extends RuntimeException{
    public EmptyAPIKeyException() {
        super();
    }

    public EmptyAPIKeyException(String message) {
        super(message);
    }

    public EmptyAPIKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyAPIKeyException(Throwable cause) {
        super(cause);
    }
}