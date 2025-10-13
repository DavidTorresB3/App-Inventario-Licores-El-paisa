package Usuarios;

public class Usuario {
     // Atributos privados para proteger los datos (Encapsulamiento)
    private String nombre;
    private String usuario;
    private String contrasena;
    private String rol;

    // Constructor
    public Usuario(String nombre, String usuario, String contrasena, String rol) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

    // Metodo que puede ser sobreescrito (Polimorfismo)
    public void mostrarMenu() {
        System.out.println("Menu general de usuario");
    }
}
