package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.ValveDto;
import com.bigzkoop.cboapi.entity.Valve;
import com.bigzkoop.cboapi.repository.ValveRepository;
import com.bigzkoop.cboapi.service.ValveService;
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
public class ValveServiceImpl implements ValveService {

    private final ValveRepository valveRepository;

    private final ModelMapper modelMapper;

    @Override
    public ArrayList<ValveDto> getAllValves(long id) {
        List<Valve> all = valveRepository.findAllBySocietyId(id);
        return modelMapper.map(all, new TypeToken<ArrayList<ValveDto>>() {
        }.getType());
    }
}
