class Restaurante {

    public Restaurante(Fecha apertura, Fecha cierre)

    public boolean abierto()
    public Reserva reservarMesa(Reserva reserva)
    public Mesa adjudicarMesa(Cliente cliente)
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

class Simular {

    public static void main(String [] args) {
        
        Restaurante donJamon = new Restaurante (apertura, cierre);

        Cliente fondoAlejandro = new Cliente ("Alejandro Fondo");
        donJamon.reservarMesa(fondoAlejandro);

        Mesa unaMesa = new Mesa(1,2);

        if(!mesaOcupada(1,2)) {
            unaMesa.adjudicarMesa(fondoAlejandro);
            unaMesa.mesaOcupada(1,2);
        }
    }
}