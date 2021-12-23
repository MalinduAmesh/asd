package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VillageDto {
    private Long villageId;
    private Long societyId;
    private String villageName;
    private Long cityId;
    private Long divisionId;

    private Date createdDate;
}
