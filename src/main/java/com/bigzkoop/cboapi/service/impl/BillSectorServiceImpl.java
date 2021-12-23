package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.BillSectorsDto;
import com.bigzkoop.cboapi.entity.BillSectors;
import com.bigzkoop.cboapi.repository.BillSectorRepository;
import com.bigzkoop.cboapi.service.BillSectorService;
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
public class BillSectorServiceImpl implements BillSectorService {

    private final BillSectorRepository billSectorRepository;

    private final ModelMapper modelMapper;

    @Override
    public ArrayList<BillSectorsDto> getAllBillSectors(long id) {
        List<BillSectors> all = billSectorRepository.findAllBySocietyId(id);
        return modelMapper.map(all, new TypeToken<ArrayList<BillSectorsDto>>() {
        }.getType());
    }
}
