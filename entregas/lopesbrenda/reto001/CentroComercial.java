package entregas.lopesbrenda.reto001;

import java.util.Random;

public class CentroComercial {
    public static void main(String[] args) {
        final int HORAS_DE_TRABAJO = 12;
        final double PROBABILIDAD_LLEGADA_CLIENTE = 0.40;

        Random random = new Random();
        int[] cajas = new int[4];
        int clientesEnCola = 0;

        for (int hora = 0; hora < HORAS_DE_TRABAJO; hora++) {
            System.out.println("Hora " + hora + ":");

            for (int minuto = 0; minuto < 60; minuto++) {
                if (random.nextDouble() < PROBABILIDAD_LLEGADA_CLIENTE) {
                    clientesEnCola++;
                }
                for (int i = 0; i < 4; i++) {
                    if (cajas[i] > 0) {
                        cajas[i]--;
                    } else if (clientesEnCola > 0) {
                        int packs = 5 + random.nextInt(15 - 5 + 1);
                        cajas[i] = packs * 1;
                        clientesEnCola--;
                    }
                }
            }

            for (int i = 0; i < 4; i++) {
                if (cajas[i] > 0) {
                    System.out.println("Caja " + (i + 1) + ": atendiendo (" + cajas[i] + " packs restantes)");
                } else {
                    System.out.println("Caja " + (i + 1) + ": libre");
                }
            }
            System.out.println("Personas en cola: " + clientesEnCola);
        }
    }
}