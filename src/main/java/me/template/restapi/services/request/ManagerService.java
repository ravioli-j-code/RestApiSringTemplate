package me.template.restapi.services.request;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 17 오후 3:45
 */
public interface ManagerService {

   /**
     * API 호출시 증가
     */
    void increaseRequestCount() throws Exception;

}