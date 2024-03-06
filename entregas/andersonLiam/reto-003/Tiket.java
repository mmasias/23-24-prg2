import java.time.LocalDate;

public class Tiket {
    private Pelicula pelicula;
    private int numeroFila;
    private int numeroSala;
    private int numeroAsiento;
    private LocalDate fecha;
   
    public Tiket(Pelicula pelicula, int numeroFila, int numeroSala, int numeroAsiento, LocalDate fecha) {
        this.pelicula = pelicula;
        this.numeroFila = numeroFila;
        this.numeroSala = numeroSala;
        this.numeroAsiento = numeroAsiento;
        this.fecha = fecha;
    }
   
   
    
}
