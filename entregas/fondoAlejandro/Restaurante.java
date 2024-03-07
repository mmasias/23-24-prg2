class Restaurante {

    public Restaurante(Fecha apertura, Fecha cierre)

    public boolean abierto()
    public Reserva reservarMesa(Cliente cliente)
    public Mesa adjudicarMesa(Reserva reserva)
    public Mesa mesaOcupada()
    public void atenderCliente(Cliente nombre)

}

class Reserva {

    public Reserva(int comensales,Fecha fecha, Cliente cliente)
}

class Mesa {

    public Mesa(int numeroMesa, int cantidadComensales)
    public int numeroMesa()
    public int cantidadComensales()
}

class Cliente {
    
    public Cliente(String nombre)
}