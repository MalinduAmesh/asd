package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long accountId;
    private Long accountNumber;
    private Long debitId;
    private Long postOfficeId;
    private Long divisionId;
    private Long villageId;
    private Long streetId;
    private Long valveId;
    private Long gaDivisionId;
    private Long billSectorId;
    private Long billingCategory;

    private String mobileNumber;
    private String lanNumber;
    private String houseNumber;
    private String houseName;

    private Long premisisNumber;
    private Long consumerId;
    private Long societyId;


}
