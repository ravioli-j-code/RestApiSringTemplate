package me.template.restapi.config.custom;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : 진경인
 * @version : 1.0
 * @since : 2021. 11. 17 오후 4:23
 */
@Configuration
@PropertySource("classpath:customconfig.properties")
@ConfigurationProperties(prefix = "api")
@Getter
@Setter
public class ApiConfig {

    private boolean limitedAccess;
    private int keySize;

}