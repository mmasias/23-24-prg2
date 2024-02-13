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

        do {

            double costumerProbability = Math.random();
            minutesWorked++;
            waitingLineCostumer = costumerArrival(PROBABILITY, costumerProbability, waitingLineCostumer);
            zeroCostumersInLine = zeroCostumersInLineCalculation(waitingLineCostumer, zeroCostumersInLine);
            costumersAttended = costumersAttendedCalculation(waitingLinePerCashier, costumersAttended);

            for (int i = 0; i < waitingLinePerCashier.length && waitingLineCostumer > 0; i++) {
                if (waitingLinePerCashier[i] == 0) {
                    waitingLinePerCashier[i]++;
                    itemsRemainingPerCashier[i] = generateRandomItems();
                    waitingLineCostumer--;
                } else if (itemsRemainingPerCashier[i] > 0) {
                    itemsRemainingPerCashier[i]--;
                    if (itemsRemainingPerCashier[i] == 0) {
                        waitingLinePerCashier[i] = 0;
                    }
                }
            }

            
            imprimirEstadoCajas(minutesWorked, waitingLinePerCashier, itemsRemainingPerCashier, waitingLineCostumer, zeroCostumersInLine);
            scanner.nextLine();
        } while (minutesWorked < TOTAL_MINUTES_PER_DAY);

    }

    private static int generateRandomItems() {
        return (int) (Math.random() * 11) + 5;
    }

    private static void imprimirEstadoCajas(int minutesWorked, int[] waitingLinePerCashier, int[] itemsRemainingPerCashier, int waitingLineCostumer, int zeroCostumersInLine) {
        System.out.println("Minuto " + minutesWorked);
        for (int i = 0; i < waitingLinePerCashier.length; i++) {
            System.out.println("Caja " + (i + 1) + ": " + waitingLinePerCashier[i] + " cliente(s) en espera con " + itemsRemainingPerCashier[i] + " item(s) restante(s)");
        }
        System.out.println("Clientes en espera: " + waitingLineCostumer);
        System.out.println("Veces en las que la linea ha tenido 0 clientes: " + zeroCostumersInLine);
    }

    

    private static int costumerArrival(double probability, double costumerProbability, int waitingLineCostumer) {
        if (costumerProbability < probability) {
            waitingLineCostumer++;
        }
        return waitingLineCostumer;
    }

    private static int zeroCostumersInLineCalculation(int waitingLineCostumer, int zeroCostumersInLine){
        if (waitingLineCostumer == 0) {
            zeroCostumersInLine++;
        }
        return zeroCostumersInLine;
    }

    private static int costumersAttendedCalculation(int [] waitingLinePerCashier, int waitingLineCostumer, int costumersAttended){
        for (int i = 0; i < waitingLinePerCashier.length && waitingLineCostumer > 0; i++) {
            if (waitingLinePerCashier[i] == 0) {
                costumersAttended++;
            } 
        }

        return costumersAttended;

    }

}
