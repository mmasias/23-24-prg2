public class Caja {

    int tiempoAtencion;
    Cliente cliente;

    public Caja() {
        tiempoAtencion = 0;
    }

    public boolean estaLibre() {
        if (tiempoAtencion == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void atenderCliente(Cliente cliente) {
        this.cliente = cliente;
        tiempoAtencion = cliente.numeroProductos;
    }

    public void avanzar() {
        if (tiempoAtencion > 0) {
            tiempoAtencion--;
        }
    }

    public String estado() {
        if (tiempoAtencion == 0) {
            return "Libre";
        } else {
            return "Atendiendo a " + cliente.cliente + " (" + tiempoAtencion + " productos)";
        }
    }

}
