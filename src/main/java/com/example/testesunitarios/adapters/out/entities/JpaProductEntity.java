package com.example.testesunitarios.adapters.out.entities;

import com.example.testesunitarios.application.domain.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "JpaProductEntity")
@NoArgsConstructor
@AllArgsConstructor
public class JpaProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    @Max(55)
    @Min(2)
    private String name;

    @NotNull
    @Max(255)
    private String description;

    @NotNull
    private int quantity;

    @NotNull
    private double price;

    JpaProductEntity(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.quantity = product.getQuantity();
        this.price = product.getPrice();
    }
}
