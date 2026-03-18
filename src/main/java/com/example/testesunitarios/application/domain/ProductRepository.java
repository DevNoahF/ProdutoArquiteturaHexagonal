package com.example.testesunitarios.application.domain;

import java.util.List;
import java.util.UUID;

public interface ProductRepository {

    Product save(Product product);
    Product findById(UUID id);
    List<Product> findAll();
    void deleteById(UUID id);
    Product update(Product product);
}
