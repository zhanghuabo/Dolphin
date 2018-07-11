package com.redteamobile.dolphin.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients(basePackages = "com.redteamobile.dolphin.dataplan")
public class OpenapiServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenapiServiceServerApplication.class, args);
    }
}
