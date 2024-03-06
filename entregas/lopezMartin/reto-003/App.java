import java.time.LocalTime;

public class App {
    public static void main(String[] args) {

        Cine cinesa = new Cine("Cinesa", LocalTime.of(16,0,0), LocalTime.of(23,0,0) );
        Cine ocine = new Cine("Ocine", LocalTime.of(16,0,0), LocalTime.of(23,0,0));
        Visitante martin = new Visitante("Martín López");
        Ticket ticketMartin = new Ticket(23, martin);

        martin.comprarTicket();
        martin.enseñarTicket(ticketMartin);
        if (cinesa.comprobarEstadoTicket(ticketMartin)) {
            martin.entrarSala();
        }

    }
}
