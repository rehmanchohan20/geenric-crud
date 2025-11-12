package com.generic.code.controller;

import com.generic.code.entity.Product;
import com.generic.code.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService service){ this.productService = service; }

    @GetMapping("/expensive")
    public List<Product> getExpensive(@RequestParam double minPrice){
        return productService.getExpensiveProducts(minPrice);
    }
}