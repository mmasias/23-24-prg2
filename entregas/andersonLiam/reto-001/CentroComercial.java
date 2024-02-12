import java.util.Random;

public class CentroComercial {
    public static void main(String[] args) {
        int[] caja = { 0, 0, 0, 0, 0 };
        int[] items = { 0, 0, 0, 0, 0 };
        boolean[] libre = { true, true, true, true, true };
        int cola = 0;
        final int minutosEnUnDia = 12 * 60;
        int numeroDeClientes = 0;
        boolean llegaNuevo = false;
        int minutosSinCola = 0;
        int totalItems = 0;
        boolean activa = false;

        for (int tiempo = 1; tiempo < minutosEnUnDia; tiempo++) {

            if (Math.random() * 100 < 40) { 
                llegaNuevo = true;
                cola++; 
                if (libre[0]) {
                    caja[0]++;
                    libre[0] = false; 
                    items[0] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + items[0];

                    cola--;

                } else if (libre[1]) {
                    caja[1]++;
                    libre[1] = false; 
                    items[1] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + items[1];
                    cola--;

                } else if (libre[2]) {
                    caja[2]++;
                    libre[2] = false; 
                    items[2] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + items[2];
                    cola--;

                } else if (libre[3]) {
                    caja[3]++;
                    libre[3] = false; 
                    items[3] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + items[3];
                    cola--;
                } else if (libre[4] && activa) {
                    caja[4]++;
                    libre[4] = false; 
                    items[4] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + items[4];
                    cola--;

                }

            }

            if (items[0] > 0) {
                items[0]--;
                if (items[0] == 0) {
                    libre[0] = true;
                }
            }
            if (items[1] > 0) {
                items[1]--;

                if (items[1] == 0) {

                    libre[1] = true;
                }
            }
            if (items[2] > 0) {
                items[2]--;

                if (items[2] == 0) {

                    libre[2] = true;
                }
            }
            if (items[3] > 0) {
                items[3]--;

                if (items[3] == 0) {
                    libre[3] = true;
                }
            }
            if (items[4] > 0) {
                items[4]--;
                if (items[4] == 0) {
                    libre[4] = true;
                }
            }
            if (cola == 0) {
                minutosSinCola++;
            }
          
            System.out.println("--------------------------------------------------------------");
            System.out.print("MINUTO " + tiempo);
            if (llegaNuevo) {
                System.out.println(" - LLega 1 persona - En cola: " + cola);
                llegaNuevo = false;
            } else {
                System.out.println(" - LLega 0 persona - En cola: " + cola);
            }
            System.out.print(" Caja1:[" + items[0] + "] | Caja2:[" + items[1] + "] | Caja3:[" + items[2] + "] | Caja4:["
                    + items[3] + "]");
            if (items[4] > 0 || activa) {
                System.out.println(" Caja5:[" + items[4] + "] ");
            } else {
                System.out.println();
            }

            if (cola >= 15) {
                activa = true;
            } else {
                activa = false;
            }
        }

        for (int i = 0; i < caja.length; i++) {
            System.out.println("clientes totales que pasan por la caja " + (i + 1) + ": " + caja[i]);
        }
        int total = 0;
        for (int i = 0; i < caja.length; i++) {
            total += caja[i];
        }

        System.out.println("Personas que han pasado por la tienda" + ":" + total);
        System.out.println("Hoy se han vendido " + totalItems + " de productos");
        System.out.println("La cola ha estado vacia durante " + minutosSinCola + " minutos");
        System.out.println("Clientes en la cola al finalizar el dia " + cola);
    }
}