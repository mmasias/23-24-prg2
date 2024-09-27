import java.util.Random;

public class Tienda {
    private static final int MINUTOS_EN_UN_DIA = 12 * 60;
    private static final int PROBABILIDAD_LLEGADA = 40;
    private Caja[] cajas;
    private int cola;
    private int minutosSinCola;
    private int totalItems;
    private boolean activa;
    private Random random;

    public Tienda() {
        this.cajas = new Caja[5];
        for (int i = 0; i < cajas.length; i++) {
            cajas[i] = new Caja();
        }
        this.cola = 0;
        this.minutosSinCola = 0;
        this.totalItems = 0;
        this.activa = false;
        this.random = new Random();
    }

    public void simularDia() {
        for (int tiempo = 1; tiempo < MINUTOS_EN_UN_DIA; tiempo++) {
            if (random.nextInt(100) < PROBABILIDAD_LLEGADA) { // 40% de probabilidad de que llegue un nuevo cliente
                cola++; // cada nuevo cliente va a la cola
                asignarClienteACaja();
            }

            procesarItemsEnCajas();

            if (cola == 0) {
                minutosSinCola++;
            }

            imprimirEstado(tiempo);
            verificarActivacionCajaExtra();
        }
        imprimirResumen();
    }

    private void asignarClienteACaja() {
        for (int i = 0; i < cajas.length; i++) {
            if (cajas[i].isLibre() && (i < 4 || activa)) {
                int items = random.nextInt(11) + 5;
                cajas[i].ocuparCaja(items);
                totalItems += items;
                cola--;
                break;
            }
        }
    }

    private void procesarItemsEnCajas() {
        for (Caja caja : cajas) {
            caja.procesarItem();
        }
    }

    private void imprimirEstado(int tiempo) {
        System.out.println("--------------------------------------------------------------");
        System.out.print("MINUTO " + tiempo + " - En cola: " + cola);
        for (int i = 0; i < cajas.length; i++) {
            System.out.print(" | Caja" + (i + 1) + ":[" + cajas[i].getItemsRestantes() + "]");
        }
        System.out.println();
    }

    private void verificarActivacionCajaExtra() {
        activa = cola >= 15;
    }

    private void imprimirResumen() {
        for (int i = 0; i < cajas.length; i++) {
            System.out.println("Clientes totales que pasan por la caja " + (i + 1) + " : " + cajas[i].getClientesProcesados());
        }
        int totalClientes = 0;
        for (Caja caja : cajas) {
            totalClientes += caja.getClientesProcesados();
        }
        System.out.println("Personas que han pasado por la tienda: " + totalClientes);
        System.out.println("Hoy se han vendido " + totalItems + " productos");
        System.out.println("La cola ha estado vacía durante " + minutosSinCola + " minutos");
        System.out.println("Quedan " + cola + " clientes al finalizar el día en la cola.");
    }
}
