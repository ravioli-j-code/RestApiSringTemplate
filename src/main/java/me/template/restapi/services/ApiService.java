package me.template.restapi.services;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 17 오후 2:54
 */
public interface ApiService {

    boolean isValidApiRequest(String apiKey) throws Exception;

}