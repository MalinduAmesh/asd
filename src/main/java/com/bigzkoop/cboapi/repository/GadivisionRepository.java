package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.Gadivision;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GadivisionRepository extends JpaRepository<Gadivision, Long> {

    List<Gadivision> findAllBySocietyId(long id);
}
