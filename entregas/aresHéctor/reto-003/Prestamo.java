import java.time.LocalDate;



public class Prestamo {

    private Usuario usuario;
    private LocalDate fechadeprestamo;
    private int duracion;
    private Libro libro;
    
    
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public LocalDate getFechadeprestamo() {
        return fechadeprestamo;
    }
    public void setFechadeprestamo(LocalDate fechadeprestamo) {
        this.fechadeprestamo = fechadeprestamo;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    
}
