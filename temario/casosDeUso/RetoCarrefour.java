public class RetoCarrefour {
    public static void main(String[] args) {
        final int MINUTE_IN_HOUR = 60 ;
        int hoursWorking = 12;
       final double POTENTIALOFARRIVAL = 0.4;
        int timeWorking= 1;
        int MaxTimeForWork= hoursWorking*MINUTE_IN_HOUR;
        int cashier1 = 0, cashier2 = 0, cashier3= 0, cashier4=0, cashier5 = 0, cashier6=0;
        boolean isWorking = true;
        int peopleInLine = 0;
        int servicedCostumers =0 ;
        int noOneInLine=0;
        int maxAmountOfPacks = 0;
        final int PACK_MINIMUM = 5;
        final int PACK_MAXIMUM = 15;
        int arrivesOnLane = 1;

        
     do {
        timeWorking = timeWorking+1;
        isWorking = timeWorking<=MaxTimeForWork;
        Double probabilityOfNewCostumer = Math.random();
        if (probabilityOfNewCostumer <= POTENTIALOFARRIVAL){
            peopleInLine= peopleInLine +1;
            arrivesOnLane = 1;
        }
        else{
            arrivesOnLane =0;
        }
        if (peopleInLine==0){
            noOneInLine++;
        }
        if (peopleInLine>0 && cashier1<=0) {
            peopleInLine--;
            servicedCostumers++;
            cashier1 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
        }
        if (peopleInLine>0 && cashier2<=0) {
            peopleInLine--;
            servicedCostumers++;
            cashier2 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
        }
        if (peopleInLine>0 && cashier3<=0) {
            peopleInLine--;
            servicedCostumers++;
            cashier3 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
        }
        if (peopleInLine>0 && cashier4<=0) {
            peopleInLine--;
            servicedCostumers++;
            cashier4 = createPacks(PACK_MINIMUM, PACK_MAXIMUM);
        }

        if (cashier1> 0) {
            cashier1= cashier1 -1;
            maxAmountOfPacks++;

        }
        if (cashier2> 0) {
            cashier2= cashier2 -1;
            maxAmountOfPacks++;

        }
        if (cashier3> 0) {
            cashier3= cashier3 -1;
            maxAmountOfPacks++;

        }
        if (cashier4> 0) {
            cashier4= cashier4 -1;
            maxAmountOfPacks++;

        }
        System.out.println("Minuto "+timeWorking+ "- Llega "+arrivesOnLane+" persona -"+ " En Cola:"+ peopleInLine );
        System.out.println("Caja1:["+cashier1+"] | Caja2:["+cashier2+"] | Caja3:["+cashier3+"] | Caja4:["+cashier4+"]");

        
     } while (isWorking == true);
        System.out.println(servicedCostumers);
        System.out.println(maxAmountOfPacks);
        System.out.println(peopleInLine);
        System.out.println(noOneInLine);
    }

    

private static int createPacks(int maxPacks, int minPacks) {
    return (int) (Math.random() * (maxPacks - minPacks)) + minPacks;
}}
