package Reto3;

import java.time.LocalDateTime;

class Restaurante {

    private Cliente cliente;
    private Reserva reserva;
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
}


class Cliente {

    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}


class Reserva {

    private Cliente cliente;
    private Mesa mesa;
    private LocalDateTime fechaHora;
    private boolean estaCancelada;

    public Reserva(Cliente cliente, Mesa mesa, LocalDateTime fechaHora) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.fechaHora = fechaHora;
        this.estaCancelada = false;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}



class Mesa {

    private int capacidad;
    private int numero;
    private boolean disponible;
    private Cliente cliente;

    public Mesa(int capacidad, int numero, boolean disponible) {
        this.capacidad = capacidad;
        this.numero = numero;
        this.disponible = disponible;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}










