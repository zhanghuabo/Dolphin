package com.redteamobile.dolphin.order.repository;

import com.redteamobile.dolphin.order.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, String>{

    List<Orders> findByDeviceId(String deviceId);
}
