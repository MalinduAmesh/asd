package com.bigzkoop.cboapi.repository;

import com.bigzkoop.cboapi.entity.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {

    List<PostOffice> findAllBySocietyId(long id);
}
