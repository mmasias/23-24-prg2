public class Restaurante{
   
    public boolean abierto()
    public Reserva buscarMesa(Reserva reserva)
    public bolean  mesaDisponible(Mesa mesa)
}

class cliente{
    
    public String nombre;
    public String apellido;
    public cliente (String nombre, String apellido)
    
}

class reserva{
   
    public reserva(cliente cliente, String fecha, Mesa mesa)
    public String fecha();

}

class Mesa{
   
    public int capacidad;
    public int  numero;
    public boolean mesaLibre;
    public mesa( int capacidad, int numero, boolean mesaDisponible)
}