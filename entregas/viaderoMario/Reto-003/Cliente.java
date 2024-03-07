package entregas.viaderoMario.Reto-003;

public class Cliente {
    private String nombreCompleto;
    private String tarjetas;
    private double dinero;
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getTarjetas() {
        return tarjetas;
    }
    public void setTarjetas(String tarjetas) {
        this.tarjetas = tarjetas;
    }
    public double getDinero() {
        return dinero;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    public Cliente(String nombreCompleto, String tarjetas, double dinero) {
        this.nombreCompleto = nombreCompleto;
        this.tarjetas = tarjetas;
        this.dinero = dinero;
    }
    
}
