class Restaurante {
    public Restaurante (localDate horaApertura, localDate horaCierre);
    public boolean abierto();
    public boolean diaDisponible();
    public boolean mesaDisponible();
    public boolean horaDisponible();
    public void hacerReserva();
    public void recibirCliente (Cliente nombre);

}