package com.betheve.BeTheVe.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/api/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowCredentials(false)
                .maxAge(3600);
    }
}
