public class Biblioteca {
    private Libro[] libros;
    private Usuario[] usuarios;
    private Prestamo[] prestamos;
    private int maxLibros;
    private int maxUsuarios;
    private int maxPrestamos;
    private int indiceLibros = 0;
    private int indiceUsuarios = 0;
    private int indicePrestamos = 0;

    public Biblioteca(int maxLibros, int maxUsuarios, int maxPrestamos) {
        this.maxLibros = maxLibros;
        this.maxUsuarios = maxUsuarios;
        this.maxPrestamos = maxPrestamos;
        this.libros = new Libro[maxLibros];
        this.usuarios = new Usuario[maxUsuarios];
        this.prestamos = new Prestamo[maxPrestamos];
    }

    public boolean agregarLibro(Libro libro) {
        if (indiceLibros < maxLibros) {
            libros[indiceLibros++] = libro;
            return true;
        } else {
            System.out.println("Capacidad máxima de libros alcanzada.");
            return false;
        }
    }

    public boolean agregarUsuario(Usuario usuario) {
        if (indiceUsuarios < maxUsuarios) {
            usuarios[indiceUsuarios++] = usuario;
            return true;
        } else {
            System.out.println("Capacidad máxima de usuarios alcanzada.");
            return false;
        }
    }

    public boolean registrarPrestamo(Prestamo prestamo) {
        if (indicePrestamos < maxPrestamos) {
            prestamos[indicePrestamos++] = prestamo;
            return true;
        } else {
            System.out.println("Capacidad máxima de préstamos alcanzada.");
            return false;
        }
    }

    public Libro buscarLibroPorId(int id) {
        for (int i = 0; i < indiceLibros; i++) {
            if (libros[i].getId() == id) {
                return libros[i];
            }
        }
        return null;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (int i = 0; i < indiceLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return libros[i];
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (int i = 0; i < indiceUsuarios; i++) {
            if (usuarios[i].getNombre().equalsIgnoreCase(nombre)) {
                return usuarios[i];
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (int i = 0; i < indiceUsuarios; i++) {
            if (usuarios[i].getId() == id) {
                return usuarios[i];
            }
        }
        return null;
    }

}
