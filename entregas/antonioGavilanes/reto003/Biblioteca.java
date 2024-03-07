package entregas.antonioGavilanes.reto003;

import java.time.LocalDate;

class Biblioteca {

    public String nombre;
    public LocalDate fechaDePrestamo;
    public LocalDate fechaDeDevolucion;

    public Biblioteca(String nombre, LocalDate fechaDePrestamo, LocalDate fechaDeDevolucion) {

        this.nombre = nombre;
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public boolean estaPrestado() {

        return fechaDePrestamo != null;
    }

    public boolean estaDevuelto() {

        return fechaDeDevolucion != null;
    }

    public void prestar() {

        fechaDePrestamo = LocalDate.now();
    }
}

class Libro {

    public String titulo;
    public String autor;

    public Libro(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
    }
}

class Usuario {

    public String nombre;
    public String dni;

    public Usuario(String nombre, String dni) {

        this.nombre = nombre;
        this.dni = dni;
    }

    public void pedirPrestamo(Biblioteca biblioteca, Libro libro) {
        if (biblioteca.estaPrestado() == true) {
            System.out.println("El libro \"" + libro.titulo + "\" no está disponible.");
            return;
        }
        biblioteca.prestar();
    }

    public void devolverLibro(Libro libro, Biblioteca biblioteca) {
        if (biblioteca.fechaDePrestamo != null && biblioteca.nombre.equals(this.nombre)) {
            biblioteca.fechaDeDevolucion = LocalDate.now();
            System.out.println("El libro \"" + libro.titulo + "\" ha sido devuelto exitosamente.");
        } else {
            System.out.println("No puedes devolver este libro porque no está prestado por ti.");
        }
    }
}

public class Prestamo {
    public LocalDate fechaDePrestamo;
    public LocalDate fechaDeDevolucion;
    public Biblioteca biblioteca;
    public Libro libro;
    public Usuario usuario;

    public Prestamo(Biblioteca biblioteca, Libro libro, Usuario usuario, LocalDate fechaDePrestamo,
            LocalDate fechaDeDevolucion) {

        this.biblioteca = biblioteca;
        this.libro = libro;
        this.usuario = usuario;
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String nombreUsuario() {
        return usuario.nombre;
    }

    public String nombreLibro() {
        return libro.titulo;
    }

    public boolean estaAtrasado() {
        return fechaDeDevolucion != null && fechaDeDevolucion.isBefore(LocalDate.now());
    }

    public boolean estaDevuelto() {
        return fechaDeDevolucion != null;
    }

    public boolean estaPrestado() {
        return fechaDePrestamo != null;
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Antonio Gavilanes", "12345678A");
        Libro libroPrestado = new Libro("La Metamorfosis", "Franz Kafka");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", LocalDate.of(2024, 3, 1),
                LocalDate.of(2024, 3, 15));

        // Ejemplo de préstamo y devolución
        usuario.pedirPrestamo(biblioteca, libroPrestado);
        usuario.devolverLibro(libroPrestado, biblioteca);
    }
}
