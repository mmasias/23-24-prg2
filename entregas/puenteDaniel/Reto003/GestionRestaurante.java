public class GestionRestaurante {


    public GestionRestaurante(Cliente cliente, Mesa mesa, Reservacion reservacion, int limiteMesas, int limiteReservaciones) {}

    public Cliente registrarCliente() {}
    public Reservacion crearReservacion() {}
    public void agregarMesa(Mesa mesa) {}
    public void quitarMesa(Mesa mesa) {}
    public void asignarClienteAMesa(int numeroMesa, Cliente cliente) {}
    public void agregarReservacionARestaurante(Reservacion reservacion) {}
    public void cancelarReservacion(Reservacion reservacion) {}

}


public class Cliente {
    
    public Cliente(String nombre, String apellido) {}

    
    public String definirNombre() {}
    public String definirApellido() {}
    public void realizarReservacion(GestionRestaurante restaurante, Mesa mesa, LocalDateTime fechaHora) {}
    public void deshacerReservacion(GestionRestaurante restaurante, Reservacion reservacion) {}

}


public class Reservacion {

    public Reservacion(Cliente cliente, Mesa mesa, LocalDateTime fechaHora) {}

    public Cliente especificarCliente() {}
    public Mesa seleccionarMesa() {}
    public LocalDateTime programarFechaHora() {}
    public boolean verificarCancelacion() {}

}


public class Mesa {

    public Mesa(int capacidad, int numero, boolean disponible) {}

    public int establecerCapacidad() {}
    public int asignarNumero() {}
    public boolean comprobarDisponibilidad() {}
    public Cliente asignarCliente() {}
    public void vincularReservacion(Reservacion reservacion) {}

}