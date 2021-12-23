package com.bigzkoop.cboapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gadivision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gadivisionId;
    private Long societyId;
    private String name;
    private Long code;
    private String description;
}
