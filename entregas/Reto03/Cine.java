package entregas.Reto03;

class Cine {
    public Cine(String nombre,int horario){}

    public void abierto(){}
    public void estaAbierto(){}
    public void cerrado(){}
    public void estaCerrado(){}
    public void mostrarPeliculas(){}
    public Ticket comprarTicket(){}

    
}
class Ticket{
    
    public Ticket(String persona, int edad){}
    
    public Pelicula pelicula(){}
    public boolean promociones(String pelicula){}
    public String[ ][ ] asientos(String fila, int numeroAsiento){}
    public boolean asientosEspeciales(){}
    public boolean snacks(){}
    public void precio(){}
    public void pago(){}
    public Persona persona(){}
}

class Pelicula{

    public Pelicula(String titulodePelicula,double duracionDePelicula){}

    public void titulodePelicula(){}
    public double horario(){}
    public double duracionDePelicula(){}
    public boolean estaDisponible(){}
    public void fecha(int fecha){}

}


class Persona{

    public Persona(String nombre){}

    public void nombre(){}
    public void edad(){}
    public void dni(){}
    public void genero(){}

}



