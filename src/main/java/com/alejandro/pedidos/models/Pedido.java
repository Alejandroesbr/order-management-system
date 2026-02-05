package com.alejandro.pedidos.models;

public class Pedido {
    // Atributos del pedido

    private int  id;
    private String cliente;
    private String producto;
    private int cantidad;
    private double precio;
    private String estado;

    // Construtores del pedido

    public Pedido (int id, String cliente, String producto, int cantidad, double precio, String estado){

        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }
    // Metodos 
    // Getters

    public int getId() {
        return id;
    }
    public String getCliente(){
        return cliente;
    }
    public String getProducto(){
        return producto;
    }
    public int getCantidad(){
        return cantidad;
    }
    public double getPrecio(){
        return precio;
    }
    public String getEstado(){
        return estado;
    }

    // Setters

    public void setProducto(String producto){
        this.producto = producto;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

}