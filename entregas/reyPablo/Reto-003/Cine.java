public class Cine{
    private Pelicula[] pelicula;
    private Visitante[] visitante;
    private Ticket[] ticket;
    public Cine(Pelicula[] pelicula, Visitante[] visitante, Ticket[] ticket){
        this.pelicula=pelicula;
        this.visitante=visitante;
        this.ticket=ticket;
    }
}