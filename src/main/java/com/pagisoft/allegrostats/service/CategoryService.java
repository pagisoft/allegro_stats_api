package com.pagisoft.allegrostats.service;

import com.google.common.collect.Lists;
import com.pagisoft.allegrostats.dao.CategoryDao;
import com.pagisoft.allegrostats.dao.PopularityDataDao;
import com.pagisoft.allegrostats.domain.Category;
import com.pagisoft.allegrostats.model.CategoryDTO;
import com.pagisoft.allegrostats.model.PopularityData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    private List<CategoryDTO> categoriesFromDb;

    private List<CategoryDTO> getAllCategoriesFromDb(){
        return Lists.newArrayList(this.categoryDao.findAll());
    }

    private List<CategoryDTO> getCategoriesFromDbByParentId(String parentId){
        return Lists.newArrayList(this.categoryDao.findByParentId(parentId));
    }

    public List<Category> getAllCategories() {

        this.categoriesFromDb = getAllCategoriesFromDb();

        List<Category> categories = categoriesFromDb.stream()
                .filter(x -> x.getParentId() == null)
                .map(temp -> {
                    return new Category(temp.getCategoryId(), temp.getName());
                }).collect(Collectors.toList());


        categories.stream().forEach(
                rootCategory -> {
                    rootCategory.setCategories(getCategories(rootCategory.getId()));
         });


        return categories;
    }

    private List<Category> getCategories(String parentId) {
        List<Category> categories = this.categoriesFromDb.stream()
                .filter(x -> x.getParentId() == parentId)
                .map(temp -> {
                    Category category = new Category(temp.getCategoryId(), temp.getName());
                    if(!temp.getLeaf()) {
                        category.setCategories(getCategories(temp.getCategoryId()));
                    }
                    return category;
                }).collect(Collectors.toList());
        return categories;
    }

    public List<Category> getCategoriesByParentId(String parentId) {

        List<CategoryDTO> categoryDTOList = getCategoriesFromDbByParentId(parentId);

        List<Category> categories = categoryDTOList.stream()
                .map(temp -> {
                    Category category = new Category(temp.getCategoryId(), temp.getName(), temp.getLeaf());
                    return category;
                }).collect(Collectors.toList());
        return categories;
    }

}
