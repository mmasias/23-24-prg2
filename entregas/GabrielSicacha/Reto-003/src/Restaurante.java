public class Restaurante {
    int id;
    Mesa[] mesas;
    Reserva[] reservas;

    public Restaurante(int id, int numDeMesas);

    public void crearReserva(Cliente cliente);

    public Mesa obtenerMesasDisponibles();


    public void cancelarReserva(int idDeReserva);
}
