package com.redteamobile.dolphin.dataplan.client;

import com.redteamobile.dolphin.dataplan.dto.DataPlan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "dataplan", fallback = DataPlanClient.ProductClientFallback.class)
public interface DataPlanClient {

    @RequestMapping(value = "/product/dataPlan/{id}",method = RequestMethod.GET)
    DataPlan getDataPlanById(@PathVariable("id") Integer id);

    @Component
    class ProductClientFallback implements DataPlanClient {

        @Override
        public DataPlan getDataPlanById(@PathVariable("id") Integer id) {
            return null;
        }

    }
}
