package com.redteamobile.dolphin.order.controller;

import com.redteamobile.dolphin.commons.response.BaseResponse;
import com.redteamobile.dolphin.order.dto.OrderDTO;
import com.redteamobile.dolphin.order.dto.OrderStatus;
import com.redteamobile.dolphin.order.requestEntity.OrdersRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/order")
@Slf4j
public class OrderController {

    @RequestMapping(value = "/orders",method = RequestMethod.POST)
    public BaseResponse<List<OrderDTO>> orders(@Valid @RequestBody OrdersRequest request) throws InterruptedException {
        OrderDTO order1 = OrderDTO.builder().id(1).status(OrderStatus.ACTIVATED.name()).build();
        OrderDTO order2 = OrderDTO.builder().id(2).status(OrderStatus.EXPIRED.name()).build();
        List<OrderDTO> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        return BaseResponse.build().success(orders);
    }

}
