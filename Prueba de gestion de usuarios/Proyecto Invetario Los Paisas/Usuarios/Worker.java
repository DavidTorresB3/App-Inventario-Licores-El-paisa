package Usuarios;

// Clase que representa al usuario trabajador (Herencia)
public class Worker extends Usuario {

    public Worker(String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena, "worker");
    }

    // Menu propio del trabajador
    @Override
    public void mostrarMenu() {
        System.out.println("\n--- Menu Trabajador ---");
        System.out.println("1. Registrar ingreso de producto");
        System.out.println("2. Registrar salida de producto");
        System.out.println("3. Consultar stock");
        System.out.println("4. Cerrar sesion");
    }
}