package com.rodrigojramos.backend.controllers;

import com.rodrigojramos.backend.dto.ProductDTO;
import com.rodrigojramos.backend.dto.newPriceDTO;
import com.rodrigojramos.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ProductDTO findByCode(@PathVariable Long id) {
        ProductDTO dto = productService.findByCode(id);
        return dto;
    }

    @GetMapping
    public List<ProductDTO> findAll() {
        List<ProductDTO> result = productService.findAll();
        return result;
    }

    @PutMapping(value = "/{id}")
    public ProductDTO updatePrice(@PathVariable Long id, @RequestBody newPriceDTO body) {
        ProductDTO dto = productService.updatePrice(id, body.getNewPrice());
        return dto;
    }

}
