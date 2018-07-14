package com.redteamobile.dolphin.order.controller;

import com.redteamobile.dolphin.commons.response.BaseResponse;
import com.redteamobile.dolphin.order.dto.OrderDTO;
import com.redteamobile.dolphin.order.requestEntity.OrdersRequest;
import com.redteamobile.dolphin.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders",method = RequestMethod.POST)
    public BaseResponse<List<OrderDTO>> orders(@Valid @RequestBody OrdersRequest request) throws Exception {
        List<OrderDTO> orders = orderService.getOrdersByDeviceId(request.getDeviceId());
        return BaseResponse.build().success(orders);
    }

}
