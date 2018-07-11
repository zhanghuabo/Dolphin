package com.redteamobile.dolphin.openapi.controller;

import com.redteamobile.dolphin.dataplan.client.DataPlanClient;
import com.redteamobile.dolphin.dataplan.common.models.DataPlan;
import com.redteamobile.dolphin.dataplan.common.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/open/productInfo/dataPlan")
@Slf4j
public class DataPlanOpenAPIController {

    @Autowired
    private DataPlanClient dataPlanClient;

    @GetMapping(value = "/{id}")
    public BaseResponse<DataPlan> list(@PathVariable("id") Integer id) {
        DataPlan dataPlan = dataPlanClient.getDataPlanById(id);
        log.info("data plan is {}", dataPlan);
        return BaseResponse.build().success(dataPlan);
    }

}
