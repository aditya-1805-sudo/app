package com.webapp.app.Configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@EnableFeignClients(basePackages = "com.webapp.app.Proxy")
@ComponentScan("com.webapp.app")
public class MainConfiguration {

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
