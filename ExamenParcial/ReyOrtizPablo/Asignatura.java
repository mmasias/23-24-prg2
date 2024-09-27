package ReyOrtizPablo;
public class Asignatura {
    private String nombrePrincipal;
    private String nombreAbreviado;
    private int creditos;

    public Asignatura(String nombrePrincipal, String nombreAbreviado, int creditos) {
        this.nombrePrincipal = nombrePrincipal;
        this.nombreAbreviado = nombreAbreviado;
        this.creditos = creditos;
    }

    public void mostrarInformacionAsignatura() {
        System.out.println("   Asignatura: " + nombrePrincipal + " - " + nombreAbreviado + " - " + creditos + " creditos");

    }
}
