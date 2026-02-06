package com.alejandro.pedidos;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.alejandro.pedidos.models.Order;
import com.alejandro.pedidos.services.OrderSystem;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); // Scanner to read user input

        OrderSystem orderSystem = new OrderSystem(); // Create an instance of the ordering system
        int opcion; // Variable to store the user's choice
        do // Loop to display the menu until the user decides to exit
        try { // Exception handling for invalid entries
            System.out.println("Options menu:");
            System.out.println("1. Add order");
            System.out.println("2. List orders");
            System.out.println("3. Search order by ID");
            System.out.println("4. Delete order by ID");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            opcion = sc.nextInt(); // Read the user's option

            switch (opcion) { // Switch structure to handle the different options
                case 1->{
                    // Logic for adding an order
            System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("Customer: "); String customer = sc.nextLine();
            System.out.print("Product: "); String product = sc.nextLine();
            System.out.print("Quantity: "); int quantity = sc.nextInt(); sc.nextLine();
            System.out.print("Price: "); double price = sc.nextDouble(); sc.nextLine();
            System.out.print("Status: "); String status = sc.nextLine();
            Order newOrder = new Order(id, customer, product, quantity, price, status); // We create the object = Order. 
            orderSystem.addOrder(newOrder); // llamamos al metodo addOrder para agregar el nuevo pedido
            System.out.println("Order added");
                }
                case 2->{
                    // LLogic for listing orders
            orderSystem.listOrder(); // We call the listOrder method to display all orders.
                }
                case 3->{
                    // Logic for searching orders by ID
            System.out.print("Enter the order ID to search: "); int idsearch = sc.nextInt();
            orderSystem.searchOrder(idsearch); // We call the searchOrder method with the idsearch.
                        System.out.println("ID found.");
                }
                case 4->{
                // Logic for deleting orders by ID
            System.out.print("Enter the order ID to delete: "); int idbusqueda = sc.nextInt();
            
            int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this order?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (answer == JOptionPane.YES_OPTION) { // Code for affirmative answer
            System.out.println("Action confirmed");

            orderSystem.deleteOrder(idbusqueda); // We call the deleteOrder method with the searchID.
            System.out.println("Order deleted");

                } else { // Code for negative case or cancel
            System.out.println("Action cancelled");

                }
                }
                case 5->{
                    //   Logic for exiting the program  
            System.out.println("Exiting the program...");
                }       
                default->{ 
                    // Handling of invalid option
                    System.out.println("Invalid option. Please try again.");
            } 
        }
    }
        catch (InputMismatchException e) { // Capture exception of type InputMismatchException
            System.out.println("Error: Only integers are allowed, no letters or symbols.");
            sc.next(); // Clear the input buffer    
        opcion = 0;
            } while(opcion != 5);
        sc.close();
    }
}