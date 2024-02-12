class RetoCCCF {
    public static void main(String[] args) {
        int tiempototal;
        double probabilidadLlegada;
        int unaCola;
        int caja1;
        int caja2;
        int caja3;
        int caja4;
        int colaencero;
        int packstotal;
        int colatotal;
        int packs;

        tiempototal = 720;
        colaencero = 0;
        unaCola = 0;
        caja1 = 0;
        caja2 = 0;
        caja3 = 0;
        caja4 = 0;
        packstotal = 0;
        colatotal = 0;
        packs = 0;

        for (int minuto = 1; minuto <= tiempototal; minuto = minuto + 1) {

            System.out.print("  Minuto " + minuto);
            System.out.print(" - ");

            probabilidadLlegada = Math.random();
            if (probabilidadLlegada <= 0.4) {
                System.out.print("Llego 1 persona");
                unaCola = unaCola + 1;
                colatotal = colatotal + 1;
            } else {
                System.out.print("No llego ninguna persona");
            }
            System.out.println(" - en cola: " + unaCola);
            if (unaCola == 0) {
                colaencero = colaencero + 1;
            }

            if (caja1 <= 0 && unaCola > 0) {
                unaCola = unaCola - 1;
                packs = (int) ((Math.random() * (15 - 5)) + 5);
                packstotal = packstotal + packs;
                caja1 = packs;
                System.out.print("  -  Pasa una persona a la caja 1 llevado [" + caja1 + "] packs");
            }
            if (caja1 > 0) {
                caja1 = caja1 - 1;
                System.out.println("  -  La caja 1 atiende una persona, le quedan " + caja1);
            }

            if (caja2 <= 0 && unaCola > 0) {
                unaCola = unaCola - 1;
                packs = (int) ((Math.random() * (15 - 5)) + 5);
                packstotal = packstotal + packs;
                caja2 = packs;
                System.out.println("  -  Pasa una persona a la caja 2 llevando [" + caja2 + "] packs");
            }

            if (caja2 > 0) {
                caja2 = caja2 - 1;
                System.out.println("  -  La caja 2 atiende un persona, le quedan " + caja2);

            }

            if (caja3 <= 0 && unaCola > 0) {
                unaCola = unaCola - 1;
                packs = (int) ((Math.random() * (15 - 5)) + 5);
                packstotal = packstotal + packs;
                caja3 = packs;
                System.out.println("  -  Pasa una persona a la caja 3 llevando [" + caja3 + "] packs");
            }

            if (caja3 > 0) {
                caja3 = caja1 - 1;
                System.out.println("  -  La caja 3 atiende un persona, le quedan " + caja3);

            }

            if (caja4 <= 0 && unaCola > 0) {
                unaCola = unaCola - 1;
                packs = (int) ((Math.random() * (15 - 5)) + 5);
                packstotal = packstotal + packs;
                caja4 = packs;
                System.out.println("  -  Pasa una persona a la caja 4 llevando [" + caja4 + "] packs");
            }

            if (caja4 > 0) {
                caja4 = caja4 - 1;
                System.out.println("  -  La caja 4 atiende un persona, le quedan " + caja4);
            }

            System.out.println("  Espera:" + unaCola);
            System.out.print("  Caja1:[Faltan " + caja1 + " packs]");
            System.out.print("  Caja 2:[Faltan " + caja2 + " packs]");
            System.out.print("  Caja 3:[Faltan " + caja3 + " packs]");
            System.out.println("  Caja 4:[Faltan " + caja4 + " packs]");
            System.out.println("----------------------------------------");
        }
        System.out.println("Resumen:");
        System.out.println("========================================");
        System.out.println("Minutos con cola en cero      : " + colaencero);
        System.out.println("Personas en la cola al cierre : " + unaCola);
        System.out.println("Personas atendidas en el día  : " + (colatotal - unaCola));
        System.out.println("Productos vendidos en el día  : " + packstotal);
        System.out.println("Fin del día");
    }
}