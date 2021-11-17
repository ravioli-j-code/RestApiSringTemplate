package me.template.restapi.config.error;

import lombok.Getter;

@Getter
public enum CustomErrorEnum {

    INVALID_API_KEY("E00001", "API 키가 정확하지 않습니다."),
    NULL_PARAMETER("E00002", "정확한 인자값을 입력해주세요."),
    INVALID_PARAMETER("E00003", "인자값이 올바르지 않습니다."),
    INTERNAL_SERVER_ERROR("E99999", "내부 서버 오류가 발생했습니다.");

    private String code;
    private String message;

    CustomErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
