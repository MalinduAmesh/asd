package com.bigzkoop.cboapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostOfficeDto {
    private Long postOfficeId;
    private Long societyId;
    private String name;
    private Long postalCode;
}
