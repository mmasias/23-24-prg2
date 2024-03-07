import java.time.LocalDate;

public class Reserva {
    

private Mesa mesa;
private Cliente cliente;
private LocalDate fechaHora;

public Reserva(Mesa mesa, Cliente cliente, LocalDate fechaHora) {
    this.mesa = mesa;
    this.cliente = cliente;
    this.fechaHora = fechaHora;
}

public Mesa getMesa() {
    return mesa;
}

public void setMesa(Mesa mesa) {
    this.mesa = mesa;
}

public Cliente getCliente() {
    return cliente;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}

public LocalDate getFechaHora() {
    return fechaHora;
}

public void setFechaHora(LocalDate fechaHora) {
    this.fechaHora = fechaHora;
}



}
