package entregas.lopesbrenda.reto001;

import java.util.Random;

public class CentroComercial {
    public static void main(String[] args) {
        final double PROBABILIDAD_LLEGADA_CLIENTE = 0.40;
        final int MIN_PACKS = 5;
        final int MAX_PACKS = 15;

        Random random = new Random();
        int[] cajas = new int[4];
        int[] cola = new int[720];
        int clientesEnCola = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;
        int minutosSinCola = 0;


            for (int minuto = 0; minuto < 720; minuto++) {
                if (random.nextDouble() < PROBABILIDAD_LLEGADA_CLIENTE) {
                    cola[minuto] = 1;
                    clientesEnCola++;
                    itemsVendidos++;
                }

               for (int i = 0; i < 4; i++) {
                if (cajas[i] > 0) {
                    cajas[i]--;
                } else if (clientesEnCola > 0) {
                    int packs = MIN_PACKS + random.nextInt(MAX_PACKS - MIN_PACKS + 1);
                    cajas[i] = packs * 1;
                    clientesEnCola--;
                    personasAtendidas++;
                    itemsVendidos += packs;
                }
            }

            if (clientesEnCola == 0) {
                minutosSinCola++;
            }

            System.out.println("MINUTO " + (minuto + 1) + " - " + (cola[minuto] == 1 ? "Llega 1 persona" : "No llega nadie") + " - En Cola: " + clientesEnCola);
            System.out.print("Caja1:[" + cajas[0] + "] | Caja2:[" + cajas[1] + "] | Caja3:[" + cajas[2] + "] | Caja4:[" + cajas[3] + "]\n");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        }
        System.out.println("RESUMEN DEL DÍA:");
        System.out.println("Número de minutos sin nadie en cola: " + minutosSinCola);
        System.out.println("Número de personas en cola al finalizar el día: " + clientesEnCola);
        System.out.println("Número de personas atendidas durante el día: " + personasAtendidas);
        System.out.println("Número de items vendidos en el día: " + itemsVendidos);
    }
}
