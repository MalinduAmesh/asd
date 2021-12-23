package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.Valve;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ValveRepository extends JpaRepository<Valve, Long> {

    List<Valve> findAllBySocietyId(long id);
}
