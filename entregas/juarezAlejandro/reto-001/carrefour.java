import java.util.Scanner;

class Carrefour{
    public static void main(String[] args) {
        final int HORA_APERTURA = 9;
        final int HORA_CIERRE = 21;
        final int TOTAL_TIEMPO_ABIERTO = 720;
        Scanner Scanner = new Scanner(System.in);

        for (int tiempoAbierto = 0; tiempoAbierto <=TOTAL_TIEMPO_ABIERTO; tiempoAbierto++){
            int horas = (HORA_APERTURA + tiempoAbierto / 60) % 24;
            int minutos = tiempoAbierto % 60;
            Scanner.nextLine();
            System.out.println(horas + ":" + minutos);
        }
    }
}