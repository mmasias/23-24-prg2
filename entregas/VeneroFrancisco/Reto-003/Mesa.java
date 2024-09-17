public class Mesa {
    
    private int asientos;
    private int numeroDeMesa;
    private int asientosOcupados;
    
    public Mesa(int asientos, int numeroDeMesa, int asientosOcupados) {
        this.asientos = asientos;
        this.numeroDeMesa = numeroDeMesa;
        this.asientosOcupados = asientosOcupados;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getNumeroDeMesa() {
        return numeroDeMesa;
    }

    public void setNumeroDeMesa(int numeroDeMesa) {
        this.numeroDeMesa = numeroDeMesa;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }


}
