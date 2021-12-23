package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.AreaDto;
import com.bigzkoop.cboapi.entity.Area;
import com.bigzkoop.cboapi.repository.AreaRepository;
import com.bigzkoop.cboapi.service.AreaService;
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
public class AreaServiceImpl implements AreaService {

    private final AreaRepository areaRepository;

    private final ModelMapper modelMapper;

    @Override
    public ArrayList<AreaDto> getAllAreas(long id) {
        List<Area> all = areaRepository.findAllBySocietyId(id);
        return modelMapper.map(all, new TypeToken<ArrayList<AreaDto>>() {
        }.getType());
    }
}
