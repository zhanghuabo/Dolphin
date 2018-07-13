package com.redteamobile.dolphin.order.models;

import lombok.*;

import java.util.Date;

@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Orders{
    private int id;
    private int dataPlanId;
    private Date order_time;
    private String status;
}
