package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GadivisionDto {
    private Long gadivisionId;
    private Long societyId;
    private String name;
    private Long code;
    private String description;
}
