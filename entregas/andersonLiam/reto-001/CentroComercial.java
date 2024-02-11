import java.util.Random;

public class CentroComercial {
    private static final int HORAS_TRABAJO = 12;
    private static final int INTERVALO_TIEMPO = 1; 
    private static final int CAJAS = 4;
    private static final int MIN_PACKS = 5;
    private static final int MAX_PACKS = 15;
    private static final double PROBABILIDAD_LLEGADA = 0.4;

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int[] cola = new int[HORAS_TRABAJO * 60]; 

        for (int tiempo = 1; tiempo <= HORAS_TRABAJO * 60; tiempo += INTERVALO_TIEMPO) {
            Thread.sleep(1000); 

            
            if (random.nextDouble() <= PROBABILIDAD_LLEGADA) {
                int packs = MIN_PACKS + random.nextInt(MAX_PACKS - MIN_PACKS + 1);
                int indice = encontrarIndiceLibre(cola);
                if (indice != -1) {
                    cola[indice] = packs;
                    System.out.println("Llegó una persona con " + packs + " pack(s) de items en el minuto " + tiempo);
                }
            }

            
            int personasEnCola = contarPersonasEnCola(cola);
            System.out.println("Personas en cola: " + personasEnCola);

            
            for (int i = 1; i <= CAJAS; i++) {
                int packs = cola[i - 1];
                if (packs > 0) {
                    int tiempoAtencion = Math.min(packs, INTERVALO_TIEMPO);
                    packs -= tiempoAtencion;
                    System.out.println("Caja " + i + " atendiendo a una persona con " + tiempoAtencion + " pack(s) de items en el minuto " + tiempo);
                    tiempo += tiempoAtencion;
                    cola[i - 1] = packs; 
                } else {
                    if (personasEnCola > 0) {
                        int packsNuevoCliente = cola[0];
                        cola[0] = 0; 
                        System.out.println("Caja " + i + " atendiendo a una persona con " + packsNuevoCliente + " pack(s) de items en el minuto " + tiempo);
                        tiempo += INTERVALO_TIEMPO;
                        cola[i - 1] = packsNuevoCliente; 
                    } else {
                        System.out.println("Caja " + i + " libre en el minuto " + tiempo);
                    }
                }
            }
            System.out.println("---------------------------------------");
        }
    }

    private static int encontrarIndiceLibre(int[] cola) {
        for (int i = 0; i < cola.length; i++) {
            if (cola[i] == 0) {
                return i;
            }
        }
        return -1; 
    }

    private static int contarPersonasEnCola(int[] cola) {
        int contador = 0;
        for (int i = 0; i < cola.length; i++) {
            if (cola[i] > 0) {
                contador++;
            }
        }
        return contador;
    }
}