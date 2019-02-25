package com.pagisoft.allegrostats.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Date;

@ApiModel(value="PopularityData", description="Popularity related data")
@Entity
public class PopularityData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(position = 1)
    private Long id;

    @ApiModelProperty(position = 3)
    private String categoryId;

    @ApiModelProperty(position = 4)
    private Integer popularity;

    @ApiModelProperty(position = 6)
    private Date aggregationDate;

    @ApiModelProperty(position = 2)
    private Long offerId;

    @ApiModelProperty(position = 5)
    private Integer stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Date getAggregationDate() {
        return aggregationDate;
    }

    public void setAggregationDate(Date aggregationDate) {
        this.aggregationDate = aggregationDate;
    }

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        this.offerId = offerId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
