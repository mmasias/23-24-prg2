public class CCCF {

    static boolean Client=false;
    static int itemPacks=0;
    static int queue=0;
    static int cashier1=0;
    static int cashier2=0;
    static int cashier3=0;
    static int cashier4=0;

    public static void main(String[] args) {

        int initialTime=9;
        int finalTime=21;
        int hours=finalTime-initialTime;
        int totalMinutes=hours*60;
        int minutes=1;

        do{

            checkNewClient();

            timeProgress();

            manageNewCLient(minutes);

            minutes++;
        }while (minutes<=totalMinutes);


    }

    static void checkNewClient(){
        int newClient=(int)Math.round(Math.random()*10);
        if(newClient<=6){
            Client=true;
        }else{
            Client=false;
            itemPacks=0;
        }


    }

    static void generateItemPacks() {
        itemPacks=(int)Math.round(Math.random()*10+5);
    }

    static void manageNewCLient(int minutesx) {

        System.out.print("MINUTO " + minutesx + " - ");
        if(Client){
            System.out.print("Llega 1 persona - ");
        }else if(!Client){
            System.out.print("No llega nadie - ");
        }


        if(cashier1==0){
            generateItemPacks();
            cashier1=cashier1+itemPacks;
            queue--;
        }else if(cashier2==0){
            generateItemPacks();
            cashier2=cashier2+itemPacks;
            queue--;
        }else if(cashier3==0){
            generateItemPacks();
            cashier3=cashier3+itemPacks;
            queue--;
        }else if(cashier4==0){
            generateItemPacks();
            cashier4=cashier4+itemPacks;
            queue--;
        }else{
            queue++;
        }

        if(queue<0){
            queue=0;
        }

        System.out.print("En cola: " + queue);
        System.out.println();
        System.out.print("Caja1:[" + cashier1 + "] | Caja2:[" + cashier2 + "] | Caja3:[" + cashier3 + "] | Caja4:[" + cashier4 + "]");
        System.out.println("\n");

    }

    private static void timeProgress() {
        if(cashier1!=0){
            cashier1--;
        }
        if(cashier2!=0){
            cashier2--;
        }
        if(cashier3!=0){
            cashier3--;
        }
        if(cashier4!=0){
            cashier4--;
        }
    }

}
