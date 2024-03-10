package entregas.antonioGavilanes.reto003;

import java.time.LocalDate;

class Biblioteca {


    public Biblioteca(String nombre, String direccion)

    public boolean disponible(Libro libro)
    public Prestamo prestar(Libro libro, Usuario usuario)
    public void multar(Usuario usuario, double cantidad)

}

class Libro {

    public Libro(String titulo, String autor)

}

class Usuario {

    public Usuario(String nombre, String apellido, String dni)

    public Libro pedir(Libro libro)
    public Libro pedir(Libro libro, Prestamo prestamo)
    public Libro devolver(Libro libro)
}

public class Prestamo {

    public Prestamo(Biblioteca biblioteca, Libro libro, Usuario usuario, Intervalo Intervalo)
}