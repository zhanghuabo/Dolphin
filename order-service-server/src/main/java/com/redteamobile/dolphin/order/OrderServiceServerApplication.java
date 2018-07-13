package com.redteamobile.dolphin.order;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@EnableFeignClients(basePackages = "com.redteamobile.dolphin")
@ComponentScan(basePackages = "com.redteamobile")
@EnableHystrixDashboard
public class OrderServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceServerApplication.class, args);
	}
}
