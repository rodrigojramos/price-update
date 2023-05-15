package com.rodrigojramos.backend.controllers;

import com.rodrigojramos.backend.dto.ProductDTO;
import com.rodrigojramos.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> findAll() {
        List<ProductDTO> result = productService.findAll();
        return result;
    }
}
