package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.GadivisionDto;
import com.bigzkoop.cboapi.entity.Gadivision;
import com.bigzkoop.cboapi.repository.GadivisionRepository;
import com.bigzkoop.cboapi.service.GadivisionService;
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
public class GadivisionServiceImpl implements GadivisionService {

    private final GadivisionRepository gadivisionRepository;

    private final ModelMapper modelMapper;

    @Override
    public ArrayList<GadivisionDto> getAllGadivisions(long id) {
        List<Gadivision> all = gadivisionRepository.findAllBySocietyId(id);
        return modelMapper.map(all, new TypeToken<ArrayList<Gadivision>>() {
        }.getType());
    }
}
