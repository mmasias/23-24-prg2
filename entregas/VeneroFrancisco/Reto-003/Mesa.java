public class Mesa {
    
    private Int asientos;
    private Int numeroDeMesa;
    private Int asientosOcupados;
    
    public Mesa(Int asientos, Int numeroDeMesa, Int asientosOcupados) {
        this.asientos = asientos;
        this.numeroDeMesa = numeroDeMesa;
        this.asientosOcupados = asientosOcupados;
    }

    public Int getAsientos() {
        return asientos;
    }

    public void setAsientos(Int asientos) {
        this.asientos = asientos;
    }

    public Int getNumeroDeMesa() {
        return numeroDeMesa;
    }

    public void setNumeroDeMesa(Int numeroDeMesa) {
        this.numeroDeMesa = numeroDeMesa;
    }

    public Int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(Int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }


}
