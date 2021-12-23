package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebitDetails {
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
