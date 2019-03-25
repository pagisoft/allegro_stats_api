package com.pagisoft.allegrostats.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Category {

    @ApiModelProperty(position = 1)
    private String id;

    @ApiModelProperty(position = 2)
    private String name;

    @ApiModelProperty(position = 3)
    private Boolean leaf;

    @ApiModelProperty(position = 4)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("children")
    List<Category> categories;

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category(String id, String name, Boolean leaf) {
        this.id = id;
        this.name = name;
        this.leaf = leaf;
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

    public Boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }
}
