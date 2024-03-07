public class Cine {
    Pelicula pelicula;
    Ticket ticket;
    Visitante visitante;

    public Cine(Pelicula pelicula, Ticket ticket, Visitante visitante) {
        pelicula = pelicula;
        ticket = ticket;
        visitante = visitante;
    }

    public void iniciar() {
    }
}
public class Pelicula {
    String titulo;
    int duracion;

    public Pelicula(String titulo, int duracion) {
        titulo = titulo;
        duracion = duracion;
    }
}


public class Ticket {
    String codigo;
    double precio;

    public Ticket(String codigo, double precio) {
        codigo = codigo;
        precio = precio;
    }
}


public class Visitante {
    String nombre;
    int edad;

    public Visitante(String nombre, int edad) {
        nombre = nombre;
        edad = edad;
    }
}
