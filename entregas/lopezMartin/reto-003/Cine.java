class Cine{

    public Cine(String nombreCine, String direccion){

    }

    Cine cine1 = new Cine("Cinesa", "C. Francisco Tomás y Valiente");

    

}
class Pelicula{

    public Pelicula(String nombrePelicula, String horaSesionPelicula, int salaEstablecida){

    }

    Pelicula starWars1 = new Pelicula("Star Wars", "20:45", 3);

}
class Ticket{

    public Ticket(String nombrePelicula, String sesionPelicula, int precio, boolean ticketValidad){

    }

    Ticket ticket1 = new Ticket("Star Wars", "20:45", 7, false);


}
class Visitante{

    public Visitante(boolean tieneTciket){

    }

    Visitante visitante1 = new Visitante(true);

    public void comprarTicket(){

    }

    public void enseñarTicket(){

    }
    public void entrarSala(){

    }
    
}





