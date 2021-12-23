package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillSectorsDto {
    private Long billSectorId;
    private Long societyId;
    private String name;
    private String description;

    private Date createdDate;

}
