import java.util.Scanner;
public class ShoppingCentre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean dayFinshed =false;
        
        final int SHIFT_START = 9;
        final int SHIFT_HOURS = 12;
        int hour = 9;
        int minutesPassed = 0;
        
        final int MINIMUM_ITEMS = 5;
        final int MAXIMUM_ITEMS = 15;
        int soldItems = 0;
        
        int[] register = new int[4];
        
        final int NEW_CUSTOMER_CHANCE = 60;
        int queue = 0;
        int emptyQueueTime = 0;
        int dailyClients = 0;

        do{ 
                minutesPassed += 1;
            
                if (minutesPassed % 3 == 0){
                    hour += 1;
                    minutesPassed = 0;
                }

                System.out.print("[" + hour + ":" + String.format("%02d", minutesPassed) + "]" + "  -  ");

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
                    } else if (queue >= 1){
                        queue -= 1;
                        dailyClients += 1;
                        register[checking] = randomNumber(MINIMUM_ITEMS, MAXIMUM_ITEMS);
                    }
                }

            System.out.println("Register1:[" + register[0] + "] | Register2:[" + register[1] + "] | Register3:[" + register[2] + "] | Register4:[" + register[3] + "]");
            System.out.println();
                
            scanner.nextLine();
        
            dayFinshed = hour == SHIFT_START + SHIFT_HOURS;
        
        }while (!dayFinshed);

        System.out.println("The queue has been empty for " + emptyQueueTime + " minutes");
        System.out.println("At closing time the queue had " + queue + " clients");
        System.out.println("In total there has been [" + soldItems + "] sold items, spread over " + dailyClients + " clients");
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
