package me.template.restapi.services;

import me.template.restapi.config.error.exceptions.EmptyAPIKeyException;
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

    @GetMapping("/isbn/{isbn}")
    public ServiceResponse getIsbnInfo(@PathVariable String isbn){
        try {
            throw new EmptyAPIKeyException("Empty list");
        } catch (EmptyAPIKeyException ex) {
            System.out.println(ex);
        }
        return new ServiceResponse(isbn);
    }

}