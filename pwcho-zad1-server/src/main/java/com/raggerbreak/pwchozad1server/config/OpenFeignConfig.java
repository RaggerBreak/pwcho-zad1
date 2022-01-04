package com.raggerbreak.pwchozad1server.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.raggerbreak.pwchozad1server")
public class OpenFeignConfig {
}
