package com.redteamobile.dolphin.dataplan.common.models;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class DataPlan {

    private Integer id;

    private String shortName;

    private String name;

    private Integer price;

    private String status;

    private Date updateTime;

    private Integer duration;

    private Integer dataVolume;

    private String description;

    private Integer promoPrice;

    private Integer purchasedCount;

    private Integer minDays;

    private Integer maxDays;

    private Integer expirationDays;

    private String promoBannerUrl;

    private Integer locationId;

    private boolean isWhite;

    private String hplmn;

    private String rplmn;

    private String fplmn;

    private Integer rat;

    private Integer dailyInventory;

    private Integer daySales;

    private String tariff;

    private Integer dataPlanLevel;

    private String spn;

    private Integer currencyId;

    private Integer type;

    private Float pluto;

    private Integer promotionId;

    private Integer sortNo;

    private Integer isVisible;

    private String tags;

    private boolean needVolumeControl;

    private Integer upgradePrice;
}
