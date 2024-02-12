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

        do {
            atendiendo += MINUTOS;
            System.out.println("Hora actual: " + atendiendo);
            trabajando = atendiendo < HORA_CIERRE;
            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTE) {
                fila = fila + 1;
            }

            System.out.println("Cantidad de clientes en fila: " + fila);
            scanner.nextLine();
        } while (trabajando);
        scanner.close();
    }
}