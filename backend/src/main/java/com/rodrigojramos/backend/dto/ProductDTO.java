package com.rodrigojramos.backend.dto;

import com.rodrigojramos.backend.entities.Product;

public class ProductDTO {

    private Long code;
    private String name;
    private Double costPrice;
    private Double salesPrice;

    public ProductDTO() {
    }

    public ProductDTO(Product entity) {
        code = entity.getCode();
        name = entity.getName();
        costPrice = entity.getCostPrice();
        salesPrice = entity.getSalesPrice();
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }
}
