package Servicio;

import java.util.ArrayList;
import java.util.List;

import Usuarios.Admin;
import Usarios.Usuario;
import Usuarios.Worker;

// Clase encargada de manejar la logica de los usuarios (Abstraccion)
public class UsuarioService {

    // Lista simulando base de datos temporal
    private List<Usuario> listaUsuarios = new ArrayList<>();

    // Constructor que crea usuarios de prueba
    public UsuarioService() {
        listaUsuarios.add(new Admin("Carlos Perez", "admin", "1234"));
        listaUsuarios.add(new Worker("Juan Lopez", "worker", "abcd"));
    }

    // Metodo para iniciar sesion
    public Usuario login(String user, String pass) {
        for (Usuario u : listaUsuarios) {
            if (u.getUsuario().equals(user) && u.getContrasena().equals(pass)) {
                return u;
            }
        }
        return null; // Si no existe el usuario
    }

    // Metodo para mostrar los usuarios (solo para admin)
    public void mostrarUsuarios() {
        System.out.println("\n--- Lista de Usuarios ---");
        for (Usuario u : listaUsuarios) {
            System.out.println("Nombre: " + u.getNombre() + " | Rol: " + u.getRol());
        }
    }
}
