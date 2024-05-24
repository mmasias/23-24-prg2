public class Restaurante{
   
    public boolean abierto()
    public boolean  mesaDisponible(Mesa mesa)
    public Reserva buscarMesa()
    
}

class Cliente{
    
    public Cliente (String nombre, String apellido)
    public Cliente (String telefono)
    public Cliente (String nombre, int telefono)
    public void darNombre(String nombre, String apellido)
    public voud darTelefono(int telefono)
    
}

class Reserva{

    public Reserva(cliente cliente, int fecha, Mesa mesa)
    public void  darFecha(int fecha);

}

class Mesa{

    public Mesa( int capacidad, int numero, boolean mesaDisponible)
    public int capacidad;
    public boolean mesaLibre;
}