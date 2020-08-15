package com.tango.migration;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.tango.migration")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer placeholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        placeholderConfigurer.setFileEncoding("UTF-8");
        placeholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
        placeholderConfigurer.setIgnoreResourceNotFound(true);
        return placeholderConfigurer;
    }
}
