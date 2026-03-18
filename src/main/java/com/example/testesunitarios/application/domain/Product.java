package com.example.testesunitarios.application.domain;
import java.util.UUID;
// Passamos a regra de negocio tambem dentro das entidades como em DDD
// A entidade pode (e deve) ter comportamento, não só dados

public class Product {

    private UUID id;

    private String name;

    private String description;

    private int quantity;

    private double price;




    public void reduceEstoque(int value){
        if (value <= 0)
            throw new IllegalArgumentException("valor nao pode ser negativo");
        if (value>quantity)
            throw new IllegalArgumentException("nao é possivel descontar esse valor");
        quantity -= value;
    }

    public void namingMaxLenght(){
        if (name.length()>55)
            throw new IllegalArgumentException("maximo de caracteres permitido é 55");
        if (name.length()<2){
            throw new IllegalArgumentException("Nome deve ser maior que 2 caracteres");
        }
    }

    public void descriptionMaxLenght() {
        if (description.length() > 255)
            throw new IllegalArgumentException("descrição nao pode ser menor que 255");
    }

    public void quantityMinLenght(){
        if (quantity<0)
            throw new IllegalArgumentException("quantidade nao pode ser negativo");
    }

    public Product() {
    }

    public Product(UUID id, String name, String description, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
