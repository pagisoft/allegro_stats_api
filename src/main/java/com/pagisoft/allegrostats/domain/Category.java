package com.pagisoft.allegrostats.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Category {

    @ApiModelProperty(position = 1)
    private String id;

    @ApiModelProperty(position = 2)
    private String name;

    @ApiModelProperty(position = 3)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    List<Category> categories;

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
