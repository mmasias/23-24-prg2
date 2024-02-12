
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

            numberOfCustomersWaiting = handleCustomerArrive(numberOfCustomersWaiting);

            printStatus(numberOfCustomersWaiting, cashiers);

            int freeCashierIndex = checkIfCashierIsFree(cashiers);

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

    static int handleCustomerCheckout(int[] cashiers, int freeCashierIndex, int numberOfCustomersWaiting) {
        if (freeCashierIndex != -1 && numberOfCustomersWaiting > 0) {
            if (cashiers[freeCashierIndex] == 0) {
                cashiers[freeCashierIndex] = generateCustomerItems();
                return numberOfCustomersWaiting -= 1;
            }
        }

        return numberOfCustomersWaiting;
    }

    static int generateCustomerItems() {
        return (int) (Math.random() * 10) + 5;
    }

    static int checkIfCashierIsFree(int[] cashiers) {
        for (int i = 0; i < cashiers.length; i++) {
            if (cashiers[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    private static int handleCustomerArrive(int numberOfCustomersWaiting) {
        boolean customerHasArrived = RANDOM.nextDouble() <= CLIENT_ARRIVAL_PROBABILITY;
        int newNumberOfCustomers;

        if (customerHasArrived) {
            minutesWithoutClients = 0;
            newNumberOfCustomers = numberOfCustomersWaiting += 1;
            System.out.println("A customer has arrived!");
        } else {
            minutesWithoutClients += 1;
            newNumberOfCustomers = numberOfCustomersWaiting;
            System.out.println("No new customer arrived" + minutesWithoutClients);
        }

        return newNumberOfCustomers;
    }

    static boolean checkIfCarrefourIsOpen(int time) {
        return time <= MINUTESOFDAY;
    }

}