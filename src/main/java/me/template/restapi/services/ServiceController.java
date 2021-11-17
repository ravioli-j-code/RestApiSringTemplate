package me.template.restapi.services;

import me.template.restapi.common.TypeValidator;
import me.template.restapi.config.error.exceptions.EmptyAPIKeyException;
import me.template.restapi.config.error.exceptions.InvalidParameterException;
import me.template.restapi.config.error.exceptions.NullParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 02 오후 6:54
 */
@RestController
public class ServiceController {


    @GetMapping(value = {"/isbn", "/isbn/{isbn}" }, produces = { "application/json" })
    public ServiceResponse getIsbnInfo(@PathVariable(required = false) final String isbn) throws Exception{
        if (isbn == null || "".equals(isbn)) {
            throw new NullParameterException();
        } else if (!TypeValidator.isISBN13(isbn)) {
            throw new InvalidParameterException();
        }
        return new ServiceResponse(isbn);
    }

}