package com.generic.code.service;

import com.generic.code.dto.ProductDto;
import com.generic.code.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class MapperService {
    public ProductDto toProductDto(Product p){
        ProductDto dto = new ProductDto();
        dto.setId(p.getId());
        dto.setName(p.getName());
        dto.setPrice(p.getPrice());
        dto.setCategoryName(p.getCategory() != null ? p.getCategory().getName() : null);
        dto.setSupplierName(p.getSupplier() != null ? p.getSupplier().getName() : null);
        return dto;
    }
}