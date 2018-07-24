package com.redteamobile.dolphin.dataplan.controller;

import com.redteamobile.dolphin.dataplan.dto.DataPlan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product/dataPlan")
@Slf4j
public class DataPlanController {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public DataPlan getDataPlanById(@PathVariable("id") Integer id) throws InterruptedException {
        List<DataPlan> dataPlans = new ArrayList<>();
        log.info("id is {}", id);
        DataPlan dataPlan = DataPlan.builder().id(id).name("data plan server").build();
        dataPlan.setName("data plan server");
        dataPlans.add(dataPlan);
        return dataPlan;
    }

}
