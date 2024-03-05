public class Biblioteca {

    private Interval horario;

    public boolean estaBibliotecaAbierta(Interval horarioAbierto) {
    }

    public Biblioteca(Interval horarioAbierto) {
    }
}

public class Usuario {

    private String nombre;
    private String dni;

    public String getNombre() {
    }

    public String getDni() {
    }

    public Usuario(String nombre, String dni) {
    }
}

public class Libro {

    private boolean disponible;
    private int numeroEjemplares;
    private String titulo;

    public boolean isDisponible() {
    }

    public int getNumeroEjemplares() {
    }

    public String getTitulo() {
    }

    public Libro(String titulo, int numeroEjemplares) {
    }
}

public class Prestamo {

    private Usuario usuario;
    private String fechaInicio;
    private String fechaFin;
    private Libro libro;

    public Prestamo(Usuario usuario, String fechaInicio, String fechaFin, Libro libro) {
    }
}
