package com.redteamobile.dolphin.dataplanserver.controller;

import com.redteamobile.dolphin.commons.response.BaseResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/dataPlan/health")
@RefreshScope
public class HealthController {

    @Value("${env}")
    private String env;

    @Value("${spring.application.name}")
    private String serviceId;

    @GetMapping(value = "")
    public BaseResponse<String> list() {
        String response = "I am " + serviceId + " and env is " + env;
        return BaseResponse.build().success(response);
    }
}
