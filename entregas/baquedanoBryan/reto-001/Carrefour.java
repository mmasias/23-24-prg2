import java.util.Scanner;

class Carrefour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_MINUTES_PER_DAY = 720;
        int minutesWorked = 0;
        final double PROBABILITY = 0.6;
        int waitingLineCostumer = 0;
        int[] waitingLinePerCashier = { 0, 0, 0, 0, };
        int[] itemsRemainingPerCashier = { 0, 0, 0, 0 };
        int zeroCostumersInLine = 0;
        int costumersAttended = 0;
        int costumersAtTheEnd = 0;
        int totalItemsSold = 0;

        do {

            double costumerProbability = Math.random();
            minutesWorked++;
            waitingLineCostumer = costumerArrival(PROBABILITY, costumerProbability, waitingLineCostumer);
            

            for (int i = 0; i < waitingLinePerCashier.length && waitingLineCostumer > 0; i++) {
                if (waitingLinePerCashier[i] == 0) {
                    waitingLinePerCashier[i]++;
                    itemsRemainingPerCashier[i] = generateRandomItems();
                    waitingLineCostumer--;
                } else if (itemsRemainingPerCashier[i] > 0) {
                    itemsRemainingPerCashier[i]--;
                    totalItemsSold = totalItemsSold+1;
                    if (itemsRemainingPerCashier[i] == 0) {
                        waitingLinePerCashier[i] = 0;
                    }
                }
            }
            zeroCostumersInLine = zeroCostumersInLineCalculation(waitingLineCostumer, zeroCostumersInLine);
            costumersAttended = costumersAttendedCalculation(waitingLinePerCashier, costumersAttended);
            costumersAtTheEnd = costumersAtTheEndOfTheDay(costumersAtTheEnd, waitingLineCostumer, minutesWorked);
            imprimirEstadoCajas(minutesWorked, waitingLinePerCashier, itemsRemainingPerCashier, waitingLineCostumer, zeroCostumersInLine, costumersAttended, totalItemsSold);
            
            scanner.nextLine();
        } while (minutesWorked < TOTAL_MINUTES_PER_DAY);
        
        System.out.println("Clientes que quedaron esperando al final del día: " + costumersAtTheEnd);

    }

    private static int generateRandomItems() {
        return (int) (Math.random() * 11) + 5;
    }

    private static void imprimirEstadoCajas(int minutesWorked, int[] waitingLinePerCashier,
            int[] itemsRemainingPerCashier, int waitingLineCostumer, int zeroCostumersInLine, int costumersAttend, int totalItemsSold) {
        System.out.println("Minuto " + minutesWorked);
        for (int i = 0; i < waitingLinePerCashier.length; i++) {
            System.out.println("Caja " + (i + 1) + ": " + waitingLinePerCashier[i] + " cliente(s) en espera con "
                    + itemsRemainingPerCashier[i] + " item(s) restante(s)");
        }
        
        System.out.println("Clientes en espera: " + waitingLineCostumer);
        System.out.println("Veces en las que la linea ha tenido 0 clientes: " + zeroCostumersInLine);
        System.out.println("Clientes atendidos: " + costumersAttend);
        System.out.println("Total de ítems vendidos durante el día: " + totalItemsSold);System.out.println("Total de ítems vendidos durante el día: " + totalItemsSold);
    }

    private static int costumerArrival(double probability, double costumerProbability, int waitingLineCostumer) {
        if (costumerProbability < probability) {
            waitingLineCostumer++;
            System.out.println("¡Ha llegado un cliente!");
        } else{
            System.out.println("No ha llegado ningun cliente");

        }

        
        return waitingLineCostumer;
    }

    private static int zeroCostumersInLineCalculation(int waitingLineCostumer, int zeroCostumersInLine) {
        if (waitingLineCostumer == 0) {
            zeroCostumersInLine++;
        }
        return zeroCostumersInLine;
    }

    private static int costumersAttendedCalculation(int[] waitingLinePerCashier, int costumersAttended) {
        for (int i = 0; i < waitingLinePerCashier.length; i++) {

                if (waitingLinePerCashier[i] == 0) {
                    costumersAttended++;
                }
            }
        return costumersAttended;
    }

    public static int costumersAtTheEndOfTheDay(int costumersAtTheEnd, int waitingLineCostumer, int minutesWorked) {
        if (minutesWorked==720) {
            costumersAtTheEnd = waitingLineCostumer;
        }
        return costumersAtTheEnd;
    }




}
