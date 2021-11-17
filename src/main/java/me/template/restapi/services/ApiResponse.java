package me.template.restapi.services;

import lombok.Getter;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 02 오후 6:56
 */
@Getter
public class ApiResponse {

    private String isbn;

    public ApiResponse(String isbn){
        this.isbn = isbn;
    }

}