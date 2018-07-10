package com.redteamobile.dolphin.openapi.controller;

import com.redteamobile.dolphin.dataplan.common.models.DataPlan;
import com.redteamobile.dolphin.dataplan.common.response.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/open/productInfo/dataPlan")
public class DataPlanOpenAPIController {

    @GetMapping(value = "/{id}")
    public BaseResponse<DataPlan> list(@PathVariable("id") Integer id) {
        DataPlan dataPlan = DataPlan.builder().id(id).build();
        return BaseResponse.build().success(dataPlan);
    }

}
