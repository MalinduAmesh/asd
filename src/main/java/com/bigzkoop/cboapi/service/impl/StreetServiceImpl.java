package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.StreetDto;
import com.bigzkoop.cboapi.entity.Street;
import com.bigzkoop.cboapi.repository.StreetRepository;
import com.bigzkoop.cboapi.service.StreetService;
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
public class StreetServiceImpl implements StreetService {

    private final StreetRepository streetRepository;

    private final ModelMapper modelMapper;


    @Override
    public ArrayList<StreetDto> getAllStreets(long id) {
        List<Street> all = streetRepository.findAllBySocietyId(id);
        return modelMapper.map(all, new TypeToken<ArrayList<StreetDto>>() {
        }.getType());
    }

}