import java.util.Scanner;

class Carrefour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double OPENING_HOURS = 9.0;
        final double CLOSING_TIME = 21.0;
        final double CUSTUMER_SERVICE_DURATION = 1.0 / 60.0;
        double assistingcustumers = OPENING_HOURS;
        boolean working = true;
        int MinutesWithouQueue = 0;
        int ClientsServed = 0;
        int Sold_Items = 0;

        int line = 0;
        final double CUSTOMER_ARRIVAL_PROBABILITY = 0.6;
        final int CASHIERS = 4;
        int [] cashregister = new int [CASHIERS];
        final int MAX_ITEMS_CUSTOMERS = 15;
        final int MIN_ITEMS_CUSTOMERS = 5;

        do {
            cleanScreen();
            assistingcustumers += CUSTUMER_SERVICE_DURATION;
            int hours = (int) assistingcustumers;
            int minutes = (int) ((assistingcustumers - hours) * 60);

            System.out.println("Hora actual: " + hours + ":" + minutes);
            imprimeLinea();
            working = assistingcustumers < CLOSING_TIME;

            if (line == 0) {
                MinutesWithouQueue++;
                
            }
            if (Math.random() < CUSTOMER_ARRIVAL_PROBABILITY) {
                line = line + 1;
            }

            for (int serve = 0; serve < CASHIERS; serve++){
                if (cashregister [serve] <= 0 && line > 0) {
                line --;
                ClientsServed++;
                int SaleItems = (int) (Math.random() * (MAX_ITEMS_CUSTOMERS - MIN_ITEMS_CUSTOMERS)) + MIN_ITEMS_CUSTOMERS;
                Sold_Items += SaleItems;
                cashregister[serve] = SaleItems;

            }   else if (cashregister[serve] > 0) {
                    cashregister[serve]--;
            }

            if (cashregister[serve] > 0) {
                System.out.print("Caja " + (serve + 1) + "Se atiende al cliente y le quedan [" + cashregister[serve] + "] items");
            } else {
                System.out.print("Caja " + (serve + 1) + "La caja se encuentra vacia.)");
            }
                
        }
        imprimeLinea();
        System.out.println("Cantidad de clientes en la cola: " + line);
        imprimeLinea();
        scanner.nextLine();

        } while (working);

        System.out.println("Resumen: ");
        imprimeLineaResumen();

        System.out.println("Total de minutos en la que no hubo clientes en la cola: " + MinutesWithouQueue);
        System.out.println("Total de clientes que permanecieron el cola tras la hora de cierre: " + line);
        System.out.println("Tras finalizar la jornada laboral se atendieron: " + ClientsServed + " clientes.");
        System.out.println("El total de productos vendidos fue de: " + Sold_Items + "items.");
        imprimeLineaResumen();
        scanner.close();
        
    }
    static void imprimeLineaResumen() {
        System.out.println("===========".repeat(7));
    }
    static void imprimeLinea(){
        System.out.println("---------+".repeat(5));

    }

    static void cleanScreen(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
}