class Carrefour {
    public static void main(String[] args) {

        final int DAY_HOURS = 12;
        final int DAY_MINUTES = DAY_HOURS * 60;

        int customerQueue = 0;
        int minutes = 0;
        int[][] cashiersStatus = {
                { 0, 0 },
                { 0, 0 },
                { 0, 0 },
                { 0, 0 }
        };
        boolean workingHours = true;

        do {
            minutes++;
            workingHours = minutes < DAY_MINUTES;
            currentTime(minutes);
            customerQueue = customerQueue + addCustomer(workingHours);
            customerQueue = customerQueue - cashierWorking(cashiersStatus, customerQueue);
            System.out.println(customerQueue);

        } while (allCustomersLeft(cashiersStatus, workingHours));
    }

    static boolean allCustomersLeft(int[][] cashiersStatus, boolean workingHours) {
        final int EMPLOYEE = 0;
        int cashierWorking = 0;
        for (int cashierLine = 0; cashierLine < cashiersStatus.length; cashierLine++) {
            cashierWorking = cashierWorking + cashiersStatus[cashierLine][EMPLOYEE];
        }
        if (cashierWorking == 0 && !workingHours) {
            return false;
        }
        return true;
    }

    static void currentTime(int minutes) {
        int hour = 9 + (minutes / 60);
        minutes = minutes % 60;
        String division = ":";
        if (minutes < 10) {
            division = ":0";
        }
        System.out.println("Hora: " + hour + division + minutes);
    }

    static int addCustomer(boolean isWorking) {
        final double customerSpawnProbability = 0.6;
        if (Math.random() < customerSpawnProbability && isWorking) {
            return 1;
        }
        return 0;
    }

    static int cashierWorking(int[][] cashiersStatus, int customerQueue) {
        final int EMPLOYEE = 0;
        final int ITEMS = 1;
        final int NOT_WORKING = 0;
        final int WORKING = 1;
        final int MIN_ITEMS = 5;
        final int MAX_ITEMS = 15;
        int numberOfCustomersToCheckout = 0;

        for (int cashierLine = 0; cashierLine < cashiersStatus.length; cashierLine++) {
            if (cashiersStatus[cashierLine][EMPLOYEE] == NOT_WORKING && customerQueue > 0) {
                cashiersStatus[cashierLine][EMPLOYEE] = WORKING;
                cashiersStatus[cashierLine][ITEMS] = (int) (Math.random() * (MAX_ITEMS - MIN_ITEMS) + MIN_ITEMS);
                numberOfCustomersToCheckout++;
            }
            if (cashiersStatus[cashierLine][EMPLOYEE] == WORKING && cashiersStatus[cashierLine][ITEMS] > 0) {
                cashiersStatus[cashierLine][ITEMS] = cashiersStatus[cashierLine][ITEMS] - 1;
            }
            if (cashiersStatus[cashierLine][ITEMS] == 0) {
                cashiersStatus[cashierLine][EMPLOYEE] = NOT_WORKING;
            }
            printASCII(cashiersStatus[cashierLine][EMPLOYEE], cashiersStatus[cashierLine][ITEMS]);
        }
        return numberOfCustomersToCheckout;
    }

    static void printASCII(int cashier, int items) {
        String[] draw = { "O ", "O:" };
        System.out.println(draw[cashier] + "[#]".repeat(items));
    }

    static void printItemsASCII(int value) {
        System.out.println();
    }

    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause(double seconds) {
        try {
            Thread.sleep((int) (1000 * seconds));
        } catch (InterruptedException e) {
        }
    }
}