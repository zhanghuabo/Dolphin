package com.redteamobile.dolphin.order.requestEntity;


import lombok.*;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdersRequest{

    @NotBlank
    private String deviceId;
}
