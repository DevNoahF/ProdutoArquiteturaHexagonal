package com.example.testesunitarios.adapters.out.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface JpaProductEntity extends JpaRepository<JpaProductEntity, UUID> {
}
