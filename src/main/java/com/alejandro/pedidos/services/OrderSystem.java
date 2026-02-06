package com.alejandro.pedidos.services;
import com.alejandro.pedidos.models.Order;
import java.util.ArrayList;
public class OrderSystem {

// Data structure - Arraylist 

private ArrayList<Order> orders = new ArrayList<Order> ();
    
    // List builder
    public OrderSystem (){
    }    
    // Methods for managing orders

    public void addOrder(Order pedido) {
        orders.add(pedido); // It is used to determine how many orders you want to add.
        
    }

    public void listOrder(){
        for (Order pedido : orders) {
        System.out.println("id: " + pedido.getId());
        System.out.println("cliente: " + pedido.getCustomer());
        System.out.println("producto: " + pedido.getProduct());
        System.out.println("cantidad: " + pedido.getQuantity());
        System.out.println("precio: " + pedido.getPrice());
        System.out.println("estado: " + pedido.getStatus());
        }
    }

    public void searchOrder(int idsearch){  //idsearch it's new data, avoid confusion
for (Order pedido : orders) {
        if (pedido.getId() == idsearch) {   // compare order ID with idsearch
            System.out.println("id: " + pedido.getId());
            System.out.println("cliente: " + pedido.getCustomer());
            System.out.println("producto: " + pedido.getProduct());
            System.out.println("cantidad: " + pedido.getQuantity());
            System.out.println("precio: " + pedido.getPrice());
            System.out.println("estado: " + pedido.getStatus());
            return;
    }
}
    }

    public void deleteOrder(int idsearch){
for (int i = orders.size() - 1; i >= 0; i--) { // Iterate through the list of orders from the end to the beginning using .size() to get the size of the list.
        if (orders.get(i).getId() == idsearch) {
            orders.remove(i);
            return;
        }
}
    }
}   