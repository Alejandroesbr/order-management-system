import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); // Scanner para leer la entrada del usuario

        SistemaPedidos sistemaPedidos = new SistemaPedidos(); // Crear una instancia del sistema de pedidos
        int opcion; // Variable para almacenar la opcion del usuario
        do // Bucle para mostrar el menu hasta que el usuario decida salir
        try { // Manejo de excepciones para entradas no validas
            System.out.println("Menu de opciones:");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Listar pedidos");
            System.out.println("3. Buscar pedido por ID");
            System.out.println("4. Eliminar pedido por ID");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt(); // Lee la opcion del usuario

            switch (opcion) { // Estructura switch para manejar las diferentes opciones
                case 1->{
                    // Lógica para agregar pedido
            System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("Cliente: "); String cliente = sc.nextLine();
            System.out.print("Producto: "); String producto = sc.nextLine();
            System.out.print("Cantidad: "); int cantidad = sc.nextInt(); sc.nextLine();
            System.out.print("Precio: "); double precio = sc.nextDouble(); sc.nextLine();
            System.out.print("Estado: "); String estado = sc.nextLine();
            Pedido nuevoPedido = new Pedido(id, cliente, producto, cantidad, precio, estado); // Creamos el objeto Pedido 
            sistemaPedidos.agregarPedido(nuevoPedido); // llamamos al metodo agregarPedido para agregar el nuevo pedido
            System.out.println("Pedido agregado");
                }
                case 2->{
                    // Lógica para listar pedidos
            sistemaPedidos.listarPedido(); // llamamos al metodo listarPedido para mostrar todos los pedidos
                }
                case 3->{
                    // Lógica para buscar pedido por ID
            System.out.print("Ingrese el ID del pedido a buscar: "); int idbusqueda = sc.nextInt();
            sistemaPedidos.buscarPedido(idbusqueda); // llamamos al metodo buscarPedido con el idbusqueda
                        System.out.println("ID encontrado");
                }
                case 4->{
                // Lógica para eliminar pedido por IDº
            System.out.print("Ingrese el ID del pedido a eliminar: "); int idbusqueda = sc.nextInt();
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar esto?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) { // Código para el caso afirmativo
            System.out.println("Acción confirmada");

            sistemaPedidos.eliminarPedido(idbusqueda); // llamamos al metodo eliminarPedido con el idbusqueda
            System.out.println("Pedido eliminado");

                } else { // Código para el caso negativo o cancelar
            System.out.println("Acción cancelada");

                }
                }
                case 5->{
                    // Logica para salir del programa    
            System.out.println("Saliendo del programa...");
                }       
                default->{ 
                    // Manejo de opcion no valida
                    System.out.println("Opcion no valida. Intente de nuevo.");
            } 
        }
    }
        catch (InputMismatchException e) { // Captura excepcion de tipo InputMismatchException
            System.out.println("Error: Solo se permiten números enteros, no letras ni signos.");
            sc.next(); // Limpiar el buffer de entrada
        opcion = 0;
            } while(opcion != 5);
        sc.close();
    }
}


