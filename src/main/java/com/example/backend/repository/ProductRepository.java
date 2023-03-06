package com.example.backend.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Category;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;


@Repository
public class ProductRepository {

    @Autowired
    ObjectMapper mapper;

    @Value("classpath:ProductList.json")
    Resource resourceFile;

    private Category[] getProductListFromJsonResource() {
        try {
            return mapper.readValue(resourceFile.getContentAsString(UTF_8), Category[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Product> getProductsByCategory(String category) {
        return Arrays.stream(getProductListFromJsonResource()).toList().stream()
                .filter(element->element.getTitle().equalsIgnoreCase(category)).collect(Collectors.toList()).get(0).getItems();
    }

    public List<Category> getAllProductCategories() {
        return Arrays.stream(getProductListFromJsonResource()).toList();
    }
}


