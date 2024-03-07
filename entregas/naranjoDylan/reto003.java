import java.util.Random;

class Cine {

    public Cine(String nombreCine, String ubicacionCine, int salasCine) {
        nombre = nombreCine;
        ubicacion = ubicacionCine;
        salas = salasCine;
    }

    public String nombre;
    public String ubicacion;
    public int salas;
    public Pelicula[] cartelera;

    public void mostrarCartelera() {
        System.out.println("Cartelera de " + nombre + ":");
        for (Pelicula pelicula : cartelera) {
            pelicula.mostrarNombre();
            pelicula.mostrarGenero();
            System.out.println("------------------------");
        }
    }

    public Ticket venderTicket(Pelicula pelicula, Visitante visitante) {
        System.out.println("Vendiendo ticket para " + pelicula.nombre + " a " + visitante.nombre);
        return new Ticket(pelicula, visitante);
    }
}

class Pelicula {
    public Pelicula(String nombrePelicula, String generoPelicula) {
        nombre = nombrePelicula;
        genero = generoPelicula;
    }

    public String nombre;
    public String genero;

    public void mostrarNombre() {
        System.out.println("Pelicula: " + nombre);
    }

    public void mostrarGenero() {
        System.out.println("Género: " + genero);
    }

    public static Pelicula seleccionarPeliculaAleatoria(Pelicula... peliculas) {
        Random rand = new Random();
        int index = rand.nextInt(peliculas.length);
        return peliculas[index];
    }
}

class Ticket {

    public Ticket(Pelicula peliculaTicket, Visitante visitanteTicket) {
        pelicula = peliculaTicket;
        visitante = visitanteTicket;
    }

    public String descripcion;
    public String prioridad;
    public String estado;
    public Pelicula pelicula;
    public Visitante visitante;

    public void mostrarDescripcion() {
        System.out.println("Descripción del ticket: " + descripcion);
    }

    public void mostrarPrioridad() {
        System.out.println("Prioridad del ticket: " + prioridad);
    }

    public void mostrarEstado() {
        System.out.println("Estado del ticket: " + estado);
    }

    public void marcarComoResuelto() {
        estado = "Resuelto";
    }
}

class Visitante {
    public Visitante(String nombreVisitante) {
        nombre = nombreVisitante;
    }

    public String nombre;
}

public class reto003 {
    public static void main(String[] args) {
        Cine cine = new Cine("Cinesa", "El Corte Inglés", 5);

        Pelicula pelicula1 = new Pelicula("Kung fu panda 4", "Animación/Acción");
        Pelicula pelicula2 = new Pelicula("Avengers: Endgame", "Acción/Aventura");
        Pelicula pelicula3 = new Pelicula("Godzilla y Kong: El nuevo imperio", "Ciencia Ficción/Acción");

        cine.cartelera = new Pelicula[] { pelicula1, pelicula2, pelicula3 };
        cine.mostrarCartelera();

        Visitante visitante1 = new Visitante("Pedro");
        Pelicula peliculaSeleccionada = Pelicula.seleccionarPeliculaAleatoria(pelicula1, pelicula2, pelicula3);
        Ticket ticket = cine.venderTicket(peliculaSeleccionada, visitante1);
        ticket.mostrarEstado();
        ticket.marcarComoResuelto();
        ticket.mostrarEstado();
    }
}
