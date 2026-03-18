package com.example.testesunitarios.services;

import com.example.testesunitarios.application.domain.Product;
import com.example.testesunitarios.application.domain.ProductRepository;

import java.util.List;
import java.util.UUID;

public class ProductService implements ProductRepository {
    @Override
    public Product save(Product product) {


    }

    @Override
    public Product findById(UUID id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(UUID id) {

    }

    @Override
    public Product update(Product product) {
        return null;
    }
}
