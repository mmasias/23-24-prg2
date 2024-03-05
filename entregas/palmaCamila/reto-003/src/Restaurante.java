
class Restaurante {
    public Restaurante();

    public void iniciarJornada(int hora);

    public void iniciarJornada(int hora);

    public Mesa obtenerMesaDisponible(Mesa[] mesas);

    public Reserva hacerReserva(Cliente cliente);

    public boolean confirmarReserva(Reserva reserva);
}

class Mesa {
    public Mesa(int numeroDeMesa, int capacidadDeLaMesa, int numeroDePersonasSentadas);

    public int capacidadDeLaMesa();

    public int obtenerNumeroDeMesa();
}

class Cliente{

    public Cliente(String nombre);

    public String obtenerNombre();
}

 Cliente damian = new Cliente("damian");
 damian.obtenerNombre();

 class Reserva {
        public Reserva(int numeroDePersonasAReservar, int fecha, String nombreDelCliente, int numeroDeMesa);

        public int obtenerId();
}

Reserva reserva = new Reserva(2, 1, 5, "damian");
int numeroDeReserva = reserva.obtenerId()
;