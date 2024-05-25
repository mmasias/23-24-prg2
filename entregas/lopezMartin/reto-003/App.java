import java.time.LocalTime;

public class App {
    public static void main(String[] args) {

        Cine cinesa = new Cine("Cinesa", LocalTime.of(16,0,0), LocalTime.of(23,0,0) );
        Cine ocine = new Cine("Ocine", LocalTime.of(16,0,0), LocalTime.of(23,0,0));
        Pelicula starwars = new Pelicula("Star Wars", LocalTime.of(20, 0, 0), 6);
        Visitante martin = new Visitante("Martín López");
        Ticket ticketMartin = new Ticket(23, martin, starwars);

        martin.comprarTicket(starwars, LocalTime.of(20, 0, 0));
        martin.enseñarTicket(ticketMartin);
        if (cinesa.comprobarEstadoTicket(ticketMartin)) {
            martin.entrarSala();
        }

    }
}
