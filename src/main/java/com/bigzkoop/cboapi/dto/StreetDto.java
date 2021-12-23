package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StreetDto {
    private Long streetId;
    private Long societyId;
    private String streetName;
    private Long cityId;
    private Long divisionId;

    private Date CreatedDate;
}
