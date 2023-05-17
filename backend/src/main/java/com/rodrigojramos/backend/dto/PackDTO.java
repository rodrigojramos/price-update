package com.rodrigojramos.backend.dto;

import com.rodrigojramos.backend.entities.Pack;

public class PackDTO {

    private Long code;
    private String name;
    private Double costPrice;
    private Double salesPrice;

    public PackDTO(Pack entity) {
        code = entity.getCode();
        name = entity.getName();
        costPrice = entity.getCostPrice();
        salesPrice = entity.getSalesPrice();
    }

    public Long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }
}
