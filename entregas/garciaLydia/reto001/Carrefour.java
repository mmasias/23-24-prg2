package entregas.garciaLydia.reto001;

import java.util.Random;

public class Carrefour {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] cajas = new int[4];
        int cola = 0;
        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int itemsVendidos = 0;

        for (int minuto = 1; minuto <= 720; minuto++) {
            // Llegada de personas
            if (rand.nextDouble() < 0.6) {
                cola++;
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En Cola: " + cola);
            } else {
                System.out.println("MINUTO " + minuto + " - No llega nadie  - En Cola: " + cola);
            }

            // Atención en cajas
            for (int i = 0; i < cajas.length; i++) {
                if (cajas[i] > 0) {
                    cajas[i]--;
                    itemsVendidos++;
                } else if (cola > 0) {
                    cajas[i] = rand.nextInt(11) + 5; // Atender a una persona con entre 5 y 15 packs de items
                    cola--;
                    personasAtendidas++;
                }
            }
            
            if (cola == 0) {
                minutosSinCola++;
            }

            // Mostrar estado de cajas
            System.out.print("Caja1:[" + cajas[0] + "] | Caja2:[" + cajas[1] + "] | Caja3:[" + cajas[2] + "] | Caja4:[" + cajas[3] + "] | ");
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }

    }
}

