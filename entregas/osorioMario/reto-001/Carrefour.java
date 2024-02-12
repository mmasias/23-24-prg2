public class Carrefour {
    public static void main(String[] args) {
        CentroComercial centroComercial = new CentroComercial();
        centroComercial.iniciarSimulacion();
        centroComercial.simularDia();
        centroComercial.mostrarResumen();
    }
}

class CentroComercial {
    static final int HORA_APERTURA = 9;
    static final int HORA_CIERRE = 21;
    static final int NUM_CAJAS = 4;
    static final int MAX_CLIENTES = 1000;

    Cliente[] colaClientes;
    Caja[] cajas;
    int clientesAtendidos;
    int articulosVendidos;

    public void iniciarSimulacion() {
        colaClientes = new Cliente[MAX_CLIENTES];
        cajas = new Caja[NUM_CAJAS];
        for (int i = 0; i < NUM_CAJAS; i++) {
            cajas[i] = new Caja();
        }
    }

    public void simularDia() {
        for (int hora = HORA_APERTURA; hora < HORA_CIERRE; hora++) {
            llegadaClientes();
            atenderClientes();
            mostrarEstado(hora);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void mostrarResumen() {
        System.out.println("\nRESUMEN\n============================================================");
        System.out.println("Minutos con cola en cero\t: " + minutosColaCero());
        System.out.println("Personas en la cola al cierre\t: " + clientesEnCola());
        System.out.println("Personas atendidas en el día\t: " + clientesAtendidos);
        System.out.println("Artículos vendidos en el día\t: " + totalArticulosVendidos());
        System.out.println("============================================================");
    }