package entregas.OrtizNazaret;
import java.util.Scanner;

class Carrefour {
   static int totalPersonsInDay = 0;
   static int totalItemsSold = 0;

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int TOTAL_MINUTES = 720;
    final double NEW_COSTUMER_PROB = 0.6;
    final int MIN_ITEMS = 5;
    final int MAX_ITEMS = 15;

    int line = 0;
    int noClients = 0;
    int currentTime = 0;
    boolean is_open = true;
    int[] cashiers = { 0, 0, 0, 0, 0, 0};
 
    while(is_open) {
       currentTime++;
       is_open = currentTime < TOTAL_MINUTES;
       boolean incomingPerson = Math.random() < NEW_COSTUMER_PROB;
       line = incomingPerson ? line + 1 : line;
       totalPersonsInDay = incomingPerson ? totalPersonsInDay + 1 : totalPersonsInDay ;
       int length = line >= 15 ? (cashiers.length - 1) : (cashiers.length - 2);

       if(line > 0) {
          line = passClientToCashier(cashiers, MAX_ITEMS, MIN_ITEMS, length) ? line - 1 : line;
       } else {
          noClients++; 
       }

       printStatus(currentTime, incomingPerson, line);
       handleCashiers(cashiers, length);
       admin(cashiers, scanner);
       scanner.nextLine();
    }

    System.out.println(
       "\nSummary" + "\n" +
       "===".repeat(10) +  "\n" +
       "Minutes in queue at zero : " + noClients + " \n" +
       "Persons in line at closing : " + line + " \n" +
       "Persons served on the day : " + totalPersonsInDay + " \n" +
       "Items sold on the day : " + totalItemsSold + " \n"
    );
 }

private static void admin(int[] cashiers, Scanner scanner) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'admin'");
}

private static void handleCashiers(int[] cashiers, int length) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'handleCashiers'");
}

private static void printStatus(int currentTime, boolean incomingPerson, int line) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'printStatus'");
}

private static boolean passClientToCashier(int[] cashiers, int mAX_ITEMS, int mIN_ITEMS, int length) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'passClientToCashier'");
}
   }


