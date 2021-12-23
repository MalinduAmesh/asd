package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {
    private Long cityId;
    private Long societyId;
    private String cityName;

    private Date createdDate;
}
