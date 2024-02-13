import java.util.Scanner;

class Carrefour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double HORARIO_APERTURA = 9.0;
        final double HORARIO_CIERRE = 21.0;
        final double DURACION_ATENCION = 1.0 / 60.0;
        double atendiendoclientes = HORARIO_APERTURA;
        boolean trabajando = true;
        int MinutosSinCola = 0;
        int ClientesAntendidos = 0;
        int ItemsVendidos = 0;

        int cola = 0;
        final double PROBABILIDAD_LLEGADA_CLIENTES = 0.6;
        final int CAJEROS = 4;
        int [] caja = new int [CAJEROS];
        final int MAX_ITEMS_CLIENTES = 15;
        final int MIN_ITEMS_CLIENTES = 5;

        do {
            cleanScreen();
            atendiendoclientes += DURACION_ATENCION;
            int horas = (int) atendiendoclientes;
            int minutos = (int) ((atendiendoclientes - horas) * 60);

            System.out.println("Hora actual: " + horas + ":" + minutos);
            ImprimeLinea();
            trabajando = atendiendoclientes < HORARIO_CIERRE;

            if (cola == 0) {
                MinutosSinCola++;
                
            }
            if (Math.random() < PROBABILIDAD_LLEGADA_CLIENTES) {
                cola = cola + 1;
            }

            for (int antender = 0; antender < CAJEROS; antender++){
                if (caja [antender] <= 0 && cola > 0) {
                cola --;
                ClientesAntendidos++;
                int ItemsVenta = (int) (Math.random() * (MAX_ITEMS_CLIENTES - MIN_ITEMS_CLIENTES)) +MIN_ITEMS_CLIENTES;
                ItemsVendidos += ItemsVenta;
                caja[antender] = ItemsVenta;

            }   else if (caja[antender] > 0) {
                    caja[antender]--;
            }

            if (caja[antender] > 0) {
                System.out.print("Caja " + (antender + 1) + "Se atiende al cliente y le quedan [" + caja[antender] + "] items");
            } else {
                System.out.print("Caja " + (antender + 1) + "La caja se encuentra vacia.)");
            }
                
        }
        ImprimeLinea();
        System.out.println("Cantidad de clientes en la cola: " + cola);
        ImprimeLinea();
        scanner.nextLine();

        } while (trabajando);
        System.out.println("Total de minutos en la que no hubo clientes en la cola: " + MinutosSinCola);
        System.out.println("Total de clientes que permanecieron el cola tras la hora de cierre: " + cola);
        System.out.println("Tras finalizar la jornada laboral se atendieron: " + ClientesAntendidos + " clientes.");
        System.out.println("El total de productos vendidos fue de: " + ItemsVendidos + "items.");
        ImprimeLinea();
        scanner.close();
        
    }
    static void ImprimeLinea(){
        System.out.println("---------+".repeat(5));
    }

    static void cleanScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}