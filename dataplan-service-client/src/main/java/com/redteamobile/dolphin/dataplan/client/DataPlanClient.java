package com.redteamobile.dolphin.dataplan.client;

import com.redteamobile.dolphin.dataplan.common.models.DataPlan;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dataplan", fallback = DataPlanClient.ProductClientFallback.class)
public interface DataPlanClient {

    @GetMapping("/product/dataPlan/{id}")
    DataPlan getDataPlanById(@PathVariable("id") Integer id);

    @Component
    class ProductClientFallback implements DataPlanClient {

        @Override
        public DataPlan getDataPlanById(@PathVariable("id") Integer id) {
            return null;
        }

    }
}
