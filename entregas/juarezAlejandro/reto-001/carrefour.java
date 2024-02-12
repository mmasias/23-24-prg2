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
        final int CANTIDAD_CAJEROS = 4;
        int [] caja = new int [CANTIDAD_CAJEROS];
        final int ITEMS_MAXIMO_CLIENTE = 15;
        final int ITEMS_MINIMO_CLIENTE = 5;
        final int AJUSTAR_TIEMPO = 100;

        do {
            atendiendo += MINUTOS;
            System.out.println("Hora actual: " + atendiendo);
            trabajando = atendiendo < HORA_CIERRE;
            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTE) {
                fila = fila + 1;
            }

            for (int atender = 0; atender < CANTIDAD_CAJEROS; atender++){
                if (caja[atender] <= 0 && fila > 0){
                    fila --;
                    caja[atender] = (int) (Math.random() * (ITEMS_MAXIMO_CLIENTE - ITEMS_MINIMO_CLIENTE)) + ITEMS_MINIMO_CLIENTE;
                } else if (caja[atender] > 0){
                    caja[atender]--;
                }

                if (caja[atender] <= 0){
                    System.out.println("Caja " + (atender + 1) + " se encuentra vacia.");
                }
            }

            System.out.println("Cantidad de clientes en fila: " + fila);
            scanner.nextLine();
        } while (trabajando);
        scanner.close();
    }
}