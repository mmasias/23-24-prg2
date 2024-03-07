public class Restaurante {

    private Mesa[] mesas;
    private Reserva[] reservas;
    private Cliente[] clientes;
   
    public Restaurante(Mesa[] mesas, Reserva[] reservas, Cliente[] clientes) {
        this.mesas = mesas;
        this.reservas = reservas;
        this.clientes = clientes;
    }

    public Mesa[] getMesas() {
        return mesas;
    }

    public void setMesas(Mesa[] mesas) {
        this.mesas = mesas;
    }

    public Reserva[] getReservas() {
        return reservas;
    }

    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    


    
}