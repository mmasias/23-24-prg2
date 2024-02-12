import java.util.Random;

public class CarrefourMain {

    public static void main(String[] args) {
        int[] caja = { 0, 0, 0, 0, 0 };
        int[] nItems = { 0, 0, 0, 0, 0 };
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
                //Probabilidad de que llegue un cliente nuevo.
                llegaNuevo = true;
                cola++;
                //Al que entra se le manda a la cola.
                if (libre[0]) {
                    caja[0]++;
                    libre[0] = false;
                    //Se pasa a un cliente a la caja, queda ocupada.
                    nItems[0] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[0];
                    cola--;

                } else if (libre[1]) {
                    caja[1]++;
                    libre[1] = false; 
                    // Queda ocupada
                    nItems[1] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[1];
                    cola--;

                } else if (libre[2]) {
                    caja[2]++;
                    libre[2] = false; 
                    // Queda ocupada
                    nItems[2] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[2];
                    cola--;

                } else if (libre[3]) {
                    caja[3]++;
                    libre[3] = false; 
                    // Queda ocupada
                    nItems[3] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[3];
                    cola--;
                } else if (libre[4] && activa) {
                    caja[4]++;
                    libre[4] = false;
                     // Queda ocupada
                    nItems[4] = ((int) (Math.random() * 100)) % 11 + 5;
                    totalItems = totalItems + nItems[4];
                    cola--;

                }
                //Se llenan las cajas y se cuenta la cola.
            }

    }
}