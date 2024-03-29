package com.example.spoilme.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RescueStation {
    private Integer id;
    private Integer ownerId;
    private String stationName;
    private Time foundTime;
    private Integer numberPeople;
    private String workCondition;
    private String address;
    private Integer numberPets;
    private Integer numberHelpPets;
    private Float amountLossPerMouth;
    private Boolean isNeedVolunteer;
    private String qrcode;
    private String shippingAddress;
    private String officialWebsite;
    private String administrator;
    private String wechat;
    private String mail;
    private String phone;
    private String rejectReason;
    private String state;
}
