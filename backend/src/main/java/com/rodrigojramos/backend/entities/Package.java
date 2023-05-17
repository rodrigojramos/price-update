package com.rodrigojramos.backend.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "packages")
public class Package {

    @EmbeddedId
    private PackagePK id = new PackagePK();
    private Integer quantity;

    public Package() {
    }

    public Package(Product product, Pack pack , Integer quantity) {
        id.setProduct(product);
        id.setPack(pack);
        this.quantity = quantity;
    }

    public PackagePK getId() {
        return id;
    }

    public void setId(PackagePK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
