import Restaurante.Cliente.Reseva;

class Restaurante {

    public Restaurante(String nombre, int mesas)
    public Mesa (int numeroMesa)

    public boolean abrirRestaurante()
    public boolean cerrarRestaurante()
    public void hacerReserva()
    public boolean liberarMesa(Mesa numeroMesa)
    public boolean mesaOcupada(Mesa numeroMesa)
    public void recibirCliente(Cliente nombre, int dia)

    Restaurante elRestaurante = new Restaurante ("Britannia", 2)
    elRestaurante.abrirRestaurante()

    Cliente mujer = new Cliente("María")
    Reserva miReserva = new Reserva (mujer)

    Cliente hombre = new Cliente("Alberto")
    Reseva suReserva = new Reserva(hombre)
    
    Mesa unaMesa = new Mesa (1)
    if(!mesaOcupada(1)){
        unaMesa.recibirCliente(mujer)
        unaMesa.mesaOcupada(1)
    }

    Mesa otraMesa = new Mesa (2)
    if(mesaOcupada(1)&& !mesaOcupada(2)){
        otraMesa.recibirCliente(hombre)
        otraMesa.mesaOcupada(2)

    }
 
}

class Cliente {
    public Cliente(String nombre)
}

class Reseva {
    public Reseva(Cliente nombre)
}

class Mesa{
    public Mesa (int numeroMesa)
}
