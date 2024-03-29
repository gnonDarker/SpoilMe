package com.example.spoilme.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;
import java.sql.Time;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonationMaterial {
    private Integer materialId;
    private Integer materialUserId;
    private String materialRescueName;
    private String materialUserName;
    private String materialCourierNumber;
    private String materialName;
    private Short materialIsAnonym;
    private String materialPhone;
    private String materialMessage;
    private Timestamp materialTime;
}
