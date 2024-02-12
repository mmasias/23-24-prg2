package entregas.lopesbrenda.reto001;

import java.util.Random;

public class CentroComercial {
    public static void main(String[] args) {
        final int HORAS_DE_TRABAJO = 12;
        final double PROBABILIDAD_LLEGADA_CLIENTE = 0.40;


        Random random = new Random();
        int clientesEnCola = 0;

        for (int hora = 0; hora < HORAS_DE_TRABAJO; hora++) {
            System.out.println("Hora " + hora + ":");

            for(int minuto = 0; minuto < 60; minuto++){
                if(random.nextDouble()< PROBABILIDAD_LLEGADA_CLIENTE){
                    clientesEnCola++;
                }
            }

            System.out.println("Personas en cola: " + clientesEnCola);
        }
    }
}
