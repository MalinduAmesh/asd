package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StreetRepository extends JpaRepository<Street, Long> {

    List<Street> findAllBySocietyId(Long id);
}
