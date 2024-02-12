import java.util.Scanner;

class Carrefour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double HORA_APERTURA = 9.0;
        final double HORA_CIERRE = 21.0;
        final double MINUTOS = 1.0 / 60.0;
        double atendiendo = HORA_APERTURA;
        boolean trabajando = true;

        int fila = 0;
        final double PROBABILIDAD_LLEGADA_CLIENTE = 0.6;
        int caja = 0;
        final int ITEMS_MAXIMO_CLIENTE = 15;
        final int ITEMS_MINIMO_CLIENTE = 5;

        do {
            atendiendo += MINUTOS;
            System.out.println("Hora actual: " + atendiendo);
            trabajando = atendiendo < HORA_CIERRE;
            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTE) {
                fila = fila + 1;
            }

            if (caja <= 0){
                fila = fila - 1;
                caja = (int) (Math.random() * (ITEMS_MAXIMO_CLIENTE - ITEMS_MINIMO_CLIENTE)) + ITEMS_MINIMO_CLIENTE;
            }
            if (caja > 0){
                caja = caja -1;
            }

            System.out.println("Cantidad de clientes en fila: " + fila);
            scanner.nextLine();
        } while (trabajando);
        scanner.close();
    }
}