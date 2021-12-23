package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiaryDetails {
    private Long benDetId;
    private Long benId;
    private String nic;
    private String firstName;
    private Long dob;

    private Long createdAtDate;


}
