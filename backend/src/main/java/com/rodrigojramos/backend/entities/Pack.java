package com.rodrigojramos.backend.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "packs")
public class Pack {

    @Id
    private Long code;
    private String name;
    private Double costPrice;
    private Double salesPrice;

    public Pack() {
    }

    public Pack(Long code, String name, Double costPrice, Double salesPrice) {
        this.code = code;
        this.name = name;
        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
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
