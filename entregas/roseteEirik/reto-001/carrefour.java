class Carrefour {
    public static void main(String[] args) {

        final int DAY_HOURS = 12;
        final int DAY_MINUTES = DAY_HOURS * 60;

        int customerQueue = 0;
        int minutes = 0;
        int[] quantityOfItems = { 0, 0, 0, 0 };
        int[] totalItems = { 0, 0, 0, 0 };
        boolean workingHours = true;

        int zeroQueueStat = 0;
        int customersAttended = 0;

        do {
            minutes++;
            currentTime(minutes);
            workingHours = minutes < DAY_MINUTES;
            customerQueue = customerQueue + addCustomer(workingHours);
            message(customerQueue, quantityOfItems);
            customersAttended = customersAttended + customerQueue;
            customerQueue = customerQueue - cashierWorking(quantityOfItems, customerQueue, totalItems);
            customersAttended = customersAttended - customerQueue;
            zeroQueueStat = zeroQueueStat + emptyQueue(customerQueue);
            pause(1);
            cleanScreen();

        } while (allCustomersLeft(quantityOfItems, workingHours, customerQueue));

        finalStats(zeroQueueStat, customerQueue, customersAttended, totalItems);
    }

    static int emptyQueue(int customerQueue){
        if(customerQueue == 0){
            return 1;
        }
        return 0;
    }

    static void finalStats(int zeroQueueStat, int customerQueue, int customersAttended, int[] totalItems){
        System.out.println("RESUMEN");
        System.out.println("=".repeat(50));
        System.out.println("Minutos con cola en cero: " + zeroQueueStat);
        System.out.println("Personas en la cola al cierre: " + customerQueue);
        System.out.println("Personas atendidas en el dia: " + customersAttended);
        System.out.println("Articulos vendidos en el dia: " + addItems(totalItems));
        System.out.println("=".repeat(50));
    }

    static int addItems(int[] totalItems){
        int total = 0;
        for (int cashierLine = 0; cashierLine < totalItems.length; cashierLine++) {
            total = total + totalItems[cashierLine];
        }
        return total;
    }

    static void message(int customerQueue, int[] quantityOfItems) {
        int numberOfItems = 0;
        System.out.println(" - Fila: " + customerQueue);
        for (int cashierLine = 0; cashierLine < quantityOfItems.length; cashierLine++) {
            numberOfItems = quantityOfItems[cashierLine] == 0 ? 0 : quantityOfItems[cashierLine] - 1;
            System.out.print("Caja" + (cashierLine + 1) + ":[" + (numberOfItems) + "] | ");
        }
        System.out.println();
    }

    static boolean allCustomersLeft(int[] quantityOfItems, boolean workingHours, int customerQueue) {
        boolean cashiersWorking = true;
        boolean customersStillInShop = true;
        int totalItems = 0;
        for (int cashierLine = 0; cashierLine < quantityOfItems.length; cashierLine++) {
            totalItems = totalItems + quantityOfItems[cashierLine];
        }
        cashiersWorking = totalItems != 0 ? true : false;
        customersStillInShop = customerQueue > 0 ? true : false;
        if (!cashiersWorking && !workingHours && !customersStillInShop) {
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
        System.out.print("Hora: " + hour + division + minutes);
    }

    static int addCustomer(boolean workingHours) {
        final double customerSpawnProbability = 0.6;
        if (Math.random() < customerSpawnProbability && workingHours) {
            System.out.print(" - Llega una persona");
            return 1;
        }
        return 0;
    }

    static int cashierWorking(int[] quantityOfItems, int customerQueue, int[] totalItems) {
        final int MIN_ITEMS = 5;
        final int MAX_ITEMS = 15;
        int numberOfCustomersToCheckout = 0;
        System.out.println();

        for (int cashierLine = 0; cashierLine < quantityOfItems.length; cashierLine++) {
            if (quantityOfItems[cashierLine] == 0 && customerQueue > 0) {
                quantityOfItems[cashierLine] = (int) (Math.random() * (MAX_ITEMS - MIN_ITEMS) + MIN_ITEMS);
                totalItems[cashierLine] = totalItems[cashierLine] + quantityOfItems[cashierLine];
                customerQueue--;
                numberOfCustomersToCheckout++;
            }
            if (quantityOfItems[cashierLine] != 0) {
                quantityOfItems[cashierLine]--;
            }
            printASCII(quantityOfItems[cashierLine], customerQueue);
        }
        return numberOfCustomersToCheckout;
    }

    static void printASCII(int quantityOfItems, int customerQueue) {
        final int EMPLOYEE_RESTING = 0;
        final int EMPLOYEE_WORKING = 1;
        String[] draw = { "O ", "O:" };
        System.out.println((quantityOfItems == 0 ? draw[EMPLOYEE_RESTING] : draw[EMPLOYEE_WORKING]) + "[#]".repeat(quantityOfItems));

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