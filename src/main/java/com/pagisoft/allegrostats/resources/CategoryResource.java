package com.pagisoft.allegrostats.resources;

import com.pagisoft.allegrostats.domain.Category;
import com.pagisoft.allegrostats.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
@Api(value="categories", description="Operations related to allegro categories")
public class CategoryResource {

    @Autowired
    private CategoryService categoryService;

    @ApiOperation(value = "View a list of available categories", response = Category.class, responseContainer="List")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> getCategoriesTree() {
        return categoryService.getAllCategories();
    }

}
