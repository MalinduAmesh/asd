package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AreaRepository extends JpaRepository<Area, Long> {

    List<Area> findAllBySocietyId(long id);

}
