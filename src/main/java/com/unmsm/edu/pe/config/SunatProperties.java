package com.unmsm.edu.pe.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "application.ruc-info.http-client.sunat-proxy")
public class SunatProperties {

    private String baseUrl;
    private String token;

}
