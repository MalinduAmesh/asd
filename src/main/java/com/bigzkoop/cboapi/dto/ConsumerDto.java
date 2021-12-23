package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsumerDto {

    private Long consumerId;
    private Long societyId;
    private String nic;
    private String initials;
    private String firstName;
    private String lastName;
    private Date dob;

    private String profileImages;
    private String nicFront;
    private String nicBack;
    private String signature;

    private Date createdDate;

}
