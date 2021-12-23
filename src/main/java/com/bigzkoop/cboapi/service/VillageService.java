package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.dto.VillageDto;

import java.util.ArrayList;

public interface VillageService {

    ArrayList<VillageDto> getAllVillages(long id);
}
