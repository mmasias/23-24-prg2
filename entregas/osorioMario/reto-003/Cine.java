public class Cine {
    Pelicula pelicula;
    Ticket ticket;
    Visitante visitante;

    public Cine(Pelicula pelicula, Ticket ticket, Visitante visitante) {
        pelicula = pelicula;
        ticket = ticket;
        visitante = visitante;
    }

    public void iniciar() {
    }
}
public class Pelicula {
    String titulo;
    int duracion;

    public Pelicula(String titulo, int duracion) {
        titulo = titulo;
        duracion = duracion;
    }
}

