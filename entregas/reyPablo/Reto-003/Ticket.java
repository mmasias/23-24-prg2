
    import java.time.LocalDate;

public class Ticket {
    private Pelicula pelicula;
    private int numeroFila;
    private int numeroSala;
    private int numeroAsiento;
    private LocalDate fecha;
   
    public Ticket(Pelicula pelicula, int numeroFila, int numeroSala, int numeroAsiento, LocalDate fecha) {
        this.pelicula = pelicula;
        this.numeroFila = numeroFila;
        this.numeroSala = numeroSala;
        this.numeroAsiento = numeroAsiento;
        this.fecha = fecha;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public int getNumeroFila() {
        return numeroFila;
    }
    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }
    public int getNumeroSala() {
        return numeroSala;
    }
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    public int getNumeroAsiento() {
        return numeroAsiento;
    }
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
   
  
   
    
}
