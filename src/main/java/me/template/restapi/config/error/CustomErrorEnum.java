package me.template.restapi.config.error;

import lombok.Getter;

@Getter
public enum CustomErrorEnum {

    EMPTY_API_KEY("E00001", "키를 입력해주세요"),
    INTERNAL_SERVER_ERROR("E99999", "내부 서버 오류가 발생했습니다.");

    private String code;
    private String message;

    CustomErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
