package entregas.viaderoMario.Reto-003;

public class CentroComercial {
    private Caja[]cajas;
    private Cliente[]clientes;
    public Caja[] getCajas() {
        return cajas;
    }
    public void setCajas(Caja[] cajas) {
        this.cajas = cajas;
    }
    public Cliente[] getClientes() {
        return clientes;
    }
    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    public CentroComercial(Caja[] cajas, Cliente[] clientes) {
        this.cajas = cajas;
        this.clientes = clientes;
    }
}
