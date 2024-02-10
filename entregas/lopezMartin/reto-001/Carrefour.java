public class Carrefour {

    public static void main(String[] args) {
        
        final int MINUTOS_FINAL = 720;
        final double probabilidadLlegadaClientes = 0.4;
        final int MAX_ITEMS = 15;
        final int MIN_ITEMS = 5;
        int itemsCaja1= 0;
        int itemsCaja2= 0;
        int itemsCaja3= 0;
        int itemsCaja4= 0;
        int colaLlegadaClientes = 0;
        boolean disponibilidadCaja1 = true, disponibilidadCaja2 = true, disponibilidadCaja3 = true, disponibilidadCaja4 = true;
        
        for(int minutoActual = 1; minutoActual<=MINUTOS_FINAL; minutoActual++){
            colaLlegadaClientes = colaLlegadaClientes + llegaCliente(probabilidadLlegadaClientes);
            
            if (disponibilidadCaja1 == true && colaLlegadaClientes>0) {
                colaLlegadaClientes--;
                disponibilidadCaja1 = false;
                itemsCaja1 = crearItemsCaja(MIN_ITEMS, MAX_ITEMS);
            }
            if (disponibilidadCaja2 == true && colaLlegadaClientes>0) {
                colaLlegadaClientes--;
                disponibilidadCaja2 = false;
                itemsCaja2 = crearItemsCaja(MIN_ITEMS, MAX_ITEMS);
            }
            if (disponibilidadCaja3 == true && colaLlegadaClientes>0) {
                colaLlegadaClientes--;
                disponibilidadCaja3 = false;
                itemsCaja3 = crearItemsCaja(MIN_ITEMS, MAX_ITEMS);
            }
            if (disponibilidadCaja4 == true && colaLlegadaClientes>0) {
                colaLlegadaClientes--;
                disponibilidadCaja4 = false;
                itemsCaja4 = crearItemsCaja(MIN_ITEMS, MAX_ITEMS);
            }

            if (!disponibilidadCaja1) {
                itemsCaja1--;
                if (itemsCaja1==0) {
                    disponibilidadCaja1 = true;
                }
            }
            if (!disponibilidadCaja2) {
                itemsCaja2--;
                if (itemsCaja2==0) {
                    disponibilidadCaja2 = true;
                }
            }
            if (!disponibilidadCaja3) {
                itemsCaja3--;
                if (itemsCaja3==0) {
                    disponibilidadCaja3 = true;
                }
            }
            if (!disponibilidadCaja4) {
                itemsCaja4--;
                if (itemsCaja4==0) {
                    disponibilidadCaja4 = true;
                }
            }

            mostrarEstadisticasPorMinuto(minutoActual, colaLlegadaClientes, itemsCaja1, itemsCaja2, itemsCaja3, itemsCaja4);
            pause(2);
            cleanScreen();
        }

    }
    static int llegaCliente (double probabilidadLlegada){
        if (Math.random()<=probabilidadLlegada) {
            return 1;
        }else{
            return 0;
        }
    }
    static int crearItemsCaja(int itemsMinimos, int itemsMaximos){
        int cantidadItems = (int) (Math.random() * (itemsMaximos-itemsMinimos)) + itemsMinimos;
        return cantidadItems;
    }
    static void mostrarEstadisticasPorMinuto(int minutoActual, int colaLlegadaClientes, int itemsCaja1, int itemsCaja2, int itemsCaja3, int itemsCaja4){
        System.out.println("MINUTO " + minutoActual + " - EN COLA: " + colaLlegadaClientes);
        System.out.println("Caja 1:[" + itemsCaja1 + "] | Caja 2:[" + itemsCaja2 + "] | Caja 3:[" + itemsCaja3 + "] | Caja 4:[" + itemsCaja4 + "]");
        System.out.println("----------------------------------------------------------------");
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