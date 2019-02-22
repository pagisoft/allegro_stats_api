package com.pagisoft.allegrostats.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PopularityData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryId;

    private Integer popularity;

    private Date aggregatonDate;

    private Long offerId;

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

    public Date getAggregatonDate() {
        return aggregatonDate;
    }

    public void setAggregatonDate(Date aggregatonDate) {
        this.aggregatonDate = aggregatonDate;
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
