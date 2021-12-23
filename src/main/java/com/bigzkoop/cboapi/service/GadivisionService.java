package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.dto.GadivisionDto;

import java.util.ArrayList;

public interface GadivisionService {

    ArrayList<GadivisionDto> getAllGadivisions(long id);
}
