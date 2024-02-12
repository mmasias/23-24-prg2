public class RetoCarrefour {
    public static void main(String[] args) {
        final int MINUTE_IN_HOUR = 60 ;
        int hoursWorking = 9;
       final double POTENTIALOFARRIVAL = 0.6;
        int timeWorking= 1;
        int ammountOfCostumers = 0;
        int MaxTimeForWork= hoursWorking*MINUTE_IN_HOUR;
        int cashier1 = 0, cashier2 = 0, cashier3= 0, cashier4=0, cashier5 = 0, cashier6=0;
        boolean isWorking = true;
        int peopleInLine = 0;
        int servicedCostumers =0 ;
        int noOneInLine=0;
        int maxAmountOfPacks = 0;
        final int PACK_MINIMUM = 5;
        final int PACK_MAXIMUM = 15;
        
     do {
        timeWorking = timeWorking++;
        isWorking = timeWorking<=MaxTimeForWork;
        Double probabilityOfNewCostumer = Math.random();
        if (POTENTIALOFARRIVAL >= probabilityOfNewCostumer){
            ammountOfCostumers++;
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
            cashier1--;
            maxAmountOfPacks++;

        }
        if (cashier2> 0) {
            cashier2--;
            maxAmountOfPacks++;

        }
        if (cashier3> 0) {
            cashier3--;
            maxAmountOfPacks++;

        }
        if (cashier4> 0) {
            cashier4--;
            maxAmountOfPacks++;

        }

        
     } while (isWorking == true);
        
    }

private static int createPacks(int maxPacks, int minPacks) {
    return (int) (Math.random() * (maxPacks - minPacks)) + minPacks;
}}
