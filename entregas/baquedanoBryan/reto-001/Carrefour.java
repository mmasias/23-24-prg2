import java.util.Scanner;

class Carrefour {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);

        final int TOTAL_MINUTES_PER_DAY = 720;
        int minutesWorked = 0;
        final double PROBABILITY = 0.6;
        int waitingLineCostumer= 0;

        do {
            double costumerProbability = Math.random();
            minutesWorked++;
            waitingLineCostumer = costumerArrival(PROBABILITY, costumerProbability, waitingLineCostumer);
            System.out.println(waitingLineCostumer);
 

        } while (minutesWorked < TOTAL_MINUTES_PER_DAY);

    }

    private static int costumerArrival(double probability, double costumerProbability, int waitingLineCostumer) {
        if (costumerProbability<probability) {
            waitingLineCostumer++;
        }

        return waitingLineCostumer;

    }
}
