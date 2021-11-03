package me.template.restapi.config.error;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 02 오후 5:44
 */
@RestController
public class CustomErrorController extends AbstractErrorController {

    public CustomErrorController(ErrorAttributes errorAttributes){
        super(errorAttributes);
    }

    @RequestMapping("/error")
    @ResponseBody
    public ResponseEntity<Object> jsonError(HttpServletRequest request){
        ErrorAttributeOptions options = ErrorAttributeOptions
                .defaults()
                .including(ErrorAttributeOptions.Include.MESSAGE);
        Map <String, Object> resBody = getErrorAttributes(request, options);
        HttpStatus status = getStatus(request);

        return new ResponseEntity <>(resBody, status);
    }


}