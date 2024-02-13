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

 static void handleCashiers(int[] cashiers, int length) {
    for(int i = 0; i < length; i++) {
       int cashier = cashiers[i];
       boolean isOcuppied = cashier > 0;

       if(cashier < 0) {
          System.out.println("Register: " + (i + 1) + " [Register close ]");
          continue;
       }
       if(isOcuppied) {
          cashiers[i] = cashier - 1;
       } 
       System.out.println("Register: " + (i + 1) + " [" + (cashier > 0 ? "°".repeat(cashier) : "") + "] " + cashier);
    }
 }

 static boolean passClientToCashier(int[] cashiers, int max, int min, int length) {
    for(int i = 0; i < length; i++) {
       int cashier = cashiers[i];
       boolean isOcuppied = cashier > 0;
       if(cashier < 0) {
          continue ;
       }
       if(!isOcuppied) {
          int items = generateItems(max, min);
          cashiers[i] = items;
          totalItemsSold += items;
          return true;
       }
    }
    return false;
 }

 static int generateItems(int max, int min) {
    return (int) (Math.random() * (max - min)) + min;
 }

 static void printStatus(int currentTime, boolean incomingPerson, int line) {
    String personas = incomingPerson ? "One person is here" : "Nobody's here";
    System.out.println("\nMINUTE " + currentTime + " - "  + personas + " - " + "In line: " + line + "\n");
 }

 static void admin(int[] cashiers, Scanner scanner) {
    System.out.println("\nClose Register [1] / Open Register [2] / Continue [3]\n");
    int input = scanner.nextInt();

    if(input == 1) {
       System.out.println("\nChoose wich register you want to close\n");
       int selectedCashier = scanner.nextInt() - 1;
       cashiers[selectedCashier] = -1;
    }

    if(input == 2) {
       System.out.println("\nChoose wich register you want to open\n");
       int selectedCashier = scanner.nextInt() - 1;
       cashiers[selectedCashier] = 0;
    }

    if(input == 3) {
       return; 
    }
 }
}
