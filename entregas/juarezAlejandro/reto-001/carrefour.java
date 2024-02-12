import java.util.Scanner;

class Carrefour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double HORA_APERTURA = 9.0;
        final double HORA_CIERRE = 21.0;
        final double MINUTOS = 1.0 / 60.0;
        double atendiendo = HORA_APERTURA;
        boolean trabajando = true;

        do {
            atendiendo += MINUTOS;
            System.out.println("Hora actual: " + atendiendo);
            scanner.nextLine();
            trabajando = atendiendo < HORA_CIERRE;
        } while (trabajando);
        scanner.close();
    }
}