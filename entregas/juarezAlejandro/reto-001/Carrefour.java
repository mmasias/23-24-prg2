import java.util.Scanner;

class Carrefour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double OPENING_HOUR = 9.0;
        final double CLOSING_TIME = 21.0;
        final double MINUTES = 1.0 / 60.0;
        double attending = OPENING_HOUR;
        boolean working = true;
        int minutesWithoutLine = 0;
        int totalClientsServed = 0;
        int totalItemsSold = 0;

        int row = 0;
        final double CUSTOMER_ARRIVAL_PROBABILITY = 0.6;
        final int AMOUNT_ATMS = 4;
        int [] box = new int [AMOUNT_ATMS];
        final int MAXIMUM_CUSTOMER_ITEMS = 15;
        final int MINIMUM_CUSTOMER_ITEMS = 5;
        boolean customerExtraBox = false;
        int extraBoxItems = 0;
        

        boolean welcome = false;

        do {
            if (attending == OPENING_HOUR && !welcome) {
                printWelcome();
                welcome = true;
                System.out.println("Presione enter para iniciar");
                scanner.nextLine();
                cleanScreen();
            }

            cleanScreen();
            attending += MINUTES;
            int hours = (int) attending;
            int minutes = (int) ((attending - hours) * 60);
            
            System.out.println("Hora actual: " + hours + ":" + minutes);
            printLine();
            working = attending < CLOSING_TIME;
            if (row == 0){
                minutesWithoutLine++;
            }
            if (Math.random() < CUSTOMER_ARRIVAL_PROBABILITY) {
                row = row + 1;
            }

            if (customerExtraBox){
                if (extraBoxItems > 0) {
                    extraBoxItems--;
                    if (extraBoxItems == 0){
                        System.out.println("La caja extra está vacía.");
                        customerExtraBox = false;
                    } else {
                        System.out.print("Un cliente se dirige a la caja extra con ");
                        for (int drawingExtraItems = 0; drawingExtraItems < extraBoxItems; drawingExtraItems++){
                            System.out.print("[#]");
                        }
                        System.out.println(" items. Lo que es igual a [" + extraBoxItems + "] items.");
                    }
                }
            }

            if (row > 15 && !customerExtraBox) {
                for (int extraBox = 0; extraBox < AMOUNT_ATMS; extraBox++) {
                    if (box[extraBox] <= 0 && !customerExtraBox) {
                        box[extraBox] = (int) (Math.random() * (MAXIMUM_CUSTOMER_ITEMS - MINIMUM_CUSTOMER_ITEMS))  + MINIMUM_CUSTOMER_ITEMS;
                        row--;
                        totalClientsServed++;
                        totalItemsSold += box[extraBox];
                        customerExtraBox = true;
                        extraBoxItems = box[extraBox];
                    }
                }
            }

            for (int attend = 0; attend < AMOUNT_ATMS; attend++){
                if (box[attend] <= 0 && row > 0){
                    row --;
                    totalClientsServed++;
                    int itemsSale = (int) (Math.random() * (MAXIMUM_CUSTOMER_ITEMS - MINIMUM_CUSTOMER_ITEMS)) + MINIMUM_CUSTOMER_ITEMS;
                    totalItemsSold += itemsSale;
                    box[attend] = itemsSale;
                } else if (box[attend] > 0){
                    box[attend]--;
                }

                if (box[attend] > 0){
                    System.out.print("Caja " + (attend + 1) + " atiende al cliente y le quedan ");
                    for (int drawingItems = 0; drawingItems < box[attend]; drawingItems++){
                        System.out.print("[#]");
                    }
                    System.out.println(" items. Lo que es igual a que le quedan [" + box[attend] + "] items.");
                } else {
                    System.out.println("Caja " + (attend + 1) + " se encuentra vacia.");
                }
            }
            printLine();
            System.out.println("Cantidad de clientes en fila: " + row);
            printPerson(row);
            printLine();
            scanner.nextLine();
        } while (working);

        System.out.println("RESUMEN");
        printSummaryLine();
        System.out.println("Cantidad de minutos en los que no hubo nadie en la fila: " + minutesWithoutLine);
        System.out.println("Cantidad de clientes que permanecieron en fila a la hora de cierre: " + row);
        System.out.println("Al finalizar el día se atendieron " + totalClientsServed + " clientes.");
        System.out.println("En total se vendieron " + totalItemsSold + " items.");
        printSummaryLine();
        scanner.close();
    }

    static void printPerson(int row) {
        int number = row / 10 + 1;
        int repetition = row % 10;
        do {
            number--;
            System.out.println("   O ".repeat(row = number != 0 ? 10 : repetition));
            System.out.println("  /|\\".repeat(row = number != 0 ? 10 : repetition));
            System.out.println("  / \\".repeat(row = number != 0 ? 10 : repetition));
            System.out.println();
        } while (number > 0);
    }

    static void printWelcome() {
        System.out.println("  ______      ___      .______      .______       _______  _______   ______    __    __  .______      ");
        System.out.println(" /      |    /   \\     |   _  \\     |   _  \\     |   ____||   ____| /  __  \\  |  |  |  | |   _  \\     ");
        System.out.println("|  ,----'   /  ^  \\    |  |_)  |    |  |_)  |    |  |__   |  |__   |  |  |  | |  |  |  | |  |_)  |    ");
        System.out.println("|  |       /  /_\\  \\   |      /     |      /     |   __|  |   __|  |  |  |  | |  |  |  | |      /     ");
        System.out.println("|  `----. /  _____  \\  |  |\\  \\----.|  |\\  \\----.|  |____ |  |     |  `--'  | |  `--'  | |  |\\  \\----.");
        System.out.println(" \\______|/__/     \\__\\ | _| `._____|| _| `._____||_______||__|      \\______/   \\______/  | _| `._____|");
    }
    static void printSummaryLine() {
        System.out.println("===========".repeat(7));
    }
    static void printLine(){
        System.out.println("---------+".repeat(5));
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}