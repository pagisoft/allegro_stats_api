package com.pagisoft.allegrostats.resources;

import com.pagisoft.allegrostats.domain.Category;
import com.pagisoft.allegrostats.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
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

    @ApiOperation(value = "View a list of available categories for parent id", response = Category.class, responseContainer="List")
    @GetMapping(value="/{parentId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> getCategoryByParentId(@PathVariable("parentId") String parentId) {
        return categoryService.getCategoriesByParentId(parentId);
    }

    @ApiOperation(value = "View a list of available root categories", response = Category.class, responseContainer="List")
    @GetMapping(value="/root", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Category> getCategoryByParentId() {
        return categoryService.getCategoriesByParentId(null);
    }

}
