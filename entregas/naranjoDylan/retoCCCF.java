class RetoCCCF {
    public static void main(String[] args) {
        int totaltime;
        double probabilityarrivals;
        int checkout_line;
        int supermarket_checkout1;
        int supermarket_checkout2;
        int supermarket_checkout3;
        int supermarket_checkout4;
        int zero_pay_line;
        int totalpackages;
        int checkout_line_total;
        int packs;

        totaltime = 720;
        zero_pay_line = 0;
        checkout_line = 0;
        supermarket_checkout1 = 0;
        supermarket_checkout2 = 0;
        supermarket_checkout3 = 0;
        supermarket_checkout4 = 0;
        totalpackages = 0;
        checkout_line_total = 0;
        packs = 0;

        for (int minute = 1; minute <= totaltime; minute = minute + 1) {

            System.out.print("  Minuto " + minute);
            System.out.print(" - ");

            probabilityarrivals = Math.random();
            if (probabilityarrivals <= 0.4) {
                System.out.print("Llego 1 persona");
                checkout_line = checkout_line + 1;
                checkout_line_total = checkout_line_total + 1;
            } else {
                System.out.print("No llego ninguna persona");
            }
            System.out.println(" - en cola: " + checkout_line);
            if (checkout_line == 0) {
                zero_pay_line = zero_pay_line + 1;
            }

            if (supermarket_checkout1 <= 0 && checkout_line > 0) {
                checkout_line = checkout_line - 1;
                packs = (int) ((Math.random() * (15 - 5)) + 5);
                totalpackages = totalpackages + packs;
                supermarket_checkout1 = packs;
                System.out.print("  -  Pasa una persona a la caja 1 llevado [" + supermarket_checkout1 + "] packs");
            }
            if (supermarket_checkout1 > 0) {
                supermarket_checkout1 = supermarket_checkout1 - 1;
                System.out.println("  -  La caja 1 atiende una persona, le quedan " + supermarket_checkout1);
            }

            if (supermarket_checkout2 <= 0 && checkout_line > 0) {
                checkout_line = checkout_line - 1;
                packs = (int) ((Math.random() * (15 - 5)) + 5);
                totalpackages = totalpackages + packs;
                supermarket_checkout2 = packs;
                System.out.println("  -  Pasa una persona a la caja 2 llevando [" + supermarket_checkout2 + "] packs");
            }

            if (supermarket_checkout2 > 0) {
                supermarket_checkout2 = supermarket_checkout2 - 1;
                System.out.println("  -  La caja 2 atiende un persona, le quedan " + supermarket_checkout2);

            }

            if (supermarket_checkout3 <= 0 && checkout_line > 0) {
                checkout_line = checkout_line - 1;
                packs = (int) ((Math.random() * (15 - 5)) + 5);
                totalpackages = totalpackages + packs;
                supermarket_checkout3 = packs;
                System.out.println("  -  Pasa una persona a la caja 3 llevando [" + supermarket_checkout3 + "] packs");
            }

            if (supermarket_checkout3 > 0) {
                supermarket_checkout3 = supermarket_checkout1 - 1;
                System.out.println("  -  La caja 3 atiende un persona, le quedan " + supermarket_checkout3);

            }

            if (supermarket_checkout4 <= 0 && checkout_line > 0) {
                checkout_line = checkout_line - 1;
                packs = (int) ((Math.random() * (15 - 5)) + 5);
                totalpackages = totalpackages + packs;
                supermarket_checkout4 = packs;
                System.out.println("  -  Pasa una persona a la caja 4 llevando [" + supermarket_checkout4 + "] packs");
            }

            if (supermarket_checkout4 > 0) {
                supermarket_checkout4 = supermarket_checkout4 - 1;
                System.out.println("  -  La caja 4 atiende un persona, le quedan " + supermarket_checkout4);
            }

            System.out.println("  Espera:" + checkout_line);
            System.out.print("  caja 1:[Faltan " + supermarket_checkout1 + " packs]");
            System.out.print("  Caja 2:[Faltan " + supermarket_checkout2 + " packs]");
            System.out.print("  Caja 3:[Faltan " + supermarket_checkout3 + " packs]");
            System.out.println("  Caja 4:[Faltan " + supermarket_checkout4 + " packs]");
            System.out.println("----------------------------------------");
        }
        System.out.println("Resumen:");
        System.out.println("========================================");
        System.out.println("Minutos con cola en cero      : " + zero_pay_line);
        System.out.println("Personas en la cola al cierre : " + checkout_line);
        System.out.println("Personas atendidas en el día  : " + (checkout_line_total - checkout_line));
        System.out.println("Productos vendidos en el día  : " + totalpackages);
        System.out.println("Fin del día");
    }
}