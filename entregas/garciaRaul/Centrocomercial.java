public class CentroComercial {
    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 720;
        final int NUM_CAJAS = 4;
        int cola = 0;
        boolean[] cajaOcupada = new boolean[NUM_CAJAS];
        int[] itemsClienteCaja = new int[NUM_CAJAS];
        int minutosSinCola = 0;
        int personasEnColaAlFinalizar = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            cleanScreen();
            for (int i = 0; i < NUM_CAJAS; i++) {
                cajaOcupada[i] = cajaEstado(itemsClienteCaja[i]);
            }
            if (llegaCliente()) {
                cola++;
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En Cola: " + cola);
            } else {
                System.out.println("MINUTO " + minuto + " - Llegan 0 personas - En Cola: " + cola);
                minutosSinCola++;
            }

            for (int i = 0; i < NUM_CAJAS; i++) {
                if (cajaOcupada[i] && itemsClienteCaja[i] > 0) {
                    itemsClienteCaja[i]--;
                    System.out.println("El cliente de la caja " + (i + 1) + " tiene un total de: " + itemsClienteCaja[i]);
                    itemsVendidos++;
                }

                if (cola >= 1 && !cajaOcupada[i]) {
                    System.out.println("Ha pasado a la caja " + (i + 1) + " un cliente");
                    cola--;
                    cajaOcupada[i] = true;
                    itemsClienteCaja[i] = items();
                    System.out.println("El cliente tiene un total de: " + itemsClienteCaja[i]);
                    personasAtendidas++;
                }
            }

            imprimirEstadoCajas(itemsClienteCaja);

            pause(2);
        }

        personasEnColaAlFinalizar = cola;

        System.out.println("\nEstadísticas Finales:");
        System.out.println("Número de minutos en que no hubo nadie en cola: " + minutosSinCola);
        System.out.println("Número de personas que estaban en cola al finalizar el día: " + personasEnColaAlFinalizar);
        System.out.println("Número de personas atendidas durante el día: " + personasAtendidas);
        System.out.println("Número de items vendidos en el día: " + itemsVendidos);
    }


    static void imprimirEstadoCajas(int[] itemsClienteCaja) {
        System.out.print("Estado de las cajas: ");
        for (int i = 0; i < itemsClienteCaja.length; i++) {
            System.out.print("Caja" + (i + 1) + ":[" + itemsClienteCaja[i] + "] | ");
        }
        System.out.println();
    }
    static boolean cajaEstado(int items) {
        return items > 0;
    }
    static int items() {
        return (int) (Math.random() * 11) + 5;
    }
    static boolean llegaCliente() {
        return Math.random() <= 0.6;
    }
    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    static void pause(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

