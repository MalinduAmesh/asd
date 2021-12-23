package com.bigzkoop.cboapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
