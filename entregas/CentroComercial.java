package entregas;
public class CentroComercial {

    private static final int NUMERO_CAJAS = 4;
    private static final double PROBABILIDAD_LLEGADA_CLIENTE = 0.6;

    public static void main(String[] args) {
        int[] colaClientes = new int[720];

        int[] tiempoAtencionCajas = new int[NUMERO_CAJAS];
        int minutosConColaCero = 0;
        int personasEnColaAlCierre = 0;
        int personasAtendidas = 0;
        int articulosVendidos = 0;

        for (int tiempo = 1; tiempo <= 720; tiempo++) {
            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTE) {
                int packsDeItems = (int) (Math.random() * 11) + 5;
                agregarACola(colaClientes, packsDeItems);
                System.out.println("MINUTO " + tiempo + " - Llega 1 persona - En Cola: " + contarElementosNoCero(colaClientes));
            } else {
                System.out.println("MINUTO " + tiempo + " - No llega nadie  - En Cola: " + contarElementosNoCero(colaClientes));
            }
            for (int i = 0; i < NUMERO_CAJAS; i++) {
                if (tiempoAtencionCajas[i] > 0) {
                    System.out.print("Caja" + (i + 1) + ":[" + tiempoAtencionCajas[i] + "] | ");
                    tiempoAtencionCajas[i]--;
                    articulosVendidos++;
                } else {
                    int packsDeItems = quitarDeCola(colaClientes);
                    if (packsDeItems > 0) {
                        tiempoAtencionCajas[i] = packsDeItems;
                        System.out.print("Caja" + (i + 1) + ":[" + tiempoAtencionCajas[i] + "] | ");
                        personasAtendidas++;
                        articulosVendidos += packsDeItems;
                    } else {
                        System.out.print("Caja" + (i + 1) + ":[0] | ");
                    }
                }
            }
            if (colaClientes[0] == 0) {
                minutosConColaCero++;
            }

        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }
    System.out.println("RESUMEN");
    System.out.println("============================================================");
    System.out.println("Minutos con cola en cero\t  : " + minutosConColaCero);
    System.out.println("Personas en la cola al cierre\t  : " + contarElementosNoCero(colaClientes));
    System.out.println("Personas atendidas en el día\t  : " + personasAtendidas);
    System.out.println("Artículos vendidos en el día\t  : " + articulosVendidos);
    System.out.println("============================================================");
    }
    private static void agregarACola(int[] cola, int elemento) {
        for (int i = 0; i < cola.length; i++) {
            if (cola[i] == 0) {
                cola[i] = elemento;
                break;
            }
        }
    }
    private static int contarElementosNoCero(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value != 0) {
                count++;
            }
        }
        return count;
    }
    private static int quitarDeCola(int[] cola) {
        int elemento = cola[0];
        for (int i = 0; i < cola.length - 1; i++) {
            cola[i] = cola[i + 1];
        }
        cola[cola.length - 1] = 0;
        return elemento;
    }
    
}