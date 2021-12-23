package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.ConsumerDto;
import com.bigzkoop.cboapi.entity.Consumer;
import com.bigzkoop.cboapi.repository.ConsumerRepository;
import com.bigzkoop.cboapi.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ConsumerServiceImpl implements ConsumerService {

    private final ConsumerRepository consumerRepository;
    private final ModelMapper modelMapper;

    @Override
    public boolean create(ConsumerDto consumerDto) {
        if (consumerRepository.existsById(consumerDto.getSocietyId())){
            System.out.println("User Already in system");
        }
        Consumer map = modelMapper.map(consumerDto, Consumer.class);
        consumerRepository.save(map);
        return true;
    }
}
