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

            if (rand.nextDouble() < 0.6) {
                cola++;
                System.out.println("MINUTO " + minuto + " - Llega 1 persona - En Cola: " + cola);
            } else {
                System.out.println("MINUTO " + minuto + " - No llega nadie  - En Cola: " + cola);
            }


        }
    }
}