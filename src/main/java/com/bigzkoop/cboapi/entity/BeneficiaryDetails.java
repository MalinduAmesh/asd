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
public class BeneficiaryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long benDetId;
    private Long benId;
    private String nic;
    private String firstName;
    private Long dob;

    private Long createdAtDate;


}
