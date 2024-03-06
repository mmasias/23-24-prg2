import java.time.*;

class Cine{

    public Cine(String nombre, LocalTime horaApertura, LocalTime horaCierre){
    }
    public boolean comprobarEstadoTicket(Ticket ticket){
    }
    public void reproducirPelicula(Pelicula pelicula){
    }
    public void pausarPelicula(Pelicula pelicula){
    }

}

class Pelicula{

    public Pelicula(String nombre, LocalTime horaSesion, int salaEstablecida){
    } 

}

class Ticket{

    public Ticket(int identificacion, Visitante visitante, Pelicula pelicula){
    }
    public Pelicula obtenerPelicula(){
    }

}

class Visitante{

    public Visitante(String nombre){
    }
    public Ticket comprarTicket(Pelicula pelicula, LocalTime horaSesion){
    }
    public void enseñarTicket(Ticket ticket){
    }
    public void entrarSala(){
    }
    
}

