package com.example.backend.controller;

import com.example.backend.service.ProductService;
import model.Category;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProductsByCategory(@RequestParam String category) {
        List<Product> result = productService.getProductsByCategory(category);
        return result;
    }

    @GetMapping("/products/")
    public List<Category> getAllProductCategories() {
        return productService.getAllProductCategories();

    }
}
