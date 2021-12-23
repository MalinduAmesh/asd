package com.bigzkoop.cboapi.service;

import com.bigzkoop.cboapi.dto.CategoryDto;

import java.util.ArrayList;

public interface CategoryService {

    ArrayList<CategoryDto> getAllCategories(long id);
}
