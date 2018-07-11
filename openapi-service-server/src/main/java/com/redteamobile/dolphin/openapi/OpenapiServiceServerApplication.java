package com.redteamobile.dolphin.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@EnableFeignClients(basePackages = "com.redteamobile.dolphin.dataplan")
@ComponentScan(basePackages = "com.redteamobile")
@EnableHystrixDashboard
public class OpenapiServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenapiServiceServerApplication.class, args);
    }
}
