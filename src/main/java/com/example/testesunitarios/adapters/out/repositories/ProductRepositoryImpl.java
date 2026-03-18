package com.example.testesunitarios.adapters.out.repositories;

import com.example.testesunitarios.application.domain.Product;
import com.example.testesunitarios.application.domain.ProductRepository;

import java.util.List;
import java.util.UUID;

public class ProductRepositoryImpl implements ProductRepository {


    private final ProductRepository productRepository;
    public ProductRepositoryImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return null;
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
