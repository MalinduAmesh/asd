package com.bigzkoop.cboapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillSectors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long billSectorId;
    private Long societyId;
    private String name;
    private String description;

    private Date createdDate;

}
