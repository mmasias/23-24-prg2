import java.util.Scanner;

class Carrefour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double HORARIO_APERTURA = 9.0;
        final double HORARIO_CIERRE = 21.0;
        final double DURACION_ATENCION = 1.0 / 60.0;
        double atendiendoclientes = HORARIO_APERTURA;
        boolean trabajando = true;

        int cola = 0;
        final double PROBABILIDAD_LLEGADA_CLIENTES = 0.6;
        int caja = 0;
        final int MAX_ITEMS_CLIENTES = 15;
        final int MIN_ITEMS_CLIENTES = 5;

        do {
            atendiendoclientes += DURACION_ATENCION;
            System.out.println("Hora actual: " + atendiendoclientes);
            trabajando = atendiendoclientes < HORARIO_CIERRE;
            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTES) {
                cola = cola + 1;
            }

            if (caja <= 0) {
                cola = cola + 1;
                caja = (int) (Math.random() * (MAX_ITEMS_CLIENTES - MIN_ITEMS_CLIENTES)) +MIN_ITEMS_CLIENTES;
                
            }
            if (caja > 0) {
                caja = caja -1;
                
            }
            
            System.out.print("Clientes en la cola: " + cola + "\n");
            scanner.nextLine();

        } while (trabajando);
    }
}