package me.template.restapi.services;

import me.template.restapi.common.TypeValidator;
import me.template.restapi.config.custom.ApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 17 오후 2:55
 */
@Service
public class ApiServiceImpl implements ApiService{

    @Autowired
    private ApiConfig apiConfig;

    public boolean isValidApiRequest(String apiKey) throws Exception {
        if (!TypeValidator.isValidLengthStr(apiConfig.getKeySize(), apiKey)) return false;
        return true;
    }

}