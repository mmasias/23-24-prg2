class Restaurante {
    
    public Restaurante (LocalDate horaApertura, LocalDate horaCierre);
    public Restaurante (Intervalo horas);
    
    public boolean abierto();
    public boolean disponible(Intervalo horas);
    public boolean disponible(LocalDate dia);
    public void recibirCliente (Cliente cliente);
}
