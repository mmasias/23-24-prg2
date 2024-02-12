public class CentroComercial {
    public static void main(String[] args) {
        final int MINUTOS_JORNADA = 720;
        int cola = 0;
        boolean caja1Ocupada = false;
        int itemsClienteCaja1 = 0;

        boolean caja2Ocupada = false;
        int itemsClienteCaja2 = 0;

        boolean caja3Ocupada = false;
        int itemsClienteCaja3 = 0;

        boolean caja4Ocupada = false;
        int itemsClienteCaja4 = 0;

        for(int minuto = 1;minuto <= MINUTOS_JORNADA; minuto++){
            cleanScreen();

            caja1Ocupada = caja1Estado(itemsClienteCaja1);
            caja2Ocupada = caja2Estado(itemsClienteCaja2);
            caja3Ocupada = caja3Estado(itemsClienteCaja3);
            caja4Ocupada = caja4Estado(itemsClienteCaja4);

            if(llegaCliente()){
                cola++;
                System.out.println("Ha llegado un cliente!");
            }
            System.out.println("Hay una cola de: " + cola);
            if(caja1Ocupada && itemsClienteCaja1 > 0){
                itemsClienteCaja1--;
                System.out.println("El cliente de la caja 1 tiene un total de: " + itemsClienteCaja1);
            }
            if(cola >= 1 && !caja1Ocupada){
                System.out.println("Ha pasado a la caja 1 un cliente");
                cola--;
                caja1Ocupada = true;
                itemsClienteCaja1 = items();
                System.out.println("El cliente tiene un total de: " + itemsClienteCaja1);
            }

            if(caja2Ocupada && itemsClienteCaja2 > 0){
                itemsClienteCaja2--;
                System.out.println("El cliente de la caja 2 tiene un total de: " + itemsClienteCaja2);
            }

            if(cola >= 1 && !caja2Ocupada){
                System.out.println("Ha pasado a la caja 1 un cliente");
                cola--;
                caja2Ocupada = true;
                itemsClienteCaja2 = items();
                System.out.println("El cliente tiene un total de: " + itemsClienteCaja2);
            }

            if(caja3Ocupada && itemsClienteCaja3 > 0){
                itemsClienteCaja3--;
                System.out.println("El cliente de la caja 3 tiene un total de: " + itemsClienteCaja3);
            }

            if(cola >= 1 && !caja3Ocupada){
                System.out.println("Ha pasado a la caja 1 un cliente");
                cola--;
                caja3Ocupada = true;
                itemsClienteCaja3 = items();
                System.out.println("El cliente tiene un total de: " + itemsClienteCaja3);
            }

            if(caja4Ocupada && itemsClienteCaja4 > 0){
                itemsClienteCaja4--;
                System.out.println("El cliente de la caja 4 tiene un total de: " + itemsClienteCaja4);
            }

            if(cola >= 1 && !caja4Ocupada){
                System.out.println("Ha pasado a la caja 1 un cliente");
                cola--;
                caja4Ocupada = true;
                itemsClienteCaja4 = items();
                System.out.println("El cliente tiene un total de: " + itemsClienteCaja4);
            }

            pause(2);

        }
    }
    static boolean caja1Estado(int items){
        if(items == 0){
            return false;
        }else{
            return true;
        }
    }

    static boolean caja2Estado(int items){
        if(items == 0){
            return false;
        }else{
            return true;
        }
    }

    static boolean caja3Estado(int items){
        if(items == 0){
            return false;
        }else{
            return true;
        }
    }

    static boolean caja4Estado(int items){
        if(items == 0){
            return false;
        }else{
            return true;
        }
    }

    static int items(){
        return (int) (Math.random() * 11) + 5;
    }
    static boolean llegaCliente(){
        return Math.random() <= 0.6;
    }
    static void cleanScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
      }
      
    static void pause(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
        }
    }
}
