package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.SyncDto;
import com.bigzkoop.cboapi.entity.Sync;
import com.bigzkoop.cboapi.repository.SyncRepository;
import com.bigzkoop.cboapi.service.SyncService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SyncServiceImpl implements SyncService {

   private final SyncRepository syncRepository;

    @Override
    public boolean get(SyncDto syncDto) {
        Sync sync = new Sync();
        sync.setAddress(syncDto.getAddress());
        sync.setName(syncDto.getName());
        syncRepository.save(sync);
        return true;
    }
}
