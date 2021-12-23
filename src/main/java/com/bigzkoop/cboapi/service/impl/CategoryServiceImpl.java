package com.bigzkoop.cboapi.service.impl;

import com.bigzkoop.cboapi.dto.CategoryDto;
import com.bigzkoop.cboapi.entity.Category;
import com.bigzkoop.cboapi.repository.CategoryRepository;
import com.bigzkoop.cboapi.service.CategoryService;
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
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final ModelMapper modelMapper;

    @Override
    public ArrayList<CategoryDto> getAllCategories(long id) {
        List<Category> all = categoryRepository.findAllBySocietyId(id);
        return modelMapper.map(all, new TypeToken<ArrayList<CategoryDto>>() {
        }.getType());
    }
}
