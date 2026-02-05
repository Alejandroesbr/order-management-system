package com.alejandro.pedidos.services;
import com.alejandro.pedidos.models.Pedido;
import java.util.ArrayList;
import java.io.*;
public class SistemaPedidos {

// Estructura de datos - Arraylist 

private ArrayList<Pedido> pedidos = new ArrayList<Pedido> ();
    
    // Constructor de la lista
    public SistemaPedidos (){
    }    
    // Metodos para gestionar los pedidos

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido); // se usa para saber cuantos pedidos se quiere agregar
        File data = new File("C:\\Users\\Alejandro\\.config\\SistemaDeGestion.java\\Data.csv");
        
    }

    public void listarPedido(){
        for (Pedido pedido : pedidos) {
        System.out.println("id: " + pedido.getId());
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("producto: " + pedido.getProducto());
        System.out.println("cantidad: " + pedido.getCantidad());
        System.out.println("precio: " + pedido.getPrecio());
        System.out.println("estado: " + pedido.getEstado());
        }
    }

    public void buscarPedido(int idbusqueda){  //idbusqueda es un nuevo dato, evitar confundir con id y no ponerle ()
for (Pedido pedido : pedidos) {
        if (pedido.getId() == idbusqueda) {   // comparar id del pedido con idbusqueda
            System.out.println("id: " + pedido.getId());
            System.out.println("cliente: " + pedido.getCliente());
            System.out.println("producto: " + pedido.getProducto());
            System.out.println("cantidad: " + pedido.getCantidad());
            System.out.println("precio: " + pedido.getPrecio());
            System.out.println("estado: " + pedido.getEstado());
            return;
    }
}
    }

    public void eliminarPedido(int idbusqueda){
for (int i = pedidos.size() - 1; i >= 0; i--) { // Recorre la lista de pedidos desde el final hacia el principio usando .size() para obtener el tamaño de la lista
        if (pedidos.get(i).getId() == idbusqueda) {
            pedidos.remove(i);
            return;
        }
}
    }
}   