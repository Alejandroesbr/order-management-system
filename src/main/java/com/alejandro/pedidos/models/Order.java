package com.alejandro.pedidos.models;

public class Order {
    // Order attributes

    private int  id;
    private String customer;
    private String product;
    private int quantity;
    private double price;
    private String status;

    // Construtores del pedido

    public Order (int id, String customer, String product, int quantity, double price, String status){

        this.id = id;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }
    // Metodos 
    // Getters

    public int getId() {
        return id;
    }
    public String getCustomer(){
        return customer;
    }
    public String getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public String getStatus(){
        return status;
    }

    // Setters

    public void setProduct(String product){
        this.product = product;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrecio(double price){
        this.price = price;
    }
    public void setStatus(String status){
        this.status = status;
    }

}