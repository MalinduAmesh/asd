package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DivisionDto {
    private Long divisionId;
    private Long societyId;
    private Long cityId;
    private String areaName;
    private String description;

    private Date createdDate;

}
