package me.template.restapi.config.error;


import lombok.Getter;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 17 오후 1:25
 */
@Getter
public class CustomError {

    private String code;
    private String message;

    CustomError(CustomErrorEnum errorEnum){
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
    }

}