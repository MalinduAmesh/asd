package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.dto.PostOfficeDto;

import java.util.ArrayList;


public interface PostOfficeService {

    ArrayList<PostOfficeDto> getAllPostOffices(long id);
}
