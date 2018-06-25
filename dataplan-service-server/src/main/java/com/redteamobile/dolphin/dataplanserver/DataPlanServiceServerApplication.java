package com.redteamobile.dolphin.dataplanserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableDiscoveryClient
@SpringBootApplication
public class DataPlanServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataPlanServiceServerApplication.class, args);
    }
}

