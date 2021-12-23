package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.PostOfficeDto;
import com.bigzkoop.cboapi.entity.PostOffice;
import com.bigzkoop.cboapi.repository.PostOfficeRepository;
import com.bigzkoop.cboapi.service.PostOfficeService;
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
public class PostOfficeServiceImpl implements PostOfficeService {

    private final PostOfficeRepository postOfficeRepository;

    private final ModelMapper modelMapper;

    @Override
    public ArrayList<PostOfficeDto> getAllPostOffices(long id) {
        List<PostOffice> all = postOfficeRepository.findAllBySocietyId(id);
        return modelMapper.map(all, new TypeToken<ArrayList<PostOfficeDto>>() {
        }.getType());

    }
}
