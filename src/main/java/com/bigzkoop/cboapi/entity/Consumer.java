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
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long consumerId;
    private Long societyId;
    private String nic;
    private String initials;
    private String firstName;
    private String lastName;
    private Date dob;

    private String profileImages;
    private String nicFront;
    private String nicBack;
    private String signature;

    private Date createdDate;
}
