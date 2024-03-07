public class Ticket {
    public Pelicula pelicula;
    public int numeroFila;
    public int numeroSala;
    public int numeroAsiento;
    public LocalDate fecha;

    public Tiket(Pelicula pelicula, int numeroFila, int numeroSala, int numeroAsiento, LocalDate fecha) {
        this.pelicula = pelicula;
        this.numeroFila = numeroFila;
        this.numeroSala = numeroSala;
        this.numeroAsiento = numeroAsiento;
        this.fecha = fecha;
    }



}