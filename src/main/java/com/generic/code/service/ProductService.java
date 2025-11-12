package com.generic.code.service;

import com.generic.code.entity.Product;
import com.generic.code.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository repo){ this.productRepository = repo; }

    public List<Product> getExpensiveProducts(double minPrice){
        return productRepository.findByPriceGreaterThan(minPrice);
    }
}