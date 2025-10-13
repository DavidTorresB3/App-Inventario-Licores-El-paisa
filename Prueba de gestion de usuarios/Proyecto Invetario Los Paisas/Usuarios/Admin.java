package Usuarios;

// Clase que representa al usuario administrador (Herencia)
public class Admin extends Usuario {

    // Constructor que usa el de la clase padre
    public Admin(String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena, "admin");
    }

    // Menu propio del administrador (Polimorfismo)
    @Override
    public void mostrarMenu() {
        System.out.println("\n--- Menu Administrador ---");
        System.out.println("1. Crear usuario");
        System.out.println("2. Eliminar usuario");
        System.out.println("3. Ver todos los usuarios");
        System.out.println("4. Cerrar sesion");
    }
}