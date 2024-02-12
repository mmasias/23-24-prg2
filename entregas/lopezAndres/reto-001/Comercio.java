import java.util.Arrays;

public class Comercio {
    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 720;
        final int CAJAS_INICIALES = 4;
        final int PERSONAS_POR_CAJA = 5;
        final int MAXIMO_PERSONAS_EN_COLA_NUEVA_CAJA = 15;

        int cola = 0;
        int numCajas = CAJAS_INICIALES;
        boolean[] cajaOcupada = new boolean[CAJAS_INICIALES];
        int[] itemsClienteCaja = new int[CAJAS_INICIALES];
        int minutosSinCola = 0;
        int personasEnColaAlFinalizar = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;
        boolean nuevaCajaAgregadaEsteMinuto = false;

        for (int minuto = 1; minuto <= MINUTOS_JORNADA; minuto++) {
            cleanScreen();

            for (int i = 0; i < numCajas; i++) {
                cajaOcupada[i] = cajaEstado(itemsClienteCaja[i]);
            }

            if (llegaCliente()) {
                cola++;
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En Cola: " + cola);
            } else {
                System.out.println("MINUTO " + minuto + " - Llegan 0 personas - En Cola: " + cola);
                minutosSinCola++;
            }

            if (cola > MAXIMO_PERSONAS_EN_COLA_NUEVA_CAJA && !nuevaCajaAgregadaEsteMinuto) {
                numCajas++;
                System.out.println("Nueva caja agregada. Total de cajas: " + numCajas);
                cola = 0;
                cajaOcupada = Arrays.copyOf(cajaOcupada, numCajas);
                itemsClienteCaja = Arrays.copyOf(itemsClienteCaja, numCajas);
                nuevaCajaAgregadaEsteMinuto = true;
            }
             for (int i = 0; i < numCajas; i++) {
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
}
