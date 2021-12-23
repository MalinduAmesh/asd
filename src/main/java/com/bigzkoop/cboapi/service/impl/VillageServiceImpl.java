package com.bigzkoop.cboapi.service.impl;


import com.bigzkoop.cboapi.dto.VillageDto;
import com.bigzkoop.cboapi.entity.Village;
import com.bigzkoop.cboapi.repository.VillageRepository;
import com.bigzkoop.cboapi.service.VillageService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class VillageServiceImpl implements VillageService {

    private final VillageRepository villageRepository;

    private final ModelMapper modelMapper;

    @Override
    public ArrayList<VillageDto> getAllVillages(long id) {
        List<Village> all = villageRepository.findAllBySocietyId(id);
        return modelMapper.map(all, new TypeToken<ArrayList<VillageDto>>() {
        }.getType());
    }
}
