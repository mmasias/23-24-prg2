import java.util.Arrays;

public class CentroComercial {
    public static void main(String[] args) {
        final int MINUTOS_JORNADA_TOTAL = 720;
        final int NUMERO_DE_CAJAS_INICIALES = 4;
        final int PERSONAS_POR_CAJA = 5;
        final int MAX_PERSONAS_EN_COLA_PARA_NUEVA_CAJA = 15;

        int cola = 0;
        boolean[] cajaOcupada = new boolean[NUMERO_DE_CAJAS_INICIALES];
        int[] itemsClienteEnLaCaja = new int[NUMERO_DE_CAJAS_INICIALES];
        int numeroCajas = NUMERO_DE_CAJAS_INICIALES;
        int minutosSinNadieEnCola = 0;
        int personasEnColaAlFinalizar = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

        boolean nuevaCajaAgregadaEsteMinuto = false;

        for (int minuto = 1; minuto <= MINUTOS_JORNADA_TOTAL; minuto++) {
            cleanScreen();

            for (int i = 0; i < numeroCajas; i++) {
                cajaOcupada[i] = cajaEstado(itemsClienteEnLaCaja[i]);
            }

            if (llegaCliente()) {
                cola++;
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En Cola: " + cola);
            } else {
                System.out.println("MINUTO " + minuto + " - Llegan 0 personas - En Cola: " + cola);
                minutosSinNadieEnCola++;
            }

            if (cola > MAX_PERSONAS_EN_COLA_PARA_NUEVA_CAJA && !nuevaCajaAgregadaEsteMinuto) {
                numeroCajas++;
                System.out.println("Nueva caja agregada. Total de cajas: " + numeroCajas);
                cola = 0;
                cajaOcupada = Arrays.copyOf(cajaOcupada, numeroCajas);
                itemsClienteEnLaCaja = Arrays.copyOf(itemsClienteEnLaCaja, numeroCajas);
                nuevaCajaAgregadaEsteMinuto = true;
            }

            for (int i = 0; i < numeroCajas; i++) {
                if (cajaOcupada[i] && itemsClienteEnLaCaja[i] > 0) {
                    itemsClienteEnLaCaja[i]--;
                    System.out
                            .println("El cliente de la caja " + (i + 1) + " tiene un total de: "
                                    + itemsClienteEnLaCaja[i]);
                    itemsVendidos++;
                }
                if (cola >= 1 && !cajaOcupada[i]) {
                    System.out.println("Ha pasado a la caja " + (i + 1) + " un cliente");
                    cola--;
                    cajaOcupada[i] = true;
                    itemsClienteEnLaCaja[i] = items();
                    System.out.println("El cliente tiene un total de: " + itemsClienteEnLaCaja[i]);
                    personasAtendidas++;
                }
            }

            imprimirEstadoCajas(itemsClienteEnLaCaja);

            pause(1);
        }

        personasEnColaAlFinalizar = cola;
        System.out.println("\nEstadística Final de la Jornada:");
        System.out.println("Número de minutos que pasaron en el cual no hubo nadie en cola: " + minutosSinNadieEnCola);
        System.out.println(
                "Número total de personas que estaban en cola al finalizar el día: " + personasEnColaAlFinalizar);
        System.out.println("Número total de personas atendidas durante el día: " + personasAtendidas);
        System.out.println("Número total de items vendidos en el día: " + itemsVendidos);
    }

    static void imprimirEstadoCajas(int[] itemsClienteEnLaCaja) {
        System.out.print("Estado de las cajas: ");
        for (int i = 0; i < itemsClienteEnLaCaja.length; i++) {
            System.out.print("Caja" + (i + 1) + ":[" + itemsClienteEnLaCaja[i] + "] | ");
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
