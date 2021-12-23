package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.Village;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface VillageRepository extends JpaRepository<Village, Long> {

    ArrayList<Village> findAllBySocietyId(long id);
}
