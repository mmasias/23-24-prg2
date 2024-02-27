import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        Libro libro1 = new Libro(1, "El Señor de los Anillos", "J.R.R. Tolkien");

        Usuario usuario1 = new Usuario(1, "Juan Pérez");

        Prestamo prestamo1 = new Prestamo(libro1, usuario1, "27/02/2024");

        mostrarDetallesPrestamo(prestamo1);
    }

    public static void mostrarDetallesPrestamo(Prestamo prestamo) {
        System.out.println("Detalles del Préstamo:");
        System.out.println("Libro: " + prestamo.getLibro().getTitulo() + ", Autor: " + prestamo.getLibro().getAutor());
        System.out.println("Usuario: " + prestamo.getUsuario().getNombre());
        System.out.println("Fecha de Préstamo: " + prestamo.getFechaPrestamo());
    }

    /*
     * private static Scanner scanner = new Scanner(System.in);
     * private static Biblioteca biblioteca = new Biblioteca(10, 10, 10);
     * 
     * public static void main(String[] args) {
     * while (true) {
     * System.out.println("\nBienvenido a la Biblioteca");
     * System.out.println("1. Agregar Libro");
     * System.out.println("2. Agregar Usuario");
     * System.out.println("3. Realizar Préstamo");
     * System.out.println("4. Salir");
     * System.out.print("Seleccione una opción: ");
     * 
     * int opcion = scanner.nextInt();
     * scanner.nextLine();
     * 
     * switch (opcion) {
     * case 1:
     * agregarLibro();
     * break;
     * case 2:
     * agregarUsuario();
     * break;
     * case 3:
     * realizarPrestamo();
     * break;
     * case 4:
     * System.out.println("Gracias por usar la Biblioteca. ¡Hasta pronto!");
     * return;
     * default:
     * System.out.println("Opción no válida. Por favor, intente de nuevo.");
     * }
     * }
     * }
     * 
     * private static void agregarLibro() {
     * System.out.print("Ingrese título del libro: ");
     * String titulo = scanner.nextLine();
     * 
     * System.out.print("Ingrese autor del libro: ");
     * String autor = scanner.nextLine();
     * 
     * Libro libro = new Libro(titulo, autor);
     * if (biblioteca.agregarLibro(libro)) {
     * System.out.println("Libro agregado exitosamente.");
     * } else {
     * System.out.println("No fue posible agregar el libro.");
     * }
     * }
     * 
     * private static void agregarUsuario() {
     * System.out.print("Ingrese nombre del usuario: ");
     * String nombre = scanner.nextLine();
     * 
     * Usuario usuario = new Usuario(nombre);
     * if (biblioteca.agregarUsuario(usuario)) {
     * System.out.println("Usuario agregado exitosamente.");
     * } else {
     * System.out.println("No fue posible agregar el usuario.");
     * }
     * }
     * 
     * private static void realizarPrestamo() {
     * System.out.print("Ingrese el título del libro a prestar: ");
     * String titulo = scanner.nextLine();
     * 
     * System.out.print("Ingrese nombre del usuario: ");
     * String nombre = scanner.nextLine();
     * 
     * Libro libro = biblioteca.buscarLibroPorTitulo(titulo);
     * Usuario usuario = biblioteca.buscarUsuarioPorNombre(nombre);
     * 
     * if (libro != null && usuario != null) {
     * Prestamo prestamo = new Prestamo(libro, usuario, "Fecha actual");
     * if (biblioteca.registrarPrestamo(prestamo)) {
     * System.out.println("Préstamo realizado con éxito.");
     * } else {
     * System.out.println("No fue posible realizar el préstamo.");
     * }
     * } else {
     * System.out.println("Libro o usuario no encontrado.");
     * }
     * }
     */
}
