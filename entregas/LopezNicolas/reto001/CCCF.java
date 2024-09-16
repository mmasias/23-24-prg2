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

            for (int j = 0; j < cashiers.length; j++){

                if (cashiers[j] == 0 && queue_size > 0){

                    int next_customer = queue[--queue_size];
                    cashiers[j] = next_customer;
                    items_sold = items_sold + next_customer;

                }

                if (cashiers[j] > 0){

                    cashiers[j]--;
                }
            }

            System.out.println("Minuto - " + (i + 1));

            if(people_queued){

                System.out.println("Llegó una persona");

            }else{

                System.out.println("No ha llegado nadie");

            }

            for (int k = 0; k < cashiers.length; k++){

                System.out.print("Caja " + (k + 1) + ": [" + cashiers[k] + "] | ");

            }
            
            System.out.println("\n___________________________________________________________");

        }
        
        System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("RESUMEN FINAL");
        System.out.println("============================================================");
        System.out.println("Personas atendidas durante el día: " + customers_total);
        System.out.println("Artíuclos vendidos durante el día: " + items_sold + "\n");

    }

}