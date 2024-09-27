public class Cine {
    private Pelicula[] pelicula;
    private Visitante[] visitante;
    private Ticket[] ticket;

    public Cine(Pelicula[] pelicula, Visitante[] visitante, Ticket[] ticket) {
        this.pelicula = pelicula;
        this.visitante = visitante;
        this.ticket = ticket;
    }

    public Pelicula[] getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula[] pelicula) {
        this.pelicula = pelicula;
    }

    public Visitante[] getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante[] visitante) {
        this.visitante = visitante;
    }

    public Ticket[] getTicket() {
        return ticket;
    }

    public void setTicket(Ticket[] ticket) {
        this.ticket = ticket;
    }
}