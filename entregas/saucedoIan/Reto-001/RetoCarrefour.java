import java.util.Scanner;

public class RetoCarrefour {
    public static void main(String[] args) {
        final int MINUTE_IN_HOUR = 60;
        int hoursWorking = 12;
        final double POTENTIALOFARRIVAL = 0.4;
        int timeWorking = 1;
        int MaxTimeForWork = hoursWorking * MINUTE_IN_HOUR;
        int cashier1 = 0, cashier2 = 0, cashier3 = 0, cashier4 = 0, cashier5 = 0, cashier6 = 0;
        boolean isWorking = true;
        int peopleInLine = 0;
        int servicedCostumers = 0;
        int noOneInLine = 0;
        int maxAmountOfPacks = 0;
        final int PACK_MINIMUM = 5;
        final int PACK_MAXIMUM = 15;
        int arrivesOnLane = 1;
        boolean cashier1Working = true, cashier2Working = true, cashier3Working = true, cashier4Working = true,
                cashier5Working = false, cashier6Working = false;
        int selectedCashier = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            timeWorking = timeWorking + 1;
            isWorking = timeWorking <= MaxTimeForWork;

            Double probabilityOfNewCostumer = Math.random();
            if (probabilityOfNewCostumer <= POTENTIALOFARRIVAL) {
                peopleInLine = peopleInLine + 1;
                arrivesOnLane = 1;
            } else {
                arrivesOnLane = 0;
            }
            if (peopleInLine == 0) {
                noOneInLine++;
            }
            if (peopleInLine > 0 && cashier1 <= 0 && cashier1Working == true) {
                peopleInLine--;
                servicedCostumers++;
                cashier1 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
            }
            if (peopleInLine > 0 && cashier2 <= 0 && cashier2Working == true) {
                peopleInLine--;
                servicedCostumers++;
                cashier2 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
            }
            if (peopleInLine > 0 && cashier3 <= 0 && cashier3Working == true) {
                peopleInLine--;
                servicedCostumers++;
                cashier3 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
            }
            if (peopleInLine > 0 && cashier4 <= 0 && cashier4Working == true) {
                peopleInLine--;
                servicedCostumers++;
                cashier4 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
            }
            if (peopleInLine > 0 && cashier5 <= 0 && cashier5Working == true) {
                peopleInLine--;
                servicedCostumers++;
                cashier5 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
            }
            if (peopleInLine > 0 && cashier6 <= 0 && cashier6Working == true) {
                peopleInLine--;
                servicedCostumers++;
                cashier6 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
            }

            if (cashier1 > 0) {
                cashier1 = cashier1 - 1;
                maxAmountOfPacks++;

            }
            if (cashier2 > 0) {
                cashier2 = cashier2 - 1;
                maxAmountOfPacks++;

            }
            if (cashier3 > 0) {
                cashier3 = cashier3 - 1;
                maxAmountOfPacks++;

            }
            if (cashier4 > 0) {
                cashier4 = cashier4 - 1;
                maxAmountOfPacks++;

            }
            if (cashier5 > 0) {
                cashier5 = cashier5 - 1;
                maxAmountOfPacks++;

            }
            if (cashier6 > 0) {
                cashier6 = cashier6 - 1;
                maxAmountOfPacks++;

            }
            printInterface(timeWorking, cashier1, cashier2, cashier3, cashier4, cashier5, cashier6, peopleInLine,
                    arrivesOnLane, cashier1Working,cashier2Working, cashier3Working, cashier4Working, cashier5Working, cashier6Working );
            System.out.println(
                    "Seleccione caja a activar a desactivar digitando su numero, para mantener el status de las cajas digite 0");
            selectedCashier = scanner.nextInt();
            switch (selectedCashier) {
                case 1:
                    if (cashier1Working == true) {
                        System.out.println("Se desactivara la caja 1");
                        cashier1Working = false;
                    } else {
                        System.out.println("Se activara la caja 1");
                        cashier1Working = true;
                    }

                    break;
                case 2:
                    if (cashier2Working == true) {
                        System.out.println("Se desactivara la caja 2");
                        cashier2Working = false;
                    } else {
                        System.out.println("Se activara la caja 2");
                        cashier2Working = true;
                    }

                    break;
                case 3:
                    if (cashier3Working == true) {
                        System.out.println("Se desactivara la caja 3");
                        cashier3Working = false;
                    } else {
                        System.out.println("Se activara la caja 3");
                        cashier3Working = true;
                    }

                    break;
                case 4:
                    if (cashier4Working == true) {
                        System.out.println("Se desactivara la caja 4");
                        cashier4Working = false;
                    } else {
                        System.out.println("Se activara la caja 4");
                        cashier4Working = true;
                    }
                case 5:
                    if (cashier5Working == true) {
                        System.out.println("Se desactivara la caja 5");
                        cashier5Working = false;
                    } else {
                        System.out.println("Se activara la caja 5");
                        cashier5Working = true;
                    }

                    break;
                case 6:
                    if (cashier6Working == true) {
                        System.out.println("Se desactivara la caja 6");
                        cashier6Working = false;
                    } else {
                        System.out.println("Se activara la caja 6");
                        cashier6Working = true;
                    }

                    break;

                default:
                    break;
            }
            if (peopleInLine >= 15) {
                cashier5Working = true;
                System.out.println("Se activara la caja 5 por exceso de clientes");
            } 
        } while (isWorking == true);
        statistics(peopleInLine, servicedCostumers, noOneInLine, maxAmountOfPacks);
    }

    private static void statistics(int peopleInLine, int servicedCostumers, int noOneInLine, int maxAmountOfPacks) {
        System.out.println("Resumen del dia");
        System.out.println("+-+".repeat(15));
        System.out.println("Personas atendidas en el dia: " + servicedCostumers);
        System.out.println("Articulos vendidos en el dia: " + maxAmountOfPacks);
        System.out.println("Personas en la cola al cierre: " + peopleInLine);
        System.out.println("Minutos con cola en cero: " + noOneInLine);
        System.out.println("+-+".repeat(15));
    }

    private static void printInterface(int timeWorking, int cashier1, int cashier2, int cashier3, int cashier4,
            int cashier5, int cashier6, int peopleInLine, int arrivesOnLane, boolean cashier1Working, boolean cashier2Working,  boolean cashier3Working, boolean cashier4Working, boolean cashier5Working, boolean cashier6Working) {
        System.out.println("-".repeat(120));
        System.out.println(
                "Minuto " + timeWorking + "- Llega " + arrivesOnLane + " persona -" + " En Cola:" + peopleInLine);
        System.out.println("Caja1:[" + cashier1 + "] | Caja2:[" + cashier2 + "] | Caja3:[" + cashier3 + "] | Caja4:["
                + cashier4 + "] | Caja5:[" + cashier5 + "]" + " | Caja6:[" + cashier6 + "]");
            if (cashier1Working == true) {
                System.out.print("Caja1:[ACTIVADA] ");
            }
            else {
                System.out.print("Caja1:[DESACTIVADA] ");
            }
            if (cashier2Working == true) {
                System.out.print("Caja2:[ACTIVADA]  ");
            }
            else {
                System.out.print("Caja2:[DESACTIVADA] ");
            }
            if (cashier3Working == true) {
                System.out.print("Caja3:[ACTIVADA]  ");
                
            }
            else {
                System.out.print("Caja3:[DESACTIVADA] ");
            }
            if (cashier4Working == true) {
                System.out.print("Caja4:[ACTIVADA]  ");
            }
            else {
                System.out.print("Caja4:[DESACTIVADA] ");
            }
            if (cashier5Working == true) {
                System.out.print("Caja5:[ACTIVADA] " );
                
                
            }
            else {
                System.out.print("Caja5:[DESACTIVADA] ");
            }
            if (cashier6Working == true) {
                System.out.print("Caja6:[ACTIVADA] ");
                
            }
            else {
                System.out.print("Caja6:[DESACTIVADA] ");
            }
            System.out.println();
        System.out.println("-".repeat(120));

    }

    private static int createPacks(int maxPacks, int minPacks) {
        return (int) (Math.random() * (maxPacks - minPacks)) + minPacks;
    }
}
