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
public class Valve {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long valveId;
    private Long societyId;
    private String name;
    private String description;

    private Date createdDate;
}
