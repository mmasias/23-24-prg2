package Reto3;

import java.time.LocalDateTime;

class Restaurante {

    private Cliente cliente;
    private Mesa[] mesa;
    private Reserva reserva;
    private int indiceMesa;
    private Reserva[] reservas;
    private int indiceReserva;

    public Restaurante(Cliente cliente, Mesa mesa, Reserva reserva, int maxMesas, int maxReservas) {
        this.cliente = cliente;
        this.mesa = new Mesa[maxMesas];
        this.reserva = reserva;
        this.indiceMesa = 0;
        this.reservas = new Reserva[maxReservas];
        this.indiceReserva = 0;
    }

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

    public void anadirMesa(Mesa mesa) {
        if (indiceMesa < this.mesa.length) {
            this.mesa[indiceMesa] = mesa;
            indiceMesa++;
        } else {
            System.out.println("No se puede añadir más mesas. El restaurante está lleno.");
        }
    }

    public void removeMesa(Mesa mesa) {
        for (int i = 0; i < indiceMesa; i++) {
            if (this.mesa[i].equals(mesa)) {
                for (int j = i; j < indiceMesa - 1; j++) {
                    this.mesa[j] = this.mesa[j + 1];
                }
                indiceMesa--;
                return;
            }
        }
        System.out.println("La mesa no se encontró.");
    }

    public void asignarClienteAMesa(int numeroMesa, Cliente cliente) {
        if (numeroMesa >= 0 && numeroMesa < mesa.length) {
            mesa[numeroMesa].setCliente(cliente);
        } else {
            System.out.println("Número de mesa inválido.");
        }
    }

    public void addReserva(Reserva reserva) {
        if (indiceReserva < reservas.length) {
            this.reservas[indiceReserva] = reserva;
            indiceReserva++;
        } else {
            System.out.println("No se puede añadir más reservas. El restaurante está lleno.");
        }
    }

    public void removeReserva(Reserva reserva) {
        for (int i = 0; i < indiceReserva; i++) {
            if (reservas[i].equals(reserva)) {
                for (int j = i; j < indiceReserva - 1; j++) {
                    reservas[j] = reservas[j + 1];
                }
                indiceReserva--;
                return;
            }
        }
        System.out.println("La reserva no se encontró.");
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

    public void hacerReserva(Restaurante restaurante, Mesa mesa, LocalDateTime fechaHora) {
        Reserva reserva = new Reserva(this, mesa, fechaHora);
        restaurante.addReserva(reserva);
    }

    public void anularReserva(Restaurante restaurante, Reserva reserva) {
        restaurante.removeReserva(reserva);
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

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean estaCancelada() {
        return estaCancelada;
    }

    public void setEstaCancelada(boolean estaCancelada) {
        this.estaCancelada = estaCancelada;
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

    public boolean estaDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setReserva(Reserva reserva) {
        if (reserva != null) {
            this.disponible = false;
        } else {
            this.disponible = true;
        }
    }
}
