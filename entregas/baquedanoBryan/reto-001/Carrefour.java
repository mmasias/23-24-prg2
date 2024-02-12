import java.util.Scanner;

class Carrefour {
    public static void main(String[] args) {
       // Scanner entrada = new Scanner(System.in);

        final int TOTAL_MINUTES_PER_DAY = 720;
        int minutesWorked = 0;



       do {
        minutesWorked = minutesWorked++;
        System.out.println("Comprobaciòn de que el while sirve");
        
        
       } while (minutesWorked<TOTAL_MINUTES_PER_DAY);

    }
}