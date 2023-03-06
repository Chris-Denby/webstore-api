package com.example.backend.service;

import com.example.backend.repository.ProductRepository;
import model.Category;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductsByCategory(String category) {
        return productRepository.getProductsByCategory(category);
    }

    public List<Category> getAllProductCategories() {
        return productRepository.getAllProductCategories();
    }

}
