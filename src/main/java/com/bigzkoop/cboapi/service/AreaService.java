package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.dto.AreaDto;

import java.util.ArrayList;

public interface AreaService {

    ArrayList<AreaDto> getAllAreas(long id);
}
