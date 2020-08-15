package com.tango.migration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String userName(@Value("${name}") String userName) {
        return userName;
    }
}
