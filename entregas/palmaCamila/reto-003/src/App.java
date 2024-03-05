public class App {
    public static void main(String[] args) {

        Cliente damian = new Cliente("damian");
        damian.obtenerNombre();

        Reserva reserva = new Reserva(2, 1, 5, "damian");
        int numeroDeReserva = reserva.obtenerId();

    }
}
