public class Biblioteca {

    private Libro[] libro;
    private Prestamo[] prestamo;
    private Usuario[] usuario;


    
   
    public Biblioteca(Libro[] libro, Prestamo[] prestamo, Usuario[] usuario) {
        this.libro = libro;
        this.prestamo = prestamo;
        this.usuario = usuario;
    }
    public Libro[] getLibro() {
        return libro;
    }
    public void setLibro(Libro[] libro) {
        this.libro = libro;
    }
    public Prestamo[] getPrestamo() {
        return prestamo;
    }
    public void setPrestamo(Prestamo[] prestamo) {
        this.prestamo = prestamo;
    }
    public Usuario[] getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario[] usuario) {
        this.usuario = usuario;
    }

    public void insertarLibro(Libro libro){

    }


    public Libro buscarLibro(String libro)
    {
        return null;
}

    
    

    
}