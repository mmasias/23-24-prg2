import java.util.Scanner;

class Carrefour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HORA_APERTURA = 9;
        final int HORA_CIERRE = 21;
        final int TOTAL_TIEMPO_ABIERTO = 720;
        final double PROBABILIDAD_LLEGADA_CLIENTE = 0.6;

        boolean cajaAbierta = false;

        for (int tiempoAbierto = 0; tiempoAbierto <= TOTAL_TIEMPO_ABIERTO; tiempoAbierto++) {
            int horas = (HORA_APERTURA + tiempoAbierto / 60) % 24;
            int minutos = tiempoAbierto % 60;
            scanner.nextLine();
            System.out.println(horas + ":" + minutos);
            double probabilidadLlegada = Math.random();
            if (probabilidadLlegada <= PROBABILIDAD_LLEGADA_CLIENTE) {
                System.out.println("Llega un cliente");
                if (!cajaAbierta){
                    System.out.println("Caja abierta para que pase un cliente");
                    cajaAbierta = true;
                    int itemsCliente = (int) (Math.random() * 11) + 5;
                    tiempoAbierto += itemsCliente;
                    System.out.println("El cliente lleva " + itemsCliente + " items");
                    cajaAbierta = false;
                }
            }

        }
        scanner.close();
    }
}
