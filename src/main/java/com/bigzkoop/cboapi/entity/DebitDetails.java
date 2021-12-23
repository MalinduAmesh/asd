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
public class DebitDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long debitDetId;
    private Long debitId;
    private Double totalAmount;
    private Double basicAmount;
    private Double totalInstallments;
    private Double paidInstallments;
    private Double amountPerInstallments;
    private Double remainingInstallments;
    private Double remainingAmount;

}
