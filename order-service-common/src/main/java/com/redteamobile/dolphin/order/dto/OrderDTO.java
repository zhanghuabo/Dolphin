package com.redteamobile.dolphin.order.dto;

import com.redteamobile.dolphin.dataplan.common.models.DataPlan;
import lombok.*;

import java.util.Date;

@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Integer id;
    private String deviceId;
    private String dataPlanId;
    private Date orderTime;
    private String status;
    private DataPlan dataPlan;
}
