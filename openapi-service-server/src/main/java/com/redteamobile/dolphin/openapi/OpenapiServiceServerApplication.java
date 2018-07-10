package com.redteamobile.dolphin.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OpenapiServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenapiServiceServerApplication.class, args);
    }
}
