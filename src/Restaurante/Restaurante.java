public class Restaurante {

    private String nombre;
    private int numeroMesas;

    public Restaurante() {

    }

    public Restaurante(String nombre) {

        this.nombre = nombre;
        
    }
    
    public void mesasDisponibles(int numeroMesas) {

        this.numeroMesas = numeroMesas;

    }

    public String mostrar() {
        return "Restaurante: | " + "nombre: " + nombre + " - " + "mesas disponibles: " + this.numeroMesas;
    }



}
