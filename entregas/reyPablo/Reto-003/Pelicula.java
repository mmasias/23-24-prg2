
public class Pelicula {
    private String nombre;
    private int numeroPersonajes;
    private int duracion;
   
    public Pelicula(String nombre, int numeroPersonajes, int duracion) {
        this.nombre = nombre;
        this.numeroPersonajes = numeroPersonajes;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPersonajes() {
        return numeroPersonajes;
    }

    public void setNumeroPersonajes(int numeroPersonajes) {
        this.numeroPersonajes = numeroPersonajes;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }



}    
