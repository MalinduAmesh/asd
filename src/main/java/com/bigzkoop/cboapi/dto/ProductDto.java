package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long prodId;
    private Long societyId;
    private Long prodCode;
    private String description;
    private String productType;
    private Date createdDate;
}
