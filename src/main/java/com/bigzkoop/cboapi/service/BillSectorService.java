package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.dto.BillSectorsDto;

import java.util.ArrayList;

public interface BillSectorService {

    ArrayList<BillSectorsDto> getAllBillSectors(long id);
}
