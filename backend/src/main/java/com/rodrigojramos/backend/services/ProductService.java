package com.rodrigojramos.backend.services;

import com.rodrigojramos.backend.dto.ProductDTO;
import com.rodrigojramos.backend.entities.Product;
import com.rodrigojramos.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> findAll() {
        List<Product> result = productRepository.findAll();
        return result.stream().map(ProductDTO::new).toList();
    }

}
