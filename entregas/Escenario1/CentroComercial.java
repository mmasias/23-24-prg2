public class CentroComercial {

    Fila filas[];
    Caja cajas[];
    Cliente cliente;

    public CentroComercial(int numFilas, int numCajas) {
        filas = new Fila[numFilas];
        cajas = new Caja[numCajas];
        for (int i = 0; i < numFilas; i++) {
            filas[i] = new Fila();
        }
        for (int i = 0; i < numCajas; i++) {
            cajas[i] = new Caja();
        }
    }

    public void agregarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarCliente() {
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i].estaLibre()) {
                cajas[i].atenderCliente(cliente);
                break;
            }
        }
    }

    public void mostrarEstado() {
        for (int i = 0; i < cajas.length; i++) {
            System.out.println("Caja " + i + ": " + cajas[i].estado());
        }
    }

    public int avanzar() {
        for (int i = 0; i < cajas.length; i++) {
            cajas[i].avanzar();
        }
        for (int i = 0; i < filas.length; i++) {
            filas[i].avanzar();
        }

        for (int i = 0; i < filas.length; i++) {
            if (filas[i].siguienteCliente() != null) {
                return 1;
            }
        }
        return 0;
    }

    public Object siguienteClienteEnFila() {
        for (int i = 0; i < filas.length; i++) {
            if (filas[i].siguienteCliente() != null) {
                return filas[i].siguienteCliente();
            }
        }
        return null;
    }
    
}
