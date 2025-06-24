package com.IdealRein.service;

import java.util.List;

import com.IdealRein.pojo.Category;

public interface CategoryService {
    void add(Category category);
    List<Category> list();
    Category findById(Integer id);
    void update(Category category);
    void deleteById(Integer id);
}
