import java.util.Scanner;

import Servicio.UsuarioService;
import Usuarios.Usuario;
import Usuarios.Admin;
import Usuarios.Worker;

// Clase principal que ejecuta la aplicacion
public class AppMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioService userService = new UsuarioService();
        Usuario userActivo = null;

        System.out.println("=== Sistema de Usuarios ===");

        // Proceso de login
        while (userActivo == null) {
            System.out.print("Usuario: ");
            String user = sc.nextLine();
            System.out.print("Contrasena: ");
            String pass = sc.nextLine();

            userActivo = userService.login(user, pass);

            if (userActivo == null) {
                System.out.println("Credenciales incorrectas. Intente de nuevo.\n");
            }
        }

        System.out.println("\nBienvenido " + userActivo.getNombre() + " - Rol: " + userActivo.getRol());
        boolean salir = false;

        // Menu segun el rol
        while (!salir) {
            userActivo.mostrarMenu();
            System.out.print("\nOpcion: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    if (userActivo instanceof Admin) {
                        System.out.println("Creando usuario (futuro desarrollo)");
                    } else {
                        System.out.println("Registrando ingreso (futuro desarrollo)");
                    }
                    break;
                case "2":
                    if (userActivo instanceof Admin) {
                        System.out.println("Eliminando usuario (futuro desarrollo)");
                    } else {
                        System.out.println("Registrando salida (futuro desarrollo)");
                    }
                    break;
                case "3":
                    if (userActivo instanceof Admin) {
                        userService.mostrarUsuarios();
                    } else {
                        System.out.println("Consultando stock (futuro desarrollo)");
                    }
                    break;
                case "4":
                    System.out.println("Cerrando sesion...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        }

        sc.close();
        System.out.println("Fin del programa.");
    }
}
