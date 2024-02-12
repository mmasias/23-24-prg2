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

        }

    }

}