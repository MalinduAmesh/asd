package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.BillSectors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillSectorRepository extends JpaRepository<BillSectors, Long> {

    List<BillSectors> findAllBySocietyId(long id);

}
