class Restaurante2 {

    public Restaurante(LocalDate apertura, LocalDate cierre)

    public boolean abierto()
    public Mesa liberarMesa()
    public Mesa mesaOcupada()
    public Reserva hacerReservar(Cliente cliente)
    public boolean confirmarReserva(Reserva reserva)
    public void recibirCliente(Cliente nombre)
  
}

    class Simulacion {

        public static void main(String[] args) {

            Restaurante britannia = new Restaurante(apertura, cierre);

            Cliente mariaArroniz = new Cliente("Maria Arroniz");
            Cliente albertoSaiz = new Cliente("Alberto Saiz");

            britannia.hacerReserva(mariaArroniz);
            britannia.hacerReserva(albertoSaiz);

            Mesa unaMesa = new Mesa(1, 4);
            Mesa otraMesa = new Mesa(2, 4);

            if (!mesaOcupada(1, 4)) {
                unaMesa.recibirCliente(mariaArroniz);
                unaMesa.mesaOcupada(1, 4);

            } else if (mesaOcupada(1, 4) && !mesaOcupada(2, 4)) {
                otraMesa.recibirCliente(albertoSaiz);
                otraMesa.mesaOcupada(2, 4);

            }

        }

    }

class Cliente {

    public Cliente(String nombre)

    public String obtenerNombre()
}

class Reseva {

    public Reseva(int cantidad, LocalDate fecha, Cliente cliente)

    public int obtenerReserva()
}

class Mesa {

    public Mesa(int numero, int capacidad)

    public int obtenerCapacidad()
    public int obternerNumero()

}
