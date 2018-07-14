package com.redteamobile.dolphin.order.service;

import com.redteamobile.dolphin.dataplan.client.DataPlanClient;
import com.redteamobile.dolphin.order.dto.OrderDTO;
import com.redteamobile.dolphin.order.models.Orders;
import com.redteamobile.dolphin.order.repository.OrdersRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private DataPlanClient dataPlanClient;

    @Override
    public List<OrderDTO> getOrdersByDeviceId(String deviceId) {
        List<Orders> orders = ordersRepository.findByDeviceId(deviceId);
        List<OrderDTO> orderDTOS = orders.stream().map(o -> {
            OrderDTO order = new OrderDTO();
            BeanUtils.copyProperties(o, order);
            order.setDataPlan(dataPlanClient.getDataPlanById(Integer.parseInt(order.getDataPlanId())));
            return order;
        }).collect(Collectors.toList());
        return orderDTOS;
    }
}
