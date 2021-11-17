package me.template.restapi.services;

import me.template.restapi.common.TypeValidator;
import me.template.restapi.config.error.exceptions.InvalidAPIKeyException;
import me.template.restapi.config.error.exceptions.InvalidParameterException;
import me.template.restapi.config.error.exceptions.NullParameterException;
import me.template.restapi.services.request.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 02 오후 6:54
 */
@RestController
public class ApiMainController {

    @Autowired
    private ApiService apiService;

    @Autowired
    private ManagerService managerService;

    @GetMapping(value = {"/isbn", "/isbn/{isbn}" }, produces = { "application/json" })
    public ApiResponse getIsbnInfo(@PathVariable(required = false) final String isbn,
                                   @RequestParam(required = false) final String apiKey) throws Exception{

        // 호출에 대해 무조건 카운트 증가
        managerService.increaseRequestCount();

        // 유효한 호출인지 확인
        if(!apiService.isValidApiRequest(apiKey)) {
            throw new InvalidAPIKeyException();
        }

        // 인자값이 정확한지 확인
        if (isbn == null || "".equals(isbn)) {
            throw new NullParameterException();
        } else if (!TypeValidator.isISBN13(isbn)) {
            throw new InvalidParameterException();
        }
        return new ApiResponse(isbn);
    }

}