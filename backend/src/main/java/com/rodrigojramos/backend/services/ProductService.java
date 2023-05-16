package com.rodrigojramos.backend.services;

import com.rodrigojramos.backend.dto.ProductDTO;
import com.rodrigojramos.backend.entities.Product;
import com.rodrigojramos.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> result = productRepository.findAll();
        return result.stream().map(ProductDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public ProductDTO findByCode(Long id) {
        Product product = productRepository.findById(id).get();
        return new ProductDTO(product);
    }

    @Transactional
    public ProductDTO updatePrice(Long id, Double newPrice) {
        Product product = productRepository.findById(id).get();
        product.setSalesPrice(newPrice);
        productRepository.save(product);
        return new ProductDTO(product);
    }

}
