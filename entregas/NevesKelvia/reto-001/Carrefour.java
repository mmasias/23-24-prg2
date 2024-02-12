class Carrefour {

    public static void main(String[] args) {

        final double OPENING_TIME = 9;
        final double CLOSING_TIME = 21;
        int time = 0;
        boolean isOpen = true;
        final double PROBABILITY_ARRIVAL = 0.6;
        int cashier = 0;
        final int ITEM_MINIMUM = 5;
        final int ITEM_MAXIMUM = 15;

        if (time < CLOSING_TIME) {
            isOpen = true;
            time++;
            System.out.println("Time: " + time);
        }
        int line = 0;

        line = line + (Math.random() < PROBABILITY_ARRIVAL ? 1 : 0);

        System.out.println(time);
        System.out.println("Line: " + line);

        if (cashier <= 0 & line > 0) {
            line = line - 1;
            cashier = (int) (Math.random() * (ITEM_MAXIMUM - ITEM_MINIMUM)) + ITEM_MINIMUM;
        }

        if (cashier > 0) {
            cashier = cashier - 1;
        }

    }
}