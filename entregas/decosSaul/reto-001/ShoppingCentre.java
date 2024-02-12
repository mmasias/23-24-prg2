import java.util.Scanner;
public class ShoppingCentre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean dayFinshed =false;
        
        final int SHIFT_START = 9;
        final int SHIFT_HOURS = 12;
        
        final int MINIMUM_ITEMS = 5;
        final int MAXIMUM_ITEMS = 15;

        final int NEW_CUSTOMER_CHANCE = 60;

        int minutesPassed = 0;
        int hour = 9;

        int soldItems = 0;
        
        String registerStatusMessage = "";

        int[] register = new int[4];

        int queue = 0;
        int emptyQueueTime = 0;

        int dailyClients = 0;
        do{ 
            minutesPassed += 1;
            registerStatusMessage = "";
        
            if (minutesPassed % 60 == 0){
                hour += 1;
                minutesPassed = 0;
            }

            System.out.println("[" + hour + ":" + String.format("%02d", minutesPassed) + "]");
            
            if (somethingHappens(NEW_CUSTOMER_CHANCE)){
                queue += 1;
                System.out.println("A new customer has arrived, there are " + queue + " customers in the queue");
            } else {
                System.out.println("No new customers arrived, currently the queue has " + queue + " customers");
            }

            emptyQueueTime += queue == 0 ? 1 : 0;

            for (int checking = 0; checking < register.length; checking ++){
                if (register[checking] > 0){
                    register[checking] -= 1;
                    soldItems += 1;
                    registerStatusMessage += "Register[" + checking + "] " + register[checking] + " items  /   ";
                } else if (queue >= 1){
                    queue -= 1;
                    dailyClients += 1;
                    register[checking] = randomNumber(MINIMUM_ITEMS, MAXIMUM_ITEMS);
                    registerStatusMessage += "Register[" + checking + "] " + register[checking] + " items  /   ";
                } else {
                    registerStatusMessage += "Register[" + checking + "] " + register[checking] + " items  /   ";
                }
            }



        System.out.println(registerStatusMessage);
        System.out.println();
                
        scanner.nextLine();
        
        dayFinshed = hour == SHIFT_START + SHIFT_HOURS;
        
        }while (!dayFinshed);

    System.out.println("The queue has been empty for " + emptyQueueTime + " minutes");
    System.out.println("In total there has been " + soldItems + " sold items, spreaded over " + dailyClients + " clients");
    }

    static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
    static boolean somethingHappens(int probability) {
        if (randomNumber(0, 100) < probability){
            return true;
        } else {
            return false;
        }
    }

}
