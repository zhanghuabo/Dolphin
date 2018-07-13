package com.redteamobile.dolphin.order.dto;

import lombok.*;

import java.util.Date;

@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private int id;
    private int dataPlanId;
    private Date order_time;
    private String status;
}
