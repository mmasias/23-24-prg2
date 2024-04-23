public class Reserva {
    
    private int comensales;
    private String nombre;

    public Reserva() {

    }
    
    public Reserva(int comensales, String nombre) {

        this.comensales = comensales;
        this.nombre = nombre;

    }

    public String mostrar() {
        return "Reserva: | " + "comensales: " + this.comensales + " comensal/es" + " - " + "cliente: " + nombre;
    }

}
