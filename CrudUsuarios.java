import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nombre;
    int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

public class CrudUsuarios {
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> crearUsuario();
                case 2 -> mostrarUsuarios();
                case 3 -> eliminarUsuario();
            }
        } while (opcion != 4);
    }

    static void crearUsuario() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        usuarios.add(new Usuario(nombre, edad));
        System.out.println("Usuario creado");
    }

    static void mostrarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    static void eliminarUsuario() {
        System.out.print("Nombre a eliminar: ");
        String nombre = sc.nextLine();

        usuarios.removeIf(u -> u.nombre.equalsIgnoreCase(nombre));
        System.out.println("Usuario eliminado (si exista)");
    }
}



