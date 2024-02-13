class Carrefour {
    public static void main(String[] args) {

        final int DAY_HOURS = 12;
        final int DAY_MINUTES = DAY_HOURS * 60;

        int customerQueue = 0;
        int minutes = 0;
        int[] quantityOfItems = { 0, 0, 0, 0 };
        boolean workingHours = true;

        do {
            minutes++;
            workingHours = minutes < DAY_MINUTES;
            currentTime(minutes);
            customerQueue = customerQueue + addCustomer(workingHours);
            customerQueue = customerQueue - cashierWorking(quantityOfItems, customerQueue);
            System.out.println(customerQueue);

        } while (allCustomersLeft(quantityOfItems, workingHours));
    }

    static boolean allCustomersLeft(int[] quantityOfItems, boolean workingHours) {
        boolean cashiersWorking = true;
        int totalItems = 0;
        for (int cashierLine = 0; cashierLine < quantityOfItems.length; cashierLine++) {
            totalItems = totalItems + quantityOfItems[cashierLine];
        }
        cashiersWorking = totalItems != 0 ? true : false;
        if (!cashiersWorking && !workingHours) {
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

    static int addCustomer(boolean workingHours) {
        final double customerSpawnProbability = 0.6;
        if (Math.random() < customerSpawnProbability && workingHours) {
            return 1;
        }
        return 0;
    }

    static int cashierWorking(int[] quantityOfItems, int customerQueue) {
        final int MIN_ITEMS = 5;
        final int MAX_ITEMS = 15;
        int numberOfCustomersToCheckout = 0;

        for (int cashierLine = 0; cashierLine < quantityOfItems.length; cashierLine++) {
            if (quantityOfItems[cashierLine] == 0 && customerQueue > 0) {
                quantityOfItems[cashierLine] = (int) (Math.random() * (MAX_ITEMS - MIN_ITEMS) + MIN_ITEMS);
                customerQueue--;
                numberOfCustomersToCheckout++;
            }
            if (quantityOfItems[cashierLine] != 0) {
                quantityOfItems[cashierLine]--;
            }
            printASCII(quantityOfItems[cashierLine]);
        }

        reduceCustomer(numberOfCustomersToCheckout);
        return numberOfCustomersToCheckout;
    }

    static int reduceCustomer(int reduce) {
        return reduce;
    }

    static void printASCII(int quantityOfItems) {
        final int EMPLOYEE_RESTING = 0;
        final int EMPLOYEE_WORKING = 1;
        String[] draw = { "O ", "O:" };
        System.out.println((quantityOfItems == 0 ? draw[EMPLOYEE_RESTING] : draw[EMPLOYEE_WORKING])
                + "[#]".repeat(quantityOfItems));
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