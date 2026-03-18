package com.example.testesunitarios.adapters.out.repositories;

import com.example.testesunitarios.application.domain.Product;
import com.example.testesunitarios.application.domain.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProductRepositoryImpl implements ProductRepository {


    private final ProductRepository productRepository;
    public ProductRepositoryImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //É necessario fazer o mapeamento para separar a entidade de persistencia(jpa) do dominio da aplicação


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(UUID id) {
        Optional<Product> optionalProduct = productRepository.findById(id).orElse(null);
        return optionalProduct.map(entity-> new Product(entity.getId(), entity.getName(), entity.getDescription(), entity.getQuantity(), entity.getPrice()));

    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll()
                .stream()
                .map(entity->new Product(entity.getId(), entity.getName(), entity.getDescription(), entity.getQuantity(), entity.getPrice()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(UUID id) {
        productRepository.deleteById(id);

    }

    @Override
    public Product update(Product product) {
        return productRepository.update(product);
    }
}
