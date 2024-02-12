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

            System.out.print("Minuto" + minuto);
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
                System.out.print(" - Pasa una persona a la caja 1 llevado [" + caja1 + "] packs");
            }
            if (caja1 > 0) {
                caja1 = caja1 - 1;
                System.out.println(" - La caja 1 atiende un item, le quedan " + caja1);
            }
            System.out.println("Espera:" + unaCola);
            System.out.print("  Caja1:[Faltan " + caja1 + " packs]");
            System.out.println("----------------------------------------");
        }

    }
}