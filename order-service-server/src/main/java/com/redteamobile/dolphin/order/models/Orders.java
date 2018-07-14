package com.redteamobile.dolphin.order.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@EqualsAndHashCode
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders{
    @Id
    private Integer id;
    private String deviceId;
    private String dataPlanId;
    private Date orderTime;
    private String status;
}
