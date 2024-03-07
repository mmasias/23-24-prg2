package entregas.Reto03;

import java.lang.reflect.AccessFlag.Location;

public class Cine {
    public Cine(String nombre, int horario) {
    }

    public void abierto() {
    }

    public void cerrado() {
    }

    public boolean estaAbierto() {
    }

    public void mostrarPelicula() {
    }

    public Ticket comprarTicket() {
    }
}

public class Pelicula {

    public Pelicula(String tituloPelicula, double duracionPelicula) {
    }

    public void tituloPelicula() {
    }

    public int horario() {
    }

    public double duracionPelicula() {
    }

    public boolean estaDisponible() {
    }

    public void fecha(int fecha) {
    }
}

class Ticket {

    public Ticket(String persona, int edad) {
    }

    public Pelicula pelicula() {
        return null;
    }

    public void asientos() {
    }

    public boolean asientosEspeciales() {
        return false;
    }

    public boolean snacks() {
        return false;
    }

    public void promociones() {
    }

    public void precio() {
    }

    public void pago() {
    }

    public Persona persona() {
        return null;
    }
}

public class Persona {

    public Persona(Sting nombre) {
    }

    public void nombre() {
    }

    public void dni() {
    }

    public void edad() {
    }

    public void genero() {
    }
}