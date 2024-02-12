public class CCCF {

    static double arrival_prob = 0.4;
    static int items_min = 5;
    static int items_max = 15;

    public static void main(String[] args) {

        int [] queue = new int [720];
        int [] cashiers = new int [4];
        int customers_total = 0;
        int items_sold = 0;
        int queue_size = 0;
        boolean people_queued = false;

        for (int i = 0; i < queue.length; i++){

            double random_num = Math.random();

            if (random_num < arrival_prob){
               
                people_queued = true;
                queue[queue_size++] = (int) (Math.random()*(items_max - items_min + 1)) + items_min;
                customers_total++;

            }else{

                people_queued = false;

            }
        }
    }

}