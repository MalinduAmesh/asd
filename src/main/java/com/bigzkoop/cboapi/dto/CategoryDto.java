package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long catId;
    private Long societyId;
    private String name;
    private Double ConnectionFee;
    private String description;

    private Date createdDate;


}
