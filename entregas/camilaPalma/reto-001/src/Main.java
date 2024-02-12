
import java.util.Random;

class CCCF {

    final static int MINUTESOFDAY = 720;
    final static double CLIENT_ARRIVAL_PROBABILITY = 0.4;
    final static Random RANDOM = new Random();
    static int minutesWithoutClients = 0;

    public static void main(String[] args) {

        int time = 0;

        boolean carrefourIsOpen = true;

        int numberOfCustomersWaiting = 0;

        int[] cashiers = { 0, 0, 0, 0 };

        while (carrefourIsOpen) {

            printStatus(numberOfCustomersWaiting, cashiers);

            time++;
            carrefourIsOpen = checkIfCarrefourIsOpen(time);
        }
    }

    static void printStatus(int numberOfCustomersWaiting, int[] cashiers) {
        System.out.println("Customers in line: " + numberOfCustomersWaiting);
        for (int cashier : cashiers) {
            System.out.print("[" + cashier + "] ");
        }
        System.out.println();
    }

    static boolean checkIfCarrefourIsOpen(int time) {
        return time <= MINUTESOFDAY;
    }

}