package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.dto.ValveDto;

import java.util.ArrayList;

public interface ValveService {

    ArrayList<ValveDto> getAllValves(long id);
}
