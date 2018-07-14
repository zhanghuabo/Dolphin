package com.redteamobile.dolphin.order.service;

import com.redteamobile.dolphin.order.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getOrdersByDeviceId(String deviceId);
}
