class Cine {
    public Cine(String nombre, String ubicacion, int horaApertura, int horaCierre) {
    }

    public String nombre() {
    }

    public String ubicacion() {
    }

    public String horaApertura() {
    }

    public String horaCierre() {
    }

    public boolean abierto(int hora) {
    }

    public boolean abierto(Intervalo fecha) {
    }
}

class Pelicula {
    public Pelicula(String titulo, int duracion, int pegi, boolean enCartelera) {
    }

    public String titulo() {
    }

    public int duracion() {
    }

    public boolean esNovedad(String titulo) {
    }

    public int obtenerPegi() {
    }
}

class Ticket {

    public Ticket(Pelicula pelicula, Cine cine, Visitante visitante, String fecha, String hora) {
    }

    public String pelicula() {
    }

    public String cine() {
    }

    public String fecha() {
    }

    public String nombre(Visitante visitante) {
    }

    public int obtenerPrecio() {
    }

    public boolean esValido() {
    }

    public int[] obtenerSitio() {
    }

    public int obtenerHora() {
    }
}

class Visitante {
    public Visitante(String nombre, int edad) {
    }

    public String obtenerNombre() {
    }

    }

    Visitante visitante = new Visitante("Yusep Diaz", 49);
    Cine cinesa = new Cine("Cinesa", "C. Francisco Tomás y Valiente, 1, 39011 Santander, Cantabria", 10, 22);
    Pelicula pelicula = new Pelicula("Aquaman y el reino perdido", 124, 12, true);
    Ticket ticket = new Ticket(pelicula, cinesa, visitante, "02/03/2024", "19:00");

    if(cinesa.abierto(ticket.obtenerHora()))
    {
            if (ticket.esValido()) {
                System.out.println(visitante.obtenerNombre() + " Su asiento es: " + ticket.obtenerSitio()[0]);
            } else {
                System.out.println("El ticket no es válido");
            }
        }else
    {
        System.out.println("El cine está cerrado");
}
