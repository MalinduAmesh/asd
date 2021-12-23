package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.dto.StreetDto;

import java.util.ArrayList;

public interface StreetService {

    ArrayList<StreetDto> getAllStreets(long id);

}
