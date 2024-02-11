import java.util.Scanner;
public class ShoppingCentre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean dayFinshed =false;
        
        final int SHIFT_START = 9;
        final int SHIFT_HOURS = 12;

        final int SHIFT_DURATION = SHIFT_HOURS * 60;
        int minutesPassed = 0;
        int hour = 9;

        do{ 

        minutesPassed += 1;
        if (minutesPassed % 60 == 0){
            hour += 1;
            minutesPassed = 0;
        }
        System.out.println(hour + ":" + String.format("%02d", minutesPassed) + " horas");
        scanner.nextLine();
        dayFinshed = hour == SHIFT_START + SHIFT_HOURS;
        }while (!dayFinshed);
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
