public class Carrefour {

    public static void main(String[] args) {
        
        final int MINUTOS_FINAL = 720;
        final double PROBABILIDAD_LLEGADA_CLIENTES = 0.4;
        final int MAX_ITEMS = 15;
        final int MIN_ITEMS = 5;
        int itemsCaja1= 0;
        int itemsCaja2= 0;
        int itemsCaja3= 0;
        int itemsCaja4= 0;
        int itemsCaja5 = 0;
        int colaLlegadaClientes = 0;
        String mensajeLlegaCliente;
        int minutosSinCola = 0;
        int personasAtendidas = 0;
        int articulosVendidos = 0;
        boolean disponibilidadCaja1 = true, disponibilidadCaja2 = true, disponibilidadCaja3 = true, disponibilidadCaja4 = true, disponibilidadCaja5 = false , aperturaCaja5 = false;
        
        for(int minutoActual = 1; minutoActual<=MINUTOS_FINAL; minutoActual++){
            if (llegaCliente(PROBABILIDAD_LLEGADA_CLIENTES)) {
                colaLlegadaClientes = colaLlegadaClientes + 1;
                mensajeLlegaCliente = "Llega 1 persona";
            }else{
                mensajeLlegaCliente = "No llega nadie";
            }

            if (colaLlegadaClientes==0) {
                minutosSinCola++;
            }

            if (colaLlegadaClientes>15) {
                disponibilidadCaja5 = true;
                aperturaCaja5 = true;
            }
            
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
            if (disponibilidadCaja5) {
                colaLlegadaClientes--;
                disponibilidadCaja5 = false;
                itemsCaja5 = crearItemsCaja(MIN_ITEMS, MAX_ITEMS);
            }

            if (!disponibilidadCaja1) {
                itemsCaja1--;
                articulosVendidos++;
                if (itemsCaja1==0) {
                    disponibilidadCaja1 = true;
                    personasAtendidas++;
                }
            }
            if (!disponibilidadCaja2) {
                itemsCaja2--;
                articulosVendidos++;
                if (itemsCaja2==0) {
                    disponibilidadCaja2 = true;
                    personasAtendidas++;
                }
            }
            if (!disponibilidadCaja3) {
                itemsCaja3--;
                articulosVendidos++;
                if (itemsCaja3==0) {
                    disponibilidadCaja3 = true;
                    personasAtendidas++;
                }
            }
            if (!disponibilidadCaja4) {
                itemsCaja4--;
                articulosVendidos++;
                if (itemsCaja4==0) {
                    disponibilidadCaja4 = true;
                    personasAtendidas++;
                }
            }
            if (!disponibilidadCaja5 && aperturaCaja5) { 
                if (colaLlegadaClientes<=15) {
                    aperturaCaja5=false;
                }
                itemsCaja5--;
                articulosVendidos++;
                if (itemsCaja5==0) {
                    disponibilidadCaja5 = true;
                    personasAtendidas++;
                }
            }

            mostrarEstadisticasPorMinuto(minutoActual, colaLlegadaClientes, itemsCaja1, itemsCaja2, itemsCaja3, itemsCaja4, itemsCaja5, mensajeLlegaCliente);
            pause(2);
            cleanScreen();
        }
        mostrarEstadisticasJornada(minutosSinCola, colaLlegadaClientes, personasAtendidas, articulosVendidos);

    }
    static boolean llegaCliente (double probabilidadLlegada){
        return Math.random()<=probabilidadLlegada;
    }
    static int crearItemsCaja(int itemsMinimos, int itemsMaximos){
        int cantidadItems = (int) (Math.random() * (itemsMaximos-itemsMinimos)) + itemsMinimos;
        return cantidadItems;
    }
    static void mostrarEstadisticasPorMinuto(int minutoActual, int colaLlegadaClientes, int itemsCaja1, int itemsCaja2, int itemsCaja3, int itemsCaja4, int itemsCaja5, String mensaje){
        System.out.println("MINUTO " + minutoActual + " - " + mensaje + " - EN COLA: " + colaLlegadaClientes);
        System.out.println("Caja 1:[" + itemsCaja1 + "] | Caja 2:[" + itemsCaja2 + "] | Caja 3:[" + itemsCaja3 + "] | Caja 4:[" + itemsCaja4 + "] | Caja 5:[" + itemsCaja5 + "]");
        System.out.println("----------------------------------------------------------------");
    }
    static void mostrarEstadisticasJornada(int minutosSinCola, int colaLlegadaClientes, int personasAtendidas, int articulosVendidos){
        System.out.println("RESUMEN");
        System.out.println("============================================================");
        System.out.println("Minutos con cola en cero: " + minutosSinCola);
        System.out.println("Personas en la cola al cierre " + colaLlegadaClientes);
        System.out.println("Personas atendidas en el dia: " + personasAtendidas);
        System.out.println("Articulos vendidos en el dia: " + articulosVendidos);
        System.out.println("============================================================");
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