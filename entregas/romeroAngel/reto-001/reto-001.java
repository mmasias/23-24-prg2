import java.util.Scanner;

class RetoCarrefour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int CLOSING_TIME = 720;
        final double CLIENT_ARRIVAL_PROBABILITY = 0.4;

        int currentMinute = 0;
        int queue = 0;
        boolean working;

        int itemsMaximum = 15;
        int itemsMinimum = 5;

        int[] cashiers = { 0, 0, 0, 0 };

        do {
            queue = clientArrives(queue, CLIENT_ARRIVAL_PROBABILITY);
            cashiers = sendClientToCashier(cashiers, queue, itemsMaximum, itemsMinimum);
            currentMinute++;
            showData(queue, cashiers, currentMinute);

            scanner.nextLine();
            
            working = currentMinute < CLOSING_TIME;
        } while (working);

    }

    private static void showData(int queue, int[] cashiers, int currentMinute) {
        System.out.println("MINUTO " + currentMinute + " -  - En Cola: " + queue);
        System.out.print("Caja 1:[" + cashiers[0] + "] | Caja 2:[" + cashiers[1] + "] | Caja 3:[" + cashiers[2] + "] | Caja 4: [" + cashiers[3] + "]");
    }

    private static int[] sendClientToCashier(int[] cashiers, int queue, int itemsMaximum, int itemsMinimum) {
        if (queue > 0) {
            for (int i = 0; i < cashiers.length && queue > 0; i++) {
                if (cashiers[i] == 0) {
                    int itemsAsigned = (int) (Math.random() * (itemsMaximum - itemsMinimum) + itemsMaximum);
                    cashiers[i] = itemsAsigned;
                    queue--;
                    return cashiers;
                }
            }
        }

        return cashiers;
    }

    private static int clientArrives(int queue, double CLIENT_ARRIVAL_PROBABILITY) {
        double clientArrival = Math.random();
        if (clientArrival <= CLIENT_ARRIVAL_PROBABILITY) {
            queue++;
        }
        return queue;

    }

}