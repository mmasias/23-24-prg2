 class Restaurante {
   
    public Restaurante(String nombre, String direccion, int horaApertura, int horaCierre) {
    }
    public String getNombre() {
    }
    public String getDireccion() {
    }
    public String horaApertura() {
    }
    public boolean abierto(int hora) {
    }
}

 class Reserva {
    public Reserva(int numeroReserva, String fecha, int cliente, int mesa) {
    }
    public int getNumeroReserva() { 
    }
    public String getFecha() {   
    }
    public int getCliente() {  
    }
    public int getMesa() {  
    }


}

class Cliente {

    public Cliente(String nombre, String telefono) {
    }
    public String getNombre() {
    }

    public String getTelefono() {
    }
}

 class Mesa {

    public Mesa(int numeroMesa, int capacidad) {
    }
    public int getNumeroMesa() {
    }
    public int getCapacidad() {
    }
}


Mesa mesa = new Mesa(3, 8);
Cliente cliente = new Cliente("Picoli", "66611222");
Reserva reserva = new Reserva("221", 124, 12, true);
Restaurante restaurante = new Restaurante("Raul", "Calle Univerdidad de Brandon", 8:00, 9:00);

if(resturante.abierto(cliente.getNombre())) 
{
        if (reserva.getNumeroReserva()) {
            System.out.println(cliente.obtenerNombre() + " Su mesa es: " + reserva.getMesa());
        } else {
            System.out.println("No tiene reserva");
        }
        } else
{
    System.out.println("El restaurante esta cerrado");
}