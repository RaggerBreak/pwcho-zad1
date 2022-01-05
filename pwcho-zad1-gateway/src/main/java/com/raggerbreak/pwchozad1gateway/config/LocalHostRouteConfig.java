package com.raggerbreak.pwchozad1gateway.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalHostRouteConfig {

    @Value("${pwcho.fib.url}")
    private String fibdUrl;
    @Value("${pwcho.fib.port}")
    private String fibPort;
    @Value("${pwcho.server.url}")
    private String serverUrl;
    @Value("${pwcho.server.port}")
    private String serverPort;

    @Bean
    public RouteLocator localHostRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/server/**")
                        .uri("http://"+serverUrl+":"+serverPort))
                .route(r -> r.path("/api/fib/**")
                        .uri("http://"+fibdUrl+":"+fibPort))
                .build();
    }
}
