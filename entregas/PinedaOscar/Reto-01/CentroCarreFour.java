import java.util.Arrays;

public class CentroCarreFour {
    public static void main(String[] args) {
        final int TOTAL_MINUTES = 720;
        final int TOTAL_CASHIERS = 4;
        final int CLIENTS_PER_CASHIER = 5;
        final int NEW_CASHIER_MAX_AMOUNT_ = 15;

        int cola = 0;
        boolean[] occupiedCashier = new boolean[TOTAL_CASHIERS];
        int[] itemsClientCashier = new int[TOTAL_CASHIERS];
        int numberCashier = TOTAL_CASHIERS;
        int minutesWithoutClientInLine = 0;
        int clientsInLineAtTheEnd = 0;
        int servedPeople = 0;
        int soldItems = 0;

        boolean newCashierAddedThisMinute = false;

    }
}