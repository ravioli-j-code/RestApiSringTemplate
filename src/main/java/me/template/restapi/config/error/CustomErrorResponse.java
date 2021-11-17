package me.template.restapi.config.error;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 02 오후 5:53
 */
@Getter
public class CustomErrorResponse {

    private HttpStatus status;
    private CustomError error;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime responsetime;

    CustomErrorResponse(HttpStatus status, CustomError cstError){
        super();
        this.status = status;
        this.error = cstError;
        this.responsetime = LocalDateTime.now();
    }

}