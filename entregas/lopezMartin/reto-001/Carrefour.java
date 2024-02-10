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
        int cantidadItems = (int) Math.random() * (itemsMaximos-itemsMinimos) + itemsMinimos;
        return cantidadItems;
    }
}