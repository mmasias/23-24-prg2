    import java.util.Scanner;

    class RetoCarrefour {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            final int CLOSING_TIME = 720;
            final double CLIENT_ARRIVAL_PROBABILITY = 0.4;
            final int ITEMS_MAXIMUM = 15;
            final int ITEMS_MINIMUM = 5;

            int queue = 0;
            int currentMinute = 0;
            boolean working;

            int[] cashiers = { 0, 0, 0, 0 };

            do {
                queue = clientArrives(queue, CLIENT_ARRIVAL_PROBABILITY);

                int[] data = sendClientToCashier(cashiers, queue, ITEMS_MAXIMUM, ITEMS_MINIMUM);
                cashiers = new int[] {data[0], data[1], data[2], data[3]};
                queue = data[4];
                
                scanProducts(cashiers);
                currentMinute++;
                showData(queue, cashiers, currentMinute);

                scanner.nextLine();

                working = currentMinute < CLOSING_TIME;
            } while (working);

        }

        private static void showData(int queue, int[] cashiers, int currentMinute) {
            System.out.println("MINUTO " + currentMinute + " -  - En Cola: " + queue);
            System.out.print("Caja 1:[" + cashiers[0] + "] | Caja 2:[" + cashiers[1] + "] | Caja 3:[" + cashiers[2]
                    + "] | Caja 4: [" + cashiers[3] + "]");
        }

        private static int[] sendClientToCashier(int[] cashiers, int queue, int ITEMS_MAXIMUM, int ITEMS_MINIMUM) {

            for (int i = 0; i < cashiers.length && queue > 0; i++) {
                if (cashiers[i] == 0) {
                    int itemsAsigned = (int) (Math.random() * (ITEMS_MAXIMUM - ITEMS_MINIMUM) + ITEMS_MINIMUM);
                    cashiers[i] = itemsAsigned;
                    
                    queue--;
                    return new int[] {cashiers[0], cashiers[1], cashiers[2], cashiers[3], queue};

                }

            }

            return new int[] {cashiers[0], cashiers[1], cashiers[2], cashiers[3], queue};

        }

        private static void scanProducts(int[] cashiers) {
            for (int i = 0; i < cashiers.length; i++) {
                if (cashiers[i] > 0) {
                    cashiers[i]--;
                }
            }
        }

        private static int clientArrives(int queue, double CLIENT_ARRIVAL_PROBABILITY) {
            double clientArrival = Math.random();
            if (clientArrival <= CLIENT_ARRIVAL_PROBABILITY) {
                queue++;
            }
            return queue;

        }

    }