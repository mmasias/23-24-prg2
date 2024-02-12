class TestParcial {
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

    public void llegadaClientes() {
        double probabilidad = Math.random();
        if (probabilidad <= 0.6) {
            for (int i = 0; i < colaClientes.length; i++) {
                if (colaClientes[i] == null) {
                    colaClientes[i] = new Cliente();
                    break;
                }
            }
        }
    }

    public void atenderClientes() {
        for (Caja caja : cajas) {
            if (caja.estaLibre()) {
                for (int i = 0; i < colaClientes.length; i++) {
                    if (colaClientes[i] != null) {
                        caja.atenderCliente(colaClientes[i]);
                        colaClientes[i] = null;
                        clientesAtendidos++;
                        break;
                    }
                }
            }
            caja.atenderPack();
        }
    }

    public void mostrarEstado(int hora) {
        System.out.println(
                "\nMINUTO " + hora + " - Llega " + llegadaActual() + " persona - En Cola: " + clientesEnCola());
        for (int i = 0; i < NUM_CAJAS; i++) {
            System.out.print("Caja" + (i + 1) + ":[");
            if (!cajas[i].estaLibre()) {
                System.out.print(cajas[i].tiempoRestante);
            } else {
                System.out.print(0);
            }
            System.out.print("] | ");
        }
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

    public int llegadaActual() {
        double probabilidad = Math.random();
        if (probabilidad <= 0.6) {
            return 1;
        }
        return 0;
    }

    public int clientesEnCola() {
        int count = 0;
        for (Cliente cliente : colaClientes) {
            if (cliente != null) {
                count++;
            }
        }
        return count;
    }

    public int minutosColaCero() {
        int minutosCero = 0;
        for (int i = 0; i < colaClientes.length; i++) {
            if (colaClientes[i] == null) {
                minutosCero++;
            }
        }
        return minutosCero;
    }

    public int totalArticulosVendidos() {
        for (Caja caja : cajas) {
            articulosVendidos += 15 - caja.tiempoRestante;
        }
        return articulosVendidos;
    }
}

class Cliente {
    int numPacks;

    public Cliente() {
        numPacks = (int) (Math.random() * 11) + 5;
    }

    public int getNumPacks() {
        return numPacks;
    }
}

class Caja {
    boolean libre = true;
    int tiempoRestante = 0;

    public boolean estaLibre() {
        return libre;
    }

    public void atenderCliente(Cliente cliente) {
        libre = false;
        tiempoRestante = cliente.getNumPacks();
    }

    public void atenderPack() {
        if (!libre) {
            tiempoRestante--;
            if (tiempoRestante == 0) {
                libre = true;
            }
        }
    }
}
