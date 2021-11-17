package me.template.restapi.config.error.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 03 오전 10:15
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class InvalidAPIKeyException extends RuntimeException{
    public InvalidAPIKeyException() {
        super();
    }

    public InvalidAPIKeyException(String message) {
        super(message);
    }

    public InvalidAPIKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAPIKeyException(Throwable cause) {
        super(cause);
    }
}